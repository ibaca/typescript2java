package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: GlobalEventHandlers
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 729939
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface GlobalEventHandlers
{

    /*
        Methods
    */
    void addEventListener(String type, EventListenerObject listener);
    void addEventListener(String type, EventListenerObject listener, Boolean useCapture /* optional */);
    void addEventListener(String type, EventListener listener);
    void addEventListener(String type, EventListener listener, Boolean useCapture /* optional */);
    void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener);
    /** 
      * tsd/browser/lib.es6.d.ts@730813
      * inherited from (js.browser.GlobalEventHandlers)
     */
    void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener, Boolean useCapture /* optional */);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointercancel")
    Function1<PointerEvent, Object> getOnpointercancel();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerdown")
    Function1<PointerEvent, Object> getOnpointerdown();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerenter")
    Function1<PointerEvent, Object> getOnpointerenter();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerleave")
    Function1<PointerEvent, Object> getOnpointerleave();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointermove")
    Function1<PointerEvent, Object> getOnpointermove();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerout")
    Function1<PointerEvent, Object> getOnpointerout();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerover")
    Function1<PointerEvent, Object> getOnpointerover();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerup")
    Function1<PointerEvent, Object> getOnpointerup();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onwheel")
    Function1<WheelEvent, Object> getOnwheel();
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointercancel")
    void setOnpointercancel(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerdown")
    void setOnpointerdown(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerenter")
    void setOnpointerenter(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerleave")
    void setOnpointerleave(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointermove")
    void setOnpointermove(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerout")
    void setOnpointerout(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerover")
    void setOnpointerover(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onpointerup")
    void setOnpointerup(Function1<PointerEvent, Object> value);
    /** 
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
      * inherited from (js.browser.GlobalEventHandlers)
     */
    @JsProperty(name = "onwheel")
    void setOnwheel(Function1<WheelEvent, Object> value);
}
