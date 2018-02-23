package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLHtmlElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 419374
  * declared in: tsd/browser/lib.es6.d.ts at pos 419829
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLHtmlElement")
public class HTMLHtmlElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLHtmlElement () {
    } 

    /*
        Properties
    */

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
      * Sets or retrieves the DTD version that governs the current document.
     */
    public String version;

    /*
        Methods
    */
    @JsProperty(name = "version")
    public native String getVersion();
    @JsProperty(name = "version")
    public native void setVersion(String value);
}
