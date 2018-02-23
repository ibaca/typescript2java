package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBRequestEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 494743
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface IDBRequestEventMap
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.IDBRequestEventMap)
     */
    @JsProperty(name = "error")
    Event getError();
    /** 
      * inherited from (js.browser.IDBRequestEventMap)
     */
    @JsProperty(name = "success")
    Event getSuccess();
    /** 
      * inherited from (js.browser.IDBRequestEventMap)
     */
    @JsProperty(name = "error")
    void setError(Event value);
    /** 
      * inherited from (js.browser.IDBRequestEventMap)
     */
    @JsProperty(name = "success")
    void setSuccess(Event value);
}
