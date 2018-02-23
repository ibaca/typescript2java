package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLTimeElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 483972
  * declared in: tsd/browser/lib.es6.d.ts at pos 484334
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLTimeElement")
public class HTMLTimeElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLTimeElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public String dateTime;

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
    @JsProperty(name = "dateTime")
    public native String getDateTime();
    @JsProperty(name = "dateTime")
    public native void setDateTime(String value);
}
