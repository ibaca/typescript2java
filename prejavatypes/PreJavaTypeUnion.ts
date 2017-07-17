import * as ts from "typescript"
import { PreJavaType, CompletablePreJavaType, ProcessContext, TypeReplacer } from './PreJavaType'
import { PreJavaTypeClassOrInterface } from './PreJavaTypeClassOrInterface'
import { PreJavaTypeReference } from './PreJavaTypeReference'

export class PreJavaTypeUnion extends PreJavaType {
    packageName: string
    types: PreJavaType[]

    constructor(types: PreJavaType[]) {
        super()
        this.types = []
        types.forEach(type => {
            if (this.types.indexOf(type) < 0)
                this.types.push(type)
        })
    }

    dump() {
        console.log(`UnionType ${this.getParametrizedSimpleName()}`)
        if (this.types && this.types.length)
            this.types.forEach(t => console.log(`- ${t.getParametrizedSimpleName()}`))
    }


    // TODO : ADD TYPE PARAMETERS IF ANY, BUT FOR NOW THE DATA DOES NOT EXISTS IN THE UNION PJT STRUCTURE
    getParametrization(): string { return '' }

    setSimpleName(name: string) { }

    getSimpleName(): string {
        if ((!this.types) || this.types.length == 0)
            return 'EmptyUnion'

        return this.transformTypeName(this).replace(new RegExp('\\?', 'g'), 'UNKOWNTYPE')
    }

    getPackageName(): string { return this.packageName }

    setPackageName(name: string) {
        if (!this.packageName)
            this.packageName = name
    }

    isClassLike() { return false }

    isCompletablePreJavaType() { return null }

    substituteTypeReal(replacer: TypeReplacer, cache: Map<PreJavaType, PreJavaType>, passThroughTypes: Set<PreJavaType>): PreJavaType {
        let stay = replacer(this)
        if (!stay || stay != this)
            return stay

        if (this.types)
            this.types = this.types.map(t => t.substituteType(replacer, cache, passThroughTypes)).filter(t => t != null)

        return this
    }

    private transformTypeName(type: PreJavaType): string {
        if (type instanceof PreJavaTypeClassOrInterface) {
            let res = type.name
            return res
        }

        if (type instanceof PreJavaTypeReference) {
            let res = this.transformTypeName(type.type)
            if (type.typeParameters && type.typeParameters.length)
                res += `Of${type.typeParameters.map(t => this.transformTypeName(t)).join('And')}`
            return res
        }

        if (type instanceof PreJavaTypeUnion) {
            return `UnionOf${type.types.map(t => this.transformTypeName(t)).join('And')}`
        }

        return type.getSimpleName()
    }
}
