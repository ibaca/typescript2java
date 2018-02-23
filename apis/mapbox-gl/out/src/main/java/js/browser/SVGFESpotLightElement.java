package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGFESpotLightElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 595506
  * declared in: tsd/browser/lib.es6.d.ts at pos 596190
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGFESpotLightElement")
public class SVGFESpotLightElement extends SVGElement 
{

    /*
        Constructors
    */
    public SVGFESpotLightElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public Element lastElementChild;

    public SVGAnimatedNumber limitingConeAngle;

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

    public SVGAnimatedNumber pointsAtX;

    public SVGAnimatedNumber pointsAtY;

    public SVGAnimatedNumber pointsAtZ;

    public Element previousElementSibling;

    public SVGAnimatedNumber specularExponent;

    public SVGAnimatedNumber x;

    public SVGAnimatedNumber y;

    public SVGAnimatedNumber z;

    /*
        Methods
    */
    @JsProperty(name = "limitingConeAngle")
    public native SVGAnimatedNumber getLimitingConeAngle();
    @JsProperty(name = "pointsAtX")
    public native SVGAnimatedNumber getPointsAtX();
    @JsProperty(name = "pointsAtY")
    public native SVGAnimatedNumber getPointsAtY();
    @JsProperty(name = "pointsAtZ")
    public native SVGAnimatedNumber getPointsAtZ();
    @JsProperty(name = "specularExponent")
    public native SVGAnimatedNumber getSpecularExponent();
    @JsProperty(name = "x")
    public native SVGAnimatedNumber getX();
    @JsProperty(name = "y")
    public native SVGAnimatedNumber getY();
    @JsProperty(name = "z")
    public native SVGAnimatedNumber getZ();
    @JsProperty(name = "limitingConeAngle")
    public native void setLimitingConeAngle(SVGAnimatedNumber value);
    @JsProperty(name = "pointsAtX")
    public native void setPointsAtX(SVGAnimatedNumber value);
    @JsProperty(name = "pointsAtY")
    public native void setPointsAtY(SVGAnimatedNumber value);
    @JsProperty(name = "pointsAtZ")
    public native void setPointsAtZ(SVGAnimatedNumber value);
    @JsProperty(name = "specularExponent")
    public native void setSpecularExponent(SVGAnimatedNumber value);
    @JsProperty(name = "x")
    public native void setX(SVGAnimatedNumber value);
    @JsProperty(name = "y")
    public native void setY(SVGAnimatedNumber value);
    @JsProperty(name = "z")
    public native void setZ(SVGAnimatedNumber value);
}
