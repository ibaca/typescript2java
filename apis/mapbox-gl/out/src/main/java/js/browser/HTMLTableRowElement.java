package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLTableRowElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 476345
  * declared in: tsd/browser/lib.es6.d.ts at pos 478000
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLTableRowElement")
public class HTMLTableRowElement extends HTMLElement  implements HTMLTableAlignment 
{

    /*
        Constructors
    */
    public HTMLTableRowElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves how the object is aligned with adjacent text.
     */
    public String align;

    public Object bgColor;

    /** 
      * Retrieves a collection of all cells in the table row.
     */
    public HTMLCollectionOf<UnionOfHTMLTableDataCellElementAndHTMLTableHeaderCellElement> cells;

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

    /** 
      * Sets or retrieves the height of the object.
     */
    public Object height;

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
      * Retrieves the position of the object in the rows collection for the table.
     */
    public Number rowIndex;

    /** 
      * Retrieves the position of the object in the collection.
     */
    public Number sectionRowIndex;

    /** 
      * Sets or retrieves how text and other content are vertically aligned within the object that contains them.
     */
    public String vAlign;

    /*
        Methods
    */
    public native void deleteCell();
    /** 
      * tsd/browser/lib.es6.d.ts@477342
      * Removes the specified cell from the table row, as well as from the cells collection.
     */
    public native void deleteCell(@DoNotAutobox Number index /* optional */);
    @JsProperty(name = "align")
    public native String getAlign();
    @JsProperty(name = "bgColor")
    public native Object getBgColor();
    @JsProperty(name = "cells")
    public native HTMLCollectionOf<UnionOfHTMLTableDataCellElementAndHTMLTableHeaderCellElement> getCells();
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
    @JsProperty(name = "height")
    public native Object getHeight();
    @JsProperty(name = "rowIndex")
    public native Number getRowIndex();
    @JsProperty(name = "sectionRowIndex")
    public native Number getSectionRowIndex();
    /** 
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
     */
    @JsProperty(name = "vAlign")
    public native String getVAlign();
    public native HTMLTableDataCellElement insertCell();
    /** 
      * tsd/browser/lib.es6.d.ts@477652
      * Creates a new cell in the table row, and adds the cell to the cells collection.
     */
    public native HTMLTableDataCellElement insertCell(@DoNotAutobox Number index /* optional */);
    @JsProperty(name = "align")
    public native void setAlign(String value);
    @JsProperty(name = "bgColor")
    public native void setBgColor(Object value);
    @JsProperty(name = "cells")
    public native void setCells(HTMLCollectionOf<UnionOfHTMLTableDataCellElementAndHTMLTableHeaderCellElement> value);
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
    @JsProperty(name = "height")
    public native void setHeight(Object value);
    @JsProperty(name = "rowIndex")
    public native void setRowIndex(@DoNotAutobox Number value);
    @JsProperty(name = "sectionRowIndex")
    public native void setSectionRowIndex(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
     */
    @JsProperty(name = "vAlign")
    public native void setVAlign(String value);
}
