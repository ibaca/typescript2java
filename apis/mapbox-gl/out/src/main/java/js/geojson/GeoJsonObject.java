package js.geojson;

import js.browser.BBox_Union_99_rAndNumber;
import js.browser.TupleOf4;
import js.browser.TupleOf6;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/geojson/index".GeoJsonObject
  * flags: Object (32768)
  * declared in: tsd/geojson/index.d.ts at pos 1606

  * The base GeoJSON object.
  * https://tools.ietf.org/html/rfc7946#section-3
  * The GeoJSON specification also allows foreign members
  * (https://tools.ietf.org/html/rfc7946#section-6.1)
  * Developers should use "&" type in TypeScript or extend the interface
  * to add these foreign members.
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface GeoJsonObject
{

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
    BBox_Union_99_rAndNumber getBbox();
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
    String getType();
    @JsProperty(name = "bbox")
    void setBbox(TupleOf6<Number, Number, Number, Number, Number, Number> value);
    @JsProperty(name = "bbox")
    void setBbox(TupleOf4<Number, Number, Number, Number> value);
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
    void setBbox(BBox_Union_99_rAndNumber value);
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
    void setType(String value);
}
