package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCDtmfSenderEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 555011

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCDtmfSenderEventMap
{

    /*
        Properties
    */

    public RTCDTMFToneChangeEvent tonechange;

    /*
        Methods
    */
    @JsProperty(name = "tonechange")
    public native RTCDTMFToneChangeEvent getTonechange();
    @JsProperty(name = "tonechange")
    public native void setTonechange(RTCDTMFToneChangeEvent value);
}
