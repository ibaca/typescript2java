package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpCapabilities
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 276894

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtpCapabilities
{

    /*
        Properties
    */

    public Array<RTCRtpCodecCapability> codecs;

    public Array<String> fecMechanisms;

    public Array<RTCRtpHeaderExtension> headerExtensions;

    /*
        Methods
    */
    @JsProperty(name = "codecs")
    public native Array<RTCRtpCodecCapability> getCodecs();
    @JsProperty(name = "fecMechanisms")
    public native Array<String> getFecMechanisms();
    @JsProperty(name = "headerExtensions")
    public native Array<RTCRtpHeaderExtension> getHeaderExtensions();
    @JsProperty(name = "codecs")
    public native void setCodecs(Array<RTCRtpCodecCapability> value);
    @JsProperty(name = "fecMechanisms")
    public native void setFecMechanisms(Array<String> value);
    @JsProperty(name = "headerExtensions")
    public native void setHeaderExtensions(Array<RTCRtpHeaderExtension> value);
}
