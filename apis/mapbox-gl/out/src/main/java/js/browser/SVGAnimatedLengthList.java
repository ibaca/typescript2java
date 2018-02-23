package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGAnimatedLengthList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 571158
  * declared in: tsd/browser/lib.es6.d.ts at pos 571282
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedLengthList")
public class SVGAnimatedLengthList
{

    /*
        Constructors
    */
    public SVGAnimatedLengthList () {
    } 

    /*
        Properties
    */

    public SVGLengthList animVal;

    public SVGLengthList baseVal;

    /*
        Methods
    */
    @JsProperty(name = "animVal")
    public native SVGLengthList getAnimVal();
    @JsProperty(name = "baseVal")
    public native SVGLengthList getBaseVal();
    @JsProperty(name = "animVal")
    public native void setAnimVal(SVGLengthList value);
    @JsProperty(name = "baseVal")
    public native void setBaseVal(SVGLengthList value);
}
