package js.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayBufferViewAndHTMLImageElement  {
    @JsOverlay
    default ArrayBufferView asArrayBufferView() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferViewAndHTMLImageElement ofArrayBufferView(ArrayBufferView value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HTMLImageElement asHTMLImageElement() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayBufferViewAndHTMLImageElement ofHTMLImageElement(HTMLImageElement value) {
        return Js.cast( value );
    }
    
}
