package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceTransportStateChangedEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 558926
  * declared in: tsd/browser/lib.es6.d.ts at pos 559029
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCIceTransportStateChangedEvent")
public class RTCIceTransportStateChangedEvent extends Event 
{

    /*
        Constructors
    */
    public RTCIceTransportStateChangedEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public String state;

    /*
        Methods
    */
    @JsProperty(name = "state")
    public native String getState();
    @JsProperty(name = "state")
    public native void setState(String value);
}
