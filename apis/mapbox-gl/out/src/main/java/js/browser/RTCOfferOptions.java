package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCOfferOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 275978

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCOfferOptions
{

    /*
        Properties
    */

    public Boolean iceRestart;

    public Number offerToReceiveAudio;

    public Number offerToReceiveVideo;

    public Boolean voiceActivityDetection;

    /*
        Methods
    */
    @JsProperty(name = "iceRestart")
    public native Boolean getIceRestart();
    @JsProperty(name = "offerToReceiveAudio")
    public native Number getOfferToReceiveAudio();
    @JsProperty(name = "offerToReceiveVideo")
    public native Number getOfferToReceiveVideo();
    @JsProperty(name = "voiceActivityDetection")
    public native Boolean getVoiceActivityDetection();
    @JsProperty(name = "iceRestart")
    public native void setIceRestart(Boolean value);
    @JsProperty(name = "offerToReceiveAudio")
    public native void setOfferToReceiveAudio(@DoNotAutobox Number value);
    @JsProperty(name = "offerToReceiveVideo")
    public native void setOfferToReceiveVideo(@DoNotAutobox Number value);
    @JsProperty(name = "voiceActivityDetection")
    public native void setVoiceActivityDetection(Boolean value);
}
