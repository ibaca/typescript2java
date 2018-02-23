package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WaveShaperNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 664410
  * declared in: tsd/browser/lib.es6.d.ts at pos 664527
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WaveShaperNode")
public class WaveShaperNode extends AudioNode 
{

    /*
        Constructors
    */
    public WaveShaperNode () {
    } 

    /*
        Properties
    */

    public Float32Array curve;

    public String oversample;

    /*
        Methods
    */
    @JsProperty(name = "curve")
    public native Float32Array getCurve();
    @JsProperty(name = "oversample")
    public native String getOversample();
    @JsProperty(name = "curve")
    public native void setCurve(Float32Array value);
    @JsProperty(name = "oversample")
    public native void setOversample(String value);
}
