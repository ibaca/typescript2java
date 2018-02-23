package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: WebKitDirectoryReader
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 701121
  * declared in: tsd/browser/lib.es6.d.ts at pos 701271
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitDirectoryReader")
public class WebKitDirectoryReader
{

    /*
        Constructors
    */
    public WebKitDirectoryReader () {
    } 

    /*
        Methods
    */
    public native void readEntries(WebKitEntriesCallback successCallback);
    /** 
      * tsd/browser/lib.es6.d.ts@701161
     */
    public native void readEntries(WebKitEntriesCallback successCallback, WebKitErrorCallback errorCallback /* optional */);
}
