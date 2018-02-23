package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSAppAsyncOperation
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 501742
  * declared in: tsd/browser/lib.es6.d.ts at pos 502427
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSAppAsyncOperation")
public class MSAppAsyncOperation extends EventTarget 
{

    /*
        Constructors
    */
    public MSAppAsyncOperation () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="MSAppAsyncOperation", name="COMPLETED")
    public static Number COMPLETED;

    @JsProperty(namespace="MSAppAsyncOperation", name="ERROR")
    public static Number ERROR;

    @JsProperty(namespace="MSAppAsyncOperation", name="STARTED")
    public static Number STARTED;

    /*
        Properties
    */

    public DOMError error;

    public Function1<Event, Object> oncomplete;

    public Function1<Event, Object> onerror;

    public Number readyState;

    public Object result;

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
    /** 
      * tsd/browser/lib.es6.d.ts@502012
     */
    public native void start();
}
