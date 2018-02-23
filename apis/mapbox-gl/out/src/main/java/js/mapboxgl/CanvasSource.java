package js.mapboxgl;

import js.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".CanvasSource
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 15178
  * source type: "tsd/mapbox-gl/index".CanvasSource
  * flags: TypeParameter (16384)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 15178

  * CanvasSource
  * CanvasSource
 */
@JsType(isNative=true, namespace="mapboxgl", name="CanvasSource")
public class CanvasSource implements Source, CanvasSourceOptions 
{

    /*
        Properties
    */

    public Boolean animate;

    public String canvas;

    public Array<Array<Number>> coordinates;

    public String type;

    /*
        Methods
    */
    /** 
      * inherited from (js.mapboxgl.CanvasSourceOptions)
     */
    @JsProperty(name = "animate")
    public native Boolean getAnimate();
    /** 
      * inherited from (js.mapboxgl.CanvasSourceOptions)
     */
    @JsProperty(name = "canvas")
    public native String getCanvas();
    /** 
      * inherited from (js.mapboxgl.CanvasSourceOptions)
     */
    @JsProperty(name = "coordinates")
    public native Array<Array<Number>> getCoordinates();
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
      * inherited from (js.mapboxgl.CanvasSourceOptions)
     */
    @JsProperty(name = "animate")
    public native void setAnimate(Boolean value);
    /** 
      * inherited from (js.mapboxgl.CanvasSourceOptions)
     */
    @JsProperty(name = "canvas")
    public native void setCanvas(String value);
    /** 
      * inherited from (js.mapboxgl.CanvasSourceOptions)
     */
    @JsProperty(name = "coordinates")
    public native void setCoordinates(Array<Array<Number>> value);
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
