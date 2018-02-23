package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLLIElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 433202
  * declared in: tsd/browser/lib.es6.d.ts at pos 433644
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLLIElement")
public class HTMLLIElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLLIElement () {
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

    public String type;

    /** 
      * Sets or retrieves the value of a list item.
     */
    public Number value;

    /*
        Methods
    */
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "value")
    public native Number getValue();
    @JsProperty(name = "type")
    public native void setType(String value);
    @JsProperty(name = "value")
    public native void setValue(@DoNotAutobox Number value);
}
