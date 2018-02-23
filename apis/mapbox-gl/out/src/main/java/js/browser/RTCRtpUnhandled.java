package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpUnhandled
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 278819

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtpUnhandled
{

    /*
        Properties
    */

    public String muxId;

    public Number payloadType;

    public Number ssrc;

    /*
        Methods
    */
    @JsProperty(name = "muxId")
    public native String getMuxId();
    @JsProperty(name = "payloadType")
    public native Number getPayloadType();
    @JsProperty(name = "ssrc")
    public native Number getSsrc();
    @JsProperty(name = "muxId")
    public native void setMuxId(String value);
    @JsProperty(name = "payloadType")
    public native void setPayloadType(@DoNotAutobox Number value);
    @JsProperty(name = "ssrc")
    public native void setSsrc(@DoNotAutobox Number value);
}
