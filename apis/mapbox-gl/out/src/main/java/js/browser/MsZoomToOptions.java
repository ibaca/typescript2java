package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MsZoomToOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 271076

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MsZoomToOptions
{

    /*
        Properties
    */

    public String animate;

    public Number contentX;

    public Number contentY;

    public Number scaleFactor;

    public String viewportX;

    public String viewportY;

    /*
        Methods
    */
    @JsProperty(name = "animate")
    public native String getAnimate();
    @JsProperty(name = "contentX")
    public native Number getContentX();
    @JsProperty(name = "contentY")
    public native Number getContentY();
    @JsProperty(name = "scaleFactor")
    public native Number getScaleFactor();
    @JsProperty(name = "viewportX")
    public native String getViewportX();
    @JsProperty(name = "viewportY")
    public native String getViewportY();
    @JsProperty(name = "animate")
    public native void setAnimate(String value);
    @JsProperty(name = "contentX")
    public native void setContentX(@DoNotAutobox Number value);
    @JsProperty(name = "contentY")
    public native void setContentY(@DoNotAutobox Number value);
    @JsProperty(name = "scaleFactor")
    public native void setScaleFactor(@DoNotAutobox Number value);
    @JsProperty(name = "viewportX")
    public native void setViewportX(String value);
    @JsProperty(name = "viewportY")
    public native void setViewportY(String value);
}
