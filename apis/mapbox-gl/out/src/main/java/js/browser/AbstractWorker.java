package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AbstractWorker
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 722648
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface AbstractWorker
{

    /*
        Methods
    */
    void addEventListener(String type, EventListenerObject listener);
    void addEventListener(String type, EventListenerObject listener, Boolean useCapture /* optional */);
    void addEventListener(String type, EventListener listener);
    void addEventListener(String type, EventListener listener, Boolean useCapture /* optional */);
    void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener);
    /** 
      * tsd/browser/lib.es6.d.ts@722912
     */
    void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener, Boolean useCapture /* optional */);
    /** 
      * inherited from (js.browser.AbstractWorker)
      * inherited from (js.browser.AbstractWorker)
     */
    @JsProperty(name = "onerror")
    Function1<ErrorEvent, Object> getOnerror();
    /** 
      * inherited from (js.browser.AbstractWorker)
      * inherited from (js.browser.AbstractWorker)
     */
    @JsProperty(name = "onerror")
    void setOnerror(Function1<ErrorEvent, Object> value);
}
