package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLMapElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 436404
  * declared in: tsd/browser/lib.es6.d.ts at pos 436970
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLMapElement")
public class HTMLMapElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLMapElement () {
    } 

    /*
        Properties
    */

    /** 
      * Retrieves a collection of the area objects defined for the given map object.
     */
    public HTMLAreasCollection areas;

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public Element lastElementChild;

    /** 
      * Sets or retrieves the name of the object.
     */
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
    @JsProperty(name = "areas")
    public native HTMLAreasCollection getAreas();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "areas")
    public native void setAreas(HTMLAreasCollection value);
    @JsProperty(name = "name")
    public native void setName(String value);
}
