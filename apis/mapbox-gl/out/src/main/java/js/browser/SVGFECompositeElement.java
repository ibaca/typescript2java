package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGFECompositeElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 582831
  * declared in: tsd/browser/lib.es6.d.ts at pos 583852
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGFECompositeElement")
public class SVGFECompositeElement extends SVGElement  implements SVGFilterPrimitiveStandardAttributes 
{

    /*
        Constructors
    */
    public SVGFECompositeElement () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="SVGFECompositeElement", name="SVG_FECOMPOSITE_OPERATOR_ARITHMETIC")
    public static Number SVG_FECOMPOSITE_OPERATOR_ARITHMETIC;

    @JsProperty(namespace="SVGFECompositeElement", name="SVG_FECOMPOSITE_OPERATOR_ATOP")
    public static Number SVG_FECOMPOSITE_OPERATOR_ATOP;

    @JsProperty(namespace="SVGFECompositeElement", name="SVG_FECOMPOSITE_OPERATOR_IN")
    public static Number SVG_FECOMPOSITE_OPERATOR_IN;

    @JsProperty(namespace="SVGFECompositeElement", name="SVG_FECOMPOSITE_OPERATOR_OUT")
    public static Number SVG_FECOMPOSITE_OPERATOR_OUT;

    @JsProperty(namespace="SVGFECompositeElement", name="SVG_FECOMPOSITE_OPERATOR_OVER")
    public static Number SVG_FECOMPOSITE_OPERATOR_OVER;

    @JsProperty(namespace="SVGFECompositeElement", name="SVG_FECOMPOSITE_OPERATOR_UNKNOWN")
    public static Number SVG_FECOMPOSITE_OPERATOR_UNKNOWN;

    @JsProperty(namespace="SVGFECompositeElement", name="SVG_FECOMPOSITE_OPERATOR_XOR")
    public static Number SVG_FECOMPOSITE_OPERATOR_XOR;

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public SVGAnimatedLength height;

    public SVGAnimatedString in1;

    public SVGAnimatedString in2;

    public SVGAnimatedNumber k1;

    public SVGAnimatedNumber k2;

    public SVGAnimatedNumber k3;

    public SVGAnimatedNumber k4;

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

    public SVGAnimatedEnumeration operator;

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
    @JsProperty(name = "k1")
    public native SVGAnimatedNumber getK1();
    @JsProperty(name = "k2")
    public native SVGAnimatedNumber getK2();
    @JsProperty(name = "k3")
    public native SVGAnimatedNumber getK3();
    @JsProperty(name = "k4")
    public native SVGAnimatedNumber getK4();
    @JsProperty(name = "operator")
    public native SVGAnimatedEnumeration getOperator();
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
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_ARITHMETIC")
    public native Number getSVG_FECOMPOSITE_OPERATOR_ARITHMETIC();
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_ATOP")
    public native Number getSVG_FECOMPOSITE_OPERATOR_ATOP();
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_IN")
    public native Number getSVG_FECOMPOSITE_OPERATOR_IN();
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_OUT")
    public native Number getSVG_FECOMPOSITE_OPERATOR_OUT();
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_OVER")
    public native Number getSVG_FECOMPOSITE_OPERATOR_OVER();
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_UNKNOWN")
    public native Number getSVG_FECOMPOSITE_OPERATOR_UNKNOWN();
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_XOR")
    public native Number getSVG_FECOMPOSITE_OPERATOR_XOR();
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
    @JsProperty(name = "k1")
    public native void setK1(SVGAnimatedNumber value);
    @JsProperty(name = "k2")
    public native void setK2(SVGAnimatedNumber value);
    @JsProperty(name = "k3")
    public native void setK3(SVGAnimatedNumber value);
    @JsProperty(name = "k4")
    public native void setK4(SVGAnimatedNumber value);
    @JsProperty(name = "operator")
    public native void setOperator(SVGAnimatedEnumeration value);
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
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_ARITHMETIC")
    public native void setSVG_FECOMPOSITE_OPERATOR_ARITHMETIC(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_ATOP")
    public native void setSVG_FECOMPOSITE_OPERATOR_ATOP(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_IN")
    public native void setSVG_FECOMPOSITE_OPERATOR_IN(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_OUT")
    public native void setSVG_FECOMPOSITE_OPERATOR_OUT(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_OVER")
    public native void setSVG_FECOMPOSITE_OPERATOR_OVER(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_UNKNOWN")
    public native void setSVG_FECOMPOSITE_OPERATOR_UNKNOWN(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FECOMPOSITE_OPERATOR_XOR")
    public native void setSVG_FECOMPOSITE_OPERATOR_XOR(@DoNotAutobox Number value);
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
