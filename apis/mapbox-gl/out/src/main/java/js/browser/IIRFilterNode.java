package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: IIRFilterNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 496783
  * declared in: tsd/browser/lib.es6.d.ts at pos 496958
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="IIRFilterNode")
public class IIRFilterNode extends AudioNode 
{

    /*
        Constructors
    */
    public IIRFilterNode () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@496833
     */
    public native void getFrequencyResponse(Float32Array frequencyHz, Float32Array magResponse, Float32Array phaseResponse);
}
