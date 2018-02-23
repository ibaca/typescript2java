package js.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class UnionOfHTMLScriptElementAndSVGScriptElement extends Element  {
    @JsOverlay
    public final HTMLScriptElement asHTMLScriptElement() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHTMLScriptElementAndSVGScriptElement ofHTMLScriptElement(HTMLScriptElement value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final SVGScriptElement asSVGScriptElement() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHTMLScriptElementAndSVGScriptElement ofSVGScriptElement(SVGScriptElement value) {
        return Js.uncheckedCast( value );
    }
    
}
