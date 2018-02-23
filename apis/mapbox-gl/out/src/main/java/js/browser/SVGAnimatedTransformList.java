package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGAnimatedTransformList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 572436
  * declared in: tsd/browser/lib.es6.d.ts at pos 572569
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedTransformList")
public class SVGAnimatedTransformList
{

    /*
        Constructors
    */
    public SVGAnimatedTransformList () {
    } 

    /*
        Properties
    */

    public SVGTransformList animVal;

    public SVGTransformList baseVal;

    /*
        Methods
    */
    @JsProperty(name = "animVal")
    public native SVGTransformList getAnimVal();
    @JsProperty(name = "baseVal")
    public native SVGTransformList getBaseVal();
    @JsProperty(name = "animVal")
    public native void setAnimVal(SVGTransformList value);
    @JsProperty(name = "baseVal")
    public native void setBaseVal(SVGTransformList value);
}
