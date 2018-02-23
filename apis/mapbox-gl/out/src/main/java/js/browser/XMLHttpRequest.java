package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: XMLHttpRequest
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 717163
  * declared in: tsd/browser/lib.es6.d.ts at pos 718565
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XMLHttpRequest")
public class XMLHttpRequest extends EventTarget  implements XMLHttpRequestEventTarget 
{

    /*
        Constructors
    */
    public XMLHttpRequest () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="XMLHttpRequest", name="DONE")
    public static Number DONE;

    @JsProperty(namespace="XMLHttpRequest", name="HEADERS_RECEIVED")
    public static Number HEADERS_RECEIVED;

    @JsProperty(namespace="XMLHttpRequest", name="LOADING")
    public static Number LOADING;

    @JsProperty(namespace="XMLHttpRequest", name="OPENED")
    public static Number OPENED;

    @JsProperty(namespace="XMLHttpRequest", name="UNSENT")
    public static Number UNSENT;

    /*
        Properties
    */

    public String msCaching;

    public Function1<Event, Object> onabort;

    public Function1<ErrorEvent, Object> onerror;

    public Function1<Event, Object> onload;

    public Function1<ProgressEvent, Object> onloadend;

    public Function1<Event, Object> onloadstart;

    public Function1<ProgressEvent, Object> onprogress;

    public Function1<Event, Object> onreadystatechange;

    public Function1<ProgressEvent, Object> ontimeout;

    public Number readyState;

    public Object response;

    public String responseText;

    public String responseType;

    public String responseURL;

    public Document responseXML;

    public Number status;

    public String statusText;

    public Number timeout;

    public XMLHttpRequestUpload upload;

    public Boolean withCredentials;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@717688
     */
    public native void abort();
    /** 
      * tsd/browser/lib.es6.d.ts@717707
     */
    public native String getAllResponseHeaders();
    @JsProperty(name = "DONE")
    public native Number getDONE();
    @JsProperty(name = "HEADERS_RECEIVED")
    public native Number getHEADERS_RECEIVED();
    @JsProperty(name = "LOADING")
    public native Number getLOADING();
    @JsProperty(name = "msCaching")
    public native String getMsCaching();
    @JsProperty(name = "OPENED")
    public native Number getOPENED();
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
    @JsProperty(name = "onreadystatechange")
    public native Function1<Event, Object> getOnreadystatechange();
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "ontimeout")
    public native Function1<ProgressEvent, Object> getOntimeout();
    @JsProperty(name = "readyState")
    public native Number getReadyState();
    @JsProperty(name = "response")
    public native Object getResponse();
    /** 
      * tsd/browser/lib.es6.d.ts@717744
     */
    public native String getResponseHeader(String header);
    @JsProperty(name = "responseText")
    public native String getResponseText();
    @JsProperty(name = "responseType")
    public native String getResponseType();
    @JsProperty(name = "responseURL")
    public native String getResponseURL();
    @JsProperty(name = "responseXML")
    public native Document getResponseXML();
    @JsProperty(name = "status")
    public native Number getStatus();
    @JsProperty(name = "statusText")
    public native String getStatusText();
    @JsProperty(name = "timeout")
    public native Number getTimeout();
    @JsProperty(name = "UNSENT")
    public native Number getUNSENT();
    @JsProperty(name = "upload")
    public native XMLHttpRequestUpload getUpload();
    @JsProperty(name = "withCredentials")
    public native Boolean getWithCredentials();
    /** 
      * tsd/browser/lib.es6.d.ts@717798
     */
    public native Boolean msCachingEnabled();
    public native void open(String method, String url);
    public native void open(String method, String url, Boolean async /* optional */);
    public native void open(String method, String url, Boolean async /* optional */, String user /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@717831
     */
    public native void open(String method, String url, Boolean async /* optional */, String user /* optional */, String password /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@717927
     */
    public native void overrideMimeType(String mime);
    public native void send();
    /** 
      * tsd/browser/lib.es6.d.ts@718002
      * VERSION 1
     */
    public native void send(String data /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@717969
     */
    public native void send(Document data /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@718033
      * VERSION 2
     */
    public native void send(Object data /* optional */);
    @JsProperty(name = "DONE")
    public native void setDONE(@DoNotAutobox Number value);
    @JsProperty(name = "HEADERS_RECEIVED")
    public native void setHEADERS_RECEIVED(@DoNotAutobox Number value);
    @JsProperty(name = "LOADING")
    public native void setLOADING(@DoNotAutobox Number value);
    @JsProperty(name = "msCaching")
    public native void setMsCaching(String value);
    @JsProperty(name = "OPENED")
    public native void setOPENED(@DoNotAutobox Number value);
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
    @JsProperty(name = "onreadystatechange")
    public native void setOnreadystatechange(Function1<Event, Object> value);
    /** 
      * inherited from (js.browser.XMLHttpRequestEventTarget)
      * inherited from (js.browser.XMLHttpRequestEventTarget)
     */
    @JsProperty(name = "ontimeout")
    public native void setOntimeout(Function1<ProgressEvent, Object> value);
    @JsProperty(name = "readyState")
    public native void setReadyState(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@718061
     */
    public native void setRequestHeader(String header, String value);
    @JsProperty(name = "response")
    public native void setResponse(Object value);
    @JsProperty(name = "responseText")
    public native void setResponseText(String value);
    @JsProperty(name = "responseType")
    public native void setResponseType(String value);
    @JsProperty(name = "responseURL")
    public native void setResponseURL(String value);
    @JsProperty(name = "responseXML")
    public native void setResponseXML(Document value);
    @JsProperty(name = "status")
    public native void setStatus(@DoNotAutobox Number value);
    @JsProperty(name = "statusText")
    public native void setStatusText(String value);
    @JsProperty(name = "timeout")
    public native void setTimeout(@DoNotAutobox Number value);
    @JsProperty(name = "UNSENT")
    public native void setUNSENT(@DoNotAutobox Number value);
    @JsProperty(name = "upload")
    public native void setUpload(XMLHttpRequestUpload value);
    @JsProperty(name = "withCredentials")
    public native void setWithCredentials(Boolean value);
}
