package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: FocusNavigationOrigin
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 258939

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class FocusNavigationOrigin
{

    /*
        Properties
    */

    public Number originHeight;

    public Number originLeft;

    public Number originTop;

    public Number originWidth;

    /*
        Methods
    */
    @JsProperty(name = "originHeight")
    public native Number getOriginHeight();
    @JsProperty(name = "originLeft")
    public native Number getOriginLeft();
    @JsProperty(name = "originTop")
    public native Number getOriginTop();
    @JsProperty(name = "originWidth")
    public native Number getOriginWidth();
    @JsProperty(name = "originHeight")
    public native void setOriginHeight(@DoNotAutobox Number value);
    @JsProperty(name = "originLeft")
    public native void setOriginLeft(@DoNotAutobox Number value);
    @JsProperty(name = "originTop")
    public native void setOriginTop(@DoNotAutobox Number value);
    @JsProperty(name = "originWidth")
    public native void setOriginWidth(@DoNotAutobox Number value);
}
