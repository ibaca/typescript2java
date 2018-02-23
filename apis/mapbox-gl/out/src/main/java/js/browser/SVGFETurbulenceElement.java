package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGFETurbulenceElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 596787
  * declared in: tsd/browser/lib.es6.d.ts at pos 597741
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGFETurbulenceElement")
public class SVGFETurbulenceElement extends SVGElement  implements SVGFilterPrimitiveStandardAttributes 
{

    /*
        Constructors
    */
    public SVGFETurbulenceElement () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="SVGFETurbulenceElement", name="SVG_STITCHTYPE_NOSTITCH")
    public static Number SVG_STITCHTYPE_NOSTITCH;

    @JsProperty(namespace="SVGFETurbulenceElement", name="SVG_STITCHTYPE_STITCH")
    public static Number SVG_STITCHTYPE_STITCH;

    @JsProperty(namespace="SVGFETurbulenceElement", name="SVG_STITCHTYPE_UNKNOWN")
    public static Number SVG_STITCHTYPE_UNKNOWN;

    @JsProperty(namespace="SVGFETurbulenceElement", name="SVG_TURBULENCE_TYPE_FRACTALNOISE")
    public static Number SVG_TURBULENCE_TYPE_FRACTALNOISE;

    @JsProperty(namespace="SVGFETurbulenceElement", name="SVG_TURBULENCE_TYPE_TURBULENCE")
    public static Number SVG_TURBULENCE_TYPE_TURBULENCE;

    @JsProperty(namespace="SVGFETurbulenceElement", name="SVG_TURBULENCE_TYPE_UNKNOWN")
    public static Number SVG_TURBULENCE_TYPE_UNKNOWN;

    /*
        Properties
    */

    public SVGAnimatedNumber baseFrequencyX;

    public SVGAnimatedNumber baseFrequencyY;

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public SVGAnimatedLength height;

    public Element lastElementChild;

    public Element nextElementSibling;

    public SVGAnimatedInteger numOctaves;

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

    public SVGAnimatedString result;

    public SVGAnimatedNumber seed;

    public SVGAnimatedEnumeration stitchTiles;

    public SVGAnimatedEnumeration type;

    public SVGAnimatedLength width;

    public SVGAnimatedLength x;

    public SVGAnimatedLength y;

    /*
        Methods
    */
    @JsProperty(name = "baseFrequencyX")
    public native SVGAnimatedNumber getBaseFrequencyX();
    @JsProperty(name = "baseFrequencyY")
    public native SVGAnimatedNumber getBaseFrequencyY();
    /** 
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
     */
    @JsProperty(name = "height")
    public native SVGAnimatedLength getHeight();
    @JsProperty(name = "numOctaves")
    public native SVGAnimatedInteger getNumOctaves();
    /** 
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
     */
    @JsProperty(name = "result")
    public native SVGAnimatedString getResult();
    @JsProperty(name = "SVG_STITCHTYPE_NOSTITCH")
    public native Number getSVG_STITCHTYPE_NOSTITCH();
    @JsProperty(name = "SVG_STITCHTYPE_STITCH")
    public native Number getSVG_STITCHTYPE_STITCH();
    @JsProperty(name = "SVG_STITCHTYPE_UNKNOWN")
    public native Number getSVG_STITCHTYPE_UNKNOWN();
    @JsProperty(name = "SVG_TURBULENCE_TYPE_FRACTALNOISE")
    public native Number getSVG_TURBULENCE_TYPE_FRACTALNOISE();
    @JsProperty(name = "SVG_TURBULENCE_TYPE_TURBULENCE")
    public native Number getSVG_TURBULENCE_TYPE_TURBULENCE();
    @JsProperty(name = "SVG_TURBULENCE_TYPE_UNKNOWN")
    public native Number getSVG_TURBULENCE_TYPE_UNKNOWN();
    @JsProperty(name = "seed")
    public native SVGAnimatedNumber getSeed();
    @JsProperty(name = "stitchTiles")
    public native SVGAnimatedEnumeration getStitchTiles();
    @JsProperty(name = "type")
    public native SVGAnimatedEnumeration getType();
    /** 
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
     */
    @JsProperty(name = "width")
    public native SVGAnimatedLength getWidth();
    /** 
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
     */
    @JsProperty(name = "x")
    public native SVGAnimatedLength getX();
    /** 
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
     */
    @JsProperty(name = "y")
    public native SVGAnimatedLength getY();
    @JsProperty(name = "baseFrequencyX")
    public native void setBaseFrequencyX(SVGAnimatedNumber value);
    @JsProperty(name = "baseFrequencyY")
    public native void setBaseFrequencyY(SVGAnimatedNumber value);
    /** 
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
     */
    @JsProperty(name = "height")
    public native void setHeight(SVGAnimatedLength value);
    @JsProperty(name = "numOctaves")
    public native void setNumOctaves(SVGAnimatedInteger value);
    /** 
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
     */
    @JsProperty(name = "result")
    public native void setResult(SVGAnimatedString value);
    @JsProperty(name = "SVG_STITCHTYPE_NOSTITCH")
    public native void setSVG_STITCHTYPE_NOSTITCH(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_STITCHTYPE_STITCH")
    public native void setSVG_STITCHTYPE_STITCH(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_STITCHTYPE_UNKNOWN")
    public native void setSVG_STITCHTYPE_UNKNOWN(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_TURBULENCE_TYPE_FRACTALNOISE")
    public native void setSVG_TURBULENCE_TYPE_FRACTALNOISE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_TURBULENCE_TYPE_TURBULENCE")
    public native void setSVG_TURBULENCE_TYPE_TURBULENCE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_TURBULENCE_TYPE_UNKNOWN")
    public native void setSVG_TURBULENCE_TYPE_UNKNOWN(@DoNotAutobox Number value);
    @JsProperty(name = "seed")
    public native void setSeed(SVGAnimatedNumber value);
    @JsProperty(name = "stitchTiles")
    public native void setStitchTiles(SVGAnimatedEnumeration value);
    @JsProperty(name = "type")
    public native void setType(SVGAnimatedEnumeration value);
    /** 
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
     */
    @JsProperty(name = "width")
    public native void setWidth(SVGAnimatedLength value);
    /** 
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
     */
    @JsProperty(name = "x")
    public native void setX(SVGAnimatedLength value);
    /** 
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
      * inherited from (js.browser.SVGFilterPrimitiveStandardAttributes)
     */
    @JsProperty(name = "y")
    public native void setY(SVGAnimatedLength value);
}
