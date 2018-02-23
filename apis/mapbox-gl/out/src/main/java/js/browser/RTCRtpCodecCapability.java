package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpCodecCapability
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 277044

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtpCodecCapability
{

    /*
        Properties
    */

    public Number clockRate;

    public String kind;

    public Number maxSpatialLayers;

    public Number maxTemporalLayers;

    public Number maxptime;

    public String name;

    public Number numChannels;

    public Object options;

    public Object parameters;

    public Number preferredPayloadType;

    public Number ptime;

    public Array<RTCRtcpFeedback> rtcpFeedback;

    public Boolean svcMultiStreamSupport;

    /*
        Methods
    */
    @JsProperty(name = "clockRate")
    public native Number getClockRate();
    @JsProperty(name = "kind")
    public native String getKind();
    @JsProperty(name = "maxSpatialLayers")
    public native Number getMaxSpatialLayers();
    @JsProperty(name = "maxTemporalLayers")
    public native Number getMaxTemporalLayers();
    @JsProperty(name = "maxptime")
    public native Number getMaxptime();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "numChannels")
    public native Number getNumChannels();
    @JsProperty(name = "options")
    public native Object getOptions();
    @JsProperty(name = "parameters")
    public native Object getParameters();
    @JsProperty(name = "preferredPayloadType")
    public native Number getPreferredPayloadType();
    @JsProperty(name = "ptime")
    public native Number getPtime();
    @JsProperty(name = "rtcpFeedback")
    public native Array<RTCRtcpFeedback> getRtcpFeedback();
    @JsProperty(name = "svcMultiStreamSupport")
    public native Boolean getSvcMultiStreamSupport();
    @JsProperty(name = "clockRate")
    public native void setClockRate(@DoNotAutobox Number value);
    @JsProperty(name = "kind")
    public native void setKind(String value);
    @JsProperty(name = "maxSpatialLayers")
    public native void setMaxSpatialLayers(@DoNotAutobox Number value);
    @JsProperty(name = "maxTemporalLayers")
    public native void setMaxTemporalLayers(@DoNotAutobox Number value);
    @JsProperty(name = "maxptime")
    public native void setMaxptime(@DoNotAutobox Number value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "numChannels")
    public native void setNumChannels(@DoNotAutobox Number value);
    @JsProperty(name = "options")
    public native void setOptions(Object value);
    @JsProperty(name = "parameters")
    public native void setParameters(Object value);
    @JsProperty(name = "preferredPayloadType")
    public native void setPreferredPayloadType(@DoNotAutobox Number value);
    @JsProperty(name = "ptime")
    public native void setPtime(@DoNotAutobox Number value);
    @JsProperty(name = "rtcpFeedback")
    public native void setRtcpFeedback(Array<RTCRtcpFeedback> value);
    @JsProperty(name = "svcMultiStreamSupport")
    public native void setSvcMultiStreamSupport(Boolean value);
}
