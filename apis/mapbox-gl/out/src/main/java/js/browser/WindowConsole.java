package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WindowConsole
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 735512
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface WindowConsole
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.WindowConsole)
     */
    @JsProperty(name = "console")
    Console getConsole();
    /** 
      * inherited from (js.browser.WindowConsole)
     */
    @JsProperty(name = "console")
    void setConsole(Console value);
}
