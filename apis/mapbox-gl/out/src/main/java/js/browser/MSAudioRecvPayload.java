package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSAudioRecvPayload
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 260957

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSAudioRecvPayload implements MSPayloadBase 
{

    /*
        Properties
    */

    public Number burstLossLength1;

    public Number burstLossLength2;

    public Number burstLossLength3;

    public Number burstLossLength4;

    public Number burstLossLength5;

    public Number burstLossLength6;

    public Number burstLossLength7;

    public Number burstLossLength8OrHigher;

    public Number fecRecvDistance1;

    public Number fecRecvDistance2;

    public Number fecRecvDistance3;

    public String id;

    public String msType;

    public Number packetReorderDepthAvg;

    public Number packetReorderDepthMax;

    public Number packetReorderRatio;

    public String payloadDescription;

    public Number ratioCompressedSamplesAvg;

    public Number ratioConcealedSamplesAvg;

    public Number ratioStretchedSamplesAvg;

    public Number samplingRate;

    public MSAudioRecvSignal signal;

    public Number timestamp;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "burstLossLength1")
    public native Number getBurstLossLength1();
    @JsProperty(name = "burstLossLength2")
    public native Number getBurstLossLength2();
    @JsProperty(name = "burstLossLength3")
    public native Number getBurstLossLength3();
    @JsProperty(name = "burstLossLength4")
    public native Number getBurstLossLength4();
    @JsProperty(name = "burstLossLength5")
    public native Number getBurstLossLength5();
    @JsProperty(name = "burstLossLength6")
    public native Number getBurstLossLength6();
    @JsProperty(name = "burstLossLength7")
    public native Number getBurstLossLength7();
    @JsProperty(name = "burstLossLength8OrHigher")
    public native Number getBurstLossLength8OrHigher();
    @JsProperty(name = "fecRecvDistance1")
    public native Number getFecRecvDistance1();
    @JsProperty(name = "fecRecvDistance2")
    public native Number getFecRecvDistance2();
    @JsProperty(name = "fecRecvDistance3")
    public native Number getFecRecvDistance3();
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
    @JsProperty(name = "packetReorderDepthAvg")
    public native Number getPacketReorderDepthAvg();
    @JsProperty(name = "packetReorderDepthMax")
    public native Number getPacketReorderDepthMax();
    @JsProperty(name = "packetReorderRatio")
    public native Number getPacketReorderRatio();
    /** 
      * inherited from (js.browser.MSPayloadBase)
      * inherited from (js.browser.MSPayloadBase)
      * inherited from (js.browser.MSPayloadBase)
      * inherited from (js.browser.MSPayloadBase)
     */
    @JsProperty(name = "payloadDescription")
    public native String getPayloadDescription();
    @JsProperty(name = "ratioCompressedSamplesAvg")
    public native Number getRatioCompressedSamplesAvg();
    @JsProperty(name = "ratioConcealedSamplesAvg")
    public native Number getRatioConcealedSamplesAvg();
    @JsProperty(name = "ratioStretchedSamplesAvg")
    public native Number getRatioStretchedSamplesAvg();
    @JsProperty(name = "samplingRate")
    public native Number getSamplingRate();
    @JsProperty(name = "signal")
    public native MSAudioRecvSignal getSignal();
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
    @JsProperty(name = "burstLossLength1")
    public native void setBurstLossLength1(@DoNotAutobox Number value);
    @JsProperty(name = "burstLossLength2")
    public native void setBurstLossLength2(@DoNotAutobox Number value);
    @JsProperty(name = "burstLossLength3")
    public native void setBurstLossLength3(@DoNotAutobox Number value);
    @JsProperty(name = "burstLossLength4")
    public native void setBurstLossLength4(@DoNotAutobox Number value);
    @JsProperty(name = "burstLossLength5")
    public native void setBurstLossLength5(@DoNotAutobox Number value);
    @JsProperty(name = "burstLossLength6")
    public native void setBurstLossLength6(@DoNotAutobox Number value);
    @JsProperty(name = "burstLossLength7")
    public native void setBurstLossLength7(@DoNotAutobox Number value);
    @JsProperty(name = "burstLossLength8OrHigher")
    public native void setBurstLossLength8OrHigher(@DoNotAutobox Number value);
    @JsProperty(name = "fecRecvDistance1")
    public native void setFecRecvDistance1(@DoNotAutobox Number value);
    @JsProperty(name = "fecRecvDistance2")
    public native void setFecRecvDistance2(@DoNotAutobox Number value);
    @JsProperty(name = "fecRecvDistance3")
    public native void setFecRecvDistance3(@DoNotAutobox Number value);
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
    @JsProperty(name = "packetReorderDepthAvg")
    public native void setPacketReorderDepthAvg(@DoNotAutobox Number value);
    @JsProperty(name = "packetReorderDepthMax")
    public native void setPacketReorderDepthMax(@DoNotAutobox Number value);
    @JsProperty(name = "packetReorderRatio")
    public native void setPacketReorderRatio(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSPayloadBase)
      * inherited from (js.browser.MSPayloadBase)
      * inherited from (js.browser.MSPayloadBase)
      * inherited from (js.browser.MSPayloadBase)
     */
    @JsProperty(name = "payloadDescription")
    public native void setPayloadDescription(String value);
    @JsProperty(name = "ratioCompressedSamplesAvg")
    public native void setRatioCompressedSamplesAvg(@DoNotAutobox Number value);
    @JsProperty(name = "ratioConcealedSamplesAvg")
    public native void setRatioConcealedSamplesAvg(@DoNotAutobox Number value);
    @JsProperty(name = "ratioStretchedSamplesAvg")
    public native void setRatioStretchedSamplesAvg(@DoNotAutobox Number value);
    @JsProperty(name = "samplingRate")
    public native void setSamplingRate(@DoNotAutobox Number value);
    @JsProperty(name = "signal")
    public native void setSignal(MSAudioRecvSignal value);
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
}
