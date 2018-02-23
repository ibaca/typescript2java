package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: WindowBase64
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 735406
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface WindowBase64
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@735437
      * inherited from (js.browser.WindowBase64)
     */
    String atob(String encodedString);
    /** 
      * tsd/browser/lib.es6.d.ts@735478
      * inherited from (js.browser.WindowBase64)
     */
    String btoa(String rawString);
}
