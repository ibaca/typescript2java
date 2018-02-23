package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: XMLSerializer
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 719298
  * declared in: tsd/browser/lib.es6.d.ts at pos 719385
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="XMLSerializer")
public class XMLSerializer
{

    /*
        Constructors
    */
    public XMLSerializer () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@719330
     */
    public native String serializeToString(Node target);
}
