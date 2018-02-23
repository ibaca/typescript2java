package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MouseEventInit
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 270856
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface MouseEventInit extends EventModifierInit 
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "button")
    Number getButton();
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "buttons")
    Number getButtons();
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "clientX")
    Number getClientX();
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "clientY")
    Number getClientY();
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "relatedTarget")
    EventTarget getRelatedTarget();
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "screenX")
    Number getScreenX();
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "screenY")
    Number getScreenY();
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "button")
    void setButton(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "buttons")
    void setButtons(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "clientX")
    void setClientX(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "clientY")
    void setClientY(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "relatedTarget")
    void setRelatedTarget(EventTarget value);
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "screenX")
    void setScreenX(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MouseEventInit)
      * inherited from (js.browser.MouseEventInit)
     */
    @JsProperty(name = "screenY")
    void setScreenY(@DoNotAutobox Number value);
}
