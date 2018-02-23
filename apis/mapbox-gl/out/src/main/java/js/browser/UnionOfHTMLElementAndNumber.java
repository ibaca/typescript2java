package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfHTMLElementAndNumber  {
    @JsOverlay
    default HTMLElement asHTMLElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfHTMLElementAndNumber ofHTMLElement(HTMLElement value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfHTMLElementAndNumber ofNumber(@DoNotAutobox Number value) {
        return Js.cast( value );
    }
    
}
