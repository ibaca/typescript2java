package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AnalyserNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 282778
  * declared in: tsd/browser/lib.es6.d.ts at pos 283195
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AnalyserNode")
public class AnalyserNode extends AudioNode 
{

    /*
        Constructors
    */
    public AnalyserNode () {
    } 

    /*
        Properties
    */

    public Number fftSize;

    public Number frequencyBinCount;

    public Number maxDecibels;

    public Number minDecibels;

    public Number smoothingTimeConstant;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@282973
     */
    public native void getByteFrequencyData(Uint8Array array);
    /** 
      * tsd/browser/lib.es6.d.ts@283024
     */
    public native void getByteTimeDomainData(Uint8Array array);
    @JsProperty(name = "fftSize")
    public native Number getFftSize();
    /** 
      * tsd/browser/lib.es6.d.ts@283076
     */
    public native void getFloatFrequencyData(Float32Array array);
    /** 
      * tsd/browser/lib.es6.d.ts@283130
     */
    public native void getFloatTimeDomainData(Float32Array array);
    @JsProperty(name = "frequencyBinCount")
    public native Number getFrequencyBinCount();
    @JsProperty(name = "maxDecibels")
    public native Number getMaxDecibels();
    @JsProperty(name = "minDecibels")
    public native Number getMinDecibels();
    @JsProperty(name = "smoothingTimeConstant")
    public native Number getSmoothingTimeConstant();
    @JsProperty(name = "fftSize")
    public native void setFftSize(@DoNotAutobox Number value);
    @JsProperty(name = "frequencyBinCount")
    public native void setFrequencyBinCount(@DoNotAutobox Number value);
    @JsProperty(name = "maxDecibels")
    public native void setMaxDecibels(@DoNotAutobox Number value);
    @JsProperty(name = "minDecibels")
    public native void setMinDecibels(@DoNotAutobox Number value);
    @JsProperty(name = "smoothingTimeConstant")
    public native void setSmoothingTimeConstant(@DoNotAutobox Number value);
}
