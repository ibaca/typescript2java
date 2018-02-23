package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCDtlsTransportEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 553734

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCDtlsTransportEventMap
{

    /*
        Properties
    */

    public RTCDtlsTransportStateChangedEvent dtlsstatechange;

    public Event error;

    /*
        Methods
    */
    @JsProperty(name = "dtlsstatechange")
    public native RTCDtlsTransportStateChangedEvent getDtlsstatechange();
    @JsProperty(name = "error")
    public native Event getError();
    @JsProperty(name = "dtlsstatechange")
    public native void setDtlsstatechange(RTCDtlsTransportStateChangedEvent value);
    @JsProperty(name = "error")
    public native void setError(Event value);
}
