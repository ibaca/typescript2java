package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceCandidatePairChangedEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 556125
  * declared in: tsd/browser/lib.es6.d.ts at pos 556239
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceCandidatePairChangedEvent")
public class RTCIceCandidatePairChangedEvent extends Event 
{

    /*
        Constructors
    */
    public RTCIceCandidatePairChangedEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public RTCIceCandidatePair pair;

    /*
        Methods
    */
    @JsProperty(name = "pair")
    public native RTCIceCandidatePair getPair();
    @JsProperty(name = "pair")
    public native void setPair(RTCIceCandidatePair value);
}
