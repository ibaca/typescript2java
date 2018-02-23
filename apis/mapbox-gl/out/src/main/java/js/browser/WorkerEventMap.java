package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WorkerEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 716037

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class WorkerEventMap implements AbstractWorkerEventMap 
{

    /*
        Properties
    */

    public ErrorEvent error;

    public MessageEvent message;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.AbstractWorkerEventMap)
      * inherited from (js.browser.AbstractWorkerEventMap)
     */
    @JsProperty(name = "error")
    public native ErrorEvent getError();
    @JsProperty(name = "message")
    public native MessageEvent getMessage();
    /** 
      * inherited from (js.browser.AbstractWorkerEventMap)
      * inherited from (js.browser.AbstractWorkerEventMap)
     */
    @JsProperty(name = "error")
    public native void setError(ErrorEvent value);
    @JsProperty(name = "message")
    public native void setMessage(MessageEvent value);
}
