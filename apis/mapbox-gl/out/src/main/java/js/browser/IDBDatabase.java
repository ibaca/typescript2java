package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBDatabase
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 490849
  * declared in: tsd/browser/lib.es6.d.ts at pos 491796
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBDatabase")
public class IDBDatabase extends EventTarget 
{

    /*
        Constructors
    */
    public IDBDatabase () {
    } 

    /*
        Properties
    */

    public String name;

    public DOMStringList objectStoreNames;

    public Function1<Event, Object> onabort;

    public Function1<Event, Object> onerror;

    public Function1<IDBVersionChangeEvent, Object> onversionchange;

    public Number version;

    /*
        Methods
    */
    public native void addEventListener(String type, Function1<IDBVersionChangeEvent, Object> listener);
    /** 
      * tsd/browser/lib.es6.d.ts@491395
     */
    public native void addEventListener(String type, Function1<IDBVersionChangeEvent, Object> listener, Boolean useCapture /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@491154
     */
    public native void close();
    public native IDBObjectStore createObjectStore(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@491173
     */
    public native IDBObjectStore createObjectStore(String name, IDBObjectStoreParameters optionalParameters /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@491273
     */
    public native void deleteObjectStore(String name);
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "objectStoreNames")
    public native DOMStringList getObjectStoreNames();
    @JsProperty(name = "onabort")
    public native Function1<Event, Object> getOnabort();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "onversionchange")
    public native Function1<IDBVersionChangeEvent, Object> getOnversionchange();
    @JsProperty(name = "version")
    public native Number getVersion();
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "objectStoreNames")
    public native void setObjectStoreNames(DOMStringList value);
    @JsProperty(name = "onabort")
    public native void setOnabort(Function1<Event, Object> value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "onversionchange")
    public native void setOnversionchange(Function1<IDBVersionChangeEvent, Object> value);
    @JsProperty(name = "version")
    public native void setVersion(@DoNotAutobox Number value);
    public native IDBTransaction transaction(String storeNames);
    public native IDBTransaction transaction(String storeNames, String mode /* optional */);
    public native IDBTransaction transaction(Array<String> storeNames);
    public native IDBTransaction transaction(Array<String> storeNames, String mode /* optional */);
    public native IDBTransaction transaction(UnionOfArrayOfStringAndString storeNames);
    /** 
      * tsd/browser/lib.es6.d.ts@491316
     */
    public native IDBTransaction transaction(UnionOfArrayOfStringAndString storeNames, String mode /* optional */);
}
