package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCMediaStreamTrackStats
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 275524

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCMediaStreamTrackStats implements RTCStats 
{

    /*
        Properties
    */

    public Number audioLevel;

    public Number echoReturnLoss;

    public Number echoReturnLossEnhancement;

    public Number frameHeight;

    public Number frameWidth;

    public Number framesCorrupted;

    public Number framesDecoded;

    public Number framesDropped;

    public Number framesPerSecond;

    public Number framesReceived;

    public Number framesSent;

    public String id;

    public String msType;

    public Boolean remoteSource;

    public Array<String> ssrcIds;

    public Number timestamp;

    public String trackIdentifier;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "audioLevel")
    public native Number getAudioLevel();
    @JsProperty(name = "echoReturnLoss")
    public native Number getEchoReturnLoss();
    @JsProperty(name = "echoReturnLossEnhancement")
    public native Number getEchoReturnLossEnhancement();
    @JsProperty(name = "frameHeight")
    public native Number getFrameHeight();
    @JsProperty(name = "frameWidth")
    public native Number getFrameWidth();
    @JsProperty(name = "framesCorrupted")
    public native Number getFramesCorrupted();
    @JsProperty(name = "framesDecoded")
    public native Number getFramesDecoded();
    @JsProperty(name = "framesDropped")
    public native Number getFramesDropped();
    @JsProperty(name = "framesPerSecond")
    public native Number getFramesPerSecond();
    @JsProperty(name = "framesReceived")
    public native Number getFramesReceived();
    @JsProperty(name = "framesSent")
    public native Number getFramesSent();
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "id")
    public native String getId();
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "msType")
    public native String getMsType();
    @JsProperty(name = "remoteSource")
    public native Boolean getRemoteSource();
    @JsProperty(name = "ssrcIds")
    public native Array<String> getSsrcIds();
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "timestamp")
    public native Number getTimestamp();
    @JsProperty(name = "trackIdentifier")
    public native String getTrackIdentifier();
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "audioLevel")
    public native void setAudioLevel(@DoNotAutobox Number value);
    @JsProperty(name = "echoReturnLoss")
    public native void setEchoReturnLoss(@DoNotAutobox Number value);
    @JsProperty(name = "echoReturnLossEnhancement")
    public native void setEchoReturnLossEnhancement(@DoNotAutobox Number value);
    @JsProperty(name = "frameHeight")
    public native void setFrameHeight(@DoNotAutobox Number value);
    @JsProperty(name = "frameWidth")
    public native void setFrameWidth(@DoNotAutobox Number value);
    @JsProperty(name = "framesCorrupted")
    public native void setFramesCorrupted(@DoNotAutobox Number value);
    @JsProperty(name = "framesDecoded")
    public native void setFramesDecoded(@DoNotAutobox Number value);
    @JsProperty(name = "framesDropped")
    public native void setFramesDropped(@DoNotAutobox Number value);
    @JsProperty(name = "framesPerSecond")
    public native void setFramesPerSecond(@DoNotAutobox Number value);
    @JsProperty(name = "framesReceived")
    public native void setFramesReceived(@DoNotAutobox Number value);
    @JsProperty(name = "framesSent")
    public native void setFramesSent(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "id")
    public native void setId(String value);
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "msType")
    public native void setMsType(String value);
    @JsProperty(name = "remoteSource")
    public native void setRemoteSource(Boolean value);
    @JsProperty(name = "ssrcIds")
    public native void setSsrcIds(Array<String> value);
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "timestamp")
    public native void setTimestamp(@DoNotAutobox Number value);
    @JsProperty(name = "trackIdentifier")
    public native void setTrackIdentifier(String value);
    /** 
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
      * inherited from (js.browser.RTCStats)
     */
    @JsProperty(name = "type")
    public native void setType(String value);
}
