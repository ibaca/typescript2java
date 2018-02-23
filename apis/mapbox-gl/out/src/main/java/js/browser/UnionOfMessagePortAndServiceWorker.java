package js.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class UnionOfMessagePortAndServiceWorker extends EventTarget  {
    @JsOverlay
    public final MessagePort asMessagePort() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfMessagePortAndServiceWorker ofMessagePort(MessagePort value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final ServiceWorker asServiceWorker() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfMessagePortAndServiceWorker ofServiceWorker(ServiceWorker value) {
        return Js.uncheckedCast( value );
    }
    
}
