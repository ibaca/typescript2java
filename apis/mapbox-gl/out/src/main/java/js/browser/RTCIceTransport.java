package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceTransport
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 557641
  * declared in: tsd/browser/lib.es6.d.ts at pos 558845
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceTransport")
public class RTCIceTransport extends RTCStatsProvider 
{

    /*
        Constructors
    */
    public RTCIceTransport () {
    } 

    /*
        Properties
    */

    public String component;

    public RTCIceGatherer iceGatherer;

    public Function1<RTCIceCandidatePairChangedEvent, Object> oncandidatepairchange;

    public Function1<RTCIceTransportStateChangedEvent, Object> onicestatechange;

    public String role;

    public String state;

    /*
        Methods
    */
    public native void addRemoteCandidate(RTCIceCandidateDictionary remoteCandidate);
    public native void addRemoteCandidate(RTCIceCandidateComplete remoteCandidate);
    /** 
      * tsd/browser/lib.es6.d.ts@558042
     */
    public native void addRemoteCandidate(UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary remoteCandidate);
    /** 
      * tsd/browser/lib.es6.d.ts@558142
     */
    public native RTCIceTransport createAssociatedTransport();
    @JsProperty(name = "component")
    public native String getComponent();
    @JsProperty(name = "iceGatherer")
    public native RTCIceGatherer getIceGatherer();
    /** 
      * tsd/browser/lib.es6.d.ts@558192
     */
    public native RTCIceCandidatePair getNominatedCandidatePair();
    @JsProperty(name = "oncandidatepairchange")
    public native Function1<RTCIceCandidatePairChangedEvent, Object> getOncandidatepairchange();
    @JsProperty(name = "onicestatechange")
    public native Function1<RTCIceTransportStateChangedEvent, Object> getOnicestatechange();
    /** 
      * tsd/browser/lib.es6.d.ts@558253
     */
    public native Array<RTCIceCandidateDictionary> getRemoteCandidates();
    /** 
      * tsd/browser/lib.es6.d.ts@558309
     */
    public native RTCIceParameters getRemoteParameters();
    @JsProperty(name = "role")
    public native String getRole();
    @JsProperty(name = "state")
    public native String getState();
    @JsProperty(name = "component")
    public native void setComponent(String value);
    @JsProperty(name = "iceGatherer")
    public native void setIceGatherer(RTCIceGatherer value);
    @JsProperty(name = "oncandidatepairchange")
    public native void setOncandidatepairchange(Function1<RTCIceCandidatePairChangedEvent, Object> value);
    @JsProperty(name = "onicestatechange")
    public native void setOnicestatechange(Function1<RTCIceTransportStateChangedEvent, Object> value);
    /** 
      * tsd/browser/lib.es6.d.ts@558361
     */
    public native void setRemoteCandidates(Array<RTCIceCandidateDictionary> remoteCandidates);
    @JsProperty(name = "role")
    public native void setRole(String value);
    @JsProperty(name = "state")
    public native void setState(String value);
    public native void start(RTCIceGatherer gatherer, RTCIceParameters remoteParameters);
    /** 
      * tsd/browser/lib.es6.d.ts@558439
     */
    public native void start(RTCIceGatherer gatherer, RTCIceParameters remoteParameters, String role /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@558533
     */
    public native void stop();
}
