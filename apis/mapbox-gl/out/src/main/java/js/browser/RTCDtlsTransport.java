package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCDtlsTransport
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 553852
  * declared in: tsd/browser/lib.es6.d.ts at pos 554662
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCDtlsTransport")
public class RTCDtlsTransport extends RTCStatsProvider 
{

    /*
        Constructors
    */
    public RTCDtlsTransport (RTCIceTransport transport) {
    } 

    /*
        Properties
    */

    public Function1<RTCDtlsTransportStateChangedEvent, Object> ondtlsstatechange;

    public Function1<Event, Object> onerror;

    public String state;

    public RTCIceTransport transport;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@554151
     */
    public native RTCDtlsParameters getLocalParameters();
    @JsProperty(name = "ondtlsstatechange")
    public native Function1<RTCDtlsTransportStateChangedEvent, Object> getOndtlsstatechange();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    /** 
      * tsd/browser/lib.es6.d.ts@554196
     */
    public native Array<ArrayBuffer> getRemoteCertificates();
    /** 
      * tsd/browser/lib.es6.d.ts@554240
     */
    public native RTCDtlsParameters getRemoteParameters();
    @JsProperty(name = "state")
    public native String getState();
    @JsProperty(name = "transport")
    public native RTCIceTransport getTransport();
    @JsProperty(name = "ondtlsstatechange")
    public native void setOndtlsstatechange(Function1<RTCDtlsTransportStateChangedEvent, Object> value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "state")
    public native void setState(String value);
    @JsProperty(name = "transport")
    public native void setTransport(RTCIceTransport value);
    /** 
      * tsd/browser/lib.es6.d.ts@554293
     */
    public native void start(RTCDtlsParameters remoteParameters);
    /** 
      * tsd/browser/lib.es6.d.ts@554347
     */
    public native void stop();
}
