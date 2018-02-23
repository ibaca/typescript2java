package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGStyleElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 628391
  * declared in: tsd/browser/lib.es6.d.ts at pos 628807
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGStyleElement")
public class SVGStyleElement extends SVGElement 
{

    /*
        Constructors
    */
    public SVGStyleElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Boolean disabled;

    public Element firstElementChild;

    public Element lastElementChild;

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

    public String title;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "disabled")
    public native Boolean getDisabled();
    @JsProperty(name = "media")
    public native String getMedia();
    @JsProperty(name = "title")
    public native String getTitle();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "disabled")
    public native void setDisabled(Boolean value);
    @JsProperty(name = "media")
    public native void setMedia(String value);
    @JsProperty(name = "title")
    public native void setTitle(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
