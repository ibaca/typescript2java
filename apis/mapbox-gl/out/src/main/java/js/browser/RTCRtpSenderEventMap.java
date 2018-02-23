package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpSenderEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 563407

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtpSenderEventMap
{

    /*
        Properties
    */

    public Event error;

    public RTCSsrcConflictEvent ssrcconflict;

    /*
        Methods
    */
    @JsProperty(name = "error")
    public native Event getError();
    @JsProperty(name = "ssrcconflict")
    public native RTCSsrcConflictEvent getSsrcconflict();
    @JsProperty(name = "error")
    public native void setError(Event value);
    @JsProperty(name = "ssrcconflict")
    public native void setSsrcconflict(RTCSsrcConflictEvent value);
}
