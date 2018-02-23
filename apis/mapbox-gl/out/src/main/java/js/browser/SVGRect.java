package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGRect
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 623313
  * declared in: tsd/browser/lib.es6.d.ts at pos 623418
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGRect")
public class SVGRect
{

    /*
        Constructors
    */
    public SVGRect () {
    } 

    /*
        Properties
    */

    public Number height;

    public Number width;

    public Number x;

    public Number y;

    /*
        Methods
    */
    @JsProperty(name = "height")
    public native Number getHeight();
    @JsProperty(name = "width")
    public native Number getWidth();
    @JsProperty(name = "x")
    public native Number getX();
    @JsProperty(name = "y")
    public native Number getY();
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
    @JsProperty(name = "x")
    public native void setX(@DoNotAutobox Number value);
    @JsProperty(name = "y")
    public native void setY(@DoNotAutobox Number value);
}
