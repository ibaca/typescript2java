package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TextMetrics
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 654656
  * declared in: tsd/browser/lib.es6.d.ts at pos 654724
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextMetrics")
public class TextMetrics
{

    /*
        Constructors
    */
    public TextMetrics () {
    } 

    /*
        Properties
    */

    public Number width;

    /*
        Methods
    */
    @JsProperty(name = "width")
    public native Number getWidth();
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
}
