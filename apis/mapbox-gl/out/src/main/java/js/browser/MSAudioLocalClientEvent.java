package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSAudioLocalClientEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 260202

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSAudioLocalClientEvent implements MSLocalClientEventBase 
{

    /*
        Properties
    */

    public Number cpuInsufficientEventRatio;

    public Number deviceCaptureNotFunctioningEventRatio;

    public Number deviceClippingEventRatio;

    public Number deviceEchoEventRatio;

    public Number deviceGlitchesEventRatio;

    public Number deviceHalfDuplexAECEventRatio;

    public Number deviceHowlingEventCount;

    public Number deviceLowSNREventRatio;

    public Number deviceLowSpeechLevelEventRatio;

    public Number deviceMultipleEndpointsEventCount;

    public Number deviceNearEndToEchoRatioEventRatio;

    public Number deviceRenderMuteEventRatio;

    public Number deviceRenderNotFunctioningEventRatio;

    public Number deviceRenderZeroVolumeEventRatio;

    public String id;

    public String msType;

    public Number networkBandwidthLowEventRatio;

    public Number networkDelayEventRatio;

    public Number networkReceiveQualityEventRatio;

    public Number networkSendQualityEventRatio;

    public Number timestamp;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "cpuInsufficientEventRatio")
    public native Number getCpuInsufficientEventRatio();
    @JsProperty(name = "deviceCaptureNotFunctioningEventRatio")
    public native Number getDeviceCaptureNotFunctioningEventRatio();
    @JsProperty(name = "deviceClippingEventRatio")
    public native Number getDeviceClippingEventRatio();
    @JsProperty(name = "deviceEchoEventRatio")
    public native Number getDeviceEchoEventRatio();
    @JsProperty(name = "deviceGlitchesEventRatio")
    public native Number getDeviceGlitchesEventRatio();
    @JsProperty(name = "deviceHalfDuplexAECEventRatio")
    public native Number getDeviceHalfDuplexAECEventRatio();
    @JsProperty(name = "deviceHowlingEventCount")
    public native Number getDeviceHowlingEventCount();
    @JsProperty(name = "deviceLowSNREventRatio")
    public native Number getDeviceLowSNREventRatio();
    @JsProperty(name = "deviceLowSpeechLevelEventRatio")
    public native Number getDeviceLowSpeechLevelEventRatio();
    @JsProperty(name = "deviceMultipleEndpointsEventCount")
    public native Number getDeviceMultipleEndpointsEventCount();
    @JsProperty(name = "deviceNearEndToEchoRatioEventRatio")
    public native Number getDeviceNearEndToEchoRatioEventRatio();
    @JsProperty(name = "deviceRenderMuteEventRatio")
    public native Number getDeviceRenderMuteEventRatio();
    @JsProperty(name = "deviceRenderNotFunctioningEventRatio")
    public native Number getDeviceRenderNotFunctioningEventRatio();
    @JsProperty(name = "deviceRenderZeroVolumeEventRatio")
    public native Number getDeviceRenderZeroVolumeEventRatio();
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
    /** 
      * inherited from (js.browser.MSLocalClientEventBase)
     */
    @JsProperty(name = "networkBandwidthLowEventRatio")
    public native Number getNetworkBandwidthLowEventRatio();
    @JsProperty(name = "networkDelayEventRatio")
    public native Number getNetworkDelayEventRatio();
    /** 
      * inherited from (js.browser.MSLocalClientEventBase)
     */
    @JsProperty(name = "networkReceiveQualityEventRatio")
    public native Number getNetworkReceiveQualityEventRatio();
    @JsProperty(name = "networkSendQualityEventRatio")
    public native Number getNetworkSendQualityEventRatio();
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
    @JsProperty(name = "cpuInsufficientEventRatio")
    public native void setCpuInsufficientEventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "deviceCaptureNotFunctioningEventRatio")
    public native void setDeviceCaptureNotFunctioningEventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "deviceClippingEventRatio")
    public native void setDeviceClippingEventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "deviceEchoEventRatio")
    public native void setDeviceEchoEventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "deviceGlitchesEventRatio")
    public native void setDeviceGlitchesEventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "deviceHalfDuplexAECEventRatio")
    public native void setDeviceHalfDuplexAECEventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "deviceHowlingEventCount")
    public native void setDeviceHowlingEventCount(@DoNotAutobox Number value);
    @JsProperty(name = "deviceLowSNREventRatio")
    public native void setDeviceLowSNREventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "deviceLowSpeechLevelEventRatio")
    public native void setDeviceLowSpeechLevelEventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "deviceMultipleEndpointsEventCount")
    public native void setDeviceMultipleEndpointsEventCount(@DoNotAutobox Number value);
    @JsProperty(name = "deviceNearEndToEchoRatioEventRatio")
    public native void setDeviceNearEndToEchoRatioEventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "deviceRenderMuteEventRatio")
    public native void setDeviceRenderMuteEventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "deviceRenderNotFunctioningEventRatio")
    public native void setDeviceRenderNotFunctioningEventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "deviceRenderZeroVolumeEventRatio")
    public native void setDeviceRenderZeroVolumeEventRatio(@DoNotAutobox Number value);
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
    /** 
      * inherited from (js.browser.MSLocalClientEventBase)
     */
    @JsProperty(name = "networkBandwidthLowEventRatio")
    public native void setNetworkBandwidthLowEventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "networkDelayEventRatio")
    public native void setNetworkDelayEventRatio(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSLocalClientEventBase)
     */
    @JsProperty(name = "networkReceiveQualityEventRatio")
    public native void setNetworkReceiveQualityEventRatio(@DoNotAutobox Number value);
    @JsProperty(name = "networkSendQualityEventRatio")
    public native void setNetworkSendQualityEventRatio(@DoNotAutobox Number value);
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
