package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBObjectStore
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 493175
  * declared in: tsd/browser/lib.es6.d.ts at pos 493957
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBObjectStore")
public class IDBObjectStore
{

    /*
        Constructors
    */
    public IDBObjectStore () {
    } 

    /*
        Properties
    */

    public Boolean autoIncrement;

    public DOMStringList indexNames;

    public UnionOfArrayOfStringAndString keyPath;

    public String name;

    public IDBTransaction transaction;

    /*
        Methods
    */
    public native IDBRequest add(Object value);
    public native IDBRequest add(Object value, String key /* optional */);
    public native IDBRequest add(Object value, Date key /* optional */);
    public native IDBRequest add(Object value, @DoNotAutobox Number key /* optional */);
    public native IDBRequest add(Object value, IDBArrayKey key /* optional */);
    public native IDBRequest add(Object value, IDBKeyRange key /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@493377
     */
    public native IDBRequest add(Object value, UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@493443
     */
    public native IDBRequest clear();
    public native IDBRequest count();
    public native IDBRequest count(String key /* optional */);
    public native IDBRequest count(Date key /* optional */);
    public native IDBRequest count(@DoNotAutobox Number key /* optional */);
    public native IDBRequest count(IDBArrayKey key /* optional */);
    public native IDBRequest count(IDBKeyRange key /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@493468
     */
    public native IDBRequest count(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key /* optional */);
    public native IDBIndex createIndex(String name, String keyPath);
    public native IDBIndex createIndex(String name, String keyPath, IDBIndexParameters optionalParameters /* optional */);
    public native IDBIndex createIndex(String name, Array<String> keyPath);
    public native IDBIndex createIndex(String name, Array<String> keyPath, IDBIndexParameters optionalParameters /* optional */);
    public native IDBIndex createIndex(String name, UnionOfArrayOfStringAndString keyPath);
    /** 
      * tsd/browser/lib.es6.d.ts@493524
     */
    public native IDBIndex createIndex(String name, UnionOfArrayOfStringAndString keyPath, IDBIndexParameters optionalParameters /* optional */);
    public native IDBRequest delete(String key);
    public native IDBRequest delete(Date key);
    public native IDBRequest delete(@DoNotAutobox Number key);
    public native IDBRequest delete(IDBArrayKey key);
    public native IDBRequest delete(IDBKeyRange key);
    /** 
      * tsd/browser/lib.es6.d.ts@493634
     */
    public native IDBRequest delete(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key);
    /** 
      * tsd/browser/lib.es6.d.ts@493690
     */
    public native void deleteIndex(String indexName);
    /** 
      * tsd/browser/lib.es6.d.ts@493732
     */
    public native IDBRequest get(Object key);
    @JsProperty(name = "autoIncrement")
    public native Boolean getAutoIncrement();
    @JsProperty(name = "indexNames")
    public native DOMStringList getIndexNames();
    @JsProperty(name = "keyPath")
    public native UnionOfArrayOfStringAndString getKeyPath();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "transaction")
    public native IDBTransaction getTransaction();
    /** 
      * tsd/browser/lib.es6.d.ts@493763
     */
    public native IDBIndex index(String name);
    public native IDBRequest openCursor();
    public native IDBRequest openCursor(String range /* optional */);
    public native IDBRequest openCursor(String range /* optional */, String direction /* optional */);
    public native IDBRequest openCursor(Date range /* optional */);
    public native IDBRequest openCursor(Date range /* optional */, String direction /* optional */);
    public native IDBRequest openCursor(@DoNotAutobox Number range /* optional */);
    public native IDBRequest openCursor(@DoNotAutobox Number range /* optional */, String direction /* optional */);
    public native IDBRequest openCursor(IDBArrayKey range /* optional */);
    public native IDBRequest openCursor(IDBArrayKey range /* optional */, String direction /* optional */);
    public native IDBRequest openCursor(IDBKeyRange range /* optional */);
    public native IDBRequest openCursor(IDBKeyRange range /* optional */, String direction /* optional */);
    public native IDBRequest openCursor(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString range /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@493798
     */
    public native IDBRequest openCursor(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString range /* optional */, String direction /* optional */);
    public native IDBRequest put(Object value);
    public native IDBRequest put(Object value, String key /* optional */);
    public native IDBRequest put(Object value, Date key /* optional */);
    public native IDBRequest put(Object value, @DoNotAutobox Number key /* optional */);
    public native IDBRequest put(Object value, IDBArrayKey key /* optional */);
    public native IDBRequest put(Object value, IDBKeyRange key /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@493881
     */
    public native IDBRequest put(Object value, UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key /* optional */);
    @JsProperty(name = "autoIncrement")
    public native void setAutoIncrement(Boolean value);
    @JsProperty(name = "indexNames")
    public native void setIndexNames(DOMStringList value);
    @JsProperty(name = "keyPath")
    public native void setKeyPath(String value);
    @JsProperty(name = "keyPath")
    public native void setKeyPath(Array<String> value);
    @JsProperty(name = "keyPath")
    public native void setKeyPath(UnionOfArrayOfStringAndString value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "transaction")
    public native void setTransaction(IDBTransaction value);
}
