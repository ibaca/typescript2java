package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpRtxParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 278765

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtpRtxParameters
{

    /*
        Properties
    */

    public Number ssrc;

    /*
        Methods
    */
    @JsProperty(name = "ssrc")
    public native Number getSsrc();
    @JsProperty(name = "ssrc")
    public native void setSsrc(@DoNotAutobox Number value);
}
