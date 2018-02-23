package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RequestInit
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 279814

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RequestInit
{

    /*
        Properties
    */

    public Object body;

    public String cache;

    public String credentials;

    public Object headers;

    public String integrity;

    public Boolean keepalive;

    public String method;

    public String mode;

    public String redirect;

    public String referrer;

    public String referrerPolicy;

    public Object window;

    /*
        Methods
    */
    @JsProperty(name = "body")
    public native Object getBody();
    @JsProperty(name = "cache")
    public native String getCache();
    @JsProperty(name = "credentials")
    public native String getCredentials();
    @JsProperty(name = "headers")
    public native Object getHeaders();
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
    @JsProperty(name = "window")
    public native Object getWindow();
    @JsProperty(name = "body")
    public native void setBody(Object value);
    @JsProperty(name = "cache")
    public native void setCache(String value);
    @JsProperty(name = "credentials")
    public native void setCredentials(String value);
    @JsProperty(name = "headers")
    public native void setHeaders(Object value);
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
    @JsProperty(name = "window")
    public native void setWindow(Object value);
}
