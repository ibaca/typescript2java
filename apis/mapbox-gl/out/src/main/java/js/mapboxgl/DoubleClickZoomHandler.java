package js.mapboxgl;

import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".DoubleClickZoomHandler
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 10260
  * 1 constructors
  * DoubleClickZoomHandler
 */
@JsType(isNative=true, namespace="mapboxgl", name="DoubleClickZoomHandler")
public class DoubleClickZoomHandler
{

    /*
        Constructors
    */
    public DoubleClickZoomHandler (Map map) {
    } 

    /*
        Methods
    */
    /** 
      * tsd/mapbox-gl/index.d.ts@10455
     */
    public native void disable();
    /** 
      * tsd/mapbox-gl/index.d.ts@10430
     */
    public native void enable();
    /** 
      * tsd/mapbox-gl/index.d.ts@10399
     */
    public native Boolean isEnabled();
}
