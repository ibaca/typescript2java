package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLTableColElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 470809
  * declared in: tsd/browser/lib.es6.d.ts at pos 471482
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLTableColElement")
public class HTMLTableColElement extends HTMLElement  implements HTMLTableAlignment 
{

    /*
        Constructors
    */
    public HTMLTableColElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves the alignment of the object relative to the display or table.
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
      * Sets or retrieves the number of columns in the group.
     */
    public Number span;

    /** 
      * Sets or retrieves how text and other content are vertically aligned within the object that contains them.
     */
    public String vAlign;

    /** 
      * Sets or retrieves the width of the object.
     */
    public Object width;

    /*
        Methods
    */
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
    @JsProperty(name = "span")
    public native Number getSpan();
    /** 
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
     */
    @JsProperty(name = "vAlign")
    public native String getVAlign();
    @JsProperty(name = "width")
    public native Object getWidth();
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
    @JsProperty(name = "span")
    public native void setSpan(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
      * inherited from (js.browser.HTMLTableAlignment)
     */
    @JsProperty(name = "vAlign")
    public native void setVAlign(String value);
    @JsProperty(name = "width")
    public native void setWidth(Object value);
}
