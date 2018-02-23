package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: UIEventInit
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 281414
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface UIEventInit extends EventInit 
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
     */
    @JsProperty(name = "detail")
    Number getDetail();
    /** 
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
     */
    @JsProperty(name = "view")
    Window getView();
    /** 
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
     */
    @JsProperty(name = "detail")
    void setDetail(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
      * inherited from (js.browser.UIEventInit)
     */
    @JsProperty(name = "view")
    void setView(Window value);
}
