package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLTableElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 472050
  * declared in: tsd/browser/lib.es6.d.ts at pos 475641
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLTableElement")
public class HTMLTableElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLTableElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves a value that indicates the table alignment.
     */
    public String align;

    public Object bgColor;

    /** 
      * Sets or retrieves the width of the border to draw around the object.
     */
    public String border;

    /** 
      * Sets or retrieves the border color of the object. 
     */
    public Object borderColor;

    /** 
      * Retrieves the caption object of a table.
     */
    public HTMLTableCaptionElement caption;

    /** 
      * Sets or retrieves the amount of space between the border of the cell and the content of the cell.
     */
    public String cellPadding;

    /** 
      * Sets or retrieves the amount of space between cells in a table.
     */
    public String cellSpacing;

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Sets or retrieves the number of columns in the table.
     */
    public Number cols;

    public Element firstElementChild;

    /** 
      * Sets or retrieves the way the border frame around the table is displayed.
     */
    public String frame;

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
      * Sets or retrieves the number of horizontal rows contained in the object.
     */
    public HTMLCollectionOf<HTMLTableRowElement> rows;

    /** 
      * Sets or retrieves which dividing lines (inner borders) are displayed.
     */
    public String rules;

    /** 
      * Sets or retrieves a description and/or structure of the object.
     */
    public String summary;

    /** 
      * Retrieves a collection of all tBody objects in the table. Objects in this collection are in source order.
     */
    public HTMLCollectionOf<HTMLTableSectionElement> tBodies;

    /** 
      * Retrieves the tFoot object of the table.
     */
    public HTMLTableSectionElement tFoot;

    /** 
      * Retrieves the tHead object of the table.
     */
    public HTMLTableSectionElement tHead;

    /** 
      * Sets or retrieves the width of the object.
     */
    public String width;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@474029
      * Creates an empty caption element in the table.
     */
    public native HTMLTableCaptionElement createCaption();
    /** 
      * tsd/browser/lib.es6.d.ts@474145
      * Creates an empty tBody element in the table.
     */
    public native HTMLTableSectionElement createTBody();
    /** 
      * tsd/browser/lib.es6.d.ts@474259
      * Creates an empty tFoot element in the table.
     */
    public native HTMLTableSectionElement createTFoot();
    /** 
      * tsd/browser/lib.es6.d.ts@474395
      * Returns the tHead element object if successful, or null otherwise.
     */
    public native HTMLTableSectionElement createTHead();
    /** 
      * tsd/browser/lib.es6.d.ts@474525
      * Deletes the caption element and its contents from the table.
     */
    public native void deleteCaption();
    public native void deleteRow();
    /** 
      * tsd/browser/lib.es6.d.ts@474767
      * Removes the specified row (tr) from the element and from the rows collection.
     */
    public native void deleteRow(@DoNotAutobox Number index /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@474888
      * Deletes the tFoot element and its contents from the table.
     */
    public native void deleteTFoot();
    /** 
      * tsd/browser/lib.es6.d.ts@474997
      * Deletes the tHead element and its contents from the table.
     */
    public native void deleteTHead();
    @JsProperty(name = "align")
    public native String getAlign();
    @JsProperty(name = "bgColor")
    public native Object getBgColor();
    @JsProperty(name = "border")
    public native String getBorder();
    @JsProperty(name = "borderColor")
    public native Object getBorderColor();
    @JsProperty(name = "caption")
    public native HTMLTableCaptionElement getCaption();
    @JsProperty(name = "cellPadding")
    public native String getCellPadding();
    @JsProperty(name = "cellSpacing")
    public native String getCellSpacing();
    @JsProperty(name = "cols")
    public native Number getCols();
    @JsProperty(name = "frame")
    public native String getFrame();
    @JsProperty(name = "height")
    public native Object getHeight();
    @JsProperty(name = "rows")
    public native HTMLCollectionOf<HTMLTableRowElement> getRows();
    @JsProperty(name = "rules")
    public native String getRules();
    @JsProperty(name = "summary")
    public native String getSummary();
    @JsProperty(name = "tBodies")
    public native HTMLCollectionOf<HTMLTableSectionElement> getTBodies();
    @JsProperty(name = "tFoot")
    public native HTMLTableSectionElement getTFoot();
    @JsProperty(name = "tHead")
    public native HTMLTableSectionElement getTHead();
    @JsProperty(name = "width")
    public native String getWidth();
    public native HTMLTableRowElement insertRow();
    /** 
      * tsd/browser/lib.es6.d.ts@475302
      * Creates a new row (tr) in the table, and adds the row to the rows collection.
     */
    public native HTMLTableRowElement insertRow(@DoNotAutobox Number index /* optional */);
    @JsProperty(name = "align")
    public native void setAlign(String value);
    @JsProperty(name = "bgColor")
    public native void setBgColor(Object value);
    @JsProperty(name = "border")
    public native void setBorder(String value);
    @JsProperty(name = "borderColor")
    public native void setBorderColor(Object value);
    @JsProperty(name = "caption")
    public native void setCaption(HTMLTableCaptionElement value);
    @JsProperty(name = "cellPadding")
    public native void setCellPadding(String value);
    @JsProperty(name = "cellSpacing")
    public native void setCellSpacing(String value);
    @JsProperty(name = "cols")
    public native void setCols(@DoNotAutobox Number value);
    @JsProperty(name = "frame")
    public native void setFrame(String value);
    @JsProperty(name = "height")
    public native void setHeight(Object value);
    @JsProperty(name = "rows")
    public native void setRows(HTMLCollectionOf<HTMLTableRowElement> value);
    @JsProperty(name = "rules")
    public native void setRules(String value);
    @JsProperty(name = "summary")
    public native void setSummary(String value);
    @JsProperty(name = "tBodies")
    public native void setTBodies(HTMLCollectionOf<HTMLTableSectionElement> value);
    @JsProperty(name = "tFoot")
    public native void setTFoot(HTMLTableSectionElement value);
    @JsProperty(name = "tHead")
    public native void setTHead(HTMLTableSectionElement value);
    @JsProperty(name = "width")
    public native void setWidth(String value);
}
