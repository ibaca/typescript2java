package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLDivElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 397202
  * declared in: tsd/browser/lib.es6.d.ts at pos 397766
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLDivElement")
public class HTMLDivElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLDivElement () {
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

    public Element firstElementChild;

    public Element lastElementChild;

    public Element nextElementSibling;

    /** 
      * Sets or retrieves whether the browser automatically performs wordwrap.
     */
    public Boolean noWrap;

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
    @JsProperty(name = "noWrap")
    public native Boolean getNoWrap();
    @JsProperty(name = "align")
    public native void setAlign(String value);
    @JsProperty(name = "noWrap")
    public native void setNoWrap(Boolean value);
}
