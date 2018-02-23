package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCDtlsParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 273739

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCDtlsParameters
{

    /*
        Properties
    */

    public Array<RTCDtlsFingerprint> fingerprints;

    public String role;

    /*
        Methods
    */
    @JsProperty(name = "fingerprints")
    public native Array<RTCDtlsFingerprint> getFingerprints();
    @JsProperty(name = "role")
    public native String getRole();
    @JsProperty(name = "fingerprints")
    public native void setFingerprints(Array<RTCDtlsFingerprint> value);
    @JsProperty(name = "role")
    public native void setRole(String value);
}
