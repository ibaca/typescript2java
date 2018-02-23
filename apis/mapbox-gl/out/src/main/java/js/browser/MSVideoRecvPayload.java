package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSVideoRecvPayload
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 266565

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSVideoRecvPayload implements MSVideoPayload 
{

    /*
        Properties
    */

    public Number durationSeconds;

    public String id;

    public Number lowBitRateCallPercent;

    public Number lowFrameRateCallPercent;

    public String msType;

    public String payloadDescription;

    public Number recvBitRateAverage;

    public Number recvBitRateMaximum;

    public String recvCodecType;

    public Number recvFpsHarmonicAverage;

    public Number recvFrameRateAverage;

    public Number recvNumResSwitches;

    public Number recvReorderBufferMaxSuccessfullyOrderedExtent;

    public Number recvReorderBufferMaxSuccessfullyOrderedLateTime;

    public Number recvReorderBufferPacketsDroppedDueToBufferExhaustion;

    public Number recvReorderBufferPacketsDroppedDueToTimeout;

    public Number recvReorderBufferReorderedPackets;

    public Number recvResolutionHeight;

    public Number recvResolutionWidth;

    public Number recvVideoStreamsMax;

    public Number recvVideoStreamsMin;

    public Number recvVideoStreamsMode;

    public Number reorderBufferTotalPackets;

    public String resolution;

    public Number timestamp;

    public String type;

    public Number videoBitRateAvg;

    public Number videoBitRateMax;

    public Number videoFrameLossRate;

    public Number videoFrameRateAvg;

    public Number videoPacketLossRate;

    public Number videoPostFECPLR;

    public MSVideoResolutionDistribution videoResolutions;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "durationSeconds")
    public native Number getDurationSeconds();
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "lowBitRateCallPercent")
    public native Number getLowBitRateCallPercent();
    @JsProperty(name = "lowFrameRateCallPercent")
    public native Number getLowFrameRateCallPercent();
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "msType")
    public native String getMsType();
    /** 
      * inherited from (js.browser.MSPayloadBase)
      * inherited from (js.browser.MSPayloadBase)
      * inherited from (js.browser.MSPayloadBase)
      * inherited from (js.browser.MSPayloadBase)
     */
    @JsProperty(name = "payloadDescription")
    public native String getPayloadDescription();
    @JsProperty(name = "recvBitRateAverage")
    public native Number getRecvBitRateAverage();
    @JsProperty(name = "recvBitRateMaximum")
    public native Number getRecvBitRateMaximum();
    @JsProperty(name = "recvCodecType")
    public native String getRecvCodecType();
    @JsProperty(name = "recvFpsHarmonicAverage")
    public native Number getRecvFpsHarmonicAverage();
    @JsProperty(name = "recvFrameRateAverage")
    public native Number getRecvFrameRateAverage();
    @JsProperty(name = "recvNumResSwitches")
    public native Number getRecvNumResSwitches();
    @JsProperty(name = "recvReorderBufferMaxSuccessfullyOrderedExtent")
    public native Number getRecvReorderBufferMaxSuccessfullyOrderedExtent();
    @JsProperty(name = "recvReorderBufferMaxSuccessfullyOrderedLateTime")
    public native Number getRecvReorderBufferMaxSuccessfullyOrderedLateTime();
    @JsProperty(name = "recvReorderBufferPacketsDroppedDueToBufferExhaustion")
    public native Number getRecvReorderBufferPacketsDroppedDueToBufferExhaustion();
    @JsProperty(name = "recvReorderBufferPacketsDroppedDueToTimeout")
    public native Number getRecvReorderBufferPacketsDroppedDueToTimeout();
    @JsProperty(name = "recvReorderBufferReorderedPackets")
    public native Number getRecvReorderBufferReorderedPackets();
    @JsProperty(name = "recvResolutionHeight")
    public native Number getRecvResolutionHeight();
    @JsProperty(name = "recvResolutionWidth")
    public native Number getRecvResolutionWidth();
    @JsProperty(name = "recvVideoStreamsMax")
    public native Number getRecvVideoStreamsMax();
    @JsProperty(name = "recvVideoStreamsMin")
    public native Number getRecvVideoStreamsMin();
    @JsProperty(name = "recvVideoStreamsMode")
    public native Number getRecvVideoStreamsMode();
    @JsProperty(name = "reorderBufferTotalPackets")
    public native Number getReorderBufferTotalPackets();
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "resolution")
    public native String getResolution();
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "timestamp")
    public native Number getTimestamp();
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "type")
    public native String getType();
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoBitRateAvg")
    public native Number getVideoBitRateAvg();
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoBitRateMax")
    public native Number getVideoBitRateMax();
    @JsProperty(name = "videoFrameLossRate")
    public native Number getVideoFrameLossRate();
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoFrameRateAvg")
    public native Number getVideoFrameRateAvg();
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoPacketLossRate")
    public native Number getVideoPacketLossRate();
    @JsProperty(name = "videoPostFECPLR")
    public native Number getVideoPostFECPLR();
    @JsProperty(name = "videoResolutions")
    public native MSVideoResolutionDistribution getVideoResolutions();
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "durationSeconds")
    public native void setDurationSeconds(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "lowBitRateCallPercent")
    public native void setLowBitRateCallPercent(@DoNotAutobox Number value);
    @JsProperty(name = "lowFrameRateCallPercent")
    public native void setLowFrameRateCallPercent(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "msType")
    public native void setMsType(String value);
    /** 
      * inherited from (js.browser.MSPayloadBase)
      * inherited from (js.browser.MSPayloadBase)
      * inherited from (js.browser.MSPayloadBase)
      * inherited from (js.browser.MSPayloadBase)
     */
    @JsProperty(name = "payloadDescription")
    public native void setPayloadDescription(String value);
    @JsProperty(name = "recvBitRateAverage")
    public native void setRecvBitRateAverage(@DoNotAutobox Number value);
    @JsProperty(name = "recvBitRateMaximum")
    public native void setRecvBitRateMaximum(@DoNotAutobox Number value);
    @JsProperty(name = "recvCodecType")
    public native void setRecvCodecType(String value);
    @JsProperty(name = "recvFpsHarmonicAverage")
    public native void setRecvFpsHarmonicAverage(@DoNotAutobox Number value);
    @JsProperty(name = "recvFrameRateAverage")
    public native void setRecvFrameRateAverage(@DoNotAutobox Number value);
    @JsProperty(name = "recvNumResSwitches")
    public native void setRecvNumResSwitches(@DoNotAutobox Number value);
    @JsProperty(name = "recvReorderBufferMaxSuccessfullyOrderedExtent")
    public native void setRecvReorderBufferMaxSuccessfullyOrderedExtent(@DoNotAutobox Number value);
    @JsProperty(name = "recvReorderBufferMaxSuccessfullyOrderedLateTime")
    public native void setRecvReorderBufferMaxSuccessfullyOrderedLateTime(@DoNotAutobox Number value);
    @JsProperty(name = "recvReorderBufferPacketsDroppedDueToBufferExhaustion")
    public native void setRecvReorderBufferPacketsDroppedDueToBufferExhaustion(@DoNotAutobox Number value);
    @JsProperty(name = "recvReorderBufferPacketsDroppedDueToTimeout")
    public native void setRecvReorderBufferPacketsDroppedDueToTimeout(@DoNotAutobox Number value);
    @JsProperty(name = "recvReorderBufferReorderedPackets")
    public native void setRecvReorderBufferReorderedPackets(@DoNotAutobox Number value);
    @JsProperty(name = "recvResolutionHeight")
    public native void setRecvResolutionHeight(@DoNotAutobox Number value);
    @JsProperty(name = "recvResolutionWidth")
    public native void setRecvResolutionWidth(@DoNotAutobox Number value);
    @JsProperty(name = "recvVideoStreamsMax")
    public native void setRecvVideoStreamsMax(@DoNotAutobox Number value);
    @JsProperty(name = "recvVideoStreamsMin")
    public native void setRecvVideoStreamsMin(@DoNotAutobox Number value);
    @JsProperty(name = "recvVideoStreamsMode")
    public native void setRecvVideoStreamsMode(@DoNotAutobox Number value);
    @JsProperty(name = "reorderBufferTotalPackets")
    public native void setReorderBufferTotalPackets(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "resolution")
    public native void setResolution(String value);
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "timestamp")
    public native void setTimestamp(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "type")
    public native void setType(String value);
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoBitRateAvg")
    public native void setVideoBitRateAvg(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoBitRateMax")
    public native void setVideoBitRateMax(@DoNotAutobox Number value);
    @JsProperty(name = "videoFrameLossRate")
    public native void setVideoFrameLossRate(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoFrameRateAvg")
    public native void setVideoFrameRateAvg(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoPacketLossRate")
    public native void setVideoPacketLossRate(@DoNotAutobox Number value);
    @JsProperty(name = "videoPostFECPLR")
    public native void setVideoPostFECPLR(@DoNotAutobox Number value);
    @JsProperty(name = "videoResolutions")
    public native void setVideoResolutions(MSVideoResolutionDistribution value);
}
