package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGSymbolElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 629319
  * declared in: tsd/browser/lib.es6.d.ts at pos 629675
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGSymbolElement")
public class SVGSymbolElement extends SVGElement  implements SVGFitToViewBox 
{

    /*
        Constructors
    */
    public SVGSymbolElement () {
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

    public SVGAnimatedPreserveAspectRatio preserveAspectRatio;

    public Element previousElementSibling;

    public SVGAnimatedRect viewBox;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
     */
    @JsProperty(name = "preserveAspectRatio")
    public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
    /** 
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
     */
    @JsProperty(name = "viewBox")
    public native SVGAnimatedRect getViewBox();
    /** 
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
     */
    @JsProperty(name = "preserveAspectRatio")
    public native void setPreserveAspectRatio(SVGAnimatedPreserveAspectRatio value);
    /** 
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
     */
    @JsProperty(name = "viewBox")
    public native void setViewBox(SVGAnimatedRect value);
}
