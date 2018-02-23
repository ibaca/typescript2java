package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBTransaction
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 495600
  * declared in: tsd/browser/lib.es6.d.ts at pos 496367
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBTransaction")
public class IDBTransaction extends EventTarget 
{

    /*
        Constructors
    */
    public IDBTransaction () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="IDBTransaction", name="READ_ONLY")
    public static String READ_ONLY;

    @JsProperty(namespace="IDBTransaction", name="READ_WRITE")
    public static String READ_WRITE;

    @JsProperty(namespace="IDBTransaction", name="VERSION_CHANGE")
    public static String VERSION_CHANGE;

    /*
        Properties
    */

    public IDBDatabase db;

    public DOMError error;

    public String mode;

    public Function1<Event, Object> onabort;

    public Function1<Event, Object> oncomplete;

    public Function1<Event, Object> onerror;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@495908
     */
    public native void abort();
    @JsProperty(name = "db")
    public native IDBDatabase getDb();
    @JsProperty(name = "error")
    public native DOMError getError();
    @JsProperty(name = "mode")
    public native String getMode();
    @JsProperty(name = "onabort")
    public native Function1<Event, Object> getOnabort();
    @JsProperty(name = "oncomplete")
    public native Function1<Event, Object> getOncomplete();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "READ_ONLY")
    public native String getREAD_ONLY();
    @JsProperty(name = "READ_WRITE")
    public native String getREAD_WRITE();
    @JsProperty(name = "VERSION_CHANGE")
    public native String getVERSION_CHANGE();
    /** 
      * tsd/browser/lib.es6.d.ts@495927
     */
    public native IDBObjectStore objectStore(String name);
    @JsProperty(name = "db")
    public native void setDb(IDBDatabase value);
    @JsProperty(name = "error")
    public native void setError(DOMError value);
    @JsProperty(name = "mode")
    public native void setMode(String value);
    @JsProperty(name = "onabort")
    public native void setOnabort(Function1<Event, Object> value);
    @JsProperty(name = "oncomplete")
    public native void setOncomplete(Function1<Event, Object> value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "READ_ONLY")
    public native void setREAD_ONLY(String value);
    @JsProperty(name = "READ_WRITE")
    public native void setREAD_WRITE(String value);
    @JsProperty(name = "VERSION_CHANGE")
    public native void setVERSION_CHANGE(String value);
}
