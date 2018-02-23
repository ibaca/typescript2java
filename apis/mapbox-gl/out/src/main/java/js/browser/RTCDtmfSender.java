package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCDtmfSender
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 555090
  * declared in: tsd/browser/lib.es6.d.ts at pos 555756
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCDtmfSender")
public class RTCDtmfSender extends EventTarget 
{

    /*
        Constructors
    */
    public RTCDtmfSender (RTCRtpSender sender) {
    } 

    /*
        Properties
    */

    public Boolean canInsertDTMF;

    public Number duration;

    public Number interToneGap;

    public Function1<RTCDTMFToneChangeEvent, Object> ontonechange;

    public RTCRtpSender sender;

    public String toneBuffer;

    /*
        Methods
    */
    @JsProperty(name = "canInsertDTMF")
    public native Boolean getCanInsertDTMF();
    @JsProperty(name = "duration")
    public native Number getDuration();
    @JsProperty(name = "interToneGap")
    public native Number getInterToneGap();
    @JsProperty(name = "ontonechange")
    public native Function1<RTCDTMFToneChangeEvent, Object> getOntonechange();
    @JsProperty(name = "sender")
    public native RTCRtpSender getSender();
    @JsProperty(name = "toneBuffer")
    public native String getToneBuffer();
    public native void insertDTMF(String tones);
    public native void insertDTMF(String tones, @DoNotAutobox Number duration /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@555389
     */
    public native void insertDTMF(String tones, @DoNotAutobox Number duration /* optional */, @DoNotAutobox Number interToneGap /* optional */);
    @JsProperty(name = "canInsertDTMF")
    public native void setCanInsertDTMF(Boolean value);
    @JsProperty(name = "duration")
    public native void setDuration(@DoNotAutobox Number value);
    @JsProperty(name = "interToneGap")
    public native void setInterToneGap(@DoNotAutobox Number value);
    @JsProperty(name = "ontonechange")
    public native void setOntonechange(Function1<RTCDTMFToneChangeEvent, Object> value);
    @JsProperty(name = "sender")
    public native void setSender(RTCRtpSender value);
    @JsProperty(name = "toneBuffer")
    public native void setToneBuffer(String value);
}
