package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DeviceRotationRateDict
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 257723

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class DeviceRotationRateDict
{

    /*
        Properties
    */

    public Number alpha;

    public Number beta;

    public Number gamma;

    /*
        Methods
    */
    @JsProperty(name = "alpha")
    public native Number getAlpha();
    @JsProperty(name = "beta")
    public native Number getBeta();
    @JsProperty(name = "gamma")
    public native Number getGamma();
    @JsProperty(name = "alpha")
    public native void setAlpha(@DoNotAutobox Number value);
    @JsProperty(name = "beta")
    public native void setBeta(@DoNotAutobox Number value);
    @JsProperty(name = "gamma")
    public native void setGamma(@DoNotAutobox Number value);
}
