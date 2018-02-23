package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCSessionDescription
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 564597
  * declared in: tsd/browser/lib.es6.d.ts at pos 564715
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCSessionDescription")
public class RTCSessionDescription
{

    /*
        Constructors
    */
    public RTCSessionDescription (RTCSessionDescriptionInit descriptionInitDict /* optional */) {
    } 
    public RTCSessionDescription () {
    } 

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
    /** 
      * tsd/browser/lib.es6.d.ts@564686
     */
    public native Object toJSON();
}
