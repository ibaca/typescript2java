package js.geojson;

import javaemul.internal.annotations.DoNotAutobox;
import js.browser.BBox_Union_99_rAndNumber;
import js.browser.PropertyKey_UnionOfFakeEsSymbolAndNumberAndString;
import js.browser.TupleOf4;
import js.browser.TupleOf6;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/geojson/index".Feature
  * flags: Object (32768)
  * declared in: tsd/geojson/index.d.ts at pos 4126

  * A feature object which contains a geometry and associated properties.
  * https://tools.ietf.org/html/rfc7946#section-3.2
  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class Feature<G extends GeometryObject, P> implements GeoJsonObject 
{

    /*
        Properties
    */

    /** 
      * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
      * https://tools.ietf.org/html/rfc7946#section-5
     */
    public BBox_Union_99_rAndNumber bbox;

    /** 
      * The feature's geometry
     */
    public G geometry;

    /** 
      * A value that uniquely identifies this feature in a
      * https://tools.ietf.org/html/rfc7946#section-3.2.
     */
    public PropertyKey_UnionOfFakeEsSymbolAndNumberAndString id;

    /** 
      * Properties associated with this feature.
     */
    public P properties;

    /** 
      * Specifies the type of GeoJSON object.
     */
    public String type;

    /*
        Methods
    */
    /** 
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
     */
    @JsProperty(name = "bbox")
    public native BBox_Union_99_rAndNumber getBbox();
    @JsProperty(name = "geometry")
    public native G getGeometry();
    @JsProperty(name = "id")
    public native PropertyKey_UnionOfFakeEsSymbolAndNumberAndString getId();
    @JsProperty(name = "properties")
    public native P getProperties();
    /** 
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
     */
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "bbox")
    public native void setBbox(TupleOf6<Number, Number, Number, Number, Number, Number> value);
    @JsProperty(name = "bbox")
    public native void setBbox(TupleOf4<Number, Number, Number, Number> value);
    /** 
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
     */
    @JsProperty(name = "bbox")
    public native void setBbox(BBox_Union_99_rAndNumber value);
    @JsProperty(name = "geometry")
    public native void setGeometry(@DoNotAutobox G value);
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "id")
    public native void setId(@DoNotAutobox Number value);
    @JsProperty(name = "id")
    public native void setId(PropertyKey_UnionOfFakeEsSymbolAndNumberAndString value);
    @JsProperty(name = "properties")
    public native void setProperties(@DoNotAutobox P value);
    /** 
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
      * inherited from (js.geojson.GeoJsonObject)
     */
    @JsProperty(name = "type")
    public native void setType(String value);
}
