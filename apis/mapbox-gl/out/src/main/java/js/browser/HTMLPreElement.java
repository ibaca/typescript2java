package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLPreElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 458503
  * declared in: tsd/browser/lib.es6.d.ts at pos 458981
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLPreElement")
public class HTMLPreElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLPreElement () {
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
      * Sets or gets a value that you can use to implement your own width functionality for the object.
     */
    public Number width;

    /*
        Methods
    */
    @JsProperty(name = "width")
    public native Number getWidth();
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
}
