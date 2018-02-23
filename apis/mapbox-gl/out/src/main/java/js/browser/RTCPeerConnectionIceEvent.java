package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCPeerConnectionIceEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 561994
  * declared in: tsd/browser/lib.es6.d.ts at pos 562103
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCPeerConnectionIceEvent")
public class RTCPeerConnectionIceEvent extends Event 
{

    /*
        Constructors
    */
    public RTCPeerConnectionIceEvent (String type, RTCPeerConnectionIceEventInit eventInitDict) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public RTCIceCandidate candidate;

    /*
        Methods
    */
    @JsProperty(name = "candidate")
    public native RTCIceCandidate getCandidate();
    @JsProperty(name = "candidate")
    public native void setCandidate(RTCIceCandidate value);
}
