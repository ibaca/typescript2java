package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLSlotElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 743979
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLSlotElement")
public class HTMLSlotElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLSlotElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public Element lastElementChild;

    public String name;

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
    public native Array<Node> assignedNodes();
    /** 
      * tsd/browser/lib.es6.d.ts@744051
     */
    public native Array<Node> assignedNodes(AssignedNodesOptions options /* optional */);
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "name")
    public native void setName(String value);
}
