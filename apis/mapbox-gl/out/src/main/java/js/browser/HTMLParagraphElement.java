package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLParagraphElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 456616
  * declared in: tsd/browser/lib.es6.d.ts at pos 457094
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLParagraphElement")
public class HTMLParagraphElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLParagraphElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves how the object is aligned with adjacent text. 
     */
    public String align;

    public Number childElementCount;

    public HTMLCollection children;

    public String clear;

    public Element firstElementChild;

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

    /*
        Methods
    */
    @JsProperty(name = "align")
    public native String getAlign();
    @JsProperty(name = "clear")
    public native String getClear();
    @JsProperty(name = "align")
    public native void setAlign(String value);
    @JsProperty(name = "clear")
    public native void setClear(String value);
}
