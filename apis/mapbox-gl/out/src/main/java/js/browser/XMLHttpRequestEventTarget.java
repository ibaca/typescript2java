package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: XMLHttpRequestEventTarget
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 736579
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface XMLHttpRequestEventTarget
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
      * tsd/browser/lib.es6.d.ts@737328
     */
    void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener, Boolean useCapture /* optional */);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onabort")
    Function1<Event, Object> getOnabort();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onerror")
    Function1<ErrorEvent, Object> getOnerror();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onload")
    Function1<Event, Object> getOnload();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onloadend")
    Function1<ProgressEvent, Object> getOnloadend();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onloadstart")
    Function1<Event, Object> getOnloadstart();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onprogress")
    Function1<ProgressEvent, Object> getOnprogress();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "ontimeout")
    Function1<ProgressEvent, Object> getOntimeout();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onabort")
    void setOnabort(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onerror")
    void setOnerror(Function1<ErrorEvent, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onload")
    void setOnload(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onloadend")
    void setOnloadend(Function1<ProgressEvent, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onloadstart")
    void setOnloadstart(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onprogress")
    void setOnprogress(Function1<ProgressEvent, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "ontimeout")
    void setOntimeout(Function1<ProgressEvent, Object> value);
}
