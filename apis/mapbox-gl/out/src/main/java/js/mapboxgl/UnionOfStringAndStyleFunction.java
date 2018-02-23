package js.mapboxgl;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfStringAndStyleFunction  {
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfStringAndStyleFunction ofString(String value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default StyleFunction asStyleFunction() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfStringAndStyleFunction ofStyleFunction(StyleFunction value) {
        return Js.cast( value );
    }
    
}
