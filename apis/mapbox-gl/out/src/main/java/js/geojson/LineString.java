package js.geojson;

import js.browser.Array;
import js.browser.BBox_Union_99_rAndNumber;
import js.browser.TupleOf4;
import js.browser.TupleOf6;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/geojson/index".LineString
  * flags: Object (32768)
  * declared in: tsd/geojson/index.d.ts at pos 2957

  * LineString geometry object.
  * https://tools.ietf.org/html/rfc7946#section-3.1.4
  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class LineString implements GeometryObject 
{

    /*
        Properties
    */

    /** 
      * Bounding box of the coordinate range of the object's Geometries, Features, or Feature Collections.
      * https://tools.ietf.org/html/rfc7946#section-5
     */
    public BBox_Union_99_rAndNumber bbox;

    public Array<Array<Number>> coordinates;

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
    @JsProperty(name = "coordinates")
    public native Array<Array<Number>> getCoordinates();
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
    @JsProperty(name = "coordinates")
    public native void setCoordinates(Array<Array<Number>> value);
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
