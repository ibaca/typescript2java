package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: MutationObserver
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 528372
  * declared in: tsd/browser/lib.es6.d.ts at pos 528542
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MutationObserver")
public class MutationObserver
{

    /*
        Constructors
    */
    public MutationObserver (MutationCallback callback) {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@528407
     */
    public native void disconnect();
    /** 
      * tsd/browser/lib.es6.d.ts@528431
     */
    public native void observe(Node target, MutationObserverInit options);
    /** 
      * tsd/browser/lib.es6.d.ts@528495
     */
    public native Array<MutationRecord> takeRecords();
}
