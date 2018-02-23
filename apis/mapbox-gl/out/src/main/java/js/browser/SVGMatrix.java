package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGMatrix
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 607411
  * declared in: tsd/browser/lib.es6.d.ts at pos 607997
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGMatrix")
public class SVGMatrix
{

    /*
        Constructors
    */
    public SVGMatrix () {
    } 

    /*
        Properties
    */

    public Number a;

    public Number b;

    public Number c;

    public Number d;

    public Number e;

    public Number f;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@607529
     */
    public native SVGMatrix flipX();
    /** 
      * tsd/browser/lib.es6.d.ts@607553
     */
    public native SVGMatrix flipY();
    @JsProperty(name = "a")
    public native Number getA();
    @JsProperty(name = "b")
    public native Number getB();
    @JsProperty(name = "c")
    public native Number getC();
    @JsProperty(name = "d")
    public native Number getD();
    @JsProperty(name = "e")
    public native Number getE();
    @JsProperty(name = "f")
    public native Number getF();
    /** 
      * tsd/browser/lib.es6.d.ts@607577
     */
    public native SVGMatrix inverse();
    /** 
      * tsd/browser/lib.es6.d.ts@607603
     */
    public native SVGMatrix multiply(SVGMatrix secondMatrix);
    /** 
      * tsd/browser/lib.es6.d.ts@607653
     */
    public native SVGMatrix rotate(@DoNotAutobox Number angle);
    /** 
      * tsd/browser/lib.es6.d.ts@607691
     */
    public native SVGMatrix rotateFromVector(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@607746
     */
    public native SVGMatrix scale(@DoNotAutobox Number scaleFactor);
    /** 
      * tsd/browser/lib.es6.d.ts@607789
     */
    public native SVGMatrix scaleNonUniform(@DoNotAutobox Number scaleFactorX, @DoNotAutobox Number scaleFactorY);
    @JsProperty(name = "a")
    public native void setA(@DoNotAutobox Number value);
    @JsProperty(name = "b")
    public native void setB(@DoNotAutobox Number value);
    @JsProperty(name = "c")
    public native void setC(@DoNotAutobox Number value);
    @JsProperty(name = "d")
    public native void setD(@DoNotAutobox Number value);
    @JsProperty(name = "e")
    public native void setE(@DoNotAutobox Number value);
    @JsProperty(name = "f")
    public native void setF(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@607865
     */
    public native SVGMatrix skewX(@DoNotAutobox Number angle);
    /** 
      * tsd/browser/lib.es6.d.ts@607902
     */
    public native SVGMatrix skewY(@DoNotAutobox Number angle);
    /** 
      * tsd/browser/lib.es6.d.ts@607939
     */
    public native SVGMatrix translate(@DoNotAutobox Number x, @DoNotAutobox Number y);
}
