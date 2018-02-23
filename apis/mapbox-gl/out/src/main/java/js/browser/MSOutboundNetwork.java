package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSOutboundNetwork
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 264753

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSOutboundNetwork implements MSNetwork 
{

    /*
        Properties
    */

    public Number appliedBandwidthLimit;

    public MSDelay delay;

    public String id;

    public MSJitter jitter;

    public String msType;

    public MSPacketLoss packetLoss;

    public Number timestamp;

    public String type;

    public MSUtilization utilization;

    /*
        Methods
    */
    @JsProperty(name = "appliedBandwidthLimit")
    public native Number getAppliedBandwidthLimit();
    /** 
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "delay")
    public native MSDelay getDelay();
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
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "jitter")
    public native MSJitter getJitter();
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
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "packetLoss")
    public native MSPacketLoss getPacketLoss();
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
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "utilization")
    public native MSUtilization getUtilization();
    @JsProperty(name = "appliedBandwidthLimit")
    public native void setAppliedBandwidthLimit(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "delay")
    public native void setDelay(MSDelay value);
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
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "jitter")
    public native void setJitter(MSJitter value);
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
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "packetLoss")
    public native void setPacketLoss(MSPacketLoss value);
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
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "utilization")
    public native void setUtilization(MSUtilization value);
}
