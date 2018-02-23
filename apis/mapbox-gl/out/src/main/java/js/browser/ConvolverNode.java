package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ConvolverNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 317858
  * declared in: tsd/browser/lib.es6.d.ts at pos 317974
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ConvolverNode")
public class ConvolverNode extends AudioNode 
{

    /*
        Constructors
    */
    public ConvolverNode () {
    } 

    /*
        Properties
    */

    public AudioBuffer buffer;

    public Boolean normalize;

    /*
        Methods
    */
    @JsProperty(name = "buffer")
    public native AudioBuffer getBuffer();
    @JsProperty(name = "normalize")
    public native Boolean getNormalize();
    @JsProperty(name = "buffer")
    public native void setBuffer(AudioBuffer value);
    @JsProperty(name = "normalize")
    public native void setNormalize(Boolean value);
}
