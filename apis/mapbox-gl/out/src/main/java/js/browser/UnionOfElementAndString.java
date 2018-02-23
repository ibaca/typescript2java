package js.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfElementAndString  {
    @JsOverlay
    default Element asElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfElementAndString ofElement(Element value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfElementAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
