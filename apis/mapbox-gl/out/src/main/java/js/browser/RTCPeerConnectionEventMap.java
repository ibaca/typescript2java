package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCPeerConnectionEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 559161

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCPeerConnectionEventMap
{

    /*
        Properties
    */

    public MediaStreamEvent addstream;

    public RTCPeerConnectionIceEvent icecandidate;

    public Event iceconnectionstatechange;

    public Event icegatheringstatechange;

    public Event negotiationneeded;

    public MediaStreamEvent removestream;

    public Event signalingstatechange;

    /*
        Methods
    */
    @JsProperty(name = "addstream")
    public native MediaStreamEvent getAddstream();
    @JsProperty(name = "icecandidate")
    public native RTCPeerConnectionIceEvent getIcecandidate();
    @JsProperty(name = "iceconnectionstatechange")
    public native Event getIceconnectionstatechange();
    @JsProperty(name = "icegatheringstatechange")
    public native Event getIcegatheringstatechange();
    @JsProperty(name = "negotiationneeded")
    public native Event getNegotiationneeded();
    @JsProperty(name = "removestream")
    public native MediaStreamEvent getRemovestream();
    @JsProperty(name = "signalingstatechange")
    public native Event getSignalingstatechange();
    @JsProperty(name = "addstream")
    public native void setAddstream(MediaStreamEvent value);
    @JsProperty(name = "icecandidate")
    public native void setIcecandidate(RTCPeerConnectionIceEvent value);
    @JsProperty(name = "iceconnectionstatechange")
    public native void setIceconnectionstatechange(Event value);
    @JsProperty(name = "icegatheringstatechange")
    public native void setIcegatheringstatechange(Event value);
    @JsProperty(name = "negotiationneeded")
    public native void setNegotiationneeded(Event value);
    @JsProperty(name = "removestream")
    public native void setRemovestream(MediaStreamEvent value);
    @JsProperty(name = "signalingstatechange")
    public native void setSignalingstatechange(Event value);
}
