package js.mapboxgl;

import js.browser.Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".CanvasSourceOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 15472
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface CanvasSourceOptions
{

    /*
        Methods
    */
    /** 
      * inherited from (js.mapboxgl.CanvasSourceOptions)
     */
    @JsProperty(name = "animate")
    Boolean getAnimate();
    /** 
      * inherited from (js.mapboxgl.CanvasSourceOptions)
     */
    @JsProperty(name = "canvas")
    String getCanvas();
    /** 
      * inherited from (js.mapboxgl.CanvasSourceOptions)
     */
    @JsProperty(name = "coordinates")
    Array<Array<Number>> getCoordinates();
    /** 
      * inherited from (js.mapboxgl.CanvasSourceOptions)
     */
    @JsProperty(name = "animate")
    void setAnimate(Boolean value);
    /** 
      * inherited from (js.mapboxgl.CanvasSourceOptions)
     */
    @JsProperty(name = "canvas")
    void setCanvas(String value);
    /** 
      * inherited from (js.mapboxgl.CanvasSourceOptions)
     */
    @JsProperty(name = "coordinates")
    void setCoordinates(Array<Array<Number>> value);
}
