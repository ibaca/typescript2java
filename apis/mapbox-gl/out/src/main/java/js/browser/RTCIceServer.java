package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceServer
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 275234

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCIceServer
{

    /*
        Properties
    */

    public String credential;

    public Object urls;

    public String username;

    /*
        Methods
    */
    @JsProperty(name = "credential")
    public native String getCredential();
    @JsProperty(name = "urls")
    public native Object getUrls();
    @JsProperty(name = "username")
    public native String getUsername();
    @JsProperty(name = "credential")
    public native void setCredential(String value);
    @JsProperty(name = "urls")
    public native void setUrls(Object value);
    @JsProperty(name = "username")
    public native void setUsername(String value);
}
