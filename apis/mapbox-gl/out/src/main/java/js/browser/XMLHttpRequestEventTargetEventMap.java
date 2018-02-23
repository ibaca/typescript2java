package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: XMLHttpRequestEventTargetEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 736351
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface XMLHttpRequestEventTargetEventMap
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "abort")
    Event getAbort();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "error")
    ErrorEvent getError();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "load")
    Event getLoad();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "loadend")
    ProgressEvent getLoadend();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "loadstart")
    Event getLoadstart();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "progress")
    ProgressEvent getProgress();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "timeout")
    ProgressEvent getTimeout();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "abort")
    void setAbort(Event value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "error")
    void setError(ErrorEvent value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "load")
    void setLoad(Event value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "loadend")
    void setLoadend(ProgressEvent value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "loadstart")
    void setLoadstart(Event value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "progress")
    void setProgress(ProgressEvent value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "timeout")
    void setTimeout(ProgressEvent value);
}
