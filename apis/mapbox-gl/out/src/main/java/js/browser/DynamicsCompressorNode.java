package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DynamicsCompressorNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 364500
  * declared in: tsd/browser/lib.es6.d.ts at pos 364767
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DynamicsCompressorNode")
public class DynamicsCompressorNode extends AudioNode 
{

    /*
        Constructors
    */
    public DynamicsCompressorNode () {
    } 

    /*
        Properties
    */

    public AudioParam attack;

    public AudioParam knee;

    public AudioParam ratio;

    public Number reduction;

    public AudioParam release;

    public AudioParam threshold;

    /*
        Methods
    */
    @JsProperty(name = "attack")
    public native AudioParam getAttack();
    @JsProperty(name = "knee")
    public native AudioParam getKnee();
    @JsProperty(name = "ratio")
    public native AudioParam getRatio();
    @JsProperty(name = "reduction")
    public native Number getReduction();
    @JsProperty(name = "release")
    public native AudioParam getRelease();
    @JsProperty(name = "threshold")
    public native AudioParam getThreshold();
    @JsProperty(name = "attack")
    public native void setAttack(AudioParam value);
    @JsProperty(name = "knee")
    public native void setKnee(AudioParam value);
    @JsProperty(name = "ratio")
    public native void setRatio(AudioParam value);
    @JsProperty(name = "reduction")
    public native void setReduction(@DoNotAutobox Number value);
    @JsProperty(name = "release")
    public native void setRelease(AudioParam value);
    @JsProperty(name = "threshold")
    public native void setThreshold(AudioParam value);
}
