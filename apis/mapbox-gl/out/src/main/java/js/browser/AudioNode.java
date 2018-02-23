package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AudioNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 289698
  * declared in: tsd/browser/lib.es6.d.ts at pos 290221
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioNode")
public class AudioNode extends EventTarget 
{

    /*
        Constructors
    */
    public AudioNode () {
    } 

    /*
        Properties
    */

    public Number channelCount;

    public String channelCountMode;

    public String channelInterpretation;

    public AudioContext context;

    public Number numberOfInputs;

    public Number numberOfOutputs;

    /*
        Methods
    */
    public native AudioNode connect(AudioNode destination);
    public native AudioNode connect(AudioNode destination, @DoNotAutobox Number output /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@289948
     */
    public native AudioNode connect(AudioNode destination, @DoNotAutobox Number output /* optional */, @DoNotAutobox Number input /* optional */);
    public native void disconnect();
    /** 
      * tsd/browser/lib.es6.d.ts@290029
     */
    public native void disconnect(@DoNotAutobox Number output /* optional */);
    public native void disconnect(AudioParam destination);
    /** 
      * tsd/browser/lib.es6.d.ts@290147
      * VERSION 2
     */
    public native void disconnect(AudioParam destination, @DoNotAutobox Number output /* optional */);
    public native void disconnect(AudioNode destination);
    public native void disconnect(AudioNode destination, @DoNotAutobox Number output /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@290068
      * VERSION 1
     */
    public native void disconnect(AudioNode destination, @DoNotAutobox Number output /* optional */, @DoNotAutobox Number input /* optional */);
    @JsProperty(name = "channelCount")
    public native Number getChannelCount();
    @JsProperty(name = "channelCountMode")
    public native String getChannelCountMode();
    @JsProperty(name = "channelInterpretation")
    public native String getChannelInterpretation();
    @JsProperty(name = "context")
    public native AudioContext getContext();
    @JsProperty(name = "numberOfInputs")
    public native Number getNumberOfInputs();
    @JsProperty(name = "numberOfOutputs")
    public native Number getNumberOfOutputs();
    @JsProperty(name = "channelCount")
    public native void setChannelCount(@DoNotAutobox Number value);
    @JsProperty(name = "channelCountMode")
    public native void setChannelCountMode(String value);
    @JsProperty(name = "channelInterpretation")
    public native void setChannelInterpretation(String value);
    @JsProperty(name = "context")
    public native void setContext(AudioContext value);
    @JsProperty(name = "numberOfInputs")
    public native void setNumberOfInputs(@DoNotAutobox Number value);
    @JsProperty(name = "numberOfOutputs")
    public native void setNumberOfOutputs(@DoNotAutobox Number value);
}
