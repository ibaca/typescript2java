package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: EventTarget
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 373239
  * declared in: tsd/browser/lib.es6.d.ts at pos 373544

  * created because of multiple implementation inheritance of js.browser.Window
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="EventTarget")
public interface EventTarget_Interface
{

    /*
        Methods
    */
    void addEventListener(String type);
    void addEventListener(String type, EventListenerObject listener /* optional */);
    void addEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    void addEventListener(String type, EventListener listener /* optional */);
    void addEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@373269
     */
    void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@373380
      * inherited from (js.browser.EventTarget_Interface)
     */
    Boolean dispatchEvent(Event evt);
    void removeEventListener(String type);
    void removeEventListener(String type, EventListenerObject listener /* optional */);
    void removeEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    void removeEventListener(String type, EventListener listener /* optional */);
    void removeEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@373420
      * inherited from (js.browser.EventTarget_Interface)
     */
    void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
}
