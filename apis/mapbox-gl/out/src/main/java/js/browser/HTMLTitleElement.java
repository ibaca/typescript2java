package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLTitleElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 484415
  * declared in: tsd/browser/lib.es6.d.ts at pos 484855
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLTitleElement")
public class HTMLTitleElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLTitleElement () {
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

    /** 
      * Retrieves or sets the text of the object as a string. 
     */
    public String text;

    /*
        Methods
    */
    @JsProperty(name = "text")
    public native String getText();
    @JsProperty(name = "text")
    public native void setText(String value);
}
