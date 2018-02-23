package js.mapboxgl;

import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".KeyboardHandler
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 10057
  * 1 constructors
  * KeyboardHandler
 */
@JsType(isNative=true, namespace="mapboxgl", name="KeyboardHandler")
public class KeyboardHandler
{

    /*
        Constructors
    */
    public KeyboardHandler (Map map) {
    } 

    /*
        Methods
    */
    /** 
      * tsd/mapbox-gl/index.d.ts@10238
     */
    public native void disable();
    /** 
      * tsd/mapbox-gl/index.d.ts@10213
     */
    public native void enable();
    /** 
      * tsd/mapbox-gl/index.d.ts@10182
     */
    public native Boolean isEnabled();
}
