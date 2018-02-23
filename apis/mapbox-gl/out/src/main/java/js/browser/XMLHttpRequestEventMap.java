package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: XMLHttpRequestEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 717052

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class XMLHttpRequestEventMap implements XMLHttpRequestEventTargetEventMap 
{

    /*
        Properties
    */

    public Event abort;

    public ErrorEvent error;

    public Event load;

    public ProgressEvent loadend;

    public Event loadstart;

    public ProgressEvent progress;

    public Event readystatechange;

    public ProgressEvent timeout;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "abort")
    public native Event getAbort();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "error")
    public native ErrorEvent getError();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "load")
    public native Event getLoad();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "loadend")
    public native ProgressEvent getLoadend();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "loadstart")
    public native Event getLoadstart();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "progress")
    public native ProgressEvent getProgress();
    @JsProperty(name = "readystatechange")
    public native Event getReadystatechange();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "timeout")
    public native ProgressEvent getTimeout();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "abort")
    public native void setAbort(Event value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "error")
    public native void setError(ErrorEvent value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "load")
    public native void setLoad(Event value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "loadend")
    public native void setLoadend(ProgressEvent value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "loadstart")
    public native void setLoadstart(Event value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "progress")
    public native void setProgress(ProgressEvent value);
    @JsProperty(name = "readystatechange")
    public native void setReadystatechange(Event value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTargetEventMap)
     */
    @JsProperty(name = "timeout")
    public native void setTimeout(ProgressEvent value);
}
