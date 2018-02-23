package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBEnvironment
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 731486
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface IDBEnvironment
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.IDBEnvironment)
     */
    @JsProperty(name = "indexedDB")
    IDBFactory getIndexedDB();
    /** 
      * inherited from (js.browser.IDBEnvironment)
     */
    @JsProperty(name = "indexedDB")
    void setIndexedDB(IDBFactory value);
}
