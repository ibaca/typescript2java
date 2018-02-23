package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLTableCellElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 469069
  * declared in: tsd/browser/lib.es6.d.ts at pos 470713
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLTableCellElement")
public class HTMLTableCellElement extends HTMLElement  implements HTMLTableAlignment 
{

    /*
        Constructors
    */
    public HTMLTableCellElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves abbreviated text for the object.
     */
    public String abbr;

    /** 
      * Sets or retrieves how the object is aligned with adjacent text.
     */
    public String align;

    /** 
      * Sets or retrieves a comma-delimited list of conceptual categories associated with the object.
     */
    public String axis;

    public Object bgColor;

    /** 
      * Retrieves the position of the object in the cells collection of a row.
     */
    public Number cellIndex;

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

    /** 
      * Sets or retrieves the number columns in the table that the object should span.
     */
    public Number colSpan;

    public Element firstElementChild;

    /** 
      * Sets or retrieves a list of header cells that provide information for the object.
     */
    public String headers;

    /** 
      * Sets or retrieves the height of the object.
     */
    public Object height;

    public Element lastElementChild;

    public Element nextElementSibling;

    /** 
      * Sets or retrieves whether the browser automatically performs wordwrap.
     */
    public Boolean noWrap;

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
      * Sets or retrieves how many rows in a table the cell should span.
     */
    public Number rowSpan;

    /** 
      * Sets or retrieves the group of cells in a table to which the object's information applies.
     */
    public String scope;

    /** 
      * Sets or retrieves how text and other content are vertically aligned within the object that contains them.
     */
    public String vAlign;

    /** 
      * Sets or retrieves the width of the object.
     */
    public String width;

    /*
        Methods
    */
    @JsProperty(name = "abbr")
    public native String getAbbr();
    @JsProperty(name = "align")
    public native String getAlign();
    @JsProperty(name = "axis")
    public native String getAxis();
    @JsProperty(name = "bgColor")
    public native Object getBgColor();
    @JsProperty(name = "cellIndex")
    public native Number getCellIndex();
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
    @JsProperty(name = "colSpan")
    public native Number getColSpan();
    @JsProperty(name = "headers")
    public native String getHeaders();
    @JsProperty(name = "height")
    public native Object getHeight();
    @JsProperty(name = "noWrap")
    public native Boolean getNoWrap();
    @JsProperty(name = "rowSpan")
    public native Number getRowSpan();
    @JsProperty(name = "scope")
    public native String getScope();
    /** 
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
     */
    @JsProperty(name = "vAlign")
    public native String getVAlign();
    @JsProperty(name = "width")
    public native String getWidth();
    @JsProperty(name = "abbr")
    public native void setAbbr(String value);
    @JsProperty(name = "align")
    public native void setAlign(String value);
    @JsProperty(name = "axis")
    public native void setAxis(String value);
    @JsProperty(name = "bgColor")
    public native void setBgColor(Object value);
    @JsProperty(name = "cellIndex")
    public native void setCellIndex(@DoNotAutobox Number value);
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
    @JsProperty(name = "colSpan")
    public native void setColSpan(@DoNotAutobox Number value);
    @JsProperty(name = "headers")
    public native void setHeaders(String value);
    @JsProperty(name = "height")
    public native void setHeight(Object value);
    @JsProperty(name = "noWrap")
    public native void setNoWrap(Boolean value);
    @JsProperty(name = "rowSpan")
    public native void setRowSpan(@DoNotAutobox Number value);
    @JsProperty(name = "scope")
    public native void setScope(String value);
    /** 
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
     */
    @JsProperty(name = "vAlign")
    public native void setVAlign(String value);
    @JsProperty(name = "width")
    public native void setWidth(String value);
}
