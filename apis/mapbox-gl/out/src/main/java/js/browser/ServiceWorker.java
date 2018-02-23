package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ServiceWorker
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 641346
  * declared in: tsd/browser/lib.es6.d.ts at pos 641880
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ServiceWorker")
public class ServiceWorker extends EventTarget  implements AbstractWorker 
{

    /*
        Constructors
    */
    public ServiceWorker () {
    } 

    /*
        Properties
    */

    public Function1<ErrorEvent, Object> onerror;

    public Function1<Event, Object> onstatechange;

    public String scriptURL;

    public String state;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.AbstractWorker)
      * inherited from (js.browser.AbstractWorker)
     */
    @JsProperty(name = "onerror")
    public native Function1<ErrorEvent, Object> getOnerror();
    @JsProperty(name = "onstatechange")
    public native Function1<Event, Object> getOnstatechange();
    @JsProperty(name = "scriptURL")
    public native String getScriptURL();
    @JsProperty(name = "state")
    public native String getState();
    public native void postMessage(Object message);
    /** 
      * tsd/browser/lib.es6.d.ts@641537
     */
    public native void postMessage(Object message, Array<Object> transfer /* optional */);
    /** 
      * inherited from (js.browser.AbstractWorker)
      * inherited from (js.browser.AbstractWorker)
     */
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<ErrorEvent, Object> value);
    @JsProperty(name = "onstatechange")
    public native void setOnstatechange(Function1<Event, Object> value);
    @JsProperty(name = "scriptURL")
    public native void setScriptURL(String value);
    @JsProperty(name = "state")
    public native void setState(String value);
}
