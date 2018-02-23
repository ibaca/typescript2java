package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLQuoteElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 460119
  * declared in: tsd/browser/lib.es6.d.ts at pos 460562
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLQuoteElement")
public class HTMLQuoteElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLQuoteElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Sets or retrieves reference information about the object.
     */
    public String cite;

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
    @JsProperty(name = "cite")
    public native String getCite();
    @JsProperty(name = "cite")
    public native void setCite(String value);
}
