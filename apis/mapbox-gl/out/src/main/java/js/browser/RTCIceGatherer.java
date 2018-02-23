package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceGatherer
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 556469
  * declared in: tsd/browser/lib.es6.d.ts at pos 557148
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceGatherer")
public class RTCIceGatherer extends RTCStatsProvider 
{

    /*
        Constructors
    */
    public RTCIceGatherer (RTCIceGatherOptions options) {
    } 

    /*
        Properties
    */

    public String component;

    public Function1<Event, Object> onerror;

    public Function1<RTCIceGathererEvent, Object> onlocalcandidate;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@556710
     */
    public native RTCIceGatherer createAssociatedGatherer();
    @JsProperty(name = "component")
    public native String getComponent();
    /** 
      * tsd/browser/lib.es6.d.ts@556758
     */
    public native Array<RTCIceCandidateDictionary> getLocalCandidates();
    /** 
      * tsd/browser/lib.es6.d.ts@556813
     */
    public native RTCIceParameters getLocalParameters();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "onlocalcandidate")
    public native Function1<RTCIceGathererEvent, Object> getOnlocalcandidate();
    @JsProperty(name = "component")
    public native void setComponent(String value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "onlocalcandidate")
    public native void setOnlocalcandidate(Function1<RTCIceGathererEvent, Object> value);
}
