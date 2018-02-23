package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: GainNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 376415
  * declared in: tsd/browser/lib.es6.d.ts at pos 376501
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="GainNode")
public class GainNode extends AudioNode 
{

    /*
        Constructors
    */
    public GainNode () {
    } 

    /*
        Properties
    */

    public AudioParam gain;

    /*
        Methods
    */
    @JsProperty(name = "gain")
    public native AudioParam getGain();
    @JsProperty(name = "gain")
    public native void setGain(AudioParam value);
}
