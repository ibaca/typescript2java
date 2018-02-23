package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceGatherOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 275001

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCIceGatherOptions
{

    /*
        Properties
    */

    public String gatherPolicy;

    public Array<RTCIceServer> iceservers;

    public MSPortRange portRange;

    /*
        Methods
    */
    @JsProperty(name = "gatherPolicy")
    public native String getGatherPolicy();
    @JsProperty(name = "iceservers")
    public native Array<RTCIceServer> getIceservers();
    @JsProperty(name = "portRange")
    public native MSPortRange getPortRange();
    @JsProperty(name = "gatherPolicy")
    public native void setGatherPolicy(String value);
    @JsProperty(name = "iceservers")
    public native void setIceservers(Array<RTCIceServer> value);
    @JsProperty(name = "portRange")
    public native void setPortRange(MSPortRange value);
}
