package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGAnimatedRect
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 572065
  * declared in: tsd/browser/lib.es6.d.ts at pos 572171
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedRect")
public class SVGAnimatedRect
{

    /*
        Constructors
    */
    public SVGAnimatedRect () {
    } 

    /*
        Properties
    */

    public SVGRect animVal;

    public SVGRect baseVal;

    /*
        Methods
    */
    @JsProperty(name = "animVal")
    public native SVGRect getAnimVal();
    @JsProperty(name = "baseVal")
    public native SVGRect getBaseVal();
    @JsProperty(name = "animVal")
    public native void setAnimVal(SVGRect value);
    @JsProperty(name = "baseVal")
    public native void setBaseVal(SVGRect value);
}
