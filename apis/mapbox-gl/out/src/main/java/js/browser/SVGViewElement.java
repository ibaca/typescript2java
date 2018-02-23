package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGViewElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 636770
  * declared in: tsd/browser/lib.es6.d.ts at pos 637177
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGViewElement")
public class SVGViewElement extends SVGElement  implements SVGZoomAndPan, SVGFitToViewBox 
{

    /*
        Constructors
    */
    public SVGViewElement () {
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

    public SVGStringList viewTarget;

    public Number zoomAndPan;

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
    @JsProperty(name = "viewTarget")
    public native SVGStringList getViewTarget();
    /** 
      * inherited from (js.browser.SVGZoomAndPan)
      * inherited from (js.browser.SVGZoomAndPan)
     */
    @JsProperty(name = "zoomAndPan")
    public native Number getZoomAndPan();
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
    @JsProperty(name = "viewTarget")
    public native void setViewTarget(SVGStringList value);
    /** 
      * inherited from (js.browser.SVGZoomAndPan)
      * inherited from (js.browser.SVGZoomAndPan)
     */
    @JsProperty(name = "zoomAndPan")
    public native void setZoomAndPan(@DoNotAutobox Number value);
}
