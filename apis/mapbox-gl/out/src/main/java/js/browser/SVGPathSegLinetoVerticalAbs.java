package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPathSegLinetoVerticalAbs
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 617357
  * declared in: tsd/browser/lib.es6.d.ts at pos 617447
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegLinetoVerticalAbs")
public class SVGPathSegLinetoVerticalAbs extends SVGPathSeg 
{

    /*
        Constructors
    */
    public SVGPathSegLinetoVerticalAbs () {
    } 

    /*
        Properties
    */

    public Number y;

    /*
        Methods
    */
    @JsProperty(name = "y")
    public native Number getY();
    @JsProperty(name = "y")
    public native void setY(@DoNotAutobox Number value);
}
