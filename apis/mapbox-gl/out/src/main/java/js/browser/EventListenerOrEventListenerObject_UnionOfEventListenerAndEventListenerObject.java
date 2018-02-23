package js.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: tsd/browser/lib.es6.d.ts:744658
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject  {
    @JsOverlay
    default EventListener asEventListener() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject ofEventListener(EventListener value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default EventListenerObject asEventListenerObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  EventListenerOrEventListenerObject_UnionOfEventListenerAndEventListenerObject ofEventListenerObject(EventListenerObject value) {
        return Js.cast( value );
    }
    
}
