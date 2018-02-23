package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: OscillatorNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 538998
  * declared in: tsd/browser/lib.es6.d.ts at pos 539616
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="OscillatorNode")
public class OscillatorNode extends AudioNode 
{

    /*
        Constructors
    */
    public OscillatorNode () {
    } 

    /*
        Properties
    */

    public AudioParam detune;

    public AudioParam frequency;

    public Function1<MediaStreamErrorEvent, Object> onended;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "detune")
    public native AudioParam getDetune();
    @JsProperty(name = "frequency")
    public native AudioParam getFrequency();
    @JsProperty(name = "onended")
    public native Function1<MediaStreamErrorEvent, Object> getOnended();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "detune")
    public native void setDetune(AudioParam value);
    @JsProperty(name = "frequency")
    public native void setFrequency(AudioParam value);
    @JsProperty(name = "onended")
    public native void setOnended(Function1<MediaStreamErrorEvent, Object> value);
    /** 
      * tsd/browser/lib.es6.d.ts@539207
     */
    public native void setPeriodicWave(PeriodicWave periodicWave);
    @JsProperty(name = "type")
    public native void setType(String value);
    public native void start();
    /** 
      * tsd/browser/lib.es6.d.ts@539262
     */
    public native void start(@DoNotAutobox Number when /* optional */);
    public native void stop();
    /** 
      * tsd/browser/lib.es6.d.ts@539294
     */
    public native void stop(@DoNotAutobox Number when /* optional */);
}
