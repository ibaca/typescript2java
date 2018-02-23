package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGTextPositioningElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 633084
  * declared in: tsd/browser/lib.es6.d.ts at pos 633654
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGTextPositioningElement")
public class SVGTextPositioningElement extends SVGTextContentElement 
{

    /*
        Constructors
    */
    public SVGTextPositioningElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public SVGAnimatedLengthList dx;

    public SVGAnimatedLengthList dy;

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

    public SVGAnimatedNumberList rotate;

    public SVGStringList systemLanguage;

    public SVGAnimatedLengthList x;

    public SVGAnimatedLengthList y;

    /*
        Methods
    */
    @JsProperty(name = "dx")
    public native SVGAnimatedLengthList getDx();
    @JsProperty(name = "dy")
    public native SVGAnimatedLengthList getDy();
    @JsProperty(name = "rotate")
    public native SVGAnimatedNumberList getRotate();
    @JsProperty(name = "x")
    public native SVGAnimatedLengthList getX();
    @JsProperty(name = "y")
    public native SVGAnimatedLengthList getY();
    @JsProperty(name = "dx")
    public native void setDx(SVGAnimatedLengthList value);
    @JsProperty(name = "dy")
    public native void setDy(SVGAnimatedLengthList value);
    @JsProperty(name = "rotate")
    public native void setRotate(SVGAnimatedNumberList value);
    @JsProperty(name = "x")
    public native void setX(SVGAnimatedLengthList value);
    @JsProperty(name = "y")
    public native void setY(SVGAnimatedLengthList value);
}
