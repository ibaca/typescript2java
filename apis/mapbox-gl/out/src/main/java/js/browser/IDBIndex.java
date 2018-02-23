package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBIndex
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 492124
  * declared in: tsd/browser/lib.es6.d.ts at pos 492651
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBIndex")
public class IDBIndex
{

    /*
        Constructors
    */
    public IDBIndex () {
    } 

    /*
        Properties
    */

    public UnionOfArrayOfStringAndString keyPath;

    public Boolean multiEntry;

    public String name;

    public IDBObjectStore objectStore;

    public Boolean unique;

    /*
        Methods
    */
    public native IDBRequest count();
    public native IDBRequest count(String key /* optional */);
    public native IDBRequest count(Date key /* optional */);
    public native IDBRequest count(@DoNotAutobox Number key /* optional */);
    public native IDBRequest count(IDBArrayKey key /* optional */);
    public native IDBRequest count(IDBKeyRange key /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@492307
     */
    public native IDBRequest count(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key /* optional */);
    public native IDBRequest get(String key);
    public native IDBRequest get(Date key);
    public native IDBRequest get(@DoNotAutobox Number key);
    public native IDBRequest get(IDBArrayKey key);
    public native IDBRequest get(IDBKeyRange key);
    /** 
      * tsd/browser/lib.es6.d.ts@492363
     */
    public native IDBRequest get(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key);
    public native IDBRequest getKey(String key);
    public native IDBRequest getKey(Date key);
    public native IDBRequest getKey(@DoNotAutobox Number key);
    public native IDBRequest getKey(IDBArrayKey key);
    public native IDBRequest getKey(IDBKeyRange key);
    /** 
      * tsd/browser/lib.es6.d.ts@492416
     */
    public native IDBRequest getKey(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString key);
    @JsProperty(name = "keyPath")
    public native UnionOfArrayOfStringAndString getKeyPath();
    @JsProperty(name = "multiEntry")
    public native Boolean getMultiEntry();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "objectStore")
    public native IDBObjectStore getObjectStore();
    @JsProperty(name = "unique")
    public native Boolean getUnique();
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
      * tsd/browser/lib.es6.d.ts@492472
     */
    public native IDBRequest openCursor(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString range /* optional */, String direction /* optional */);
    public native IDBRequest openKeyCursor();
    public native IDBRequest openKeyCursor(String range /* optional */);
    public native IDBRequest openKeyCursor(String range /* optional */, String direction /* optional */);
    public native IDBRequest openKeyCursor(Date range /* optional */);
    public native IDBRequest openKeyCursor(Date range /* optional */, String direction /* optional */);
    public native IDBRequest openKeyCursor(@DoNotAutobox Number range /* optional */);
    public native IDBRequest openKeyCursor(@DoNotAutobox Number range /* optional */, String direction /* optional */);
    public native IDBRequest openKeyCursor(IDBArrayKey range /* optional */);
    public native IDBRequest openKeyCursor(IDBArrayKey range /* optional */, String direction /* optional */);
    public native IDBRequest openKeyCursor(IDBKeyRange range /* optional */);
    public native IDBRequest openKeyCursor(IDBKeyRange range /* optional */, String direction /* optional */);
    public native IDBRequest openKeyCursor(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString range /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@492555
     */
    public native IDBRequest openKeyCursor(UnionOfDateAndIDBArrayKeyAndIDBKeyRangeAndNumberAndString range /* optional */, String direction /* optional */);
    @JsProperty(name = "keyPath")
    public native void setKeyPath(String value);
    @JsProperty(name = "keyPath")
    public native void setKeyPath(Array<String> value);
    @JsProperty(name = "keyPath")
    public native void setKeyPath(UnionOfArrayOfStringAndString value);
    @JsProperty(name = "multiEntry")
    public native void setMultiEntry(Boolean value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "objectStore")
    public native void setObjectStore(IDBObjectStore value);
    @JsProperty(name = "unique")
    public native void setUnique(Boolean value);
}
