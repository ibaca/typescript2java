package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AudioBuffer
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 285537
  * declared in: tsd/browser/lib.es6.d.ts at pos 285957
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioBuffer")
public class AudioBuffer
{

    /*
        Constructors
    */
    public AudioBuffer () {
    } 

    /*
        Properties
    */

    public Number duration;

    public int length;

    public Number numberOfChannels;

    public Number sampleRate;

    /*
        Methods
    */
    public native void copyFromChannel(Float32Array destination, @DoNotAutobox Number channelNumber);
    /** 
      * tsd/browser/lib.es6.d.ts@285699
     */
    public native void copyFromChannel(Float32Array destination, @DoNotAutobox Number channelNumber, @DoNotAutobox Number startInChannel /* optional */);
    public native void copyToChannel(Float32Array source, @DoNotAutobox Number channelNumber);
    /** 
      * tsd/browser/lib.es6.d.ts@285801
     */
    public native void copyToChannel(Float32Array source, @DoNotAutobox Number channelNumber, @DoNotAutobox Number startInChannel /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@285896
     */
    public native Float32Array getChannelData(@DoNotAutobox Number channel);
    @JsProperty(name = "duration")
    public native Number getDuration();
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "numberOfChannels")
    public native Number getNumberOfChannels();
    @JsProperty(name = "sampleRate")
    public native Number getSampleRate();
    @JsProperty(name = "duration")
    public native void setDuration(@DoNotAutobox Number value);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    @JsProperty(name = "numberOfChannels")
    public native void setNumberOfChannels(@DoNotAutobox Number value);
    @JsProperty(name = "sampleRate")
    public native void setSampleRate(@DoNotAutobox Number value);
}
