package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".PositionOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 11109
  * 
 */
@JsType(isNative=true, namespace="mapboxgl", name="PositionOptions")
public class PositionOptions
{

    /*
        Properties
    */

    public Boolean enableHighAccuracy;

    public Number maximumAge;

    public Number timeout;

    /*
        Methods
    */
    @JsProperty(name = "enableHighAccuracy")
    public native Boolean getEnableHighAccuracy();
    @JsProperty(name = "maximumAge")
    public native Number getMaximumAge();
    @JsProperty(name = "timeout")
    public native Number getTimeout();
    @JsProperty(name = "enableHighAccuracy")
    public native void setEnableHighAccuracy(Boolean value);
    @JsProperty(name = "maximumAge")
    public native void setMaximumAge(@DoNotAutobox Number value);
    @JsProperty(name = "timeout")
    public native void setTimeout(@DoNotAutobox Number value);
}
