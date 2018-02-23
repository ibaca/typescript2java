package js.geojson;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: tsd/mapbox-gl/index.d.ts:13375
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface GeoJSONGeo_98_AndPolygon extends GeometryObject  {
    @JsOverlay
    default GeometryCollection asGeometryCollection() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  GeoJSONGeo_98_AndPolygon ofGeometryCollection(GeometryCollection value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default LineString asLineString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  GeoJSONGeo_98_AndPolygon ofLineString(LineString value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default MultiLineString asMultiLineString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  GeoJSONGeo_98_AndPolygon ofMultiLineString(MultiLineString value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default MultiPoint asMultiPoint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  GeoJSONGeo_98_AndPolygon ofMultiPoint(MultiPoint value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default MultiPolygon asMultiPolygon() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  GeoJSONGeo_98_AndPolygon ofMultiPolygon(MultiPolygon value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Point asPoint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  GeoJSONGeo_98_AndPolygon ofPoint(Point value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Polygon asPolygon() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  GeoJSONGeo_98_AndPolygon ofPolygon(Polygon value) {
        return Js.cast( value );
    }
    
}
