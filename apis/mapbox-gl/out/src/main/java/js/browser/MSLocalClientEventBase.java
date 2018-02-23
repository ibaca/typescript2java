package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSLocalClientEventBase
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 264123
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface MSLocalClientEventBase extends RTCStats 
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.MSLocalClientEventBase)
     */
    @JsProperty(name = "networkBandwidthLowEventRatio")
    Number getNetworkBandwidthLowEventRatio();
    /** 
      * inherited from (js.browser.MSLocalClientEventBase)
     */
    @JsProperty(name = "networkReceiveQualityEventRatio")
    Number getNetworkReceiveQualityEventRatio();
    /** 
      * inherited from (js.browser.MSLocalClientEventBase)
     */
    @JsProperty(name = "networkBandwidthLowEventRatio")
    void setNetworkBandwidthLowEventRatio(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSLocalClientEventBase)
     */
    @JsProperty(name = "networkReceiveQualityEventRatio")
    void setNetworkReceiveQualityEventRatio(@DoNotAutobox Number value);
}
