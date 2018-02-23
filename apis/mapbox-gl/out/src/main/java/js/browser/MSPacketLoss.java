package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSPacketLoss
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 264840

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSPacketLoss
{

    /*
        Properties
    */

    public Number lossRate;

    public Number lossRateMax;

    /*
        Methods
    */
    @JsProperty(name = "lossRate")
    public native Number getLossRate();
    @JsProperty(name = "lossRateMax")
    public native Number getLossRateMax();
    @JsProperty(name = "lossRate")
    public native void setLossRate(@DoNotAutobox Number value);
    @JsProperty(name = "lossRateMax")
    public native void setLossRateMax(@DoNotAutobox Number value);
}
