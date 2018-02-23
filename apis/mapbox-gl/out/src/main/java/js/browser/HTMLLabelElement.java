package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLLabelElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 433719
  * declared in: tsd/browser/lib.es6.d.ts at pos 434308
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLLabelElement")
public class HTMLLabelElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLLabelElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    /** 
      * Retrieves a reference to the form that the object is embedded in.
     */
    public HTMLFormElement form;

    /** 
      * Sets or retrieves the object to which the given label object is assigned.
     */
    public String htmlFor;

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
    @JsProperty(name = "form")
    public native HTMLFormElement getForm();
    @JsProperty(name = "htmlFor")
    public native String getHtmlFor();
    @JsProperty(name = "form")
    public native void setForm(HTMLFormElement value);
    @JsProperty(name = "htmlFor")
    public native void setHtmlFor(String value);
}
