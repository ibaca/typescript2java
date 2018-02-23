package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGAnimatedInteger
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 570771
  * declared in: tsd/browser/lib.es6.d.ts at pos 570869
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedInteger")
public class SVGAnimatedInteger
{

    /*
        Constructors
    */
    public SVGAnimatedInteger () {
    } 

    /*
        Properties
    */

    public Number animVal;

    public Number baseVal;

    /*
        Methods
    */
    @JsProperty(name = "animVal")
    public native Number getAnimVal();
    @JsProperty(name = "baseVal")
    public native Number getBaseVal();
    @JsProperty(name = "animVal")
    public native void setAnimVal(@DoNotAutobox Number value);
    @JsProperty(name = "baseVal")
    public native void setBaseVal(@DoNotAutobox Number value);
}
