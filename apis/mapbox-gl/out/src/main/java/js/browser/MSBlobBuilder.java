package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: MSBlobBuilder
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 502771
  * declared in: tsd/browser/lib.es6.d.ts at pos 502901
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSBlobBuilder")
public class MSBlobBuilder
{

    /*
        Constructors
    */
    public MSBlobBuilder () {
    } 

    /*
        Methods
    */
    public native void append(Object data);
    /** 
      * tsd/browser/lib.es6.d.ts@502803
     */
    public native void append(Object data, String endings /* optional */);
    public native Blob getBlob();
    /** 
      * tsd/browser/lib.es6.d.ts@502850
     */
    public native Blob getBlob(String contentType /* optional */);
}
