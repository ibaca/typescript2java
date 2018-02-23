package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: BiquadFilterNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 292604
  * declared in: tsd/browser/lib.es6.d.ts at pos 292928
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="BiquadFilterNode")
public class BiquadFilterNode extends AudioNode 
{

    /*
        Constructors
    */
    public BiquadFilterNode () {
    } 

    /*
        Properties
    */

    public AudioParam Q;

    public AudioParam detune;

    public AudioParam frequency;

    public AudioParam gain;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "detune")
    public native AudioParam getDetune();
    @JsProperty(name = "frequency")
    public native AudioParam getFrequency();
    /** 
      * tsd/browser/lib.es6.d.ts@292803
     */
    public native void getFrequencyResponse(Float32Array frequencyHz, Float32Array magResponse, Float32Array phaseResponse);
    @JsProperty(name = "gain")
    public native AudioParam getGain();
    @JsProperty(name = "Q")
    public native AudioParam getQ();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "detune")
    public native void setDetune(AudioParam value);
    @JsProperty(name = "frequency")
    public native void setFrequency(AudioParam value);
    @JsProperty(name = "gain")
    public native void setGain(AudioParam value);
    @JsProperty(name = "Q")
    public native void setQ(AudioParam value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
