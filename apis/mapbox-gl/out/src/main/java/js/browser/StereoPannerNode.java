package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: StereoPannerNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 648090
  * declared in: tsd/browser/lib.es6.d.ts at pos 648183
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StereoPannerNode")
public class StereoPannerNode extends AudioNode 
{

    /*
        Constructors
    */
    public StereoPannerNode () {
    } 

    /*
        Properties
    */

    public AudioParam pan;

    /*
        Methods
    */
    @JsProperty(name = "pan")
    public native AudioParam getPan();
    @JsProperty(name = "pan")
    public native void setPan(AudioParam value);
}
