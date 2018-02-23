package js.geojson;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfLineStringAndMultiLineStringAndMultiPointAndMultiPolygonAndPointAndPolygon extends GeometryObject  {
    @JsOverlay
    default LineString asLineString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfLineStringAndMultiLineStringAndMultiPointAndMultiPolygonAndPointAndPolygon ofLineString(LineString value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default MultiLineString asMultiLineString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfLineStringAndMultiLineStringAndMultiPointAndMultiPolygonAndPointAndPolygon ofMultiLineString(MultiLineString value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default MultiPoint asMultiPoint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfLineStringAndMultiLineStringAndMultiPointAndMultiPolygonAndPointAndPolygon ofMultiPoint(MultiPoint value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default MultiPolygon asMultiPolygon() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfLineStringAndMultiLineStringAndMultiPointAndMultiPolygonAndPointAndPolygon ofMultiPolygon(MultiPolygon value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Point asPoint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfLineStringAndMultiLineStringAndMultiPointAndMultiPolygonAndPointAndPolygon ofPoint(Point value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Polygon asPolygon() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfLineStringAndMultiLineStringAndMultiPointAndMultiPolygonAndPointAndPolygon ofPolygon(Polygon value) {
        return Js.cast( value );
    }
    
}
