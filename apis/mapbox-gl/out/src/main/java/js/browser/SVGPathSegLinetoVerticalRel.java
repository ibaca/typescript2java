package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPathSegLinetoVerticalRel
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 617564
  * declared in: tsd/browser/lib.es6.d.ts at pos 617654
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathSegLinetoVerticalRel")
public class SVGPathSegLinetoVerticalRel extends SVGPathSeg 
{

    /*
        Constructors
    */
    public SVGPathSegLinetoVerticalRel () {
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
