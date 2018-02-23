package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBFactory
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 491865
  * declared in: tsd/browser/lib.es6.d.ts at pos 492058
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IDBFactory")
public class IDBFactory
{

    /*
        Constructors
    */
    public IDBFactory () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@491894
     */
    public native Number cmp(Object first, Object second);
    /** 
      * tsd/browser/lib.es6.d.ts@491936
     */
    public native IDBOpenDBRequest deleteDatabase(String name);
    public native IDBOpenDBRequest open(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@491988
     */
    public native IDBOpenDBRequest open(String name, @DoNotAutobox Number version /* optional */);
}
