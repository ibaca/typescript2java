package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: WebKitFileEntry
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 701645
  * declared in: tsd/browser/lib.es6.d.ts at pos 701799
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitFileEntry")
public class WebKitFileEntry extends WebKitEntry 
{

    /*
        Constructors
    */
    public WebKitFileEntry () {
    } 

    /*
        Methods
    */
    public native void file(WebKitFileCallback successCallback);
    /** 
      * tsd/browser/lib.es6.d.ts@701699
     */
    public native void file(WebKitFileCallback successCallback, WebKitErrorCallback errorCallback /* optional */);
}
