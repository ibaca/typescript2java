package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Request
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 567985
  * declared in: tsd/browser/lib.es6.d.ts at pos 568464
  * 6 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Request")
public class Request implements Body 
{

    /*
        Constructors
    */
    public Request (RequestInfo_UnionOfRequestAndString input, RequestInit init /* optional */) {
    } 
    public Request (Request input, RequestInit init /* optional */) {
    } 
    public Request (String input, RequestInit init /* optional */) {
    } 
    public Request (RequestInfo_UnionOfRequestAndString input) {
    } 
    public Request (Request input) {
    } 
    public Request (String input) {
    } 

    /*
        Properties
    */

    public Boolean bodyUsed;

    public String cache;

    public String credentials;

    public String destination;

    public Headers headers;

    public String integrity;

    public Boolean keepalive;

    public String method;

    public String mode;

    public String redirect;

    public String referrer;

    public String referrerPolicy;

    public String type;

    public String url;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@723074
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    public native Promise<ArrayBuffer> arrayBuffer();
    /** 
      * tsd/browser/lib.es6.d.ts@723115
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    public native Promise<Blob> blob();
    /** 
      * tsd/browser/lib.es6.d.ts@568432
     */
    public native Request clone();
    /** 
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    @JsProperty(name = "bodyUsed")
    public native Boolean getBodyUsed();
    @JsProperty(name = "cache")
    public native String getCache();
    @JsProperty(name = "credentials")
    public native String getCredentials();
    @JsProperty(name = "destination")
    public native String getDestination();
    @JsProperty(name = "headers")
    public native Headers getHeaders();
    @JsProperty(name = "integrity")
    public native String getIntegrity();
    @JsProperty(name = "keepalive")
    public native Boolean getKeepalive();
    @JsProperty(name = "method")
    public native String getMethod();
    @JsProperty(name = "mode")
    public native String getMode();
    @JsProperty(name = "redirect")
    public native String getRedirect();
    @JsProperty(name = "referrer")
    public native String getReferrer();
    @JsProperty(name = "referrerPolicy")
    public native String getReferrerPolicy();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "url")
    public native String getUrl();
    /** 
      * tsd/browser/lib.es6.d.ts@723142
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    public native Promise<Object> json();
    /** 
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    @JsProperty(name = "bodyUsed")
    public native void setBodyUsed(Boolean value);
    @JsProperty(name = "cache")
    public native void setCache(String value);
    @JsProperty(name = "credentials")
    public native void setCredentials(String value);
    @JsProperty(name = "destination")
    public native void setDestination(String value);
    @JsProperty(name = "headers")
    public native void setHeaders(Headers value);
    @JsProperty(name = "integrity")
    public native void setIntegrity(String value);
    @JsProperty(name = "keepalive")
    public native void setKeepalive(Boolean value);
    @JsProperty(name = "method")
    public native void setMethod(String value);
    @JsProperty(name = "mode")
    public native void setMode(String value);
    @JsProperty(name = "redirect")
    public native void setRedirect(String value);
    @JsProperty(name = "referrer")
    public native void setReferrer(String value);
    @JsProperty(name = "referrerPolicy")
    public native void setReferrerPolicy(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
    @JsProperty(name = "url")
    public native void setUrl(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@723168
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    public native Promise<String> text();
}
