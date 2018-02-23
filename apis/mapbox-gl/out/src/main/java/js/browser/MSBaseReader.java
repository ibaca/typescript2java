package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSBaseReader
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 731794
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface MSBaseReader
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@732231
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    void abort();
    void addEventListener(String type, EventListenerObject listener);
    void addEventListener(String type, EventListenerObject listener, Boolean useCapture /* optional */);
    void addEventListener(String type, EventListener listener);
    void addEventListener(String type, EventListener listener, Boolean useCapture /* optional */);
    void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener);
    /** 
      * tsd/browser/lib.es6.d.ts@732500
     */
    void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener, Boolean useCapture /* optional */);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "DONE")
    Number getDONE();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "EMPTY")
    Number getEMPTY();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "LOADING")
    Number getLOADING();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onabort")
    Function1<Event, Object> getOnabort();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onerror")
    Function1<ErrorEvent, Object> getOnerror();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onload")
    Function1<Event, Object> getOnload();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onloadend")
    Function1<ProgressEvent, Object> getOnloadend();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onloadstart")
    Function1<Event, Object> getOnloadstart();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onprogress")
    Function1<ProgressEvent, Object> getOnprogress();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "readyState")
    Number getReadyState();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "result")
    Object getResult();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "DONE")
    void setDONE(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "EMPTY")
    void setEMPTY(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "LOADING")
    void setLOADING(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onabort")
    void setOnabort(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onerror")
    void setOnerror(Function1<ErrorEvent, Object> value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onload")
    void setOnload(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onloadend")
    void setOnloadend(Function1<ProgressEvent, Object> value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onloadstart")
    void setOnloadstart(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onprogress")
    void setOnprogress(Function1<ProgressEvent, Object> value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "readyState")
    void setReadyState(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "result")
    void setResult(Object value);
}
