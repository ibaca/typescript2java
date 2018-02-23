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
public abstract class UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement extends HTMLElement  {
    @JsOverlay
    public final HTMLCanvasElement asHTMLCanvasElement() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement ofHTMLCanvasElement(HTMLCanvasElement value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final HTMLImageElement asHTMLImageElement() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement ofHTMLImageElement(HTMLImageElement value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final HTMLVideoElement asHTMLVideoElement() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfHTMLCanvasElementAndHTMLImageElementAndHTMLVideoElement ofHTMLVideoElement(HTMLVideoElement value) {
        return Js.uncheckedCast( value );
    }
    
}
