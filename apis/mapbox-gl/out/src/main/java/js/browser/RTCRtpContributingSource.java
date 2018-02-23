package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtpContributingSource
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 277658

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtpContributingSource
{

    /*
        Properties
    */

    public Number audioLevel;

    public Number csrc;

    public Number timestamp;

    /*
        Methods
    */
    @JsProperty(name = "audioLevel")
    public native Number getAudioLevel();
    @JsProperty(name = "csrc")
    public native Number getCsrc();
    @JsProperty(name = "timestamp")
    public native Number getTimestamp();
    @JsProperty(name = "audioLevel")
    public native void setAudioLevel(@DoNotAutobox Number value);
    @JsProperty(name = "csrc")
    public native void setCsrc(@DoNotAutobox Number value);
    @JsProperty(name = "timestamp")
    public native void setTimestamp(@DoNotAutobox Number value);
}
