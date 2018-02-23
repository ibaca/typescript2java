package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Response
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 568564
  * declared in: tsd/browser/lib.es6.d.ts at pos 568859
  * 3 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Response")
public class Response implements Body 
{

    /*
        Constructors
    */
    public Response (Object body /* optional */, ResponseInit init /* optional */) {
    } 
    public Response (Object body /* optional */) {
    } 
    public Response () {
    } 

    /*
        Properties
    */

    public ReadableStream body;

    public Boolean bodyUsed;

    public Headers headers;

    public Boolean ok;

    public Number status;

    public String statusText;

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
      * tsd/browser/lib.es6.d.ts@568826
     */
    public native Response clone();
    @JsProperty(name = "body")
    public native ReadableStream getBody();
    /** 
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    @JsProperty(name = "bodyUsed")
    public native Boolean getBodyUsed();
    @JsProperty(name = "headers")
    public native Headers getHeaders();
    @JsProperty(name = "ok")
    public native Boolean getOk();
    @JsProperty(name = "status")
    public native Number getStatus();
    @JsProperty(name = "statusText")
    public native String getStatusText();
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
    @JsProperty(name = "body")
    public native void setBody(ReadableStream value);
    /** 
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    @JsProperty(name = "bodyUsed")
    public native void setBodyUsed(Boolean value);
    @JsProperty(name = "headers")
    public native void setHeaders(Headers value);
    @JsProperty(name = "ok")
    public native void setOk(Boolean value);
    @JsProperty(name = "status")
    public native void setStatus(@DoNotAutobox Number value);
    @JsProperty(name = "statusText")
    public native void setStatusText(String value);
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
