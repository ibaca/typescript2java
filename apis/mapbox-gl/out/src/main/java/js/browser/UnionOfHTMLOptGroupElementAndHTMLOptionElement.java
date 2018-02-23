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
public abstract class UnionOfHTMLOptGroupElementAndHTMLOptionElement extends HTMLElement  {
    @JsOverlay
    public final HTMLOptGroupElement asHTMLOptGroupElement() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHTMLOptGroupElementAndHTMLOptionElement ofHTMLOptGroupElement(HTMLOptGroupElement value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final HTMLOptionElement asHTMLOptionElement() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHTMLOptGroupElementAndHTMLOptionElement ofHTMLOptionElement(HTMLOptionElement value) {
        return Js.uncheckedCast( value );
    }
    
}
