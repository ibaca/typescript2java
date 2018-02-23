package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGFEDistantLightElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 587557
  * declared in: tsd/browser/lib.es6.d.ts at pos 587996
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGFEDistantLightElement")
public class SVGFEDistantLightElement extends SVGElement 
{

    /*
        Constructors
    */
    public SVGFEDistantLightElement () {
    } 

    /*
        Properties
    */

    public SVGAnimatedNumber azimuth;

    public Number childElementCount;

    public HTMLCollection children;

    public SVGAnimatedNumber elevation;

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

    /*
        Methods
    */
    @JsProperty(name = "azimuth")
    public native SVGAnimatedNumber getAzimuth();
    @JsProperty(name = "elevation")
    public native SVGAnimatedNumber getElevation();
    @JsProperty(name = "azimuth")
    public native void setAzimuth(SVGAnimatedNumber value);
    @JsProperty(name = "elevation")
    public native void setElevation(SVGAnimatedNumber value);
}
