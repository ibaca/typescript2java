package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceCandidatePair
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 274467

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCIceCandidatePair
{

    /*
        Properties
    */

    public RTCIceCandidateDictionary local;

    public RTCIceCandidateDictionary remote;

    /*
        Methods
    */
    @JsProperty(name = "local")
    public native RTCIceCandidateDictionary getLocal();
    @JsProperty(name = "remote")
    public native RTCIceCandidateDictionary getRemote();
    @JsProperty(name = "local")
    public native void setLocal(RTCIceCandidateDictionary value);
    @JsProperty(name = "remote")
    public native void setRemote(RTCIceCandidateDictionary value);
}
