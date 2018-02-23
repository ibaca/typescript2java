package js;

import js.browser.Array;
import js.mapboxgl.LngLat;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: tsd/mapbox-gl/index.d.ts:642
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface LngLatLike_UnionOfArrayOfNumberAndLngLat  {
    @JsOverlay
    default Array<Number> asArrayOfNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  LngLatLike_UnionOfArrayOfNumberAndLngLat ofArrayOfNumber(Array<Number> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default LngLat asLngLat() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  LngLatLike_UnionOfArrayOfNumberAndLngLat ofLngLat(LngLat value) {
        return Js.cast( value );
    }
    
}
