package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGImageElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 601739
  * declared in: tsd/browser/lib.es6.d.ts at pos 602316
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGImageElement")
public class SVGImageElement extends SVGGraphicsElement  implements SVGURIReference 
{

    /*
        Constructors
    */
    public SVGImageElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public SVGAnimatedLength height;

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

    public SVGAnimatedPreserveAspectRatio preserveAspectRatio;

    public Element previousElementSibling;

    public SVGStringList requiredExtensions;

    public SVGStringList requiredFeatures;

    public SVGStringList systemLanguage;

    public SVGAnimatedLength width;

    public SVGAnimatedLength x;

    public SVGAnimatedLength y;

    /*
        Methods
    */
    @JsProperty(name = "height")
    public native SVGAnimatedLength getHeight();
    /** 
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
     */
    @JsProperty(name = "href")
    public native SVGAnimatedString getHref();
    @JsProperty(name = "preserveAspectRatio")
    public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
    @JsProperty(name = "width")
    public native SVGAnimatedLength getWidth();
    @JsProperty(name = "x")
    public native SVGAnimatedLength getX();
    @JsProperty(name = "y")
    public native SVGAnimatedLength getY();
    @JsProperty(name = "height")
    public native void setHeight(SVGAnimatedLength value);
    /** 
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
     */
    @JsProperty(name = "href")
    public native void setHref(SVGAnimatedString value);
    @JsProperty(name = "preserveAspectRatio")
    public native void setPreserveAspectRatio(SVGAnimatedPreserveAspectRatio value);
    @JsProperty(name = "width")
    public native void setWidth(SVGAnimatedLength value);
    @JsProperty(name = "x")
    public native void setX(SVGAnimatedLength value);
    @JsProperty(name = "y")
    public native void setY(SVGAnimatedLength value);
}
