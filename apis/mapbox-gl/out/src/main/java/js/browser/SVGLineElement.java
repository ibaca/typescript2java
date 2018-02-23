package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGLineElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 604142
  * declared in: tsd/browser/lib.es6.d.ts at pos 604629
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGLineElement")
public class SVGLineElement extends SVGGraphicsElement 
{

    /*
        Constructors
    */
    public SVGLineElement () {
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

    public SVGStringList requiredExtensions;

    public SVGStringList requiredFeatures;

    public SVGStringList systemLanguage;

    public SVGAnimatedLength x1;

    public SVGAnimatedLength x2;

    public SVGAnimatedLength y1;

    public SVGAnimatedLength y2;

    /*
        Methods
    */
    @JsProperty(name = "x1")
    public native SVGAnimatedLength getX1();
    @JsProperty(name = "x2")
    public native SVGAnimatedLength getX2();
    @JsProperty(name = "y1")
    public native SVGAnimatedLength getY1();
    @JsProperty(name = "y2")
    public native SVGAnimatedLength getY2();
    @JsProperty(name = "x1")
    public native void setX1(SVGAnimatedLength value);
    @JsProperty(name = "x2")
    public native void setX2(SVGAnimatedLength value);
    @JsProperty(name = "y1")
    public native void setY1(SVGAnimatedLength value);
    @JsProperty(name = "y2")
    public native void setY2(SVGAnimatedLength value);
}