package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpEncodingParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 277766

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtpEncodingParameters
{

    /*
        Properties
    */

    public Boolean active;

    public Number codecPayloadType;

    public Array<String> dependencyEncodingIds;

    public String encodingId;

    public RTCRtpFecParameters fec;

    public Number framerateScale;

    public Number maxBitrate;

    public Number maxFramerate;

    public Number minQuality;

    public Number priority;

    public Number resolutionScale;

    public RTCRtpRtxParameters rtx;

    public Number ssrc;

    public RTCSsrcRange ssrcRange;

    /*
        Methods
    */
    @JsProperty(name = "active")
    public native Boolean getActive();
    @JsProperty(name = "codecPayloadType")
    public native Number getCodecPayloadType();
    @JsProperty(name = "dependencyEncodingIds")
    public native Array<String> getDependencyEncodingIds();
    @JsProperty(name = "encodingId")
    public native String getEncodingId();
    @JsProperty(name = "fec")
    public native RTCRtpFecParameters getFec();
    @JsProperty(name = "framerateScale")
    public native Number getFramerateScale();
    @JsProperty(name = "maxBitrate")
    public native Number getMaxBitrate();
    @JsProperty(name = "maxFramerate")
    public native Number getMaxFramerate();
    @JsProperty(name = "minQuality")
    public native Number getMinQuality();
    @JsProperty(name = "priority")
    public native Number getPriority();
    @JsProperty(name = "resolutionScale")
    public native Number getResolutionScale();
    @JsProperty(name = "rtx")
    public native RTCRtpRtxParameters getRtx();
    @JsProperty(name = "ssrc")
    public native Number getSsrc();
    @JsProperty(name = "ssrcRange")
    public native RTCSsrcRange getSsrcRange();
    @JsProperty(name = "active")
    public native void setActive(Boolean value);
    @JsProperty(name = "codecPayloadType")
    public native void setCodecPayloadType(@DoNotAutobox Number value);
    @JsProperty(name = "dependencyEncodingIds")
    public native void setDependencyEncodingIds(Array<String> value);
    @JsProperty(name = "encodingId")
    public native void setEncodingId(String value);
    @JsProperty(name = "fec")
    public native void setFec(RTCRtpFecParameters value);
    @JsProperty(name = "framerateScale")
    public native void setFramerateScale(@DoNotAutobox Number value);
    @JsProperty(name = "maxBitrate")
    public native void setMaxBitrate(@DoNotAutobox Number value);
    @JsProperty(name = "maxFramerate")
    public native void setMaxFramerate(@DoNotAutobox Number value);
    @JsProperty(name = "minQuality")
    public native void setMinQuality(@DoNotAutobox Number value);
    @JsProperty(name = "priority")
    public native void setPriority(@DoNotAutobox Number value);
    @JsProperty(name = "resolutionScale")
    public native void setResolutionScale(@DoNotAutobox Number value);
    @JsProperty(name = "rtx")
    public native void setRtx(RTCRtpRtxParameters value);
    @JsProperty(name = "ssrc")
    public native void setSsrc(@DoNotAutobox Number value);
    @JsProperty(name = "ssrcRange")
    public native void setSsrcRange(RTCSsrcRange value);
}
