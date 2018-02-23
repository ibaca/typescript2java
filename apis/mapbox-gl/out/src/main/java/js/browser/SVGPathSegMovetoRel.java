package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPathSegMovetoRel
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 618453
  * declared in: tsd/browser/lib.es6.d.ts at pos 618550
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegMovetoRel")
public class SVGPathSegMovetoRel extends SVGPathSeg 
{

    /*
        Constructors
    */
    public SVGPathSegMovetoRel () {
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
