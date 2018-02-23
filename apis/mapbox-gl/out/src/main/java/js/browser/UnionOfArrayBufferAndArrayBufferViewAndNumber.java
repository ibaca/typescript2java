package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayBufferAndArrayBufferViewAndNumber  {
    @JsOverlay
    default ArrayBuffer asArrayBuffer() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndArrayBufferViewAndNumber ofArrayBuffer(ArrayBuffer value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ArrayBufferView asArrayBufferView() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndArrayBufferViewAndNumber ofArrayBufferView(ArrayBufferView value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferAndArrayBufferViewAndNumber ofNumber(@DoNotAutobox Number value) {
        return Js.cast( value );
    }
    
}
