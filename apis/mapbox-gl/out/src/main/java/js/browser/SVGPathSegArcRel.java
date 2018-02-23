package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPathSegArcRel
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 613979
  * declared in: tsd/browser/lib.es6.d.ts at pos 614175
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegArcRel")
public class SVGPathSegArcRel extends SVGPathSeg 
{

    /*
        Constructors
    */
    public SVGPathSegArcRel () {
    } 

    /*
        Properties
    */

    public Number angle;

    public Boolean largeArcFlag;

    public Number r1;

    public Number r2;

    public Boolean sweepFlag;

    public Number x;

    public Number y;

    /*
        Methods
    */
    @JsProperty(name = "angle")
    public native Number getAngle();
    @JsProperty(name = "largeArcFlag")
    public native Boolean getLargeArcFlag();
    @JsProperty(name = "r1")
    public native Number getR1();
    @JsProperty(name = "r2")
    public native Number getR2();
    @JsProperty(name = "sweepFlag")
    public native Boolean getSweepFlag();
    @JsProperty(name = "x")
    public native Number getX();
    @JsProperty(name = "y")
    public native Number getY();
    @JsProperty(name = "angle")
    public native void setAngle(@DoNotAutobox Number value);
    @JsProperty(name = "largeArcFlag")
    public native void setLargeArcFlag(Boolean value);
    @JsProperty(name = "r1")
    public native void setR1(@DoNotAutobox Number value);
    @JsProperty(name = "r2")
    public native void setR2(@DoNotAutobox Number value);
    @JsProperty(name = "sweepFlag")
    public native void setSweepFlag(Boolean value);
    @JsProperty(name = "x")
    public native void setX(@DoNotAutobox Number value);
    @JsProperty(name = "y")
    public native void setY(@DoNotAutobox Number value);
}
