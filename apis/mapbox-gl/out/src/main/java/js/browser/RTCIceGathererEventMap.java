package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceGathererEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 556368

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCIceGathererEventMap
{

    /*
        Properties
    */

    public Event error;

    public RTCIceGathererEvent localcandidate;

    /*
        Methods
    */
    @JsProperty(name = "error")
    public native Event getError();
    @JsProperty(name = "localcandidate")
    public native RTCIceGathererEvent getLocalcandidate();
    @JsProperty(name = "error")
    public native void setError(Event value);
    @JsProperty(name = "localcandidate")
    public native void setLocalcandidate(RTCIceGathererEvent value);
}
