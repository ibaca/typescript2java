package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLMetaElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 445708
  * declared in: tsd/browser/lib.es6.d.ts at pos 446846
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLMetaElement")
public class HTMLMetaElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLMetaElement () {
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

    /** 
      * Gets or sets meta-information to associate with httpEquiv or name.
     */
    public String content;

    public Element firstElementChild;

    /** 
      * Gets or sets information used to bind the value of a content attribute of a meta element to an HTTP response header.
     */
    public String httpEquiv;

    public Element lastElementChild;

    /** 
      * Sets or retrieves the value specified in the content attribute of the meta object.
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

    public Element previousElementSibling;

    /** 
      * Sets or retrieves a scheme to be used in interpreting the value of a property specified for the object.
     */
    public String scheme;

    /** 
      * Sets or retrieves the URL property that will be loaded after the specified time has elapsed. 
     */
    public String url;

    /*
        Methods
    */
    @JsProperty(name = "charset")
    public native String getCharset();
    @JsProperty(name = "content")
    public native String getContent();
    @JsProperty(name = "httpEquiv")
    public native String getHttpEquiv();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "scheme")
    public native String getScheme();
    @JsProperty(name = "url")
    public native String getUrl();
    @JsProperty(name = "charset")
    public native void setCharset(String value);
    @JsProperty(name = "content")
    public native void setContent(String value);
    @JsProperty(name = "httpEquiv")
    public native void setHttpEquiv(String value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "scheme")
    public native void setScheme(String value);
    @JsProperty(name = "url")
    public native void setUrl(String value);
}
