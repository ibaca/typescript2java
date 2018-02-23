package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: FileReader
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 374842
  * declared in: tsd/browser/lib.es6.d.ts at pos 375391
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FileReader")
public class FileReader extends EventTarget  implements MSBaseReader 
{

    /*
        Constructors
    */
    public FileReader () {
    } 

    /*
        Properties
    */

    public Number DONE;

    public Number EMPTY;

    public Number LOADING;

    public DOMError error;

    public Function1<Event, Object> onabort;

    public Function1<ErrorEvent, Object> onerror;

    public Function1<Event, Object> onload;

    public Function1<ProgressEvent, Object> onloadend;

    public Function1<Event, Object> onloadstart;

    public Function1<ProgressEvent, Object> onprogress;

    public Number readyState;

    public Object result;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@732231
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    public native void abort();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "DONE")
    public native Number getDONE();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "EMPTY")
    public native Number getEMPTY();
    @JsProperty(name = "error")
    public native DOMError getError();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "LOADING")
    public native Number getLOADING();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onabort")
    public native Function1<Event, Object> getOnabort();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onerror")
    public native Function1<ErrorEvent, Object> getOnerror();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onload")
    public native Function1<Event, Object> getOnload();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onloadend")
    public native Function1<ProgressEvent, Object> getOnloadend();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onloadstart")
    public native Function1<Event, Object> getOnloadstart();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onprogress")
    public native Function1<ProgressEvent, Object> getOnprogress();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "readyState")
    public native Number getReadyState();
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "result")
    public native Object getResult();
    /** 
      * tsd/browser/lib.es6.d.ts@374935
     */
    public native void readAsArrayBuffer(Blob blob);
    /** 
      * tsd/browser/lib.es6.d.ts@374976
     */
    public native void readAsBinaryString(Blob blob);
    /** 
      * tsd/browser/lib.es6.d.ts@375018
     */
    public native void readAsDataURL(Blob blob);
    public native void readAsText(Blob blob);
    /** 
      * tsd/browser/lib.es6.d.ts@375055
     */
    public native void readAsText(Blob blob, String encoding /* optional */);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "DONE")
    public native void setDONE(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "EMPTY")
    public native void setEMPTY(@DoNotAutobox Number value);
    @JsProperty(name = "error")
    public native void setError(DOMError value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "LOADING")
    public native void setLOADING(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onabort")
    public native void setOnabort(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<ErrorEvent, Object> value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onload")
    public native void setOnload(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onloadend")
    public native void setOnloadend(Function1<ProgressEvent, Object> value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onloadstart")
    public native void setOnloadstart(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "onprogress")
    public native void setOnprogress(Function1<ProgressEvent, Object> value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "readyState")
    public native void setReadyState(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSBaseReader)
      * inherited from (js.browser.MSBaseReader)
     */
    @JsProperty(name = "result")
    public native void setResult(Object value);
}
