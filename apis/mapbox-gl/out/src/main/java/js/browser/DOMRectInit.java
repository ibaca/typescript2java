package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DOMRectInit
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 257109

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class DOMRectInit
{

    /*
        Properties
    */

    public Object height;

    public Object width;

    public Object x;

    public Object y;

    /*
        Methods
    */
    @JsProperty(name = "height")
    public native Object getHeight();
    @JsProperty(name = "width")
    public native Object getWidth();
    @JsProperty(name = "x")
    public native Object getX();
    @JsProperty(name = "y")
    public native Object getY();
    @JsProperty(name = "height")
    public native void setHeight(Object value);
    @JsProperty(name = "width")
    public native void setWidth(Object value);
    @JsProperty(name = "x")
    public native void setX(Object value);
    @JsProperty(name = "y")
    public native void setY(Object value);
}
