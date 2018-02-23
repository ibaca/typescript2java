package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLTableCaptionElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 468380
  * declared in: tsd/browser/lib.es6.d.ts at pos 468964
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLTableCaptionElement")
public class HTMLTableCaptionElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLTableCaptionElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves the alignment of the caption or legend.
     */
    public String align;

    public Number childElementCount;

    public HTMLCollection children;

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

    /** 
      * Sets or retrieves whether the caption appears at the top or bottom of the table.
     */
    public String vAlign;

    /*
        Methods
    */
    @JsProperty(name = "align")
    public native String getAlign();
    @JsProperty(name = "vAlign")
    public native String getVAlign();
    @JsProperty(name = "align")
    public native void setAlign(String value);
    @JsProperty(name = "vAlign")
    public native void setVAlign(String value);
}
