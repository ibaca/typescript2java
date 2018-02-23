package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCDtlsTransportStateChangedEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 554772
  * declared in: tsd/browser/lib.es6.d.ts at pos 554876
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCDtlsTransportStateChangedEvent")
public class RTCDtlsTransportStateChangedEvent extends Event 
{

    /*
        Constructors
    */
    public RTCDtlsTransportStateChangedEvent () {
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
