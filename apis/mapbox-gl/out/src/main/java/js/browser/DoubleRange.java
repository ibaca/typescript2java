package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DoubleRange
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 257820
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface DoubleRange
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.DoubleRange)
     */
    @JsProperty(name = "max")
    Number getMax();
    /** 
      * inherited from (js.browser.DoubleRange)
     */
    @JsProperty(name = "min")
    Number getMin();
    /** 
      * inherited from (js.browser.DoubleRange)
     */
    @JsProperty(name = "max")
    void setMax(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.DoubleRange)
     */
    @JsProperty(name = "min")
    void setMin(@DoNotAutobox Number value);
}
