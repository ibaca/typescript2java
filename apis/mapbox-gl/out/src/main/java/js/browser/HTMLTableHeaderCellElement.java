package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLTableHeaderCellElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 475725
  * declared in: tsd/browser/lib.es6.d.ts at pos 476231
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLTableHeaderCellElement")
public class HTMLTableHeaderCellElement extends HTMLTableCellElement 
{

    /*
        Constructors
    */
    public HTMLTableHeaderCellElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves a value that you can use to implement your own ch functionality for the object.
     */
    public String ch;

    /** 
      * Sets or retrieves a value that you can use to implement your own chOff functionality for the object.
     */
    public String chOff;

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
      * Sets or retrieves how text and other content are vertically aligned within the object that contains them.
     */
    public String vAlign;

}
