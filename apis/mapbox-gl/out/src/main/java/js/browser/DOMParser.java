package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: DOMParser
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 322164
  * declared in: tsd/browser/lib.es6.d.ts at pos 322267
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMParser")
public class DOMParser
{

    /*
        Constructors
    */
    public DOMParser () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@322192
     */
    public native Document parseFromString(String source, String mimeType);
}
