package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLSourceElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 466518
  * declared in: tsd/browser/lib.es6.d.ts at pos 467227
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLSourceElement")
public class HTMLSourceElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLSourceElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public Element lastElementChild;

    /** 
      * Gets or sets the intended media type of the media source.
     */
    public String media;

    public String msKeySystem;

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

    public String sizes;

    /** 
      * The address or URL of the a media resource that is to be considered.
     */
    public String src;

    public String srcset;

    /** 
      * Gets or sets the MIME type of a media resource.
     */
    public String type;

    /*
        Methods
    */
    @JsProperty(name = "media")
    public native String getMedia();
    @JsProperty(name = "msKeySystem")
    public native String getMsKeySystem();
    @JsProperty(name = "sizes")
    public native String getSizes();
    @JsProperty(name = "src")
    public native String getSrc();
    @JsProperty(name = "srcset")
    public native String getSrcset();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "media")
    public native void setMedia(String value);
    @JsProperty(name = "msKeySystem")
    public native void setMsKeySystem(String value);
    @JsProperty(name = "sizes")
    public native void setSizes(String value);
    @JsProperty(name = "src")
    public native void setSrc(String value);
    @JsProperty(name = "srcset")
    public native void setSrcset(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
