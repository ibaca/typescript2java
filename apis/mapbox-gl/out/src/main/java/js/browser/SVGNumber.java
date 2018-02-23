package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGNumber
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 608493
  * declared in: tsd/browser/lib.es6.d.ts at pos 608550
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGNumber")
public class SVGNumber
{

    /*
        Constructors
    */
    public SVGNumber () {
    } 

    /*
        Properties
    */

    public Number value;

    /*
        Methods
    */
    @JsProperty(name = "value")
    public native Number getValue();
    @JsProperty(name = "value")
    public native void setValue(@DoNotAutobox Number value);
}
