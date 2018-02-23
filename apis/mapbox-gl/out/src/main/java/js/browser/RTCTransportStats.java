package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCTransportStats
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 279485

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCTransportStats implements RTCStats 
{

    /*
        Properties
    */

    public Boolean activeConnection;

    public Number bytesReceived;

    public Number bytesSent;

    public String id;

    public String localCertificateId;

    public String msType;

    public String remoteCertificateId;

    public String rtcpTransportStatsId;

    public String selectedCandidatePairId;

    public Number timestamp;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "activeConnection")
    public native Boolean getActiveConnection();
    @JsProperty(name = "bytesReceived")
    public native Number getBytesReceived();
    @JsProperty(name = "bytesSent")
    public native Number getBytesSent();
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
    @JsProperty(name = "localCertificateId")
    public native String getLocalCertificateId();
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
    @JsProperty(name = "remoteCertificateId")
    public native String getRemoteCertificateId();
    @JsProperty(name = "rtcpTransportStatsId")
    public native String getRtcpTransportStatsId();
    @JsProperty(name = "selectedCandidatePairId")
    public native String getSelectedCandidatePairId();
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
    @JsProperty(name = "activeConnection")
    public native void setActiveConnection(Boolean value);
    @JsProperty(name = "bytesReceived")
    public native void setBytesReceived(@DoNotAutobox Number value);
    @JsProperty(name = "bytesSent")
    public native void setBytesSent(@DoNotAutobox Number value);
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
    @JsProperty(name = "localCertificateId")
    public native void setLocalCertificateId(String value);
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
    @JsProperty(name = "remoteCertificateId")
    public native void setRemoteCertificateId(String value);
    @JsProperty(name = "rtcpTransportStatsId")
    public native void setRtcpTransportStatsId(String value);
    @JsProperty(name = "selectedCandidatePairId")
    public native void setSelectedCandidatePairId(String value);
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
