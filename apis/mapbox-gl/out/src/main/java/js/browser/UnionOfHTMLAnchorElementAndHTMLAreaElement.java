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
public abstract class UnionOfHTMLAnchorElementAndHTMLAreaElement extends HTMLElement  {
    @JsOverlay
    public final HTMLAnchorElement asHTMLAnchorElement() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHTMLAnchorElementAndHTMLAreaElement ofHTMLAnchorElement(HTMLAnchorElement value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final HTMLAreaElement asHTMLAreaElement() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHTMLAnchorElementAndHTMLAreaElement ofHTMLAreaElement(HTMLAreaElement value) {
        return Js.uncheckedCast( value );
    }
    
}
