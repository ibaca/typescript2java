package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGAnimatedString
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 572252
  * declared in: tsd/browser/lib.es6.d.ts at pos 572349
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGAnimatedString")
public class SVGAnimatedString
{

    /*
        Constructors
    */
    public SVGAnimatedString () {
    } 

    /*
        Properties
    */

    public String animVal;

    public String baseVal;

    /*
        Methods
    */
    @JsProperty(name = "animVal")
    public native String getAnimVal();
    @JsProperty(name = "baseVal")
    public native String getBaseVal();
    @JsProperty(name = "animVal")
    public native void setAnimVal(String value);
    @JsProperty(name = "baseVal")
    public native void setBaseVal(String value);
}
