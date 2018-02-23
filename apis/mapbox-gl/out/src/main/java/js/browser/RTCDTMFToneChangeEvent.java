package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCDTMFToneChangeEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 553482
  * declared in: tsd/browser/lib.es6.d.ts at pos 553574
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCDTMFToneChangeEvent")
public class RTCDTMFToneChangeEvent extends Event 
{

    /*
        Constructors
    */
    public RTCDTMFToneChangeEvent (String typeArg, RTCDTMFToneChangeEventInit eventInitDict) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public String tone;

    /*
        Methods
    */
    @JsProperty(name = "tone")
    public native String getTone();
    @JsProperty(name = "tone")
    public native void setTone(String value);
}
