package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: FormData
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 376235
  * declared in: tsd/browser/lib.es6.d.ts at pos 376332
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FormData")
public class FormData
{

    /*
        Constructors
    */
    public FormData (HTMLFormElement form /* optional */) {
    } 
    public FormData () {
    } 

    /*
        Methods
    */
    public native void append(Object name, Object value);
    /** 
      * tsd/browser/lib.es6.d.ts@376262
     */
    public native void append(Object name, Object value, String blobName /* optional */);
}
