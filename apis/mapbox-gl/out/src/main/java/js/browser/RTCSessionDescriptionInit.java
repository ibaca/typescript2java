package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCSessionDescriptionInit
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 278915

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCSessionDescriptionInit
{

    /*
        Properties
    */

    public String sdp;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "sdp")
    public native String getSdp();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "sdp")
    public native void setSdp(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
