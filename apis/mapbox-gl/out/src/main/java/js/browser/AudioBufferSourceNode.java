package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AudioBufferSourceNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 286107
  * declared in: tsd/browser/lib.es6.d.ts at pos 286821
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioBufferSourceNode")
public class AudioBufferSourceNode extends AudioNode 
{

    /*
        Constructors
    */
    public AudioBufferSourceNode () {
    } 

    /*
        Properties
    */

    public AudioBuffer buffer;

    public AudioParam detune;

    public Boolean loop;

    public Number loopEnd;

    public Number loopStart;

    public Function1<MediaStreamErrorEvent, Object> onended;

    public AudioParam playbackRate;

    /*
        Methods
    */
    @JsProperty(name = "buffer")
    public native AudioBuffer getBuffer();
    @JsProperty(name = "detune")
    public native AudioParam getDetune();
    @JsProperty(name = "loop")
    public native Boolean getLoop();
    @JsProperty(name = "loopEnd")
    public native Number getLoopEnd();
    @JsProperty(name = "loopStart")
    public native Number getLoopStart();
    @JsProperty(name = "onended")
    public native Function1<MediaStreamErrorEvent, Object> getOnended();
    @JsProperty(name = "playbackRate")
    public native AudioParam getPlaybackRate();
    @JsProperty(name = "buffer")
    public native void setBuffer(AudioBuffer value);
    @JsProperty(name = "detune")
    public native void setDetune(AudioParam value);
    @JsProperty(name = "loop")
    public native void setLoop(Boolean value);
    @JsProperty(name = "loopEnd")
    public native void setLoopEnd(@DoNotAutobox Number value);
    @JsProperty(name = "loopStart")
    public native void setLoopStart(@DoNotAutobox Number value);
    @JsProperty(name = "onended")
    public native void setOnended(Function1<MediaStreamErrorEvent, Object> value);
    @JsProperty(name = "playbackRate")
    public native void setPlaybackRate(AudioParam value);
    public native void start();
    public native void start(@DoNotAutobox Number when /* optional */);
    public native void start(@DoNotAutobox Number when /* optional */, @DoNotAutobox Number offset /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@286410
     */
    public native void start(@DoNotAutobox Number when /* optional */, @DoNotAutobox Number offset /* optional */, @DoNotAutobox Number duration /* optional */);
    public native void stop();
    /** 
      * tsd/browser/lib.es6.d.ts@286478
     */
    public native void stop(@DoNotAutobox Number when /* optional */);
}
