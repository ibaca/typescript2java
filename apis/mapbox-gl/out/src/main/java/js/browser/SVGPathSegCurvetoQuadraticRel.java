package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPathSegCurvetoQuadraticRel
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 615777
  * declared in: tsd/browser/lib.es6.d.ts at pos 615916
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegCurvetoQuadraticRel")
public class SVGPathSegCurvetoQuadraticRel extends SVGPathSeg 
{

    /*
        Constructors
    */
    public SVGPathSegCurvetoQuadraticRel () {
    } 

    /*
        Properties
    */

    public Number x;

    public Number x1;

    public Number y;

    public Number y1;

    /*
        Methods
    */
    @JsProperty(name = "x")
    public native Number getX();
    @JsProperty(name = "x1")
    public native Number getX1();
    @JsProperty(name = "y")
    public native Number getY();
    @JsProperty(name = "y1")
    public native Number getY1();
    @JsProperty(name = "x")
    public native void setX(@DoNotAutobox Number value);
    @JsProperty(name = "x1")
    public native void setX1(@DoNotAutobox Number value);
    @JsProperty(name = "y")
    public native void setY(@DoNotAutobox Number value);
    @JsProperty(name = "y1")
    public native void setY1(@DoNotAutobox Number value);
}
