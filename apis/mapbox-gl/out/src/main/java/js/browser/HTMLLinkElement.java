package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLLinkElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 435060
  * declared in: tsd/browser/lib.es6.d.ts at pos 436323
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLLinkElement")
public class HTMLLinkElement extends HTMLElement  implements LinkStyle 
{

    /*
        Constructors
    */
    public HTMLLinkElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves the character set used to encode the object.
     */
    public String charset;

    public Number childElementCount;

    public HTMLCollection children;

    public Boolean disabled;

    public Element firstElementChild;

    /** 
      * Sets or retrieves a destination URL or an anchor point.
     */
    public String href;

    /** 
      * Sets or retrieves the language code of the object.
     */
    public String hreflang;

    @JsProperty(name="import")
    public Document import_;

    public String integrity;

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

    /** 
      * Sets or retrieves the relationship between the object and the destination of the link.
     */
    public String rel;

    /** 
      * Sets or retrieves the relationship between the object and the destination of the link.
     */
    public String rev;

    public StyleSheet sheet;

    /** 
      * Sets or retrieves the window or frame at which to target content.
     */
    public String target;

    /** 
      * Sets or retrieves the MIME type of the object.
     */
    public String type;

    /*
        Methods
    */
    @JsProperty(name = "charset")
    public native String getCharset();
    @JsProperty(name = "disabled")
    public native Boolean getDisabled();
    @JsProperty(name = "href")
    public native String getHref();
    @JsProperty(name = "hreflang")
    public native String getHreflang();
    @JsProperty(name = "import")
    public native Document getImport_();
    @JsProperty(name = "integrity")
    public native String getIntegrity();
    @JsProperty(name = "media")
    public native String getMedia();
    @JsProperty(name = "rel")
    public native String getRel();
    @JsProperty(name = "rev")
    public native String getRev();
    /** 
      * inherited from (js.browser.LinkStyle)
      * inherited from (js.browser.LinkStyle)
     */
    @JsProperty(name = "sheet")
    public native StyleSheet getSheet();
    @JsProperty(name = "target")
    public native String getTarget();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "charset")
    public native void setCharset(String value);
    @JsProperty(name = "disabled")
    public native void setDisabled(Boolean value);
    @JsProperty(name = "href")
    public native void setHref(String value);
    @JsProperty(name = "hreflang")
    public native void setHreflang(String value);
    @JsProperty(name = "import")
    public native void setImport_(Document value);
    @JsProperty(name = "integrity")
    public native void setIntegrity(String value);
    @JsProperty(name = "media")
    public native void setMedia(String value);
    @JsProperty(name = "rel")
    public native void setRel(String value);
    @JsProperty(name = "rev")
    public native void setRev(String value);
    /** 
      * inherited from (js.browser.LinkStyle)
      * inherited from (js.browser.LinkStyle)
     */
    @JsProperty(name = "sheet")
    public native void setSheet(StyleSheet value);
    @JsProperty(name = "target")
    public native void setTarget(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
