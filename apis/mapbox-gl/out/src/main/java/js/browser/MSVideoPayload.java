package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSVideoPayload
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 266332
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface MSVideoPayload extends MSPayloadBase 
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "durationSeconds")
    Number getDurationSeconds();
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "resolution")
    String getResolution();
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoBitRateAvg")
    Number getVideoBitRateAvg();
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoBitRateMax")
    Number getVideoBitRateMax();
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoFrameRateAvg")
    Number getVideoFrameRateAvg();
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoPacketLossRate")
    Number getVideoPacketLossRate();
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "durationSeconds")
    void setDurationSeconds(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "resolution")
    void setResolution(String value);
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoBitRateAvg")
    void setVideoBitRateAvg(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoBitRateMax")
    void setVideoBitRateMax(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoFrameRateAvg")
    void setVideoFrameRateAvg(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MSVideoPayload)
      * inherited from (js.browser.MSVideoPayload)
     */
    @JsProperty(name = "videoPacketLossRate")
    void setVideoPacketLossRate(@DoNotAutobox Number value);
}
