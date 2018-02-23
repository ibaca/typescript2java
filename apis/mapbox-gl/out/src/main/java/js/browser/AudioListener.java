package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AudioListener
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 289318
  * declared in: tsd/browser/lib.es6.d.ts at pos 289623
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioListener")
public class AudioListener
{

    /*
        Constructors
    */
    public AudioListener () {
    } 

    /*
        Properties
    */

    public Number dopplerFactor;

    public Number speedOfSound;

    /*
        Methods
    */
    @JsProperty(name = "dopplerFactor")
    public native Number getDopplerFactor();
    @JsProperty(name = "speedOfSound")
    public native Number getSpeedOfSound();
    @JsProperty(name = "dopplerFactor")
    public native void setDopplerFactor(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@289403
     */
    public native void setOrientation(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number z, @DoNotAutobox Number xUp, @DoNotAutobox Number yUp, @DoNotAutobox Number zUp);
    /** 
      * tsd/browser/lib.es6.d.ts@289501
     */
    public native void setPosition(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number z);
    @JsProperty(name = "speedOfSound")
    public native void setSpeedOfSound(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@289557
     */
    public native void setVelocity(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number z);
}
