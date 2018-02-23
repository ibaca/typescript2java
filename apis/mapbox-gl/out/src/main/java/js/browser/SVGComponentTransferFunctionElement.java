package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGComponentTransferFunctionElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 573722
  * declared in: tsd/browser/lib.es6.d.ts at pos 574749
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGComponentTransferFunctionElement")
public class SVGComponentTransferFunctionElement extends SVGElement 
{

    /*
        Constructors
    */
    public SVGComponentTransferFunctionElement () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="SVGComponentTransferFunctionElement", name="SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE")
    public static Number SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE;

    @JsProperty(namespace="SVGComponentTransferFunctionElement", name="SVG_FECOMPONENTTRANSFER_TYPE_GAMMA")
    public static Number SVG_FECOMPONENTTRANSFER_TYPE_GAMMA;

    @JsProperty(namespace="SVGComponentTransferFunctionElement", name="SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY")
    public static Number SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY;

    @JsProperty(namespace="SVGComponentTransferFunctionElement", name="SVG_FECOMPONENTTRANSFER_TYPE_LINEAR")
    public static Number SVG_FECOMPONENTTRANSFER_TYPE_LINEAR;

    @JsProperty(namespace="SVGComponentTransferFunctionElement", name="SVG_FECOMPONENTTRANSFER_TYPE_TABLE")
    public static Number SVG_FECOMPONENTTRANSFER_TYPE_TABLE;

    @JsProperty(namespace="SVGComponentTransferFunctionElement", name="SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN")
    public static Number SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN;

    /*
        Properties
    */

    public SVGAnimatedNumber amplitude;

    public Number childElementCount;

    public HTMLCollection children;

    public SVGAnimatedNumber exponent;

    public Element firstElementChild;

    public SVGAnimatedNumber intercept;

    public Element lastElementChild;

    public Element nextElementSibling;

    public SVGAnimatedNumber offset;

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

    public SVGAnimatedNumber slope;

    public SVGAnimatedNumberList tableValues;

    public SVGAnimatedEnumeration type;

    /*
        Methods
    */
    @JsProperty(name = "amplitude")
    public native SVGAnimatedNumber getAmplitude();
    @JsProperty(name = "exponent")
    public native SVGAnimatedNumber getExponent();
    @JsProperty(name = "intercept")
    public native SVGAnimatedNumber getIntercept();
    @JsProperty(name = "offset")
    public native SVGAnimatedNumber getOffset();
    @JsProperty(name = "SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE")
    public native Number getSVG_FECOMPONENTTRANSFER_TYPE_DISCRETE();
    @JsProperty(name = "SVG_FECOMPONENTTRANSFER_TYPE_GAMMA")
    public native Number getSVG_FECOMPONENTTRANSFER_TYPE_GAMMA();
    @JsProperty(name = "SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY")
    public native Number getSVG_FECOMPONENTTRANSFER_TYPE_IDENTITY();
    @JsProperty(name = "SVG_FECOMPONENTTRANSFER_TYPE_LINEAR")
    public native Number getSVG_FECOMPONENTTRANSFER_TYPE_LINEAR();
    @JsProperty(name = "SVG_FECOMPONENTTRANSFER_TYPE_TABLE")
    public native Number getSVG_FECOMPONENTTRANSFER_TYPE_TABLE();
    @JsProperty(name = "SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN")
    public native Number getSVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN();
    @JsProperty(name = "slope")
    public native SVGAnimatedNumber getSlope();
    @JsProperty(name = "tableValues")
    public native SVGAnimatedNumberList getTableValues();
    @JsProperty(name = "type")
    public native SVGAnimatedEnumeration getType();
    @JsProperty(name = "amplitude")
    public native void setAmplitude(SVGAnimatedNumber value);
    @JsProperty(name = "exponent")
    public native void setExponent(SVGAnimatedNumber value);
    @JsProperty(name = "intercept")
    public native void setIntercept(SVGAnimatedNumber value);
    @JsProperty(name = "offset")
    public native void setOffset(SVGAnimatedNumber value);
    @JsProperty(name = "SVG_FECOMPONENTTRANSFER_TYPE_DISCRETE")
    public native void setSVG_FECOMPONENTTRANSFER_TYPE_DISCRETE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FECOMPONENTTRANSFER_TYPE_GAMMA")
    public native void setSVG_FECOMPONENTTRANSFER_TYPE_GAMMA(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FECOMPONENTTRANSFER_TYPE_IDENTITY")
    public native void setSVG_FECOMPONENTTRANSFER_TYPE_IDENTITY(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FECOMPONENTTRANSFER_TYPE_LINEAR")
    public native void setSVG_FECOMPONENTTRANSFER_TYPE_LINEAR(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FECOMPONENTTRANSFER_TYPE_TABLE")
    public native void setSVG_FECOMPONENTTRANSFER_TYPE_TABLE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN")
    public native void setSVG_FECOMPONENTTRANSFER_TYPE_UNKNOWN(@DoNotAutobox Number value);
    @JsProperty(name = "slope")
    public native void setSlope(SVGAnimatedNumber value);
    @JsProperty(name = "tableValues")
    public native void setTableValues(SVGAnimatedNumberList value);
    @JsProperty(name = "type")
    public native void setType(SVGAnimatedEnumeration value);
}
