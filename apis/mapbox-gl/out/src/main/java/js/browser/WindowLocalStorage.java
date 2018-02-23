package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WindowLocalStorage
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 735572
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface WindowLocalStorage
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.WindowLocalStorage)
     */
    @JsProperty(name = "localStorage")
    Storage getLocalStorage();
    /** 
      * inherited from (js.browser.WindowLocalStorage)
     */
    @JsProperty(name = "localStorage")
    void setLocalStorage(Storage value);
}
