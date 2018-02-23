package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCInboundRTPStreamStats
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 275326

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCInboundRTPStreamStats implements RTCRTPStreamStats 
{

    /*
        Properties
    */

    public String associateStatsId;

    public Number bytesReceived;

    public String codecId;

    public Number firCount;

    public Number fractionLost;

    public String id;

    public Boolean isRemote;

    public Number jitter;

    public String mediaTrackId;

    public String msType;

    public Number nackCount;

    public Number packetsLost;

    public Number packetsReceived;

    public Number pliCount;

    public Number sliCount;

    public String ssrc;

    public Number timestamp;

    public String transportId;

    public String type;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "associateStatsId")
    public native String getAssociateStatsId();
    @JsProperty(name = "bytesReceived")
    public native Number getBytesReceived();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "codecId")
    public native String getCodecId();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "firCount")
    public native Number getFirCount();
    @JsProperty(name = "fractionLost")
    public native Number getFractionLost();
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
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "isRemote")
    public native Boolean getIsRemote();
    @JsProperty(name = "jitter")
    public native Number getJitter();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "mediaTrackId")
    public native String getMediaTrackId();
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
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "nackCount")
    public native Number getNackCount();
    @JsProperty(name = "packetsLost")
    public native Number getPacketsLost();
    @JsProperty(name = "packetsReceived")
    public native Number getPacketsReceived();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "pliCount")
    public native Number getPliCount();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "sliCount")
    public native Number getSliCount();
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "ssrc")
    public native String getSsrc();
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
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "transportId")
    public native String getTransportId();
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
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "associateStatsId")
    public native void setAssociateStatsId(String value);
    @JsProperty(name = "bytesReceived")
    public native void setBytesReceived(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "codecId")
    public native void setCodecId(String value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "firCount")
    public native void setFirCount(@DoNotAutobox Number value);
    @JsProperty(name = "fractionLost")
    public native void setFractionLost(@DoNotAutobox Number value);
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
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "isRemote")
    public native void setIsRemote(Boolean value);
    @JsProperty(name = "jitter")
    public native void setJitter(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "mediaTrackId")
    public native void setMediaTrackId(String value);
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
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "nackCount")
    public native void setNackCount(@DoNotAutobox Number value);
    @JsProperty(name = "packetsLost")
    public native void setPacketsLost(@DoNotAutobox Number value);
    @JsProperty(name = "packetsReceived")
    public native void setPacketsReceived(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "pliCount")
    public native void setPliCount(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "sliCount")
    public native void setSliCount(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "ssrc")
    public native void setSsrc(String value);
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
      * inherited from (js.browser.RTCRTPStreamStats)
      * inherited from (js.browser.RTCRTPStreamStats)
     */
    @JsProperty(name = "transportId")
    public native void setTransportId(String value);
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
