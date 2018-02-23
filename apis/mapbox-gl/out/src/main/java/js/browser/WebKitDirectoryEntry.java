package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: WebKitDirectoryEntry
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 700913
  * declared in: tsd/browser/lib.es6.d.ts at pos 701025
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitDirectoryEntry")
public class WebKitDirectoryEntry extends WebKitEntry 
{

    /*
        Constructors
    */
    public WebKitDirectoryEntry () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@700972
     */
    public native WebKitDirectoryReader createReader();
}
