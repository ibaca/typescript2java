package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ServiceWorkerEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 641252

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ServiceWorkerEventMap implements AbstractWorkerEventMap 
{

    /*
        Properties
    */

    public ErrorEvent error;

    public Event statechange;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.AbstractWorkerEventMap)
      * inherited from (js.browser.AbstractWorkerEventMap)
     */
    @JsProperty(name = "error")
    public native ErrorEvent getError();
    @JsProperty(name = "statechange")
    public native Event getStatechange();
    /** 
      * inherited from (js.browser.AbstractWorkerEventMap)
      * inherited from (js.browser.AbstractWorkerEventMap)
     */
    @JsProperty(name = "error")
    public native void setError(ErrorEvent value);
    @JsProperty(name = "statechange")
    public native void setStatechange(Event value);
}
