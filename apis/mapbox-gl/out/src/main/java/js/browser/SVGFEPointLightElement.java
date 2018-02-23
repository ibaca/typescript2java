package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGFEPointLightElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 594142
  * declared in: tsd/browser/lib.es6.d.ts at pos 594598
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGFEPointLightElement")
public class SVGFEPointLightElement extends SVGElement 
{

    /*
        Constructors
    */
    public SVGFEPointLightElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

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

    public SVGAnimatedNumber x;

    public SVGAnimatedNumber y;

    public SVGAnimatedNumber z;

    /*
        Methods
    */
    @JsProperty(name = "x")
    public native SVGAnimatedNumber getX();
    @JsProperty(name = "y")
    public native SVGAnimatedNumber getY();
    @JsProperty(name = "z")
    public native SVGAnimatedNumber getZ();
    @JsProperty(name = "x")
    public native void setX(SVGAnimatedNumber value);
    @JsProperty(name = "y")
    public native void setY(SVGAnimatedNumber value);
    @JsProperty(name = "z")
    public native void setZ(SVGAnimatedNumber value);
}
