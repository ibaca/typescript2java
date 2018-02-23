package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRTPStreamStats
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 276410
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface RTCRTPStreamStats extends RTCStats 
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "associateStatsId")
    String getAssociateStatsId();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "codecId")
    String getCodecId();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "firCount")
    Number getFirCount();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "isRemote")
    Boolean getIsRemote();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "mediaTrackId")
    String getMediaTrackId();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "nackCount")
    Number getNackCount();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "pliCount")
    Number getPliCount();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "sliCount")
    Number getSliCount();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "ssrc")
    String getSsrc();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "transportId")
    String getTransportId();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "associateStatsId")
    void setAssociateStatsId(String value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "codecId")
    void setCodecId(String value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "firCount")
    void setFirCount(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "isRemote")
    void setIsRemote(Boolean value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "mediaTrackId")
    void setMediaTrackId(String value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "nackCount")
    void setNackCount(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "pliCount")
    void setPliCount(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "sliCount")
    void setSliCount(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "ssrc")
    void setSsrc(String value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "transportId")
    void setTransportId(String value);
}
