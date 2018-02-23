package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPathSegCurvetoQuadraticSmoothAbs
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 616039
  * declared in: tsd/browser/lib.es6.d.ts at pos 616152
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegCurvetoQuadraticSmoothAbs")
public class SVGPathSegCurvetoQuadraticSmoothAbs extends SVGPathSeg 
{

    /*
        Constructors
    */
    public SVGPathSegCurvetoQuadraticSmoothAbs () {
    } 

    /*
        Properties
    */

    public Number x;

    public Number y;

    /*
        Methods
    */
    @JsProperty(name = "x")
    public native Number getX();
    @JsProperty(name = "y")
    public native Number getY();
    @JsProperty(name = "x")
    public native void setX(@DoNotAutobox Number value);
    @JsProperty(name = "y")
    public native void setY(@DoNotAutobox Number value);
}
