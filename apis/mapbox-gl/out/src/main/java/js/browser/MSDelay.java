package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSDelay
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 262497

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSDelay
{

    /*
        Properties
    */

    public Number roundTrip;

    public Number roundTripMax;

    /*
        Methods
    */
    @JsProperty(name = "roundTrip")
    public native Number getRoundTrip();
    @JsProperty(name = "roundTripMax")
    public native Number getRoundTripMax();
    @JsProperty(name = "roundTrip")
    public native void setRoundTrip(@DoNotAutobox Number value);
    @JsProperty(name = "roundTripMax")
    public native void setRoundTripMax(@DoNotAutobox Number value);
}
