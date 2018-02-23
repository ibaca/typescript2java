package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLBaseElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 385952
  * declared in: tsd/browser/lib.es6.d.ts at pos 386511
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLBaseElement")
public class HTMLBaseElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLBaseElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    /** 
      * Gets or sets the baseline URL on which relative links are based.
     */
    public String href;

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
      * Sets or retrieves the window or frame at which to target content.
     */
    public String target;

    /*
        Methods
    */
    @JsProperty(name = "href")
    public native String getHref();
    @JsProperty(name = "target")
    public native String getTarget();
    @JsProperty(name = "href")
    public native void setHref(String value);
    @JsProperty(name = "target")
    public native void setTarget(String value);
}
