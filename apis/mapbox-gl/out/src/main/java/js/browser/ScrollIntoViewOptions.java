package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ScrollIntoViewOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 739763

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ScrollIntoViewOptions implements ScrollOptions 
{

    /*
        Properties
    */

    public String behavior;

    public String block;

    public String inline;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.ScrollOptions)
      * inherited from (js.browser.ScrollOptions)
     */
    @JsProperty(name = "behavior")
    public native String getBehavior();
    @JsProperty(name = "block")
    public native String getBlock();
    @JsProperty(name = "inline")
    public native String getInline();
    /** 
      * inherited from (js.browser.ScrollOptions)
      * inherited from (js.browser.ScrollOptions)
     */
    @JsProperty(name = "behavior")
    public native void setBehavior(String value);
    @JsProperty(name = "block")
    public native void setBlock(String value);
    @JsProperty(name = "inline")
    public native void setInline(String value);
}
