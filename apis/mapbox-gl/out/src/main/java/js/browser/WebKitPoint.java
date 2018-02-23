package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WebKitPoint
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 702077
  * declared in: tsd/browser/lib.es6.d.ts at pos 702147
  * 3 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitPoint")
public class WebKitPoint
{

    /*
        Constructors
    */
    public WebKitPoint (@DoNotAutobox Number x /* optional */, @DoNotAutobox Number y /* optional */) {
    } 
    public WebKitPoint (@DoNotAutobox Number x /* optional */) {
    } 
    public WebKitPoint () {
    } 

    /*
        Properties
    */

    public Number x;

    public Number y;

    /*
        Methods
    */
    @JsProperty(name = "x")
    public native Number getX();
    @JsProperty(name = "y")
    public native Number getY();
    @JsProperty(name = "x")
    public native void setX(@DoNotAutobox Number value);
    @JsProperty(name = "y")
    public native void setY(@DoNotAutobox Number value);
}
