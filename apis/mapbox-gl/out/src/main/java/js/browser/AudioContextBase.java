package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AudioContextBase
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 286982
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioContextBase")
public class AudioContextBase extends EventTarget 
{

    /*
        Constructors
    */
    public AudioContextBase () {
    } 

    /*
        Properties
    */

    public Number currentTime;

    public AudioDestinationNode destination;

    public AudioListener listener;

    public Function1<Event, Object> onstatechange;

    public Number sampleRate;

    public String state;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@287277
     */
    public native Promise<Void> close();
    /** 
      * tsd/browser/lib.es6.d.ts@287305
     */
    public native AnalyserNode createAnalyser();
    /** 
      * tsd/browser/lib.es6.d.ts@287341
     */
    public native BiquadFilterNode createBiquadFilter();
    /** 
      * tsd/browser/lib.es6.d.ts@287385
     */
    public native AudioBuffer createBuffer(@DoNotAutobox Number numberOfChannels, @DoNotAutobox Number length, @DoNotAutobox Number sampleRate);
    /** 
      * tsd/browser/lib.es6.d.ts@287478
     */
    public native AudioBufferSourceNode createBufferSource();
    public native ChannelMergerNode createChannelMerger();
    /** 
      * tsd/browser/lib.es6.d.ts@287527
     */
    public native ChannelMergerNode createChannelMerger(@DoNotAutobox Number numberOfInputs /* optional */);
    public native ChannelSplitterNode createChannelSplitter();
    /** 
      * tsd/browser/lib.es6.d.ts@287596
     */
    public native ChannelSplitterNode createChannelSplitter(@DoNotAutobox Number numberOfOutputs /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@287670
     */
    public native ConvolverNode createConvolver();
    public native DelayNode createDelay();
    /** 
      * tsd/browser/lib.es6.d.ts@287708
     */
    public native DelayNode createDelay(@DoNotAutobox Number maxDelayTime /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@287759
     */
    public native DynamicsCompressorNode createDynamicsCompressor();
    /** 
      * tsd/browser/lib.es6.d.ts@287815
     */
    public native GainNode createGain();
    /** 
      * tsd/browser/lib.es6.d.ts@287843
     */
    public native IIRFilterNode createIIRFilter(Array<Number> feedforward, Array<Number> feedback);
    /** 
      * tsd/browser/lib.es6.d.ts@287922
     */
    public native MediaElementAudioSourceNode createMediaElementSource(HTMLMediaElement mediaElement);
    /** 
      * tsd/browser/lib.es6.d.ts@288013
     */
    public native MediaStreamAudioSourceNode createMediaStreamSource(MediaStream mediaStream);
    /** 
      * tsd/browser/lib.es6.d.ts@288096
     */
    public native OscillatorNode createOscillator();
    /** 
      * tsd/browser/lib.es6.d.ts@288136
     */
    public native PannerNode createPanner();
    public native PeriodicWave createPeriodicWave(Float32Array real, Float32Array imag);
    /** 
      * tsd/browser/lib.es6.d.ts@288168
     */
    public native PeriodicWave createPeriodicWave(Float32Array real, Float32Array imag, PeriodicWaveConstraints constraints /* optional */);
    public native ScriptProcessorNode createScriptProcessor();
    public native ScriptProcessorNode createScriptProcessor(@DoNotAutobox Number bufferSize /* optional */);
    public native ScriptProcessorNode createScriptProcessor(@DoNotAutobox Number bufferSize /* optional */, @DoNotAutobox Number numberOfInputChannels /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@288285
     */
    public native ScriptProcessorNode createScriptProcessor(@DoNotAutobox Number bufferSize /* optional */, @DoNotAutobox Number numberOfInputChannels /* optional */, @DoNotAutobox Number numberOfOutputChannels /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@288419
     */
    public native StereoPannerNode createStereoPanner();
    /** 
      * tsd/browser/lib.es6.d.ts@288463
     */
    public native WaveShaperNode createWaveShaper();
    public native Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData);
    public native Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData, DecodeSuccessCallback successCallback /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@288503
     */
    public native Promise<AudioBuffer> decodeAudioData(ArrayBuffer audioData, DecodeSuccessCallback successCallback /* optional */, DecodeErrorCallback errorCallback /* optional */);
    @JsProperty(name = "currentTime")
    public native Number getCurrentTime();
    @JsProperty(name = "destination")
    public native AudioDestinationNode getDestination();
    @JsProperty(name = "listener")
    public native AudioListener getListener();
    @JsProperty(name = "onstatechange")
    public native Function1<Event, Object> getOnstatechange();
    @JsProperty(name = "sampleRate")
    public native Number getSampleRate();
    @JsProperty(name = "state")
    public native String getState();
    /** 
      * tsd/browser/lib.es6.d.ts@288648
     */
    public native Promise<Void> resume();
    @JsProperty(name = "currentTime")
    public native void setCurrentTime(@DoNotAutobox Number value);
    @JsProperty(name = "destination")
    public native void setDestination(AudioDestinationNode value);
    @JsProperty(name = "listener")
    public native void setListener(AudioListener value);
    @JsProperty(name = "onstatechange")
    public native void setOnstatechange(Function1<Event, Object> value);
    @JsProperty(name = "sampleRate")
    public native void setSampleRate(@DoNotAutobox Number value);
    @JsProperty(name = "state")
    public native void setState(String value);
}
