package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpCodecParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 277426

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtpCodecParameters
{

    /*
        Properties
    */

    public Number clockRate;

    public Number maxptime;

    public String name;

    public Number numChannels;

    public Object parameters;

    public Object payloadType;

    public Number ptime;

    public Array<RTCRtcpFeedback> rtcpFeedback;

    /*
        Methods
    */
    @JsProperty(name = "clockRate")
    public native Number getClockRate();
    @JsProperty(name = "maxptime")
    public native Number getMaxptime();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "numChannels")
    public native Number getNumChannels();
    @JsProperty(name = "parameters")
    public native Object getParameters();
    @JsProperty(name = "payloadType")
    public native Object getPayloadType();
    @JsProperty(name = "ptime")
    public native Number getPtime();
    @JsProperty(name = "rtcpFeedback")
    public native Array<RTCRtcpFeedback> getRtcpFeedback();
    @JsProperty(name = "clockRate")
    public native void setClockRate(@DoNotAutobox Number value);
    @JsProperty(name = "maxptime")
    public native void setMaxptime(@DoNotAutobox Number value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "numChannels")
    public native void setNumChannels(@DoNotAutobox Number value);
    @JsProperty(name = "parameters")
    public native void setParameters(Object value);
    @JsProperty(name = "payloadType")
    public native void setPayloadType(Object value);
    @JsProperty(name = "ptime")
    public native void setPtime(@DoNotAutobox Number value);
    @JsProperty(name = "rtcpFeedback")
    public native void setRtcpFeedback(Array<RTCRtcpFeedback> value);
}
