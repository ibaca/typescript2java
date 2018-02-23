package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceGathererEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 557254
  * declared in: tsd/browser/lib.es6.d.ts at pos 557393
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceGathererEvent")
public class RTCIceGathererEvent extends Event 
{

    /*
        Constructors
    */
    public RTCIceGathererEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary candidate;

    /*
        Methods
    */
    @JsProperty(name = "candidate")
    public native UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary getCandidate();
    @JsProperty(name = "candidate")
    public native void setCandidate(RTCIceCandidateDictionary value);
    @JsProperty(name = "candidate")
    public native void setCandidate(RTCIceCandidateComplete value);
    @JsProperty(name = "candidate")
    public native void setCandidate(UnionOfRTCIceCandidateCompleteAndRTCIceCandidateDictionary value);
}
