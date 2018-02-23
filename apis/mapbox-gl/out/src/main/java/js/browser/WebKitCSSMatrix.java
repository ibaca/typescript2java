package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WebKitCSSMatrix
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 699859
  * declared in: tsd/browser/lib.es6.d.ts at pos 700819
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitCSSMatrix")
public class WebKitCSSMatrix
{

    /*
        Constructors
    */
    public WebKitCSSMatrix (String text /* optional */) {
    } 
    public WebKitCSSMatrix () {
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

    public Number m11;

    public Number m12;

    public Number m13;

    public Number m14;

    public Number m21;

    public Number m22;

    public Number m23;

    public Number m24;

    public Number m31;

    public Number m32;

    public Number m33;

    public Number m34;

    public Number m41;

    public Number m42;

    public Number m43;

    public Number m44;

    /*
        Methods
    */
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
    @JsProperty(name = "m11")
    public native Number getM11();
    @JsProperty(name = "m12")
    public native Number getM12();
    @JsProperty(name = "m13")
    public native Number getM13();
    @JsProperty(name = "m14")
    public native Number getM14();
    @JsProperty(name = "m21")
    public native Number getM21();
    @JsProperty(name = "m22")
    public native Number getM22();
    @JsProperty(name = "m23")
    public native Number getM23();
    @JsProperty(name = "m24")
    public native Number getM24();
    @JsProperty(name = "m31")
    public native Number getM31();
    @JsProperty(name = "m32")
    public native Number getM32();
    @JsProperty(name = "m33")
    public native Number getM33();
    @JsProperty(name = "m34")
    public native Number getM34();
    @JsProperty(name = "m41")
    public native Number getM41();
    @JsProperty(name = "m42")
    public native Number getM42();
    @JsProperty(name = "m43")
    public native Number getM43();
    @JsProperty(name = "m44")
    public native Number getM44();
    /** 
      * tsd/browser/lib.es6.d.ts@700255
     */
    public native WebKitCSSMatrix inverse();
    /** 
      * tsd/browser/lib.es6.d.ts@700287
     */
    public native WebKitCSSMatrix multiply(WebKitCSSMatrix secondMatrix);
    public native WebKitCSSMatrix rotate(@DoNotAutobox Number angleX);
    public native WebKitCSSMatrix rotate(@DoNotAutobox Number angleX, @DoNotAutobox Number angleY /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@700349
     */
    public native WebKitCSSMatrix rotate(@DoNotAutobox Number angleX, @DoNotAutobox Number angleY /* optional */, @DoNotAutobox Number angleZ /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@700428
     */
    public native WebKitCSSMatrix rotateAxisAngle(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number z, @DoNotAutobox Number angle);
    public native WebKitCSSMatrix scale(@DoNotAutobox Number scaleX);
    public native WebKitCSSMatrix scale(@DoNotAutobox Number scaleX, @DoNotAutobox Number scaleY /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@700514
     */
    public native WebKitCSSMatrix scale(@DoNotAutobox Number scaleX, @DoNotAutobox Number scaleY /* optional */, @DoNotAutobox Number scaleZ /* optional */);
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
    @JsProperty(name = "m11")
    public native void setM11(@DoNotAutobox Number value);
    @JsProperty(name = "m12")
    public native void setM12(@DoNotAutobox Number value);
    @JsProperty(name = "m13")
    public native void setM13(@DoNotAutobox Number value);
    @JsProperty(name = "m14")
    public native void setM14(@DoNotAutobox Number value);
    @JsProperty(name = "m21")
    public native void setM21(@DoNotAutobox Number value);
    @JsProperty(name = "m22")
    public native void setM22(@DoNotAutobox Number value);
    @JsProperty(name = "m23")
    public native void setM23(@DoNotAutobox Number value);
    @JsProperty(name = "m24")
    public native void setM24(@DoNotAutobox Number value);
    @JsProperty(name = "m31")
    public native void setM31(@DoNotAutobox Number value);
    @JsProperty(name = "m32")
    public native void setM32(@DoNotAutobox Number value);
    @JsProperty(name = "m33")
    public native void setM33(@DoNotAutobox Number value);
    @JsProperty(name = "m34")
    public native void setM34(@DoNotAutobox Number value);
    @JsProperty(name = "m41")
    public native void setM41(@DoNotAutobox Number value);
    @JsProperty(name = "m42")
    public native void setM42(@DoNotAutobox Number value);
    @JsProperty(name = "m43")
    public native void setM43(@DoNotAutobox Number value);
    @JsProperty(name = "m44")
    public native void setM44(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@700592
     */
    public native void setMatrixValue(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@700633
     */
    public native WebKitCSSMatrix skewX(@DoNotAutobox Number angle);
    /** 
      * tsd/browser/lib.es6.d.ts@700676
     */
    public native WebKitCSSMatrix skewY(@DoNotAutobox Number angle);
    public native WebKitCSSMatrix translate(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@700743
     */
    public native WebKitCSSMatrix translate(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number z /* optional */);
}
