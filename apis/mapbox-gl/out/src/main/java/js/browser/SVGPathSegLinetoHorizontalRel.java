package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPathSegLinetoHorizontalRel
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 616952
  * declared in: tsd/browser/lib.es6.d.ts at pos 617044
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegLinetoHorizontalRel")
public class SVGPathSegLinetoHorizontalRel extends SVGPathSeg 
{

    /*
        Constructors
    */
    public SVGPathSegLinetoHorizontalRel () {
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
