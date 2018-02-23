package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceTransportEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 557486

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCIceTransportEventMap
{

    /*
        Properties
    */

    public RTCIceCandidatePairChangedEvent candidatepairchange;

    public RTCIceTransportStateChangedEvent icestatechange;

    /*
        Methods
    */
    @JsProperty(name = "candidatepairchange")
    public native RTCIceCandidatePairChangedEvent getCandidatepairchange();
    @JsProperty(name = "icestatechange")
    public native RTCIceTransportStateChangedEvent getIcestatechange();
    @JsProperty(name = "candidatepairchange")
    public native void setCandidatepairchange(RTCIceCandidatePairChangedEvent value);
    @JsProperty(name = "icestatechange")
    public native void setIcestatechange(RTCIceTransportStateChangedEvent value);
}
