package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGAnimatedAngle
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 570184
  * declared in: tsd/browser/lib.es6.d.ts at pos 570293
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedAngle")
public class SVGAnimatedAngle
{

    /*
        Constructors
    */
    public SVGAnimatedAngle () {
    } 

    /*
        Properties
    */

    public SVGAngle animVal;

    public SVGAngle baseVal;

    /*
        Methods
    */
    @JsProperty(name = "animVal")
    public native SVGAngle getAnimVal();
    @JsProperty(name = "baseVal")
    public native SVGAngle getBaseVal();
    @JsProperty(name = "animVal")
    public native void setAnimVal(SVGAngle value);
    @JsProperty(name = "baseVal")
    public native void setBaseVal(SVGAngle value);
}
