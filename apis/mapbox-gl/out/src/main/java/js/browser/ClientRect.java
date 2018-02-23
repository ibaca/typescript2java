package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ClientRect
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 315148
  * declared in: tsd/browser/lib.es6.d.ts at pos 315318
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ClientRect")
public class ClientRect
{

    /*
        Constructors
    */
    public ClientRect () {
    } 

    /*
        Properties
    */

    public Number bottom;

    public Number height;

    public Number left;

    public Number right;

    public Number top;

    public Number width;

    /*
        Methods
    */
    @JsProperty(name = "bottom")
    public native Number getBottom();
    @JsProperty(name = "height")
    public native Number getHeight();
    @JsProperty(name = "left")
    public native Number getLeft();
    @JsProperty(name = "right")
    public native Number getRight();
    @JsProperty(name = "top")
    public native Number getTop();
    @JsProperty(name = "width")
    public native Number getWidth();
    @JsProperty(name = "bottom")
    public native void setBottom(@DoNotAutobox Number value);
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    @JsProperty(name = "left")
    public native void setLeft(@DoNotAutobox Number value);
    @JsProperty(name = "right")
    public native void setRight(@DoNotAutobox Number value);
    @JsProperty(name = "top")
    public native void setTop(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
}
