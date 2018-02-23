package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCSsrcRange
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 279286

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCSsrcRange
{

    /*
        Properties
    */

    public Number max;

    public Number min;

    /*
        Methods
    */
    @JsProperty(name = "max")
    public native Number getMax();
    @JsProperty(name = "min")
    public native Number getMin();
    @JsProperty(name = "max")
    public native void setMax(@DoNotAutobox Number value);
    @JsProperty(name = "min")
    public native void setMin(@DoNotAutobox Number value);
}
