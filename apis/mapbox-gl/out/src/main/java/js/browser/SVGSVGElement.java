package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGSVGElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 624326
  * declared in: tsd/browser/lib.es6.d.ts at pos 626957
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGSVGElement")
public class SVGSVGElement extends SVGGraphicsElement  implements DocumentEvent, SVGFitToViewBox, SVGZoomAndPan 
{

    /*
        Constructors
    */
    public SVGSVGElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public String contentScriptType;

    public String contentStyleType;

    public Number currentScale;

    public SVGPoint currentTranslate;

    public Element firstElementChild;

    public SVGAnimatedLength height;

    public Element lastElementChild;

    public Element nextElementSibling;

    public Function1<Event, Object> onabort;

    public Function1<Event, Object> onerror;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<UIEvent, Object> onresize;

    public Function1<UIEvent, Object> onscroll;

    public Function1<Event, Object> onunload;

    public Function1<WheelEvent, Object> onwheel;

    public Function1<SVGZoomEvent, Object> onzoom;

    public Number pixelUnitToMillimeterX;

    public Number pixelUnitToMillimeterY;

    public SVGAnimatedPreserveAspectRatio preserveAspectRatio;

    public Element previousElementSibling;

    public SVGStringList requiredExtensions;

    public SVGStringList requiredFeatures;

    public Number screenPixelToMillimeterX;

    public Number screenPixelToMillimeterY;

    public SVGStringList systemLanguage;

    public SVGAnimatedRect viewBox;

    public SVGRect viewport;

    public SVGAnimatedLength width;

    public SVGAnimatedLength x;

    public SVGAnimatedLength y;

    public Number zoomAndPan;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@625262
     */
    public native Boolean checkEnclosure(SVGElement element, SVGRect rect);
    /** 
      * tsd/browser/lib.es6.d.ts@625327
     */
    public native Boolean checkIntersection(SVGElement element, SVGRect rect);
    /** 
      * tsd/browser/lib.es6.d.ts@724123
      * inherited from (js.browser.DocumentEvent)
      * inherited from (js.browser.DocumentEvent)
     */
    public native AnimationEvent createEvent(String eventInterface);
    /** 
      * tsd/browser/lib.es6.d.ts@625395
     */
    public native SVGAngle createSVGAngle();
    /** 
      * tsd/browser/lib.es6.d.ts@625427
     */
    public native SVGLength createSVGLength();
    /** 
      * tsd/browser/lib.es6.d.ts@625461
     */
    public native SVGMatrix createSVGMatrix();
    /** 
      * tsd/browser/lib.es6.d.ts@625495
     */
    public native SVGNumber createSVGNumber();
    /** 
      * tsd/browser/lib.es6.d.ts@625529
     */
    public native SVGPoint createSVGPoint();
    /** 
      * tsd/browser/lib.es6.d.ts@625561
     */
    public native SVGRect createSVGRect();
    /** 
      * tsd/browser/lib.es6.d.ts@625591
     */
    public native SVGTransform createSVGTransform();
    /** 
      * tsd/browser/lib.es6.d.ts@625631
     */
    public native SVGTransform createSVGTransformFromMatrix(SVGMatrix matrix);
    /** 
      * tsd/browser/lib.es6.d.ts@625698
     */
    public native void deselectAll();
    /** 
      * tsd/browser/lib.es6.d.ts@625723
     */
    public native void forceRedraw();
    public native CSSStyleDeclaration getComputedStyle(Element elt);
    /** 
      * tsd/browser/lib.es6.d.ts@625748
     */
    public native CSSStyleDeclaration getComputedStyle(Element elt, String pseudoElt /* optional */);
    @JsProperty(name = "contentScriptType")
    public native String getContentScriptType();
    @JsProperty(name = "contentStyleType")
    public native String getContentStyleType();
    @JsProperty(name = "currentScale")
    public native Number getCurrentScale();
    /** 
      * tsd/browser/lib.es6.d.ts@625825
     */
    public native Number getCurrentTime();
    @JsProperty(name = "currentTranslate")
    public native SVGPoint getCurrentTranslate();
    /** 
      * tsd/browser/lib.es6.d.ts@625855
     */
    public native Element getElementById(String elementId);
    /** 
      * tsd/browser/lib.es6.d.ts@625903
     */
    public native NodeListOf<UnionOfSVG_166_UseElement> getEnclosureList(SVGRect rect, SVGElement referenceElement);
    @JsProperty(name = "height")
    public native SVGAnimatedLength getHeight();
    /** 
      * tsd/browser/lib.es6.d.ts@626163
     */
    public native NodeListOf<UnionOfSVG_166_UseElement> getIntersectionList(SVGRect rect, SVGElement referenceElement);
    @JsProperty(name = "onabort")
    public native Function1<Event, Object> getOnabort();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "onresize")
    public native Function1<UIEvent, Object> getOnresize();
    @JsProperty(name = "onscroll")
    public native Function1<UIEvent, Object> getOnscroll();
    @JsProperty(name = "onunload")
    public native Function1<Event, Object> getOnunload();
    @JsProperty(name = "onzoom")
    public native Function1<SVGZoomEvent, Object> getOnzoom();
    @JsProperty(name = "pixelUnitToMillimeterX")
    public native Number getPixelUnitToMillimeterX();
    @JsProperty(name = "pixelUnitToMillimeterY")
    public native Number getPixelUnitToMillimeterY();
    /** 
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
     */
    @JsProperty(name = "preserveAspectRatio")
    public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
    @JsProperty(name = "screenPixelToMillimeterX")
    public native Number getScreenPixelToMillimeterX();
    @JsProperty(name = "screenPixelToMillimeterY")
    public native Number getScreenPixelToMillimeterY();
    /** 
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
     */
    @JsProperty(name = "viewBox")
    public native SVGAnimatedRect getViewBox();
    @JsProperty(name = "viewport")
    public native SVGRect getViewport();
    @JsProperty(name = "width")
    public native SVGAnimatedLength getWidth();
    @JsProperty(name = "x")
    public native SVGAnimatedLength getX();
    @JsProperty(name = "y")
    public native SVGAnimatedLength getY();
    /** 
      * inherited from (js.browser.SVGZoomAndPan)
      * inherited from (js.browser.SVGZoomAndPan)
     */
    @JsProperty(name = "zoomAndPan")
    public native Number getZoomAndPan();
    /** 
      * tsd/browser/lib.es6.d.ts@626426
     */
    public native void pauseAnimations();
    @JsProperty(name = "contentScriptType")
    public native void setContentScriptType(String value);
    @JsProperty(name = "contentStyleType")
    public native void setContentStyleType(String value);
    @JsProperty(name = "currentScale")
    public native void setCurrentScale(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@626455
     */
    public native void setCurrentTime(@DoNotAutobox Number seconds);
    @JsProperty(name = "currentTranslate")
    public native void setCurrentTranslate(SVGPoint value);
    @JsProperty(name = "height")
    public native void setHeight(SVGAnimatedLength value);
    @JsProperty(name = "onabort")
    public native void setOnabort(Function1<Event, Object> value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "onresize")
    public native void setOnresize(Function1<UIEvent, Object> value);
    @JsProperty(name = "onscroll")
    public native void setOnscroll(Function1<UIEvent, Object> value);
    @JsProperty(name = "onunload")
    public native void setOnunload(Function1<Event, Object> value);
    @JsProperty(name = "onzoom")
    public native void setOnzoom(Function1<SVGZoomEvent, Object> value);
    @JsProperty(name = "pixelUnitToMillimeterX")
    public native void setPixelUnitToMillimeterX(@DoNotAutobox Number value);
    @JsProperty(name = "pixelUnitToMillimeterY")
    public native void setPixelUnitToMillimeterY(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
     */
    @JsProperty(name = "preserveAspectRatio")
    public native void setPreserveAspectRatio(SVGAnimatedPreserveAspectRatio value);
    @JsProperty(name = "screenPixelToMillimeterX")
    public native void setScreenPixelToMillimeterX(@DoNotAutobox Number value);
    @JsProperty(name = "screenPixelToMillimeterY")
    public native void setScreenPixelToMillimeterY(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
     */
    @JsProperty(name = "viewBox")
    public native void setViewBox(SVGAnimatedRect value);
    @JsProperty(name = "viewport")
    public native void setViewport(SVGRect value);
    @JsProperty(name = "width")
    public native void setWidth(SVGAnimatedLength value);
    @JsProperty(name = "x")
    public native void setX(SVGAnimatedLength value);
    @JsProperty(name = "y")
    public native void setY(SVGAnimatedLength value);
    /** 
      * inherited from (js.browser.SVGZoomAndPan)
      * inherited from (js.browser.SVGZoomAndPan)
     */
    @JsProperty(name = "zoomAndPan")
    public native void setZoomAndPan(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@626498
     */
    public native Number suspendRedraw(@DoNotAutobox Number maxWaitMilliseconds);
    /** 
      * tsd/browser/lib.es6.d.ts@626554
     */
    public native void unpauseAnimations();
    /** 
      * tsd/browser/lib.es6.d.ts@626585
     */
    public native void unsuspendRedraw(@DoNotAutobox Number suspendHandleID);
    /** 
      * tsd/browser/lib.es6.d.ts@626637
     */
    public native void unsuspendRedrawAll();
}
