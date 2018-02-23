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
public interface UnionOfStringAndStyle  {
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfStringAndStyle ofString(String value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Style asStyle() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfStringAndStyle ofStyle(Style value) {
        return Js.cast( value );
    }
    
}
