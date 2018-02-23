package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ExceptionInformation
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 258608
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface ExceptionInformation
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.ExceptionInformation)
      * inherited from (js.browser.ExceptionInformation)
     */
    @JsProperty(name = "domain")
    String getDomain();
    /** 
      * inherited from (js.browser.ExceptionInformation)
      * inherited from (js.browser.ExceptionInformation)
     */
    @JsProperty(name = "domain")
    void setDomain(String value);
}
