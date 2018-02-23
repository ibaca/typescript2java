package js.mapboxgl;

import js.browser.Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".ImageSourceOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 15072
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface ImageSourceOptions
{

    /*
        Methods
    */
    /** 
      * inherited from (js.mapboxgl.ImageSourceOptions)
     */
    @JsProperty(name = "coordinates")
    Array<Array<Number>> getCoordinates();
    /** 
      * inherited from (js.mapboxgl.ImageSourceOptions)
     */
    @JsProperty(name = "url")
    String getUrl();
    /** 
      * inherited from (js.mapboxgl.ImageSourceOptions)
     */
    @JsProperty(name = "coordinates")
    void setCoordinates(Array<Array<Number>> value);
    /** 
      * inherited from (js.mapboxgl.ImageSourceOptions)
     */
    @JsProperty(name = "url")
    void setUrl(String value);
}
