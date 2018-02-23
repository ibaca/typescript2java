package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpSender
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 563505
  * declared in: tsd/browser/lib.es6.d.ts at pos 564360
  * 6 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpSender")
public class RTCRtpSender extends RTCStatsProvider 
{

    /*
        Constructors
    */
    public RTCRtpSender (MediaStreamTrack track, UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport, RTCDtlsTransport rtcpTransport /* optional */) {
    } 
    public RTCRtpSender (MediaStreamTrack track, RTCDtlsTransport transport, RTCDtlsTransport rtcpTransport /* optional */) {
    } 
    public RTCRtpSender (MediaStreamTrack track, RTCSrtpSdesTransport transport, RTCDtlsTransport rtcpTransport /* optional */) {
    } 
    public RTCRtpSender (MediaStreamTrack track, UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport) {
    } 
    public RTCRtpSender (MediaStreamTrack track, RTCDtlsTransport transport) {
    } 
    public RTCRtpSender (MediaStreamTrack track, RTCSrtpSdesTransport transport) {
    } 

    /*
        Static methods
    */

    /** 
      * source : tsd/browser/lib.es6.d.ts:564544
     */
    @JsMethod(namespace="RTCRtpSender", name = "getCapabilities")
    public static native RTCRtpCapabilities getCapabilities(String kind /* optional */);

    @JsMethod(namespace="RTCRtpSender", name = "getCapabilities")
    public static native RTCRtpCapabilities getCapabilities();

    /*
        Properties
    */

    public Function1<Event, Object> onerror;

    public Function1<RTCSsrcConflictEvent, Object> onssrcconflict;

    public RTCDtlsTransport rtcpTransport;

    public MediaStreamTrack track;

    public UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport;

    /*
        Methods
    */
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "onssrcconflict")
    public native Function1<RTCSsrcConflictEvent, Object> getOnssrcconflict();
    @JsProperty(name = "rtcpTransport")
    public native RTCDtlsTransport getRtcpTransport();
    @JsProperty(name = "track")
    public native MediaStreamTrack getTrack();
    @JsProperty(name = "transport")
    public native UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport getTransport();
    /** 
      * tsd/browser/lib.es6.d.ts@563856
     */
    public native void send(RTCRtpParameters parameters);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "onssrcconflict")
    public native void setOnssrcconflict(Function1<RTCSsrcConflictEvent, Object> value);
    @JsProperty(name = "rtcpTransport")
    public native void setRtcpTransport(RTCDtlsTransport value);
    @JsProperty(name = "track")
    public native void setTrack(MediaStreamTrack value);
    @JsProperty(name = "transport")
    public native void setTransport(RTCDtlsTransport value);
    public native void setTransport(RTCDtlsTransport transport, RTCDtlsTransport rtcpTransport /* optional */);
    @JsProperty(name = "transport")
    public native void setTransport(RTCSrtpSdesTransport value);
    public native void setTransport(RTCSrtpSdesTransport transport, RTCDtlsTransport rtcpTransport /* optional */);
    @JsProperty(name = "transport")
    public native void setTransport(UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport value);
    /** 
      * tsd/browser/lib.es6.d.ts@563947
     */
    public native void setTransport(UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport, RTCDtlsTransport rtcpTransport /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@564057
     */
    public native void stop();
}
