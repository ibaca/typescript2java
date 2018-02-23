package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGEllipseElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 578303
  * declared in: tsd/browser/lib.es6.d.ts at pos 578796
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGEllipseElement")
public class SVGEllipseElement extends SVGGraphicsElement 
{

    /*
        Constructors
    */
    public SVGEllipseElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public SVGAnimatedLength cx;

    public SVGAnimatedLength cy;

    public Element firstElementChild;

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

    public SVGStringList requiredExtensions;

    public SVGStringList requiredFeatures;

    public SVGAnimatedLength rx;

    public SVGAnimatedLength ry;

    public SVGStringList systemLanguage;

    /*
        Methods
    */
    @JsProperty(name = "cx")
    public native SVGAnimatedLength getCx();
    @JsProperty(name = "cy")
    public native SVGAnimatedLength getCy();
    @JsProperty(name = "rx")
    public native SVGAnimatedLength getRx();
    @JsProperty(name = "ry")
    public native SVGAnimatedLength getRy();
    @JsProperty(name = "cx")
    public native void setCx(SVGAnimatedLength value);
    @JsProperty(name = "cy")
    public native void setCy(SVGAnimatedLength value);
    @JsProperty(name = "rx")
    public native void setRx(SVGAnimatedLength value);
    @JsProperty(name = "ry")
    public native void setRy(SVGAnimatedLength value);
}
