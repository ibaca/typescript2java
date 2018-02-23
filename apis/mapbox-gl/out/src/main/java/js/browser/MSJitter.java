package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSJitter
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 264013

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSJitter
{

    /*
        Properties
    */

    public Number interArrival;

    public Number interArrivalMax;

    public Number interArrivalSD;

    /*
        Methods
    */
    @JsProperty(name = "interArrival")
    public native Number getInterArrival();
    @JsProperty(name = "interArrivalMax")
    public native Number getInterArrivalMax();
    @JsProperty(name = "interArrivalSD")
    public native Number getInterArrivalSD();
    @JsProperty(name = "interArrival")
    public native void setInterArrival(@DoNotAutobox Number value);
    @JsProperty(name = "interArrivalMax")
    public native void setInterArrivalMax(@DoNotAutobox Number value);
    @JsProperty(name = "interArrivalSD")
    public native void setInterArrivalSD(@DoNotAutobox Number value);
}
