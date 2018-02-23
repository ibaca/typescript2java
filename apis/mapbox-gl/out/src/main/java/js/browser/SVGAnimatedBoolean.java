package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGAnimatedBoolean
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 570377
  * declared in: tsd/browser/lib.es6.d.ts at pos 570477
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedBoolean")
public class SVGAnimatedBoolean
{

    /*
        Constructors
    */
    public SVGAnimatedBoolean () {
    } 

    /*
        Properties
    */

    public Boolean animVal;

    public Boolean baseVal;

    /*
        Methods
    */
    @JsProperty(name = "animVal")
    public native Boolean getAnimVal();
    @JsProperty(name = "baseVal")
    public native Boolean getBaseVal();
    @JsProperty(name = "animVal")
    public native void setAnimVal(Boolean value);
    @JsProperty(name = "baseVal")
    public native void setBaseVal(Boolean value);
}
