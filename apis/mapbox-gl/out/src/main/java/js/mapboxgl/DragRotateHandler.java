package js.mapboxgl;

import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".DragRotateHandler
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 9757
  * 2 constructors
  * DragRotateHandler
 */
@JsType(isNative=true, namespace="mapboxgl", name="DragRotateHandler")
public class DragRotateHandler
{

    /*
        Constructors
    */
    public DragRotateHandler (Map map, Object options /* optional */) {
    } 
    public DragRotateHandler (Map map) {
    } 

    /*
        Methods
    */
    /** 
      * tsd/mapbox-gl/index.d.ts@10035
     */
    public native void disable();
    /** 
      * tsd/mapbox-gl/index.d.ts@10010
     */
    public native void enable();
    /** 
      * tsd/mapbox-gl/index.d.ts@9980
     */
    public native Boolean isActive();
    /** 
      * tsd/mapbox-gl/index.d.ts@9949
     */
    public native Boolean isEnabled();
}
