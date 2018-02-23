package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLMenuElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 445247
  * declared in: tsd/browser/lib.es6.d.ts at pos 445627
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLMenuElement")
public class HTMLMenuElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLMenuElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Boolean compact;

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

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "compact")
    public native Boolean getCompact();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "compact")
    public native void setCompact(Boolean value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
