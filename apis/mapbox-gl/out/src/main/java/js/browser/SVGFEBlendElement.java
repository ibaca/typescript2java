package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGFEBlendElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 578883
  * declared in: tsd/browser/lib.es6.d.ts at pos 580194
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGFEBlendElement")
public class SVGFEBlendElement extends SVGElement  implements SVGFilterPrimitiveStandardAttributes 
{

    /*
        Constructors
    */
    public SVGFEBlendElement () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_COLOR")
    public static Number SVG_FEBLEND_MODE_COLOR;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_COLOR_BURN")
    public static Number SVG_FEBLEND_MODE_COLOR_BURN;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_COLOR_DODGE")
    public static Number SVG_FEBLEND_MODE_COLOR_DODGE;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_DARKEN")
    public static Number SVG_FEBLEND_MODE_DARKEN;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_DIFFERENCE")
    public static Number SVG_FEBLEND_MODE_DIFFERENCE;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_EXCLUSION")
    public static Number SVG_FEBLEND_MODE_EXCLUSION;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_HARD_LIGHT")
    public static Number SVG_FEBLEND_MODE_HARD_LIGHT;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_HUE")
    public static Number SVG_FEBLEND_MODE_HUE;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_LIGHTEN")
    public static Number SVG_FEBLEND_MODE_LIGHTEN;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_LUMINOSITY")
    public static Number SVG_FEBLEND_MODE_LUMINOSITY;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_MULTIPLY")
    public static Number SVG_FEBLEND_MODE_MULTIPLY;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_NORMAL")
    public static Number SVG_FEBLEND_MODE_NORMAL;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_OVERLAY")
    public static Number SVG_FEBLEND_MODE_OVERLAY;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_SATURATION")
    public static Number SVG_FEBLEND_MODE_SATURATION;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_SCREEN")
    public static Number SVG_FEBLEND_MODE_SCREEN;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_SOFT_LIGHT")
    public static Number SVG_FEBLEND_MODE_SOFT_LIGHT;

    @JsProperty(namespace="SVGFEBlendElement", name="SVG_FEBLEND_MODE_UNKNOWN")
    public static Number SVG_FEBLEND_MODE_UNKNOWN;

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public SVGAnimatedLength height;

    public SVGAnimatedString in1;

    public SVGAnimatedString in2;

    public Element lastElementChild;

    public SVGAnimatedEnumeration mode;

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

    public SVGAnimatedString result;

    public SVGAnimatedLength width;

    public SVGAnimatedLength x;

    public SVGAnimatedLength y;

    /*
        Methods
    */
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
    @JsProperty(name = "in1")
    public native SVGAnimatedString getIn1();
    @JsProperty(name = "in2")
    public native SVGAnimatedString getIn2();
    @JsProperty(name = "mode")
    public native SVGAnimatedEnumeration getMode();
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
    @JsProperty(name = "SVG_FEBLEND_MODE_COLOR")
    public native Number getSVG_FEBLEND_MODE_COLOR();
    @JsProperty(name = "SVG_FEBLEND_MODE_COLOR_BURN")
    public native Number getSVG_FEBLEND_MODE_COLOR_BURN();
    @JsProperty(name = "SVG_FEBLEND_MODE_COLOR_DODGE")
    public native Number getSVG_FEBLEND_MODE_COLOR_DODGE();
    @JsProperty(name = "SVG_FEBLEND_MODE_DARKEN")
    public native Number getSVG_FEBLEND_MODE_DARKEN();
    @JsProperty(name = "SVG_FEBLEND_MODE_DIFFERENCE")
    public native Number getSVG_FEBLEND_MODE_DIFFERENCE();
    @JsProperty(name = "SVG_FEBLEND_MODE_EXCLUSION")
    public native Number getSVG_FEBLEND_MODE_EXCLUSION();
    @JsProperty(name = "SVG_FEBLEND_MODE_HARD_LIGHT")
    public native Number getSVG_FEBLEND_MODE_HARD_LIGHT();
    @JsProperty(name = "SVG_FEBLEND_MODE_HUE")
    public native Number getSVG_FEBLEND_MODE_HUE();
    @JsProperty(name = "SVG_FEBLEND_MODE_LIGHTEN")
    public native Number getSVG_FEBLEND_MODE_LIGHTEN();
    @JsProperty(name = "SVG_FEBLEND_MODE_LUMINOSITY")
    public native Number getSVG_FEBLEND_MODE_LUMINOSITY();
    @JsProperty(name = "SVG_FEBLEND_MODE_MULTIPLY")
    public native Number getSVG_FEBLEND_MODE_MULTIPLY();
    @JsProperty(name = "SVG_FEBLEND_MODE_NORMAL")
    public native Number getSVG_FEBLEND_MODE_NORMAL();
    @JsProperty(name = "SVG_FEBLEND_MODE_OVERLAY")
    public native Number getSVG_FEBLEND_MODE_OVERLAY();
    @JsProperty(name = "SVG_FEBLEND_MODE_SATURATION")
    public native Number getSVG_FEBLEND_MODE_SATURATION();
    @JsProperty(name = "SVG_FEBLEND_MODE_SCREEN")
    public native Number getSVG_FEBLEND_MODE_SCREEN();
    @JsProperty(name = "SVG_FEBLEND_MODE_SOFT_LIGHT")
    public native Number getSVG_FEBLEND_MODE_SOFT_LIGHT();
    @JsProperty(name = "SVG_FEBLEND_MODE_UNKNOWN")
    public native Number getSVG_FEBLEND_MODE_UNKNOWN();
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
    @JsProperty(name = "in1")
    public native void setIn1(SVGAnimatedString value);
    @JsProperty(name = "in2")
    public native void setIn2(SVGAnimatedString value);
    @JsProperty(name = "mode")
    public native void setMode(SVGAnimatedEnumeration value);
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
    @JsProperty(name = "SVG_FEBLEND_MODE_COLOR")
    public native void setSVG_FEBLEND_MODE_COLOR(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_COLOR_BURN")
    public native void setSVG_FEBLEND_MODE_COLOR_BURN(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_COLOR_DODGE")
    public native void setSVG_FEBLEND_MODE_COLOR_DODGE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_DARKEN")
    public native void setSVG_FEBLEND_MODE_DARKEN(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_DIFFERENCE")
    public native void setSVG_FEBLEND_MODE_DIFFERENCE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_EXCLUSION")
    public native void setSVG_FEBLEND_MODE_EXCLUSION(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_HARD_LIGHT")
    public native void setSVG_FEBLEND_MODE_HARD_LIGHT(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_HUE")
    public native void setSVG_FEBLEND_MODE_HUE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_LIGHTEN")
    public native void setSVG_FEBLEND_MODE_LIGHTEN(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_LUMINOSITY")
    public native void setSVG_FEBLEND_MODE_LUMINOSITY(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_MULTIPLY")
    public native void setSVG_FEBLEND_MODE_MULTIPLY(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_NORMAL")
    public native void setSVG_FEBLEND_MODE_NORMAL(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_OVERLAY")
    public native void setSVG_FEBLEND_MODE_OVERLAY(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_SATURATION")
    public native void setSVG_FEBLEND_MODE_SATURATION(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_SCREEN")
    public native void setSVG_FEBLEND_MODE_SCREEN(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_SOFT_LIGHT")
    public native void setSVG_FEBLEND_MODE_SOFT_LIGHT(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FEBLEND_MODE_UNKNOWN")
    public native void setSVG_FEBLEND_MODE_UNKNOWN(@DoNotAutobox Number value);
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
