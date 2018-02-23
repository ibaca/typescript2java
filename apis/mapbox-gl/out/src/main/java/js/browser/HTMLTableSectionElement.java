package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLTableSectionElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 478093
  * declared in: tsd/browser/lib.es6.d.ts at pos 479306
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLTableSectionElement")
public class HTMLTableSectionElement extends HTMLElement  implements HTMLTableAlignment 
{

    /*
        Constructors
    */
    public HTMLTableSectionElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves a value that indicates the table alignment.
     */
    public String align;

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
      * Sets or retrieves the number of horizontal rows contained in the object.
     */
    public HTMLCollectionOf<HTMLTableRowElement> rows;

    /** 
      * Sets or retrieves how text and other content are vertically aligned within the object that contains them.
     */
    public String vAlign;

    /*
        Methods
    */
    public native void deleteRow();
    /** 
      * tsd/browser/lib.es6.d.ts@478643
      * Removes the specified row (tr) from the element and from the rows collection.
     */
    public native void deleteRow(@DoNotAutobox Number index /* optional */);
    @JsProperty(name = "align")
    public native String getAlign();
    /** 
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
     */
    @JsProperty(name = "ch")
    public native String getCh();
    /** 
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
     */
    @JsProperty(name = "chOff")
    public native String getChOff();
    @JsProperty(name = "rows")
    public native HTMLCollectionOf<HTMLTableRowElement> getRows();
    /** 
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
     */
    @JsProperty(name = "vAlign")
    public native String getVAlign();
    public native HTMLTableRowElement insertRow();
    /** 
      * tsd/browser/lib.es6.d.ts@478960
      * Creates a new row (tr) in the table, and adds the row to the rows collection.
     */
    public native HTMLTableRowElement insertRow(@DoNotAutobox Number index /* optional */);
    @JsProperty(name = "align")
    public native void setAlign(String value);
    /** 
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
     */
    @JsProperty(name = "ch")
    public native void setCh(String value);
    /** 
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
     */
    @JsProperty(name = "chOff")
    public native void setChOff(String value);
    @JsProperty(name = "rows")
    public native void setRows(HTMLCollectionOf<HTMLTableRowElement> value);
    /** 
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
     */
    @JsProperty(name = "vAlign")
    public native void setVAlign(String value);
}
