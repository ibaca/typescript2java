package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGFEConvolveMatrixElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 584320
  * declared in: tsd/browser/lib.es6.d.ts at pos 585414
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGFEConvolveMatrixElement")
public class SVGFEConvolveMatrixElement extends SVGElement  implements SVGFilterPrimitiveStandardAttributes 
{

    /*
        Constructors
    */
    public SVGFEConvolveMatrixElement () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="SVGFEConvolveMatrixElement", name="SVG_EDGEMODE_DUPLICATE")
    public static Number SVG_EDGEMODE_DUPLICATE;

    @JsProperty(namespace="SVGFEConvolveMatrixElement", name="SVG_EDGEMODE_NONE")
    public static Number SVG_EDGEMODE_NONE;

    @JsProperty(namespace="SVGFEConvolveMatrixElement", name="SVG_EDGEMODE_UNKNOWN")
    public static Number SVG_EDGEMODE_UNKNOWN;

    @JsProperty(namespace="SVGFEConvolveMatrixElement", name="SVG_EDGEMODE_WRAP")
    public static Number SVG_EDGEMODE_WRAP;

    /*
        Properties
    */

    public SVGAnimatedNumber bias;

    public Number childElementCount;

    public HTMLCollection children;

    public SVGAnimatedNumber divisor;

    public SVGAnimatedEnumeration edgeMode;

    public Element firstElementChild;

    public SVGAnimatedLength height;

    public SVGAnimatedString in1;

    public SVGAnimatedNumberList kernelMatrix;

    public SVGAnimatedNumber kernelUnitLengthX;

    public SVGAnimatedNumber kernelUnitLengthY;

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

    public SVGAnimatedInteger orderX;

    public SVGAnimatedInteger orderY;

    public SVGAnimatedBoolean preserveAlpha;

    public Element previousElementSibling;

    public SVGAnimatedString result;

    public SVGAnimatedInteger targetX;

    public SVGAnimatedInteger targetY;

    public SVGAnimatedLength width;

    public SVGAnimatedLength x;

    public SVGAnimatedLength y;

    /*
        Methods
    */
    @JsProperty(name = "bias")
    public native SVGAnimatedNumber getBias();
    @JsProperty(name = "divisor")
    public native SVGAnimatedNumber getDivisor();
    @JsProperty(name = "edgeMode")
    public native SVGAnimatedEnumeration getEdgeMode();
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
    @JsProperty(name = "kernelMatrix")
    public native SVGAnimatedNumberList getKernelMatrix();
    @JsProperty(name = "kernelUnitLengthX")
    public native SVGAnimatedNumber getKernelUnitLengthX();
    @JsProperty(name = "kernelUnitLengthY")
    public native SVGAnimatedNumber getKernelUnitLengthY();
    @JsProperty(name = "orderX")
    public native SVGAnimatedInteger getOrderX();
    @JsProperty(name = "orderY")
    public native SVGAnimatedInteger getOrderY();
    @JsProperty(name = "preserveAlpha")
    public native SVGAnimatedBoolean getPreserveAlpha();
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
    @JsProperty(name = "SVG_EDGEMODE_DUPLICATE")
    public native Number getSVG_EDGEMODE_DUPLICATE();
    @JsProperty(name = "SVG_EDGEMODE_NONE")
    public native Number getSVG_EDGEMODE_NONE();
    @JsProperty(name = "SVG_EDGEMODE_UNKNOWN")
    public native Number getSVG_EDGEMODE_UNKNOWN();
    @JsProperty(name = "SVG_EDGEMODE_WRAP")
    public native Number getSVG_EDGEMODE_WRAP();
    @JsProperty(name = "targetX")
    public native SVGAnimatedInteger getTargetX();
    @JsProperty(name = "targetY")
    public native SVGAnimatedInteger getTargetY();
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
    @JsProperty(name = "bias")
    public native void setBias(SVGAnimatedNumber value);
    @JsProperty(name = "divisor")
    public native void setDivisor(SVGAnimatedNumber value);
    @JsProperty(name = "edgeMode")
    public native void setEdgeMode(SVGAnimatedEnumeration value);
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
    @JsProperty(name = "kernelMatrix")
    public native void setKernelMatrix(SVGAnimatedNumberList value);
    @JsProperty(name = "kernelUnitLengthX")
    public native void setKernelUnitLengthX(SVGAnimatedNumber value);
    @JsProperty(name = "kernelUnitLengthY")
    public native void setKernelUnitLengthY(SVGAnimatedNumber value);
    @JsProperty(name = "orderX")
    public native void setOrderX(SVGAnimatedInteger value);
    @JsProperty(name = "orderY")
    public native void setOrderY(SVGAnimatedInteger value);
    @JsProperty(name = "preserveAlpha")
    public native void setPreserveAlpha(SVGAnimatedBoolean value);
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
    @JsProperty(name = "SVG_EDGEMODE_DUPLICATE")
    public native void setSVG_EDGEMODE_DUPLICATE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_EDGEMODE_NONE")
    public native void setSVG_EDGEMODE_NONE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_EDGEMODE_UNKNOWN")
    public native void setSVG_EDGEMODE_UNKNOWN(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_EDGEMODE_WRAP")
    public native void setSVG_EDGEMODE_WRAP(@DoNotAutobox Number value);
    @JsProperty(name = "targetX")
    public native void setTargetX(SVGAnimatedInteger value);
    @JsProperty(name = "targetY")
    public native void setTargetY(SVGAnimatedInteger value);
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
