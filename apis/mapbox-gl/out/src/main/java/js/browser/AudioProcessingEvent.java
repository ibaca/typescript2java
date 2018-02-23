package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AudioProcessingEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 290904
  * declared in: tsd/browser/lib.es6.d.ts at pos 291081
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioProcessingEvent")
public class AudioProcessingEvent extends Event 
{

    /*
        Constructors
    */
    public AudioProcessingEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public AudioBuffer inputBuffer;

    public AudioBuffer outputBuffer;

    public Number playbackTime;

    /*
        Methods
    */
    @JsProperty(name = "inputBuffer")
    public native AudioBuffer getInputBuffer();
    @JsProperty(name = "outputBuffer")
    public native AudioBuffer getOutputBuffer();
    @JsProperty(name = "playbackTime")
    public native Number getPlaybackTime();
    @JsProperty(name = "inputBuffer")
    public native void setInputBuffer(AudioBuffer value);
    @JsProperty(name = "outputBuffer")
    public native void setOutputBuffer(AudioBuffer value);
    @JsProperty(name = "playbackTime")
    public native void setPlaybackTime(@DoNotAutobox Number value);
}
