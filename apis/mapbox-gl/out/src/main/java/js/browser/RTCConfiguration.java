package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCConfiguration
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 273430

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCConfiguration
{

    /*
        Properties
    */

    public String bundlePolicy;

    public Array<RTCIceServer> iceServers;

    public String iceTransportPolicy;

    public String peerIdentity;

    /*
        Methods
    */
    @JsProperty(name = "bundlePolicy")
    public native String getBundlePolicy();
    @JsProperty(name = "iceServers")
    public native Array<RTCIceServer> getIceServers();
    @JsProperty(name = "iceTransportPolicy")
    public native String getIceTransportPolicy();
    @JsProperty(name = "peerIdentity")
    public native String getPeerIdentity();
    @JsProperty(name = "bundlePolicy")
    public native void setBundlePolicy(String value);
    @JsProperty(name = "iceServers")
    public native void setIceServers(Array<RTCIceServer> value);
    @JsProperty(name = "iceTransportPolicy")
    public native void setIceTransportPolicy(String value);
    @JsProperty(name = "peerIdentity")
    public native void setPeerIdentity(String value);
}
