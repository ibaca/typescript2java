package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: NavigatorConcurrentHardware
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 733367
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NavigatorConcurrentHardware
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.NavigatorConcurrentHardware)
     */
    @JsProperty(name = "hardwareConcurrency")
    Number getHardwareConcurrency();
    /** 
      * inherited from (js.browser.NavigatorConcurrentHardware)
     */
    @JsProperty(name = "hardwareConcurrency")
    void setHardwareConcurrency(@DoNotAutobox Number value);
}
