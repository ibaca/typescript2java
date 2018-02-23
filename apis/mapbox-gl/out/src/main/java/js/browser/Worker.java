package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Worker
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 716127
  * declared in: tsd/browser/lib.es6.d.ts at pos 716589
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Worker")
public class Worker extends EventTarget  implements AbstractWorker 
{

    /*
        Constructors
    */
    public Worker (String stringUrl) {
    } 

    /*
        Properties
    */

    public Function1<ErrorEvent, Object> onerror;

    public Function1<MessageEvent, Object> onmessage;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.AbstractWorker)
      * inherited from (js.browser.AbstractWorker)
     */
    @JsProperty(name = "onerror")
    public native Function1<ErrorEvent, Object> getOnerror();
    @JsProperty(name = "onmessage")
    public native Function1<MessageEvent, Object> getOnmessage();
    public native void postMessage(Object message);
    /** 
      * tsd/browser/lib.es6.d.ts@716244
     */
    public native void postMessage(Object message, Array<Object> transfer /* optional */);
    /** 
      * inherited from (js.browser.AbstractWorker)
      * inherited from (js.browser.AbstractWorker)
     */
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<ErrorEvent, Object> value);
    @JsProperty(name = "onmessage")
    public native void setOnmessage(Function1<MessageEvent, Object> value);
    /** 
      * tsd/browser/lib.es6.d.ts@716299
     */
    public native void terminate();
}
