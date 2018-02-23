package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLProgressElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 459059
  * declared in: tsd/browser/lib.es6.d.ts at pos 460026
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLProgressElement")
public class HTMLProgressElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLProgressElement () {
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

    public Element lastElementChild;

    /** 
      * Defines the maximum, or "done" value for a progress element.
     */
    public Number max;

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

    /** 
      * Returns the quotient of value/max when the value attribute is set (determinate progress bar), or -1 when the value attribute is missing (indeterminate progress bar).
     */
    public Number position;

    public Element previousElementSibling;

    /** 
      * Sets or gets the current value of a progress element. The value must be a non-negative number between 0 and the max value.
     */
    public Number value;

    /*
        Methods
    */
    @JsProperty(name = "form")
    public native HTMLFormElement getForm();
    @JsProperty(name = "max")
    public native Number getMax();
    @JsProperty(name = "position")
    public native Number getPosition();
    @JsProperty(name = "value")
    public native Number getValue();
    @JsProperty(name = "form")
    public native void setForm(HTMLFormElement value);
    @JsProperty(name = "max")
    public native void setMax(@DoNotAutobox Number value);
    @JsProperty(name = "position")
    public native void setPosition(@DoNotAutobox Number value);
    @JsProperty(name = "value")
    public native void setValue(@DoNotAutobox Number value);
}
