package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGRadialGradientElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 622663
  * declared in: tsd/browser/lib.es6.d.ts at pos 623205
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGRadialGradientElement")
public class SVGRadialGradientElement extends SVGGradientElement 
{

    /*
        Constructors
    */
    public SVGRadialGradientElement () {
    } 

    /*
        Properties
    */

    public Number SVG_UNIT_TYPE_OBJECTBOUNDINGBOX;

    public Number SVG_UNIT_TYPE_UNKNOWN;

    public Number SVG_UNIT_TYPE_USERSPACEONUSE;

    public Number childElementCount;

    public HTMLCollection children;

    public SVGAnimatedLength cx;

    public SVGAnimatedLength cy;

    public Element firstElementChild;

    public SVGAnimatedLength fx;

    public SVGAnimatedLength fy;

    public SVGAnimatedString href;

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

    public SVGAnimatedLength r;

    /*
        Methods
    */
    @JsProperty(name = "cx")
    public native SVGAnimatedLength getCx();
    @JsProperty(name = "cy")
    public native SVGAnimatedLength getCy();
    @JsProperty(name = "fx")
    public native SVGAnimatedLength getFx();
    @JsProperty(name = "fy")
    public native SVGAnimatedLength getFy();
    @JsProperty(name = "r")
    public native SVGAnimatedLength getR();
    @JsProperty(name = "cx")
    public native void setCx(SVGAnimatedLength value);
    @JsProperty(name = "cy")
    public native void setCy(SVGAnimatedLength value);
    @JsProperty(name = "fx")
    public native void setFx(SVGAnimatedLength value);
    @JsProperty(name = "fy")
    public native void setFy(SVGAnimatedLength value);
    @JsProperty(name = "r")
    public native void setR(SVGAnimatedLength value);
}
