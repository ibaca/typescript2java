package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBRequest
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 494819
  * declared in: tsd/browser/lib.es6.d.ts at pos 495433
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBRequest")
public class IDBRequest extends EventTarget 
{

    /*
        Constructors
    */
    public IDBRequest () {
    } 

    /*
        Properties
    */

    public DOMError error;

    public Function1<Event, Object> onerror;

    public Function1<Event, Object> onsuccess;

    public String readyState;

    public Object result;

    public UnionOfIDBCursorAndIDBIndexAndIDBObjectStore source;

    public IDBTransaction transaction;

    /*
        Methods
    */
    @JsProperty(name = "error")
    public native DOMError getError();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "onsuccess")
    public native Function1<Event, Object> getOnsuccess();
    @JsProperty(name = "readyState")
    public native String getReadyState();
    @JsProperty(name = "result")
    public native Object getResult();
    @JsProperty(name = "source")
    public native UnionOfIDBCursorAndIDBIndexAndIDBObjectStore getSource();
    @JsProperty(name = "transaction")
    public native IDBTransaction getTransaction();
    @JsProperty(name = "error")
    public native void setError(DOMError value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "onsuccess")
    public native void setOnsuccess(Function1<Event, Object> value);
    @JsProperty(name = "readyState")
    public native void setReadyState(String value);
    @JsProperty(name = "result")
    public native void setResult(Object value);
    @JsProperty(name = "source")
    public native void setSource(IDBObjectStore value);
    @JsProperty(name = "source")
    public native void setSource(IDBIndex value);
    @JsProperty(name = "source")
    public native void setSource(IDBCursor value);
    @JsProperty(name = "source")
    public native void setSource(UnionOfIDBCursorAndIDBIndexAndIDBObjectStore value);
    @JsProperty(name = "transaction")
    public native void setTransaction(IDBTransaction value);
}
