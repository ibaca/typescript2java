package js.mapboxgl;

import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".DragPanHandler
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 9526
  * 1 constructors
  * DragPenHandler
 */
@JsType(isNative=true, namespace="mapboxgl", name="DragPanHandler")
public class DragPanHandler
{

    /*
        Constructors
    */
    public DragPanHandler (Map map) {
    } 

    /*
        Methods
    */
    /** 
      * tsd/mapbox-gl/index.d.ts@9735
     */
    public native void disable();
    /** 
      * tsd/mapbox-gl/index.d.ts@9710
     */
    public native void enable();
    /** 
      * tsd/mapbox-gl/index.d.ts@9680
     */
    public native Boolean isActive();
    /** 
      * tsd/mapbox-gl/index.d.ts@9649
     */
    public native Boolean isEnabled();
}
