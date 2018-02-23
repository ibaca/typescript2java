package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceCandidatePairStats
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 274581

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCIceCandidatePairStats implements RTCStats 
{

    /*
        Properties
    */

    public Number availableIncomingBitrate;

    public Number availableOutgoingBitrate;

    public Number bytesReceived;

    public Number bytesSent;

    public String id;

    public String localCandidateId;

    public String msType;

    public Boolean nominated;

    public Number priority;

    public Boolean readable;

    public String remoteCandidateId;

    public Number roundTripTime;

    public String state;

    public Number timestamp;

    public String transportId;

    public String type;

    public Boolean writable;

    /*
        Methods
    */
    @JsProperty(name = "availableIncomingBitrate")
    public native Number getAvailableIncomingBitrate();
    @JsProperty(name = "availableOutgoingBitrate")
    public native Number getAvailableOutgoingBitrate();
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
    @JsProperty(name = "localCandidateId")
    public native String getLocalCandidateId();
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
    @JsProperty(name = "nominated")
    public native Boolean getNominated();
    @JsProperty(name = "priority")
    public native Number getPriority();
    @JsProperty(name = "readable")
    public native Boolean getReadable();
    @JsProperty(name = "remoteCandidateId")
    public native String getRemoteCandidateId();
    @JsProperty(name = "roundTripTime")
    public native Number getRoundTripTime();
    @JsProperty(name = "state")
    public native String getState();
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
    @JsProperty(name = "writable")
    public native Boolean getWritable();
    @JsProperty(name = "availableIncomingBitrate")
    public native void setAvailableIncomingBitrate(@DoNotAutobox Number value);
    @JsProperty(name = "availableOutgoingBitrate")
    public native void setAvailableOutgoingBitrate(@DoNotAutobox Number value);
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
    @JsProperty(name = "localCandidateId")
    public native void setLocalCandidateId(String value);
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
    @JsProperty(name = "nominated")
    public native void setNominated(Boolean value);
    @JsProperty(name = "priority")
    public native void setPriority(@DoNotAutobox Number value);
    @JsProperty(name = "readable")
    public native void setReadable(Boolean value);
    @JsProperty(name = "remoteCandidateId")
    public native void setRemoteCandidateId(String value);
    @JsProperty(name = "roundTripTime")
    public native void setRoundTripTime(@DoNotAutobox Number value);
    @JsProperty(name = "state")
    public native void setState(String value);
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
    @JsProperty(name = "writable")
    public native void setWritable(Boolean value);
}
