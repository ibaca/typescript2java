package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ScrollToOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 739673

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ScrollToOptions implements ScrollOptions 
{

    /*
        Properties
    */

    public String behavior;

    public Number left;

    public Number top;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.ScrollOptions)
      * inherited from (js.browser.ScrollOptions)
     */
    @JsProperty(name = "behavior")
    public native String getBehavior();
    @JsProperty(name = "left")
    public native Number getLeft();
    @JsProperty(name = "top")
    public native Number getTop();
    /** 
      * inherited from (js.browser.ScrollOptions)
      * inherited from (js.browser.ScrollOptions)
     */
    @JsProperty(name = "behavior")
    public native void setBehavior(String value);
    @JsProperty(name = "left")
    public native void setLeft(@DoNotAutobox Number value);
    @JsProperty(name = "top")
    public native void setTop(@DoNotAutobox Number value);
}
