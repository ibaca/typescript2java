package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: NavigatorOnLine
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 733875
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NavigatorOnLine
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.NavigatorOnLine)
     */
    @JsProperty(name = "onLine")
    Boolean getOnLine();
    /** 
      * inherited from (js.browser.NavigatorOnLine)
     */
    @JsProperty(name = "onLine")
    void setOnLine(Boolean value);
}
