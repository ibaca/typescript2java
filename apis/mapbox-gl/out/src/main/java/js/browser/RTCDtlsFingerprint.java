package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCDtlsFingerprint
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 273661

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCDtlsFingerprint
{

    /*
        Properties
    */

    public String algorithm;

    public String value;

    /*
        Methods
    */
    @JsProperty(name = "algorithm")
    public native String getAlgorithm();
    @JsProperty(name = "value")
    public native String getValue();
    @JsProperty(name = "algorithm")
    public native void setAlgorithm(String value);
    @JsProperty(name = "value")
    public native void setValue(String value);
}
