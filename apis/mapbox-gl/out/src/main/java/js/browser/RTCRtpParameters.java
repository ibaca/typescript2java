package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 278507

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtpParameters
{

    /*
        Properties
    */

    public Array<RTCRtpCodecParameters> codecs;

    public String degradationPreference;

    public Array<RTCRtpEncodingParameters> encodings;

    public Array<RTCRtpHeaderExtensionParameters> headerExtensions;

    public String muxId;

    public RTCRtcpParameters rtcp;

    /*
        Methods
    */
    @JsProperty(name = "codecs")
    public native Array<RTCRtpCodecParameters> getCodecs();
    @JsProperty(name = "degradationPreference")
    public native String getDegradationPreference();
    @JsProperty(name = "encodings")
    public native Array<RTCRtpEncodingParameters> getEncodings();
    @JsProperty(name = "headerExtensions")
    public native Array<RTCRtpHeaderExtensionParameters> getHeaderExtensions();
    @JsProperty(name = "muxId")
    public native String getMuxId();
    @JsProperty(name = "rtcp")
    public native RTCRtcpParameters getRtcp();
    @JsProperty(name = "codecs")
    public native void setCodecs(Array<RTCRtpCodecParameters> value);
    @JsProperty(name = "degradationPreference")
    public native void setDegradationPreference(String value);
    @JsProperty(name = "encodings")
    public native void setEncodings(Array<RTCRtpEncodingParameters> value);
    @JsProperty(name = "headerExtensions")
    public native void setHeaderExtensions(Array<RTCRtpHeaderExtensionParameters> value);
    @JsProperty(name = "muxId")
    public native void setMuxId(String value);
    @JsProperty(name = "rtcp")
    public native void setRtcp(RTCRtcpParameters value);
}
