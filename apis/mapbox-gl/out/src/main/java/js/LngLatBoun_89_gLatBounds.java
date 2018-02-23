package js;

import js.browser.Array;
import js.mapboxgl.LngLatBounds;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: tsd/mapbox-gl/index.d.ts:690
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface LngLatBoun_89_gLatBounds  {
    @JsOverlay
    default Array<Array<Number>> asArrayOfArrayOfNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  LngLatBoun_89_gLatBounds ofArrayOfArrayOfNumber(Array<Array<Number>> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Array<LngLatLike_UnionOfArrayOfNumberAndLngLat> asArrayOfLngLatLike_UnionOfArrayOfNumberAndLngLat() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  LngLatBoun_89_gLatBounds ofArrayOfLngLatLike_UnionOfArrayOfNumberAndLngLat(Array<LngLatLike_UnionOfArrayOfNumberAndLngLat> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default LngLatBounds asLngLatBounds() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  LngLatBoun_89_gLatBounds ofLngLatBounds(LngLatBounds value) {
        return Js.cast( value );
    }
    
}
