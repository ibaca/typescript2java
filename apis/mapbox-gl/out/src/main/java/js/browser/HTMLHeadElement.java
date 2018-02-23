package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLHeadElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 418390
  * declared in: tsd/browser/lib.es6.d.ts at pos 418751
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLHeadElement")
public class HTMLHeadElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLHeadElement () {
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

    public String profile;

    /*
        Methods
    */
    @JsProperty(name = "profile")
    public native String getProfile();
    @JsProperty(name = "profile")
    public native void setProfile(String value);
}
