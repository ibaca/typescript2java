package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGTextContentElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 630192
  * declared in: tsd/browser/lib.es6.d.ts at pos 631230
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGTextContentElement")
public class SVGTextContentElement extends SVGGraphicsElement 
{

    /*
        Constructors
    */
    public SVGTextContentElement () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="SVGTextContentElement", name="LENGTHADJUST_SPACING")
    public static Number LENGTHADJUST_SPACING;

    @JsProperty(namespace="SVGTextContentElement", name="LENGTHADJUST_SPACINGANDGLYPHS")
    public static Number LENGTHADJUST_SPACINGANDGLYPHS;

    @JsProperty(namespace="SVGTextContentElement", name="LENGTHADJUST_UNKNOWN")
    public static Number LENGTHADJUST_UNKNOWN;

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public Element lastElementChild;

    public SVGAnimatedEnumeration lengthAdjust;

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

    public SVGAnimatedLength textLength;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@630354
     */
    public native Number getCharNumAtPosition(SVGPoint point);
    /** 
      * tsd/browser/lib.es6.d.ts@630405
     */
    public native Number getComputedTextLength();
    /** 
      * tsd/browser/lib.es6.d.ts@630442
     */
    public native SVGPoint getEndPositionOfChar(@DoNotAutobox Number charnum);
    /** 
      * tsd/browser/lib.es6.d.ts@630495
     */
    public native SVGRect getExtentOfChar(@DoNotAutobox Number charnum);
    @JsProperty(name = "LENGTHADJUST_SPACING")
    public native Number getLENGTHADJUST_SPACING();
    @JsProperty(name = "LENGTHADJUST_SPACINGANDGLYPHS")
    public native Number getLENGTHADJUST_SPACINGANDGLYPHS();
    @JsProperty(name = "LENGTHADJUST_UNKNOWN")
    public native Number getLENGTHADJUST_UNKNOWN();
    @JsProperty(name = "lengthAdjust")
    public native SVGAnimatedEnumeration getLengthAdjust();
    /** 
      * tsd/browser/lib.es6.d.ts@630542
     */
    public native Number getNumberOfChars();
    /** 
      * tsd/browser/lib.es6.d.ts@630574
     */
    public native Number getRotationOfChar(@DoNotAutobox Number charnum);
    /** 
      * tsd/browser/lib.es6.d.ts@630622
     */
    public native SVGPoint getStartPositionOfChar(@DoNotAutobox Number charnum);
    /** 
      * tsd/browser/lib.es6.d.ts@630677
     */
    public native Number getSubStringLength(@DoNotAutobox Number charnum, @DoNotAutobox Number nchars);
    @JsProperty(name = "textLength")
    public native SVGAnimatedLength getTextLength();
    /** 
      * tsd/browser/lib.es6.d.ts@630742
     */
    public native void selectSubString(@DoNotAutobox Number charnum, @DoNotAutobox Number nchars);
    @JsProperty(name = "LENGTHADJUST_SPACING")
    public native void setLENGTHADJUST_SPACING(@DoNotAutobox Number value);
    @JsProperty(name = "LENGTHADJUST_SPACINGANDGLYPHS")
    public native void setLENGTHADJUST_SPACINGANDGLYPHS(@DoNotAutobox Number value);
    @JsProperty(name = "LENGTHADJUST_UNKNOWN")
    public native void setLENGTHADJUST_UNKNOWN(@DoNotAutobox Number value);
    @JsProperty(name = "lengthAdjust")
    public native void setLengthAdjust(SVGAnimatedEnumeration value);
    @JsProperty(name = "textLength")
    public native void setTextLength(SVGAnimatedLength value);
}
