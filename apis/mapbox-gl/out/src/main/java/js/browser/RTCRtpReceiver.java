package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpReceiver
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 562330
  * declared in: tsd/browser/lib.es6.d.ts at pos 563175
  * 6 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCRtpReceiver")
public class RTCRtpReceiver extends RTCStatsProvider 
{

    /*
        Constructors
    */
    public RTCRtpReceiver (UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport, String kind, RTCDtlsTransport rtcpTransport /* optional */) {
    } 
    public RTCRtpReceiver (RTCDtlsTransport transport, String kind, RTCDtlsTransport rtcpTransport /* optional */) {
    } 
    public RTCRtpReceiver (RTCSrtpSdesTransport transport, String kind, RTCDtlsTransport rtcpTransport /* optional */) {
    } 
    public RTCRtpReceiver (UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport, String kind) {
    } 
    public RTCRtpReceiver (RTCDtlsTransport transport, String kind) {
    } 
    public RTCRtpReceiver (RTCSrtpSdesTransport transport, String kind) {
    } 

    /*
        Static methods
    */

    /** 
      * source : tsd/browser/lib.es6.d.ts:563354
     */
    @JsMethod(namespace="RTCRtpReceiver", name = "getCapabilities")
    public static native RTCRtpCapabilities getCapabilities(String kind /* optional */);

    @JsMethod(namespace="RTCRtpReceiver", name = "getCapabilities")
    public static native RTCRtpCapabilities getCapabilities();

    /*
        Properties
    */

    public Function1<Event, Object> onerror;

    public RTCDtlsTransport rtcpTransport;

    public MediaStreamTrack track;

    public UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@562608
     */
    public native Array<RTCRtpContributingSource> getContributingSources();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "rtcpTransport")
    public native RTCDtlsTransport getRtcpTransport();
    @JsProperty(name = "track")
    public native MediaStreamTrack getTrack();
    @JsProperty(name = "transport")
    public native UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport getTransport();
    /** 
      * tsd/browser/lib.es6.d.ts@562666
     */
    public native void receive(RTCRtpParameters parameters);
    /** 
      * tsd/browser/lib.es6.d.ts@562715
     */
    public native void requestSendCSRC(@DoNotAutobox Number csrc);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
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
      * tsd/browser/lib.es6.d.ts@562756
     */
    public native void setTransport(UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport transport, RTCDtlsTransport rtcpTransport /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@562866
     */
    public native void stop();
}
