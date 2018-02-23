package js.mapboxgl;

import js.browser.Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".VideoSourceOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 14663
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface VideoSourceOptions
{

    /*
        Methods
    */
    /** 
      * inherited from (js.mapboxgl.VideoSourceOptions)
     */
    @JsProperty(name = "coordinates")
    Array<Array<Number>> getCoordinates();
    /** 
      * inherited from (js.mapboxgl.VideoSourceOptions)
     */
    @JsProperty(name = "urls")
    Array<String> getUrls();
    /** 
      * inherited from (js.mapboxgl.VideoSourceOptions)
     */
    @JsProperty(name = "coordinates")
    void setCoordinates(Array<Array<Number>> value);
    /** 
      * inherited from (js.mapboxgl.VideoSourceOptions)
     */
    @JsProperty(name = "urls")
    void setUrls(Array<String> value);
}
