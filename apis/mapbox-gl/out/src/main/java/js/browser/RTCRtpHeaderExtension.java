package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpHeaderExtension
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 278270

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtpHeaderExtension
{

    /*
        Properties
    */

    public String kind;

    public Boolean preferredEncrypt;

    public Number preferredId;

    public String uri;

    /*
        Methods
    */
    @JsProperty(name = "kind")
    public native String getKind();
    @JsProperty(name = "preferredEncrypt")
    public native Boolean getPreferredEncrypt();
    @JsProperty(name = "preferredId")
    public native Number getPreferredId();
    @JsProperty(name = "uri")
    public native String getUri();
    @JsProperty(name = "kind")
    public native void setKind(String value);
    @JsProperty(name = "preferredEncrypt")
    public native void setPreferredEncrypt(Boolean value);
    @JsProperty(name = "preferredId")
    public native void setPreferredId(@DoNotAutobox Number value);
    @JsProperty(name = "uri")
    public native void setUri(String value);
}
