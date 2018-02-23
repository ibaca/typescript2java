package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.browser.AnonymousType705;
import js.browser.UnionOfBooleanAndNumber;
import js.geojson.Feature;
import js.geojson.FeatureCollection;
import js.geojson.GeoJSONGeo_98_AndPolygon;
import js.geojson.UnionOfFea_301_5AndString;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".GeoJSONSourceOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 13984
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface GeoJSONSourceOptions
{

    /*
        Methods
    */
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "buffer")
    Number getBuffer();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "cluster")
    UnionOfBooleanAndNumber getCluster();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "clusterMaxZoom")
    Number getClusterMaxZoom();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "clusterRadius")
    Number getClusterRadius();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "data")
    UnionOfFea_301_5AndString getData();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "maxzoom")
    Number getMaxzoom();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "tolerance")
    Number getTolerance();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "buffer")
    void setBuffer(@DoNotAutobox Number value);
    @JsProperty(name = "cluster")
    void setCluster(@DoNotAutobox Number value);
    @JsProperty(name = "cluster")
    void setCluster(Boolean value);
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "cluster")
    void setCluster(UnionOfBooleanAndNumber value);
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "clusterMaxZoom")
    void setClusterMaxZoom(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "clusterRadius")
    void setClusterRadius(@DoNotAutobox Number value);
    @JsProperty(name = "data")
    void setData(String value);
    @JsProperty(name = "data")
    void setData(Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705> value);
    @JsProperty(name = "data")
    void setData(FeatureCollection<GeoJSONGeo_98_AndPolygon, AnonymousType705> value);
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "data")
    void setData(UnionOfFea_301_5AndString value);
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "maxzoom")
    void setMaxzoom(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "tolerance")
    void setTolerance(@DoNotAutobox Number value);
}
