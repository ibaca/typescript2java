package js;

import js.browser.Array;
import js.mapboxgl.Point;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: tsd/mapbox-gl/index.d.ts:767
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface PointLike_UnionOfArrayOfNumberAndPoint  {
    @JsOverlay
    default Array<Number> asArrayOfNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  PointLike_UnionOfArrayOfNumberAndPoint ofArrayOfNumber(Array<Number> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Point asPoint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  PointLike_UnionOfArrayOfNumberAndPoint ofPoint(Point value) {
        return Js.cast( value );
    }
    
}
