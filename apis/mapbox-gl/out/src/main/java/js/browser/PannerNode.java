package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PannerNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 540308
  * declared in: tsd/browser/lib.es6.d.ts at pos 540749
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PannerNode")
public class PannerNode extends AudioNode 
{

    /*
        Constructors
    */
    public PannerNode () {
    } 

    /*
        Properties
    */

    public Number coneInnerAngle;

    public Number coneOuterAngle;

    public Number coneOuterGain;

    public String distanceModel;

    public Number maxDistance;

    public String panningModel;

    public Number refDistance;

    public Number rolloffFactor;

    /*
        Methods
    */
    @JsProperty(name = "coneInnerAngle")
    public native Number getConeInnerAngle();
    @JsProperty(name = "coneOuterAngle")
    public native Number getConeOuterAngle();
    @JsProperty(name = "coneOuterGain")
    public native Number getConeOuterGain();
    @JsProperty(name = "distanceModel")
    public native String getDistanceModel();
    @JsProperty(name = "maxDistance")
    public native Number getMaxDistance();
    @JsProperty(name = "panningModel")
    public native String getPanningModel();
    @JsProperty(name = "refDistance")
    public native Number getRefDistance();
    @JsProperty(name = "rolloffFactor")
    public native Number getRolloffFactor();
    @JsProperty(name = "coneInnerAngle")
    public native void setConeInnerAngle(@DoNotAutobox Number value);
    @JsProperty(name = "coneOuterAngle")
    public native void setConeOuterAngle(@DoNotAutobox Number value);
    @JsProperty(name = "coneOuterGain")
    public native void setConeOuterGain(@DoNotAutobox Number value);
    @JsProperty(name = "distanceModel")
    public native void setDistanceModel(String value);
    @JsProperty(name = "maxDistance")
    public native void setMaxDistance(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@540568
     */
    public native void setOrientation(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number z);
    @JsProperty(name = "panningModel")
    public native void setPanningModel(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@540627
     */
    public native void setPosition(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number z);
    @JsProperty(name = "refDistance")
    public native void setRefDistance(@DoNotAutobox Number value);
    @JsProperty(name = "rolloffFactor")
    public native void setRolloffFactor(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@540683
     */
    public native void setVelocity(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number z);
}
