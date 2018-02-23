package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".Transition
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 13006

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class Transition
{

    /*
        Properties
    */

    public Number delay;

    public Number duration;

    /*
        Methods
    */
    @JsProperty(name = "delay")
    public native Number getDelay();
    @JsProperty(name = "duration")
    public native Number getDuration();
    @JsProperty(name = "delay")
    public native void setDelay(@DoNotAutobox Number value);
    @JsProperty(name = "duration")
    public native void setDuration(@DoNotAutobox Number value);
}
