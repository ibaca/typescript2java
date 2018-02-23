package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AudioDestinationNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 289117
  * declared in: tsd/browser/lib.es6.d.ts at pos 289222
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioDestinationNode")
public class AudioDestinationNode extends AudioNode 
{

    /*
        Constructors
    */
    public AudioDestinationNode () {
    } 

    /*
        Properties
    */

    public Number maxChannelCount;

    /*
        Methods
    */
    @JsProperty(name = "maxChannelCount")
    public native Number getMaxChannelCount();
    @JsProperty(name = "maxChannelCount")
    public native void setMaxChannelCount(@DoNotAutobox Number value);
}
