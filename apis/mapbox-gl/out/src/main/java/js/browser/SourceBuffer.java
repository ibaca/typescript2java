package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SourceBuffer
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 644518
  * declared in: tsd/browser/lib.es6.d.ts at pos 645023
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SourceBuffer")
public class SourceBuffer extends EventTarget 
{

    /*
        Constructors
    */
    public SourceBuffer () {
    } 

    /*
        Properties
    */

    public Number appendWindowEnd;

    public Number appendWindowStart;

    public AudioTrackList audioTracks;

    public TimeRanges buffered;

    public String mode;

    public Number timestampOffset;

    public Boolean updating;

    public VideoTrackList videoTracks;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@644827
     */
    public native void abort();
    public native void appendBuffer(ArrayBufferView data);
    public native void appendBuffer(ArrayBuffer data);
    /** 
      * tsd/browser/lib.es6.d.ts@644846
     */
    public native void appendBuffer(UnionOfArrayBufferAndArrayBufferView data);
    public native void appendStream(MSStream stream);
    /** 
      * tsd/browser/lib.es6.d.ts@644907
     */
    public native void appendStream(MSStream stream, @DoNotAutobox Number maxSize /* optional */);
    @JsProperty(name = "appendWindowEnd")
    public native Number getAppendWindowEnd();
    @JsProperty(name = "appendWindowStart")
    public native Number getAppendWindowStart();
    @JsProperty(name = "audioTracks")
    public native AudioTrackList getAudioTracks();
    @JsProperty(name = "buffered")
    public native TimeRanges getBuffered();
    @JsProperty(name = "mode")
    public native String getMode();
    @JsProperty(name = "timestampOffset")
    public native Number getTimestampOffset();
    @JsProperty(name = "updating")
    public native Boolean getUpdating();
    @JsProperty(name = "videoTracks")
    public native VideoTrackList getVideoTracks();
    /** 
      * tsd/browser/lib.es6.d.ts@644967
     */
    public native void remove(@DoNotAutobox Number start, @DoNotAutobox Number end);
    @JsProperty(name = "appendWindowEnd")
    public native void setAppendWindowEnd(@DoNotAutobox Number value);
    @JsProperty(name = "appendWindowStart")
    public native void setAppendWindowStart(@DoNotAutobox Number value);
    @JsProperty(name = "audioTracks")
    public native void setAudioTracks(AudioTrackList value);
    @JsProperty(name = "buffered")
    public native void setBuffered(TimeRanges value);
    @JsProperty(name = "mode")
    public native void setMode(String value);
    @JsProperty(name = "timestampOffset")
    public native void setTimestampOffset(@DoNotAutobox Number value);
    @JsProperty(name = "updating")
    public native void setUpdating(Boolean value);
    @JsProperty(name = "videoTracks")
    public native void setVideoTracks(VideoTrackList value);
}
