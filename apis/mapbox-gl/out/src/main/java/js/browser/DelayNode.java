package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DelayNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 325055
  * declared in: tsd/browser/lib.es6.d.ts at pos 325147
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DelayNode")
public class DelayNode extends AudioNode 
{

    /*
        Constructors
    */
    public DelayNode () {
    } 

    /*
        Properties
    */

    public AudioParam delayTime;

    /*
        Methods
    */
    @JsProperty(name = "delayTime")
    public native AudioParam getDelayTime();
    @JsProperty(name = "delayTime")
    public native void setDelayTime(AudioParam value);
}
