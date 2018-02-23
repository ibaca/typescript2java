package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSNetwork
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 264268
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface MSNetwork extends RTCStats 
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "delay")
    MSDelay getDelay();
    /** 
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "jitter")
    MSJitter getJitter();
    /** 
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "packetLoss")
    MSPacketLoss getPacketLoss();
    /** 
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "utilization")
    MSUtilization getUtilization();
    /** 
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "delay")
    void setDelay(MSDelay value);
    /** 
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "jitter")
    void setJitter(MSJitter value);
    /** 
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "packetLoss")
    void setPacketLoss(MSPacketLoss value);
    /** 
      * inherited from (js.browser.MSNetwork)
     */
    @JsProperty(name = "utilization")
    void setUtilization(MSUtilization value);
}
