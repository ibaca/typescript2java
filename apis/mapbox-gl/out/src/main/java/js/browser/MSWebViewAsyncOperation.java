package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSWebViewAsyncOperation
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 514733
  * declared in: tsd/browser/lib.es6.d.ts at pos 515682
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSWebViewAsyncOperation")
public class MSWebViewAsyncOperation extends EventTarget 
{

    /*
        Constructors
    */
    public MSWebViewAsyncOperation () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="MSWebViewAsyncOperation", name="COMPLETED")
    public static Number COMPLETED;

    @JsProperty(namespace="MSWebViewAsyncOperation", name="ERROR")
    public static Number ERROR;

    @JsProperty(namespace="MSWebViewAsyncOperation", name="STARTED")
    public static Number STARTED;

    @JsProperty(namespace="MSWebViewAsyncOperation", name="TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM")
    public static Number TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM;

    @JsProperty(namespace="MSWebViewAsyncOperation", name="TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION")
    public static Number TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION;

    @JsProperty(namespace="MSWebViewAsyncOperation", name="TYPE_INVOKE_SCRIPT")
    public static Number TYPE_INVOKE_SCRIPT;

    /*
        Properties
    */

    public DOMError error;

    public Function1<Event, Object> oncomplete;

    public Function1<Event, Object> onerror;

    public Number readyState;

    public Object result;

    public MSHTMLWebViewElement target;

    public Number type;

    /*
        Methods
    */
    @JsProperty(name = "COMPLETED")
    public native Number getCOMPLETED();
    @JsProperty(name = "ERROR")
    public native Number getERROR();
    @JsProperty(name = "error")
    public native DOMError getError();
    @JsProperty(name = "oncomplete")
    public native Function1<Event, Object> getOncomplete();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "readyState")
    public native Number getReadyState();
    @JsProperty(name = "result")
    public native Object getResult();
    @JsProperty(name = "STARTED")
    public native Number getSTARTED();
    @JsProperty(name = "TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM")
    public native Number getTYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM();
    @JsProperty(name = "TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION")
    public native Number getTYPE_CREATE_DATA_PACKAGE_FROM_SELECTION();
    @JsProperty(name = "TYPE_INVOKE_SCRIPT")
    public native Number getTYPE_INVOKE_SCRIPT();
    @JsProperty(name = "target")
    public native MSHTMLWebViewElement getTarget();
    @JsProperty(name = "type")
    public native Number getType();
    @JsProperty(name = "COMPLETED")
    public native void setCOMPLETED(@DoNotAutobox Number value);
    @JsProperty(name = "ERROR")
    public native void setERROR(@DoNotAutobox Number value);
    @JsProperty(name = "error")
    public native void setError(DOMError value);
    @JsProperty(name = "oncomplete")
    public native void setOncomplete(Function1<Event, Object> value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "readyState")
    public native void setReadyState(@DoNotAutobox Number value);
    @JsProperty(name = "result")
    public native void setResult(Object value);
    @JsProperty(name = "STARTED")
    public native void setSTARTED(@DoNotAutobox Number value);
    @JsProperty(name = "TYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM")
    public native void setTYPE_CAPTURE_PREVIEW_TO_RANDOM_ACCESS_STREAM(@DoNotAutobox Number value);
    @JsProperty(name = "TYPE_CREATE_DATA_PACKAGE_FROM_SELECTION")
    public native void setTYPE_CREATE_DATA_PACKAGE_FROM_SELECTION(@DoNotAutobox Number value);
    @JsProperty(name = "TYPE_INVOKE_SCRIPT")
    public native void setTYPE_INVOKE_SCRIPT(@DoNotAutobox Number value);
    @JsProperty(name = "target")
    public native void setTarget(MSHTMLWebViewElement value);
    @JsProperty(name = "type")
    public native void setType(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@515085
     */
    public native void start();
}
