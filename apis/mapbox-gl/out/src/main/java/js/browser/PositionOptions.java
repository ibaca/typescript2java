package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PositionOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 273088

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
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
