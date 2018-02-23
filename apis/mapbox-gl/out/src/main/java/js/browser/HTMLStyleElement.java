package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLStyleElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 467735
  * declared in: tsd/browser/lib.es6.d.ts at pos 468296
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLStyleElement")
public class HTMLStyleElement extends HTMLElement  implements LinkStyle 
{

    /*
        Constructors
    */
    public HTMLStyleElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Boolean disabled;

    public Element firstElementChild;

    public Element lastElementChild;

    /** 
      * Sets or retrieves the media type.
     */
    public String media;

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

    public StyleSheet sheet;

    /** 
      * Retrieves the CSS language in which the style sheet is written.
     */
    public String type;

    /*
        Methods
    */
    @JsProperty(name = "disabled")
    public native Boolean getDisabled();
    @JsProperty(name = "media")
    public native String getMedia();
    /** 
      * inherited from (js.browser.LinkStyle)
      * inherited from (js.browser.LinkStyle)
     */
    @JsProperty(name = "sheet")
    public native StyleSheet getSheet();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "disabled")
    public native void setDisabled(Boolean value);
    @JsProperty(name = "media")
    public native void setMedia(String value);
    /** 
      * inherited from (js.browser.LinkStyle)
      * inherited from (js.browser.LinkStyle)
     */
    @JsProperty(name = "sheet")
    public native void setSheet(StyleSheet value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
