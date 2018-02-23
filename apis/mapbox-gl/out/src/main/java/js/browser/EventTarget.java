package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: EventTarget
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 373239
  * declared in: tsd/browser/lib.es6.d.ts at pos 373544
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="EventTarget")
public class EventTarget implements EventTarget_Interface 
{

    /*
        Constructors
    */
    public EventTarget () {
    } 

    /*
        Methods
    */
    public native void addEventListener(String type);
    public native void addEventListener(String type, EventListenerObject listener /* optional */);
    public native void addEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    public native void addEventListener(String type, EventListener listener /* optional */);
    public native void addEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@373269
     */
    public native void addEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@373380
      * inherited from (js.browser.EventTarget_Interface)
     */
    public native Boolean dispatchEvent(Event evt);
    public native void removeEventListener(String type);
    public native void removeEventListener(String type, EventListenerObject listener /* optional */);
    public native void removeEventListener(String type, EventListenerObject listener /* optional */, Boolean useCapture /* optional */);
    public native void removeEventListener(String type, EventListener listener /* optional */);
    public native void removeEventListener(String type, EventListener listener /* optional */, Boolean useCapture /* optional */);
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@373420
      * inherited from (js.browser.EventTarget_Interface)
     */
    public native void removeEventListener(String type, EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject listener /* optional */, Boolean useCapture /* optional */);
}
