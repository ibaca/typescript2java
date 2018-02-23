package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: GlobalFetch
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 730920
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface GlobalFetch
{

    /*
        Methods
    */
    Promise<Response> fetch(String input);
    Promise<Response> fetch(String input, RequestInit init /* optional */);
    Promise<Response> fetch(Request input);
    Promise<Response> fetch(Request input, RequestInit init /* optional */);
    Promise<Response> fetch(RequestInfo_UnionOfRequestAndString input);
    /** 
      * tsd/browser/lib.es6.d.ts@730950
      * inherited from (js.browser.GlobalFetch)
     */
    Promise<Response> fetch(RequestInfo_UnionOfRequestAndString input, RequestInit init /* optional */);
}
