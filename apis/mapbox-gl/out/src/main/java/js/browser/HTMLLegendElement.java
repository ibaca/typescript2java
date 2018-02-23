package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLLegendElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 434392
  * declared in: tsd/browser/lib.es6.d.ts at pos 434973
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLLegendElement")
public class HTMLLegendElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLLegendElement () {
    } 

    /*
        Properties
    */

    /** 
      * Retrieves a reference to the form that the object is embedded in.
     */
    public String align;

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    /** 
      * Retrieves a reference to the form that the object is embedded in.
     */
    public HTMLFormElement form;

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
    @JsProperty(name = "form")
    public native HTMLFormElement getForm();
    @JsProperty(name = "align")
    public native void setAlign(String value);
    @JsProperty(name = "form")
    public native void setForm(HTMLFormElement value);
}
