package js.mapboxgl;

import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".ScrollZoomHandler
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 9319
  * 1 constructors
  * ScrollZoomHandler
 */
@JsType(isNative=true, namespace="mapboxgl", name="ScrollZoomHandler")
public class ScrollZoomHandler
{

    /*
        Constructors
    */
    public ScrollZoomHandler (Map map) {
    } 

    /*
        Methods
    */
    /** 
      * tsd/mapbox-gl/index.d.ts@9504
     */
    public native void disable();
    /** 
      * tsd/mapbox-gl/index.d.ts@9479
     */
    public native void enable();
    /** 
      * tsd/mapbox-gl/index.d.ts@9448
     */
    public native Boolean isEnabled();
}
