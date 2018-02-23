package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 576402
  * declared in: tsd/browser/lib.es6.d.ts at pos 577474
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGElement")
public class SVGElement extends Element 
{

    /*
        Constructors
    */
    public SVGElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public Element lastElementChild;

    public Element nextElementSibling;

    public Function1<MouseEvent, Object> onclick;

    public Function1<MouseEvent, Object> ondblclick;

    public Function1<FocusEvent, Object> onfocusin;

    public Function1<FocusEvent, Object> onfocusout;

    public Function1<Event, Object> onload;

    public Function1<MouseEvent, Object> onmousedown;

    public Function1<MouseEvent, Object> onmousemove;

    public Function1<MouseEvent, Object> onmouseout;

    public Function1<MouseEvent, Object> onmouseover;

    public Function1<MouseEvent, Object> onmouseup;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<WheelEvent, Object> onwheel;

    public SVGSVGElement ownerSVGElement;

    public Element previousElementSibling;

    public CSSStyleDeclaration style;

    public SVGElement viewportElement;

    public String xmlbase;

    /*
        Methods
    */
    @JsProperty(name = "onclick")
    public native Function1<MouseEvent, Object> getOnclick();
    @JsProperty(name = "ondblclick")
    public native Function1<MouseEvent, Object> getOndblclick();
    @JsProperty(name = "onfocusin")
    public native Function1<FocusEvent, Object> getOnfocusin();
    @JsProperty(name = "onfocusout")
    public native Function1<FocusEvent, Object> getOnfocusout();
    @JsProperty(name = "onload")
    public native Function1<Event, Object> getOnload();
    @JsProperty(name = "onmousedown")
    public native Function1<MouseEvent, Object> getOnmousedown();
    @JsProperty(name = "onmousemove")
    public native Function1<MouseEvent, Object> getOnmousemove();
    @JsProperty(name = "onmouseout")
    public native Function1<MouseEvent, Object> getOnmouseout();
    @JsProperty(name = "onmouseover")
    public native Function1<MouseEvent, Object> getOnmouseover();
    @JsProperty(name = "onmouseup")
    public native Function1<MouseEvent, Object> getOnmouseup();
    @JsProperty(name = "ownerSVGElement")
    public native SVGSVGElement getOwnerSVGElement();
    @JsProperty(name = "style")
    public native CSSStyleDeclaration getStyle();
    @JsProperty(name = "viewportElement")
    public native SVGElement getViewportElement();
    @JsProperty(name = "xmlbase")
    public native String getXmlbase();
    @JsProperty(name = "className")
    public native void setCssClassName(Object value);
    @JsProperty(name = "onclick")
    public native void setOnclick(Function1<MouseEvent, Object> value);
    @JsProperty(name = "ondblclick")
    public native void setOndblclick(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onfocusin")
    public native void setOnfocusin(Function1<FocusEvent, Object> value);
    @JsProperty(name = "onfocusout")
    public native void setOnfocusout(Function1<FocusEvent, Object> value);
    @JsProperty(name = "onload")
    public native void setOnload(Function1<Event, Object> value);
    @JsProperty(name = "onmousedown")
    public native void setOnmousedown(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmousemove")
    public native void setOnmousemove(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseout")
    public native void setOnmouseout(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseover")
    public native void setOnmouseover(Function1<MouseEvent, Object> value);
    @JsProperty(name = "onmouseup")
    public native void setOnmouseup(Function1<MouseEvent, Object> value);
    @JsProperty(name = "ownerSVGElement")
    public native void setOwnerSVGElement(SVGSVGElement value);
    @JsProperty(name = "style")
    public native void setStyle(CSSStyleDeclaration value);
    @JsProperty(name = "viewportElement")
    public native void setViewportElement(SVGElement value);
    @JsProperty(name = "xmlbase")
    public native void setXmlbase(String value);
}
