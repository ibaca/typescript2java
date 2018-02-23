package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGAnimatedPreserveAspectRatio
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 571788
  * declared in: tsd/browser/lib.es6.d.ts at pos 571939
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedPreserveAspectRatio")
public class SVGAnimatedPreserveAspectRatio
{

    /*
        Constructors
    */
    public SVGAnimatedPreserveAspectRatio () {
    } 

    /*
        Properties
    */

    public SVGPreserveAspectRatio animVal;

    public SVGPreserveAspectRatio baseVal;

    /*
        Methods
    */
    @JsProperty(name = "animVal")
    public native SVGPreserveAspectRatio getAnimVal();
    @JsProperty(name = "baseVal")
    public native SVGPreserveAspectRatio getBaseVal();
    @JsProperty(name = "animVal")
    public native void setAnimVal(SVGPreserveAspectRatio value);
    @JsProperty(name = "baseVal")
    public native void setBaseVal(SVGPreserveAspectRatio value);
}
