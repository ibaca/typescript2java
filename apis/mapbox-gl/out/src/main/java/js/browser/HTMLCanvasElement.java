package js.browser;

import fr.lteconsulting.prebuilt.Action1;
import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLCanvasElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 392616
  * declared in: tsd/browser/lib.es6.d.ts at pos 394703
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLCanvasElement")
public class HTMLCanvasElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLCanvasElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    /** 
      * Gets or sets the height of a canvas element on a document.
     */
    public Number height;

    public Element lastElementChild;

    public Element nextElementSibling;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<WheelEvent, Object> onwheel;

    public Element previousElementSibling;

    /** 
      * Gets or sets the width of a canvas element on a document.
     */
    public Number width;

    /*
        Methods
    */
    public native CanvasRenderingContext2D getContext(String contextId);
    /** 
      * tsd/browser/lib.es6.d.ts@393450
      * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
     */
    public native CanvasRenderingContext2D getContext(String contextId, Canvas2DContextAttributes contextAttributes /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@393563
      * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
      * VERSION 1
     */
    public native WebGLRenderingContext getContext(String contextId, WebGLContextAttributes contextAttributes /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@393696
      * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
      * VERSION 2
     */
    public native UnionOfCanvasRenderingContext2DAndWebGLRenderingContext getContext(String contextId, Object contextAttributes /* optional */);
    @JsProperty(name = "height")
    public native Number getHeight();
    @JsProperty(name = "width")
    public native Number getWidth();
    /** 
      * tsd/browser/lib.es6.d.ts@393943
      * Returns a blob object encoded as a Portable Network Graphics (PNG) format from a canvas image or drawing.
     */
    public native Blob msToBlob();
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
    public native void toBlob(Action1<Blob> callback);
    public native void toBlob(Action1<Blob> callback, String type /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@394320
     */
    public native void toBlob(Action1<Blob> callback, String type /* optional */, Object...  arguments);
    public native String toDataURL();
    public native String toDataURL(String type /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@394266
      * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
     */
    public native String toDataURL(String type /* optional */, Object...  args);
}
