package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".FlyToOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 21618

  * FlyToOptions
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface FlyToOptions extends AnimationOptions, CameraOptions 
{

    /*
        Methods
    */
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "curve")
    Number getCurve();
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "minZoom")
    Number getMinZoom();
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "screenSpeed")
    Number getScreenSpeed();
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "speed")
    Number getSpeed();
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "curve")
    void setCurve(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "minZoom")
    void setMinZoom(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "screenSpeed")
    void setScreenSpeed(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "speed")
    void setSpeed(@DoNotAutobox Number value);
}
