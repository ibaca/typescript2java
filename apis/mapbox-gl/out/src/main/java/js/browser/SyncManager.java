package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: SyncManager
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 652965
  * declared in: tsd/browser/lib.es6.d.ts at pos 653067
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SyncManager")
public class SyncManager
{

    /*
        Constructors
    */
    public SyncManager () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@652995
     */
    public native Object getTags();
    /** 
      * tsd/browser/lib.es6.d.ts@653015
     */
    public native Promise<Void> register(String tag);
}
