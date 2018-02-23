package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLFrameElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 412377
  * declared in: tsd/browser/lib.es6.d.ts at pos 414504
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLFrameElement")
public class HTMLFrameElement extends HTMLElement  implements GetSVGDocument 
{

    /*
        Constructors
    */
    public HTMLFrameElement () {
    } 

    /*
        Properties
    */

    /** 
      * Specifies the properties of a border drawn around an object.
     */
    public String border;

    /** 
      * Sets or retrieves the border color of the object.
     */
    public Object borderColor;

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Retrieves the document object of the page or frame.
     */
    public Document contentDocument;

    /** 
      * Retrieves the object of the specified.
     */
    public Window contentWindow;

    public Element firstElementChild;

    /** 
      * Sets or retrieves whether to display a border for the frame.
     */
    public String frameBorder;

    /** 
      * Sets or retrieves the amount of additional space between the frames.
     */
    public Object frameSpacing;

    /** 
      * Sets or retrieves the height of the object.
     */
    public PropertyKey_UnionOfFakeEsSymbolAndNumberAndString height;

    public Element lastElementChild;

    /** 
      * Sets or retrieves a URI to a long description of the object.
     */
    public String longDesc;

    /** 
      * Sets or retrieves the top and bottom margin heights before displaying the text in a frame.
     */
    public String marginHeight;

    /** 
      * Sets or retrieves the left and right margin widths before displaying the text in a frame.
     */
    public String marginWidth;

    /** 
      * Sets or retrieves the frame name.
     */
    public String name;

    public Element nextElementSibling;

    /** 
      * Sets or retrieves whether the user can resize the frame.
     */
    public Boolean noResize;

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
      * Sets or retrieves whether the frame can be scrolled.
     */
    public String scrolling;

    /** 
      * Sets or retrieves a URL to be loaded by the object.
     */
    public String src;

    /** 
      * Sets or retrieves the width of the object.
     */
    public PropertyKey_UnionOfFakeEsSymbolAndNumberAndString width;

    /*
        Methods
    */
    @JsProperty(name = "border")
    public native String getBorder();
    @JsProperty(name = "borderColor")
    public native Object getBorderColor();
    @JsProperty(name = "contentDocument")
    public native Document getContentDocument();
    @JsProperty(name = "contentWindow")
    public native Window getContentWindow();
    @JsProperty(name = "frameBorder")
    public native String getFrameBorder();
    @JsProperty(name = "frameSpacing")
    public native Object getFrameSpacing();
    @JsProperty(name = "height")
    public native PropertyKey_UnionOfFakeEsSymbolAndNumberAndString getHeight();
    @JsProperty(name = "longDesc")
    public native String getLongDesc();
    @JsProperty(name = "marginHeight")
    public native String getMarginHeight();
    @JsProperty(name = "marginWidth")
    public native String getMarginWidth();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "noResize")
    public native Boolean getNoResize();
    /** 
      * tsd/browser/lib.es6.d.ts@729577
      * inherited from (js.browser.GetSVGDocument)
      * inherited from (js.browser.GetSVGDocument)
      * inherited from (js.browser.GetSVGDocument)
      * inherited from (js.browser.GetSVGDocument)
     */
    public native Document getSVGDocument();
    @JsProperty(name = "scrolling")
    public native String getScrolling();
    @JsProperty(name = "src")
    public native String getSrc();
    @JsProperty(name = "width")
    public native PropertyKey_UnionOfFakeEsSymbolAndNumberAndString getWidth();
    @JsProperty(name = "border")
    public native void setBorder(String value);
    @JsProperty(name = "borderColor")
    public native void setBorderColor(Object value);
    @JsProperty(name = "contentDocument")
    public native void setContentDocument(Document value);
    @JsProperty(name = "contentWindow")
    public native void setContentWindow(Window value);
    @JsProperty(name = "frameBorder")
    public native void setFrameBorder(String value);
    @JsProperty(name = "frameSpacing")
    public native void setFrameSpacing(Object value);
    @JsProperty(name = "height")
    public native void setHeight(String value);
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    @JsProperty(name = "height")
    public native void setHeight(PropertyKey_UnionOfFakeEsSymbolAndNumberAndString value);
    @JsProperty(name = "longDesc")
    public native void setLongDesc(String value);
    @JsProperty(name = "marginHeight")
    public native void setMarginHeight(String value);
    @JsProperty(name = "marginWidth")
    public native void setMarginWidth(String value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "noResize")
    public native void setNoResize(Boolean value);
    @JsProperty(name = "scrolling")
    public native void setScrolling(String value);
    @JsProperty(name = "src")
    public native void setSrc(String value);
    @JsProperty(name = "width")
    public native void setWidth(String value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(PropertyKey_UnionOfFakeEsSymbolAndNumberAndString value);
}
