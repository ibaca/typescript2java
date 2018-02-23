package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPathSegLinetoHorizontalAbs
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 616737
  * declared in: tsd/browser/lib.es6.d.ts at pos 616829
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegLinetoHorizontalAbs")
public class SVGPathSegLinetoHorizontalAbs extends SVGPathSeg 
{

    /*
        Constructors
    */
    public SVGPathSegLinetoHorizontalAbs () {
    } 

    /*
        Properties
    */

    public Number x;

    /*
        Methods
    */
    @JsProperty(name = "x")
    public native Number getX();
    @JsProperty(name = "x")
    public native void setX(@DoNotAutobox Number value);
}
