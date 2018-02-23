package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBCursor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 489939
  * declared in: tsd/browser/lib.es6.d.ts at pos 490397
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBCursor")
public class IDBCursor
{

    /*
        Constructors
    */
    public IDBCursor () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="IDBCursor", name="NEXT")
    public static String NEXT;

    @JsProperty(namespace="IDBCursor", name="NEXT_NO_DUPLICATE")
    public static String NEXT_NO_DUPLICATE;

    @JsProperty(namespace="IDBCursor", name="PREV")
    public static String PREV;

    @JsProperty(namespace="IDBCursor", name="PREV_NO_DUPLICATE")
    public static String PREV_NO_DUPLICATE;

    /*
        Properties
    */

    public String direction;

    public UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key;

    public Object primaryKey;

    public UnionOfIDBIndexAndIDBObjectStore source;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@490104
     */
    public native void advance(@DoNotAutobox Number count);
    @JsMethod(name = "continue")
    public native void continue_();
    @JsMethod(name = "continue")
    public native void continue_(String key /* optional */);
    @JsMethod(name = "continue")
    public native void continue_(Date key /* optional */);
    @JsMethod(name = "continue")
    public native void continue_(@DoNotAutobox Number key /* optional */);
    @JsMethod(name = "continue")
    public native void continue_(IDBArrayKey key /* optional */);
    @JsMethod(name = "continue")
    public native void continue_(IDBKeyRange key /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@490138
     */
    @JsMethod(name = "continue")
    public native void continue_(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@490191
     */
    public native IDBRequest delete();
    @JsProperty(name = "direction")
    public native String getDirection();
    @JsProperty(name = "key")
    public native UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString getKey();
    @JsProperty(name = "NEXT")
    public native String getNEXT();
    @JsProperty(name = "NEXT_NO_DUPLICATE")
    public native String getNEXT_NO_DUPLICATE();
    @JsProperty(name = "PREV")
    public native String getPREV();
    @JsProperty(name = "PREV_NO_DUPLICATE")
    public native String getPREV_NO_DUPLICATE();
    @JsProperty(name = "primaryKey")
    public native Object getPrimaryKey();
    @JsProperty(name = "source")
    public native UnionOfIDBIndexAndIDBObjectStore getSource();
    @JsProperty(name = "direction")
    public native void setDirection(String value);
    @JsProperty(name = "key")
    public native void setKey(String value);
    @JsProperty(name = "key")
    public native void setKey(Date value);
    @JsProperty(name = "key")
    public native void setKey(@DoNotAutobox Number value);
    @JsProperty(name = "key")
    public native void setKey(IDBArrayKey value);
    @JsProperty(name = "key")
    public native void setKey(IDBKeyRange value);
    @JsProperty(name = "key")
    public native void setKey(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString value);
    @JsProperty(name = "NEXT")
    public native void setNEXT(String value);
    @JsProperty(name = "NEXT_NO_DUPLICATE")
    public native void setNEXT_NO_DUPLICATE(String value);
    @JsProperty(name = "PREV")
    public native void setPREV(String value);
    @JsProperty(name = "PREV_NO_DUPLICATE")
    public native void setPREV_NO_DUPLICATE(String value);
    @JsProperty(name = "primaryKey")
    public native void setPrimaryKey(Object value);
    @JsProperty(name = "source")
    public native void setSource(IDBObjectStore value);
    @JsProperty(name = "source")
    public native void setSource(IDBIndex value);
    @JsProperty(name = "source")
    public native void setSource(UnionOfIDBIndexAndIDBObjectStore value);
    /** 
      * tsd/browser/lib.es6.d.ts@490217
     */
    public native IDBRequest update(Object value);
}
