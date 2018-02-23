package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: CSS
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 293435
  * declared in: tsd/browser/lib.es6.d.ts at pos 293523
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface CSS
{

    /*
        Methods
    */
    Boolean supports(String property);
    /** 
      * tsd/browser/lib.es6.d.ts@293457
     */
    Boolean supports(String property, String value /* optional */);
}
