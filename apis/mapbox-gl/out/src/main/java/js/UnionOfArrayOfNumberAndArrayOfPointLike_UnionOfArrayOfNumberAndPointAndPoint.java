package js;

import js.browser.Array;
import js.mapboxgl.Point;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayOfNumberAndArrayOfPointLike_UnionOfArrayOfNumberAndPointAndPoint  {
    @JsOverlay
    default Array<Number> asArrayOfNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfNumberAndArrayOfPointLike_UnionOfArrayOfNumberAndPointAndPoint ofArrayOfNumber(Array<Number> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Array<PointLike_UnionOfArrayOfNumberAndPoint> asArrayOfPointLike_UnionOfArrayOfNumberAndPoint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfNumberAndArrayOfPointLike_UnionOfArrayOfNumberAndPointAndPoint ofArrayOfPointLike_UnionOfArrayOfNumberAndPoint(Array<PointLike_UnionOfArrayOfNumberAndPoint> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Point asPoint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfNumberAndArrayOfPointLike_UnionOfArrayOfNumberAndPointAndPoint ofPoint(Point value) {
        return Js.cast( value );
    }
    
}
