package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: XMLHttpRequestUpload
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 718797
  * declared in: tsd/browser/lib.es6.d.ts at pos 719202
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XMLHttpRequestUpload")
public class XMLHttpRequestUpload extends EventTarget  implements XMLHttpRequestEventTarget 
{

    /*
        Constructors
    */
    public XMLHttpRequestUpload () {
    } 

    /*
        Properties
    */

    public Function1<Event, Object> onabort;

    public Function1<ErrorEvent, Object> onerror;

    public Function1<Event, Object> onload;

    public Function1<ProgressEvent, Object> onloadend;

    public Function1<Event, Object> onloadstart;

    public Function1<ProgressEvent, Object> onprogress;

    public Function1<ProgressEvent, Object> ontimeout;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onabort")
    public native Function1<Event, Object> getOnabort();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onerror")
    public native Function1<ErrorEvent, Object> getOnerror();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onload")
    public native Function1<Event, Object> getOnload();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onloadend")
    public native Function1<ProgressEvent, Object> getOnloadend();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onloadstart")
    public native Function1<Event, Object> getOnloadstart();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onprogress")
    public native Function1<ProgressEvent, Object> getOnprogress();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "ontimeout")
    public native Function1<ProgressEvent, Object> getOntimeout();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onabort")
    public native void setOnabort(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<ErrorEvent, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onload")
    public native void setOnload(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onloadend")
    public native void setOnloadend(Function1<ProgressEvent, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onloadstart")
    public native void setOnloadstart(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "onprogress")
    public native void setOnprogress(Function1<ProgressEvent, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "ontimeout")
    public native void setOntimeout(Function1<ProgressEvent, Object> value);
}
