package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationStylesAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AnimationStylesAst extends AnimationAst {
    public Array<JsTypedObject<String,Object /* UnionType */>> styles;
    @JsConstructor
    public AnimationStylesAst(Array<JsTypedObject<String,Object /* UnionType */>> styles) {}
    public native  Object visit(AnimationAstVisitor visitor,Object context);
}
