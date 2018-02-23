package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPathElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 609091
  * declared in: tsd/browser/lib.es6.d.ts at pos 611540
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPathElement")
public class SVGPathElement extends SVGGraphicsElement 
{

    /*
        Constructors
    */
    public SVGPathElement () {
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

    public SVGPathSegList pathSegList;

    public Element previousElementSibling;

    public SVGStringList requiredExtensions;

    public SVGStringList requiredFeatures;

    public SVGStringList systemLanguage;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@609193
     */
    public native SVGPathSegArcAbs createSVGPathSegArcAbs(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number r1, @DoNotAutobox Number r2, @DoNotAutobox Number angle, Boolean largeArcFlag, Boolean sweepFlag);
    /** 
      * tsd/browser/lib.es6.d.ts@609343
     */
    public native SVGPathSegArcRel createSVGPathSegArcRel(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number r1, @DoNotAutobox Number r2, @DoNotAutobox Number angle, Boolean largeArcFlag, Boolean sweepFlag);
    /** 
      * tsd/browser/lib.es6.d.ts@609493
     */
    public native SVGPathSegClosePath createSVGPathSegClosePath();
    /** 
      * tsd/browser/lib.es6.d.ts@609547
     */
    public native SVGPathSegCurvetoCubicAbs createSVGPathSegCurvetoCubicAbs(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number x1, @DoNotAutobox Number y1, @DoNotAutobox Number x2, @DoNotAutobox Number y2);
    /** 
      * tsd/browser/lib.es6.d.ts@609681
     */
    public native SVGPathSegCurvetoCubicRel createSVGPathSegCurvetoCubicRel(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number x1, @DoNotAutobox Number y1, @DoNotAutobox Number x2, @DoNotAutobox Number y2);
    /** 
      * tsd/browser/lib.es6.d.ts@609815
     */
    public native SVGPathSegCurvetoCubicSmoothAbs createSVGPathSegCurvetoCubicSmoothAbs(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number x2, @DoNotAutobox Number y2);
    /** 
      * tsd/browser/lib.es6.d.ts@609937
     */
    public native SVGPathSegCurvetoCubicSmoothRel createSVGPathSegCurvetoCubicSmoothRel(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number x2, @DoNotAutobox Number y2);
    /** 
      * tsd/browser/lib.es6.d.ts@610059
     */
    public native SVGPathSegCurvetoQuadraticAbs createSVGPathSegCurvetoQuadraticAbs(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number x1, @DoNotAutobox Number y1);
    /** 
      * tsd/browser/lib.es6.d.ts@610177
     */
    public native SVGPathSegCurvetoQuadraticRel createSVGPathSegCurvetoQuadraticRel(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number x1, @DoNotAutobox Number y1);
    /** 
      * tsd/browser/lib.es6.d.ts@610295
     */
    public native SVGPathSegCurvetoQuadraticSmoothAbs createSVGPathSegCurvetoQuadraticSmoothAbs(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@610401
     */
    public native SVGPathSegCurvetoQuadraticSmoothRel createSVGPathSegCurvetoQuadraticSmoothRel(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@610507
     */
    public native SVGPathSegLinetoAbs createSVGPathSegLinetoAbs(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@610581
     */
    public native SVGPathSegLinetoHorizontalAbs createSVGPathSegLinetoHorizontalAbs(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@610664
     */
    public native SVGPathSegLinetoHorizontalRel createSVGPathSegLinetoHorizontalRel(@DoNotAutobox Number x);
    /** 
      * tsd/browser/lib.es6.d.ts@610747
     */
    public native SVGPathSegLinetoRel createSVGPathSegLinetoRel(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@610821
     */
    public native SVGPathSegLinetoVerticalAbs createSVGPathSegLinetoVerticalAbs(@DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@610900
     */
    public native SVGPathSegLinetoVerticalRel createSVGPathSegLinetoVerticalRel(@DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@610979
     */
    public native SVGPathSegMovetoAbs createSVGPathSegMovetoAbs(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@611053
     */
    public native SVGPathSegMovetoRel createSVGPathSegMovetoRel(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@611127
     */
    public native Number getPathSegAtLength(@DoNotAutobox Number distance);
    @JsProperty(name = "pathSegList")
    public native SVGPathSegList getPathSegList();
    /** 
      * tsd/browser/lib.es6.d.ts@611177
     */
    public native SVGPoint getPointAtLength(@DoNotAutobox Number distance);
    /** 
      * tsd/browser/lib.es6.d.ts@611227
     */
    public native Number getTotalLength();
    @JsProperty(name = "pathSegList")
    public native void setPathSegList(SVGPathSegList value);
}
