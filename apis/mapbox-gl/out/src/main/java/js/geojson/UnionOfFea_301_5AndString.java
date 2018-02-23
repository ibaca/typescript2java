package js.geojson;

import js.browser.AnonymousType705;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfFea_301_5AndString  {
    @JsOverlay
    default Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705> asFeatureOfGeoJSONGeometry_UnionOfGeometryCollectionAndLineStringAndMultiLineStringAndMultiPointAndMultiPolygonAndPointAndPolygonAndAnonymousType705() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFea_301_5AndString ofFeatureOfGeoJSONGeometry_UnionOfGeometryCollectionAndLineStringAndMultiLineStringAndMultiPointAndMultiPolygonAndPointAndPolygonAndAnonymousType705(Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default FeatureCollection<GeoJSONGeo_98_AndPolygon, AnonymousType705> asFeatureCollectionOfGeoJSONGeometry_UnionOfGeometryCollectionAndLineStringAndMultiLineStringAndMultiPointAndMultiPolygonAndPointAndPolygonAndAnonymousType705() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFea_301_5AndString ofFeatureCollectionOfGeoJSONGeometry_UnionOfGeometryCollectionAndLineStringAndMultiLineStringAndMultiPointAndMultiPolygonAndPointAndPolygonAndAnonymousType705(FeatureCollection<GeoJSONGeo_98_AndPolygon, AnonymousType705> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfFea_301_5AndString ofString(String value) {
        return Js.cast( value );
    }
    
}
