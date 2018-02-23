package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPathSegCurvetoCubicSmoothAbs
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 614975
  * declared in: tsd/browser/lib.es6.d.ts at pos 615116
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegCurvetoCubicSmoothAbs")
public class SVGPathSegCurvetoCubicSmoothAbs extends SVGPathSeg 
{

    /*
        Constructors
    */
    public SVGPathSegCurvetoCubicSmoothAbs () {
    } 

    /*
        Properties
    */

    public Number x;

    public Number x2;

    public Number y;

    public Number y2;

    /*
        Methods
    */
    @JsProperty(name = "x")
    public native Number getX();
    @JsProperty(name = "x2")
    public native Number getX2();
    @JsProperty(name = "y")
    public native Number getY();
    @JsProperty(name = "y2")
    public native Number getY2();
    @JsProperty(name = "x")
    public native void setX(@DoNotAutobox Number value);
    @JsProperty(name = "x2")
    public native void setX2(@DoNotAutobox Number value);
    @JsProperty(name = "y")
    public native void setY(@DoNotAutobox Number value);
    @JsProperty(name = "y2")
    public native void setY2(@DoNotAutobox Number value);
}
