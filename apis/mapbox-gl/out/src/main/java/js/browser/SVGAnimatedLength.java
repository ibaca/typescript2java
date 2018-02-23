package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGAnimatedLength
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 570959
  * declared in: tsd/browser/lib.es6.d.ts at pos 571071
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedLength")
public class SVGAnimatedLength
{

    /*
        Constructors
    */
    public SVGAnimatedLength () {
    } 

    /*
        Properties
    */

    public SVGLength animVal;

    public SVGLength baseVal;

    /*
        Methods
    */
    @JsProperty(name = "animVal")
    public native SVGLength getAnimVal();
    @JsProperty(name = "baseVal")
    public native SVGLength getBaseVal();
    @JsProperty(name = "animVal")
    public native void setAnimVal(SVGLength value);
    @JsProperty(name = "baseVal")
    public native void setBaseVal(SVGLength value);
}
