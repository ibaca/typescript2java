package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGAnimatedNumberList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 571565
  * declared in: tsd/browser/lib.es6.d.ts at pos 571689
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedNumberList")
public class SVGAnimatedNumberList
{

    /*
        Constructors
    */
    public SVGAnimatedNumberList () {
    } 

    /*
        Properties
    */

    public SVGNumberList animVal;

    public SVGNumberList baseVal;

    /*
        Methods
    */
    @JsProperty(name = "animVal")
    public native SVGNumberList getAnimVal();
    @JsProperty(name = "baseVal")
    public native SVGNumberList getBaseVal();
    @JsProperty(name = "animVal")
    public native void setAnimVal(SVGNumberList value);
    @JsProperty(name = "baseVal")
    public native void setBaseVal(SVGNumberList value);
}
