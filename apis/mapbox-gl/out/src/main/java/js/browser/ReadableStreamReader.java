package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: ReadableStreamReader
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 567760
  * declared in: tsd/browser/lib.es6.d.ts at pos 567889
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ReadableStreamReader")
public class ReadableStreamReader
{

    /*
        Constructors
    */
    public ReadableStreamReader () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@567799
     */
    public native Promise<Void> cancel();
    /** 
      * tsd/browser/lib.es6.d.ts@567828
     */
    public native Promise<Object> read();
    /** 
      * tsd/browser/lib.es6.d.ts@567854
     */
    public native void releaseLock();
}
