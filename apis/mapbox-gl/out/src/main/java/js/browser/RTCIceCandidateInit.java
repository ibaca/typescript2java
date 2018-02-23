package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceCandidateInit
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 274359

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCIceCandidateInit
{

    /*
        Properties
    */

    public String candidate;

    public Number sdpMLineIndex;

    public String sdpMid;

    /*
        Methods
    */
    @JsProperty(name = "candidate")
    public native String getCandidate();
    @JsProperty(name = "sdpMLineIndex")
    public native Number getSdpMLineIndex();
    @JsProperty(name = "sdpMid")
    public native String getSdpMid();
    @JsProperty(name = "candidate")
    public native void setCandidate(String value);
    @JsProperty(name = "sdpMLineIndex")
    public native void setSdpMLineIndex(@DoNotAutobox Number value);
    @JsProperty(name = "sdpMid")
    public native void setSdpMid(String value);
}
