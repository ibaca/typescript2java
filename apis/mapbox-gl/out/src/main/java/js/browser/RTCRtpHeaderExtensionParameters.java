package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpHeaderExtensionParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 278402

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtpHeaderExtensionParameters
{

    /*
        Properties
    */

    public Boolean encrypt;

    public Number id;

    public String uri;

    /*
        Methods
    */
    @JsProperty(name = "encrypt")
    public native Boolean getEncrypt();
    @JsProperty(name = "id")
    public native Number getId();
    @JsProperty(name = "uri")
    public native String getUri();
    @JsProperty(name = "encrypt")
    public native void setEncrypt(Boolean value);
    @JsProperty(name = "id")
    public native void setId(@DoNotAutobox Number value);
    @JsProperty(name = "uri")
    public native void setUri(String value);
}
