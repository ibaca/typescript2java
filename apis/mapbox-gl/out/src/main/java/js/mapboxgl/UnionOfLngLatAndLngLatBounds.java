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
public interface UnionOfLngLatAndLngLatBounds  {
    @JsOverlay
    default LngLat asLngLat() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfLngLatAndLngLatBounds ofLngLat(LngLat value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default LngLatBounds asLngLatBounds() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfLngLatAndLngLatBounds ofLngLatBounds(LngLatBounds value) {
        return Js.cast( value );
    }
    
}
