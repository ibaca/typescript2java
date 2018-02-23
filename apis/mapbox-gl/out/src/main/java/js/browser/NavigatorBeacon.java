package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: NavigatorBeacon
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 733278
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NavigatorBeacon
{

    /*
        Methods
    */
    Boolean sendBeacon(String url);
    /** 
      * tsd/browser/lib.es6.d.ts@733312
      * inherited from (js.browser.NavigatorBeacon)
     */
    Boolean sendBeacon(String url, Object data /* optional */);
}
