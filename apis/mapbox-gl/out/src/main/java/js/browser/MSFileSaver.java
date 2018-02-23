package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: MSFileSaver
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 732607
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface MSFileSaver
{

    /*
        Methods
    */
    Boolean msSaveBlob(Object blob);
    /** 
      * tsd/browser/lib.es6.d.ts@732637
      * inherited from (js.browser.MSFileSaver)
     */
    Boolean msSaveBlob(Object blob, String defaultName /* optional */);
    Boolean msSaveOrOpenBlob(Object blob);
    /** 
      * tsd/browser/lib.es6.d.ts@732695
      * inherited from (js.browser.MSFileSaver)
     */
    Boolean msSaveOrOpenBlob(Object blob, String defaultName /* optional */);
}
