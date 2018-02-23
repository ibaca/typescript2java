package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLDataListElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 396243
  * declared in: tsd/browser/lib.es6.d.ts at pos 396641
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLDataListElement")
public class HTMLDataListElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLDataListElement () {
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

    public HTMLCollectionOf<HTMLOptionElement> options;

    public Element previousElementSibling;

    /*
        Methods
    */
    @JsProperty(name = "options")
    public native HTMLCollectionOf<HTMLOptionElement> getOptions();
    @JsProperty(name = "options")
    public native void setOptions(HTMLCollectionOf<HTMLOptionElement> value);
}
