package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WindowSessionStorage
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 735642
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface WindowSessionStorage
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.WindowSessionStorage)
     */
    @JsProperty(name = "sessionStorage")
    Storage getSessionStorage();
    /** 
      * inherited from (js.browser.WindowSessionStorage)
     */
    @JsProperty(name = "sessionStorage")
    void setSessionStorage(Storage value);
}
