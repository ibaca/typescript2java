package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLEmbedElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 405136
  * declared in: tsd/browser/lib.es6.d.ts at pos 406869
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLEmbedElement")
public class HTMLEmbedElement extends HTMLElement  implements GetSVGDocument 
{

    /*
        Constructors
    */
    public HTMLEmbedElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    /** 
      * Sets or retrieves the height of the object.
     */
    public String height;

    public Element lastElementChild;

    /** 
      * Gets or sets whether the DLNA PlayTo device is available.
     */
    public Boolean msPlayToDisabled;

    /** 
      * Gets or sets the path to the preferred media source. This enables the Play To target device to stream the media content, which can be DRM protected, from a different location, such as a cloud media server.
     */
    public String msPlayToPreferredSourceUri;

    /** 
      * Gets or sets the primary DLNA PlayTo device.
     */
    public Boolean msPlayToPrimary;

    /** 
      * Gets the source associated with the media element for use by the PlayToManager.
     */
    public Object msPlayToSource;

    /** 
      * Sets or retrieves the name of the object.
     */
    public String name;

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

    /** 
      * Retrieves the palette used for the embedded document.
     */
    public String palette;

    /** 
      * Retrieves the URL of the plug-in used to view an embedded document.
     */
    public String pluginspage;

    public Element previousElementSibling;

    public String readyState;

    /** 
      * Sets or retrieves a URL to be loaded by the object.
     */
    public String src;

    /** 
      * Sets or retrieves the height and width units of the embed object.
     */
    public String units;

    /** 
      * Sets or retrieves the width of the object.
     */
    public String width;

    /*
        Methods
    */
    @JsProperty(name = "height")
    public native String getHeight();
    @JsProperty(name = "msPlayToDisabled")
    public native Boolean getMsPlayToDisabled();
    @JsProperty(name = "msPlayToPreferredSourceUri")
    public native String getMsPlayToPreferredSourceUri();
    @JsProperty(name = "msPlayToPrimary")
    public native Boolean getMsPlayToPrimary();
    @JsProperty(name = "msPlayToSource")
    public native Object getMsPlayToSource();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "palette")
    public native String getPalette();
    @JsProperty(name = "pluginspage")
    public native String getPluginspage();
    @JsProperty(name = "readyState")
    public native String getReadyState();
    /** 
      * tsd/browser/lib.es6.d.ts@729577
      * inherited from (js.browser.GetSVGDocument)
      * inherited from (js.browser.GetSVGDocument)
      * inherited from (js.browser.GetSVGDocument)
      * inherited from (js.browser.GetSVGDocument)
     */
    public native Document getSVGDocument();
    @JsProperty(name = "src")
    public native String getSrc();
    @JsProperty(name = "units")
    public native String getUnits();
    @JsProperty(name = "width")
    public native String getWidth();
    @JsProperty(name = "height")
    public native void setHeight(String value);
    @JsProperty(name = "hidden")
    public native void setHidden(Object value);
    @JsProperty(name = "msPlayToDisabled")
    public native void setMsPlayToDisabled(Boolean value);
    @JsProperty(name = "msPlayToPreferredSourceUri")
    public native void setMsPlayToPreferredSourceUri(String value);
    @JsProperty(name = "msPlayToPrimary")
    public native void setMsPlayToPrimary(Boolean value);
    @JsProperty(name = "msPlayToSource")
    public native void setMsPlayToSource(Object value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "palette")
    public native void setPalette(String value);
    @JsProperty(name = "pluginspage")
    public native void setPluginspage(String value);
    @JsProperty(name = "readyState")
    public native void setReadyState(String value);
    @JsProperty(name = "src")
    public native void setSrc(String value);
    @JsProperty(name = "units")
    public native void setUnits(String value);
    @JsProperty(name = "width")
    public native void setWidth(String value);
}
