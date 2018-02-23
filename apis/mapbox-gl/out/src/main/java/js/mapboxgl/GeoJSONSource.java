package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.browser.AnonymousType705;
import js.browser.UnionOfBooleanAndNumber;
import js.geojson.Feature;
import js.geojson.FeatureCollection;
import js.geojson.GeoJSONGeo_98_AndPolygon;
import js.geojson.UnionOfFea_301_5AndString;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".GeoJSONSource
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 13710
  * source type: "tsd/mapbox-gl/index".GeoJSONSource
  * flags: TypeParameter (16384)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 13710
  * 2 constructors
 */
@JsType(isNative=true, namespace="mapboxgl", name="GeoJSONSource")
public class GeoJSONSource implements GeoJSONSourceRaw 
{

    /*
        Constructors
    */
    public GeoJSONSource (GeoJSONSourceOptions options /* optional */) {
    } 
    public GeoJSONSource () {
    } 

    /*
        Properties
    */

    public Number buffer;

    public UnionOfBooleanAndNumber cluster;

    public Number clusterMaxZoom;

    public Number clusterRadius;

    public UnionOfFea_301_5AndString data;

    public Number maxzoom;

    public Number tolerance;

    public String type;

    /*
        Methods
    */
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "buffer")
    public native Number getBuffer();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "cluster")
    public native UnionOfBooleanAndNumber getCluster();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "clusterMaxZoom")
    public native Number getClusterMaxZoom();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "clusterRadius")
    public native Number getClusterRadius();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "data")
    public native UnionOfFea_301_5AndString getData();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "maxzoom")
    public native Number getMaxzoom();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "tolerance")
    public native Number getTolerance();
    /** 
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
     */
    @JsProperty(name = "type")
    public native String getType();
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "buffer")
    public native void setBuffer(@DoNotAutobox Number value);
    @JsProperty(name = "cluster")
    public native void setCluster(@DoNotAutobox Number value);
    @JsProperty(name = "cluster")
    public native void setCluster(Boolean value);
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "cluster")
    public native void setCluster(UnionOfBooleanAndNumber value);
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "clusterMaxZoom")
    public native void setClusterMaxZoom(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "clusterRadius")
    public native void setClusterRadius(@DoNotAutobox Number value);
    @JsProperty(name = "data")
    public native void setData(String value);
    @JsProperty(name = "data")
    public native void setData(Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705> value);
    @JsProperty(name = "data")
    public native void setData(FeatureCollection<GeoJSONGeo_98_AndPolygon, AnonymousType705> value);
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "data")
    public native void setData(UnionOfFea_301_5AndString value);
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "maxzoom")
    public native void setMaxzoom(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.GeoJSONSourceOptions)
     */
    @JsProperty(name = "tolerance")
    public native void setTolerance(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
     */
    @JsProperty(name = "type")
    public native void setType(String value);
}
