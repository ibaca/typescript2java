package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ConstrainDoubleRange
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 256742

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ConstrainDoubleRange implements DoubleRange 
{

    /*
        Properties
    */

    public Number exact;

    public Number ideal;

    public Number max;

    public Number min;

    /*
        Methods
    */
    @JsProperty(name = "exact")
    public native Number getExact();
    @JsProperty(name = "ideal")
    public native Number getIdeal();
    /** 
      * inherited from (js.browser.DoubleRange)
     */
    @JsProperty(name = "max")
    public native Number getMax();
    /** 
      * inherited from (js.browser.DoubleRange)
     */
    @JsProperty(name = "min")
    public native Number getMin();
    @JsProperty(name = "exact")
    public native void setExact(@DoNotAutobox Number value);
    @JsProperty(name = "ideal")
    public native void setIdeal(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.DoubleRange)
     */
    @JsProperty(name = "max")
    public native void setMax(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.DoubleRange)
     */
    @JsProperty(name = "min")
    public native void setMin(@DoNotAutobox Number value);
}
