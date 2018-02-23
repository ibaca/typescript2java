package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLFrameSetElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 415182
  * declared in: tsd/browser/lib.es6.d.ts at pos 417512
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLFrameSetElement")
public class HTMLFrameSetElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLFrameSetElement () {
    } 

    /*
        Properties
    */

    public String border;

    /** 
      * Sets or retrieves the border color of the object.
     */
    public Object borderColor;

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Sets or retrieves the frame widths of the object.
     */
    public String cols;

    public Element firstElementChild;

    /** 
      * Sets or retrieves whether to display a border for the frame.
     */
    public String frameBorder;

    /** 
      * Sets or retrieves the amount of additional space between the frames.
     */
    public Object frameSpacing;

    public Element lastElementChild;

    public String name;

    public Element nextElementSibling;

    public Function1<Event, Object> onafterprint;

    public Function1<Event, Object> onbeforeprint;

    public Function1<BeforeUnloadEvent, Object> onbeforeunload;

    public Function1<HashChangeEvent, Object> onhashchange;

    public Function1<MessageEvent, Object> onmessage;

    public Function1<Event, Object> onoffline;

    public Function1<Event, Object> ononline;

    public Function1<Event, Object> onorientationchange;

    public Function1<PageTransitionEvent, Object> onpagehide;

    public Function1<PageTransitionEvent, Object> onpageshow;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<PopStateEvent, Object> onpopstate;

    public Function1<UIEvent, Object> onresize;

    public Function1<StorageEvent, Object> onstorage;

    public Function1<Event, Object> onunload;

    public Function1<WheelEvent, Object> onwheel;

    public Element previousElementSibling;

    /** 
      * Sets or retrieves the frame heights of the object.
     */
    public String rows;

    /*
        Methods
    */
    @JsProperty(name = "border")
    public native String getBorder();
    @JsProperty(name = "borderColor")
    public native Object getBorderColor();
    @JsProperty(name = "cols")
    public native String getCols();
    @JsProperty(name = "frameBorder")
    public native String getFrameBorder();
    @JsProperty(name = "frameSpacing")
    public native Object getFrameSpacing();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "onafterprint")
    public native Function1<Event, Object> getOnafterprint();
    @JsProperty(name = "onbeforeprint")
    public native Function1<Event, Object> getOnbeforeprint();
    @JsProperty(name = "onbeforeunload")
    public native Function1<BeforeUnloadEvent, Object> getOnbeforeunload();
    @JsProperty(name = "onhashchange")
    public native Function1<HashChangeEvent, Object> getOnhashchange();
    @JsProperty(name = "onmessage")
    public native Function1<MessageEvent, Object> getOnmessage();
    @JsProperty(name = "onoffline")
    public native Function1<Event, Object> getOnoffline();
    @JsProperty(name = "ononline")
    public native Function1<Event, Object> getOnonline();
    @JsProperty(name = "onorientationchange")
    public native Function1<Event, Object> getOnorientationchange();
    @JsProperty(name = "onpagehide")
    public native Function1<PageTransitionEvent, Object> getOnpagehide();
    @JsProperty(name = "onpageshow")
    public native Function1<PageTransitionEvent, Object> getOnpageshow();
    @JsProperty(name = "onpopstate")
    public native Function1<PopStateEvent, Object> getOnpopstate();
    @JsProperty(name = "onresize")
    public native Function1<UIEvent, Object> getOnresize();
    @JsProperty(name = "onstorage")
    public native Function1<StorageEvent, Object> getOnstorage();
    @JsProperty(name = "onunload")
    public native Function1<Event, Object> getOnunload();
    @JsProperty(name = "rows")
    public native String getRows();
    @JsProperty(name = "border")
    public native void setBorder(String value);
    @JsProperty(name = "borderColor")
    public native void setBorderColor(Object value);
    @JsProperty(name = "cols")
    public native void setCols(String value);
    @JsProperty(name = "frameBorder")
    public native void setFrameBorder(String value);
    @JsProperty(name = "frameSpacing")
    public native void setFrameSpacing(Object value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "onafterprint")
    public native void setOnafterprint(Function1<Event, Object> value);
    @JsProperty(name = "onbeforeprint")
    public native void setOnbeforeprint(Function1<Event, Object> value);
    @JsProperty(name = "onbeforeunload")
    public native void setOnbeforeunload(Function1<BeforeUnloadEvent, Object> value);
    @JsProperty(name = "onhashchange")
    public native void setOnhashchange(Function1<HashChangeEvent, Object> value);
    @JsProperty(name = "onmessage")
    public native void setOnmessage(Function1<MessageEvent, Object> value);
    @JsProperty(name = "onoffline")
    public native void setOnoffline(Function1<Event, Object> value);
    @JsProperty(name = "ononline")
    public native void setOnonline(Function1<Event, Object> value);
    @JsProperty(name = "onorientationchange")
    public native void setOnorientationchange(Function1<Event, Object> value);
    @JsProperty(name = "onpagehide")
    public native void setOnpagehide(Function1<PageTransitionEvent, Object> value);
    @JsProperty(name = "onpageshow")
    public native void setOnpageshow(Function1<PageTransitionEvent, Object> value);
    @JsProperty(name = "onpopstate")
    public native void setOnpopstate(Function1<PopStateEvent, Object> value);
    @JsProperty(name = "onresize")
    public native void setOnresize(Function1<UIEvent, Object> value);
    @JsProperty(name = "onstorage")
    public native void setOnstorage(Function1<StorageEvent, Object> value);
    @JsProperty(name = "onunload")
    public native void setOnunload(Function1<Event, Object> value);
    @JsProperty(name = "rows")
    public native void setRows(String value);
}
