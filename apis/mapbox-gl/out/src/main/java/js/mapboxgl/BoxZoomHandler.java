package js.mapboxgl;

import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".BoxZoomHandler
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 9088
  * 1 constructors
  * BoxZoomHandler
 */
@JsType(isNative=true, namespace="mapboxgl", name="BoxZoomHandler")
public class BoxZoomHandler
{

    /*
        Constructors
    */
    public BoxZoomHandler (Map map) {
    } 

    /*
        Methods
    */
    /** 
      * tsd/mapbox-gl/index.d.ts@9297
     */
    public native void disable();
    /** 
      * tsd/mapbox-gl/index.d.ts@9272
     */
    public native void enable();
    /** 
      * tsd/mapbox-gl/index.d.ts@9242
     */
    public native Boolean isActive();
    /** 
      * tsd/mapbox-gl/index.d.ts@9211
     */
    public native Boolean isEnabled();
}
