package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AudioParam
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 290284
  * declared in: tsd/browser/lib.es6.d.ts at pos 290838
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioParam")
public class AudioParam
{

    /*
        Constructors
    */
    public AudioParam () {
    } 

    /*
        Properties
    */

    public Number defaultValue;

    public Number value;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@290367
     */
    public native AudioParam cancelScheduledValues(@DoNotAutobox Number startTime);
    /** 
      * tsd/browser/lib.es6.d.ts@290425
     */
    public native AudioParam exponentialRampToValueAtTime(@DoNotAutobox Number value, @DoNotAutobox Number endTime);
    @JsProperty(name = "defaultValue")
    public native Number getDefaultValue();
    @JsProperty(name = "value")
    public native Number getValue();
    /** 
      * tsd/browser/lib.es6.d.ts@290503
     */
    public native AudioParam linearRampToValueAtTime(@DoNotAutobox Number value, @DoNotAutobox Number endTime);
    @JsProperty(name = "defaultValue")
    public native void setDefaultValue(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@290576
     */
    public native AudioParam setTargetAtTime(@DoNotAutobox Number target, @DoNotAutobox Number startTime, @DoNotAutobox Number timeConstant);
    @JsProperty(name = "value")
    public native void setValue(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@290666
     */
    public native AudioParam setValueAtTime(@DoNotAutobox Number value, @DoNotAutobox Number startTime);
    /** 
      * tsd/browser/lib.es6.d.ts@290732
     */
    public native AudioParam setValueCurveAtTime(Float32Array values, @DoNotAutobox Number startTime, @DoNotAutobox Number duration);
}
