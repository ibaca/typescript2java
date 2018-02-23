package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLScriptElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 460646
  * declared in: tsd/browser/lib.es6.d.ts at pos 461809
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLScriptElement")
public class HTMLScriptElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLScriptElement () {
    } 

    /*
        Properties
    */

    public Boolean async;

    /** 
      * Sets or retrieves the character set used to encode the object.
     */
    public String charset;

    public Number childElementCount;

    public HTMLCollection children;

    public String crossOrigin;

    /** 
      * Sets or retrieves the status of the script.
     */
    public Boolean defer;

    /** 
      * Sets or retrieves the event for which the script is written. 
     */
    public String event;

    public Element firstElementChild;

    /** 
      * Sets or retrieves the object that is bound to the event script.
     */
    public String htmlFor;

    public String integrity;

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
      * Retrieves the URL to an external file that contains the source code or data.
     */
    public String src;

    /** 
      * Retrieves or sets the text of the object as a string. 
     */
    public String text;

    /** 
      * Sets or retrieves the MIME type for the associated scripting engine.
     */
    public String type;

    /*
        Methods
    */
    @JsProperty(name = "async")
    public native Boolean getAsync();
    @JsProperty(name = "charset")
    public native String getCharset();
    @JsProperty(name = "crossOrigin")
    public native String getCrossOrigin();
    @JsProperty(name = "defer")
    public native Boolean getDefer();
    @JsProperty(name = "event")
    public native String getEvent();
    @JsProperty(name = "htmlFor")
    public native String getHtmlFor();
    @JsProperty(name = "integrity")
    public native String getIntegrity();
    @JsProperty(name = "src")
    public native String getSrc();
    @JsProperty(name = "text")
    public native String getText();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "async")
    public native void setAsync(Boolean value);
    @JsProperty(name = "charset")
    public native void setCharset(String value);
    @JsProperty(name = "crossOrigin")
    public native void setCrossOrigin(String value);
    @JsProperty(name = "defer")
    public native void setDefer(Boolean value);
    @JsProperty(name = "event")
    public native void setEvent(String value);
    @JsProperty(name = "htmlFor")
    public native void setHtmlFor(String value);
    @JsProperty(name = "integrity")
    public native void setIntegrity(String value);
    @JsProperty(name = "src")
    public native void setSrc(String value);
    @JsProperty(name = "text")
    public native void setText(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
