package js.mapboxgl;

import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".TouchZoomRotateHandler
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 10477
  * 1 constructors
  * TouchZoomRotateHandler
 */
@JsType(isNative=true, namespace="mapboxgl", name="TouchZoomRotateHandler")
public class TouchZoomRotateHandler
{

    /*
        Constructors
    */
    public TouchZoomRotateHandler (Map map) {
    } 

    /*
        Methods
    */
    /** 
      * tsd/mapbox-gl/index.d.ts@10672
     */
    public native void disable();
    /** 
      * tsd/mapbox-gl/index.d.ts@10698
     */
    public native void disableRotation();
    /** 
      * tsd/mapbox-gl/index.d.ts@10647
     */
    public native void enable();
    /** 
      * tsd/mapbox-gl/index.d.ts@10732
     */
    public native void enableRotation();
    /** 
      * tsd/mapbox-gl/index.d.ts@10616
     */
    public native Boolean isEnabled();
}
