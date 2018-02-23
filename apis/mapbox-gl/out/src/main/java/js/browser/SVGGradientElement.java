package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGGradientElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 600017
  * declared in: tsd/browser/lib.es6.d.ts at pos 600735
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGGradientElement")
public class SVGGradientElement extends SVGElement  implements SVGUnitTypes, SVGURIReference 
{

    /*
        Constructors
    */
    public SVGGradientElement () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="SVGGradientElement", name="SVG_SPREADMETHOD_PAD")
    public static Number SVG_SPREADMETHOD_PAD;

    @JsProperty(namespace="SVGGradientElement", name="SVG_SPREADMETHOD_REFLECT")
    public static Number SVG_SPREADMETHOD_REFLECT;

    @JsProperty(namespace="SVGGradientElement", name="SVG_SPREADMETHOD_REPEAT")
    public static Number SVG_SPREADMETHOD_REPEAT;

    @JsProperty(namespace="SVGGradientElement", name="SVG_SPREADMETHOD_UNKNOWN")
    public static Number SVG_SPREADMETHOD_UNKNOWN;

    /*
        Properties
    */

    public Number SVG_UNIT_TYPE_OBJECTBOUNDINGBOX;

    public Number SVG_UNIT_TYPE_UNKNOWN;

    public Number SVG_UNIT_TYPE_USERSPACEONUSE;

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public SVGAnimatedTransformList gradientTransform;

    public SVGAnimatedEnumeration gradientUnits;

    public SVGAnimatedString href;

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

    public Element previousElementSibling;

    public SVGAnimatedEnumeration spreadMethod;

    /*
        Methods
    */
    @JsProperty(name = "gradientTransform")
    public native SVGAnimatedTransformList getGradientTransform();
    @JsProperty(name = "gradientUnits")
    public native SVGAnimatedEnumeration getGradientUnits();
    /** 
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
     */
    @JsProperty(name = "href")
    public native SVGAnimatedString getHref();
    @JsProperty(name = "SVG_SPREADMETHOD_PAD")
    public native Number getSVG_SPREADMETHOD_PAD();
    @JsProperty(name = "SVG_SPREADMETHOD_REFLECT")
    public native Number getSVG_SPREADMETHOD_REFLECT();
    @JsProperty(name = "SVG_SPREADMETHOD_REPEAT")
    public native Number getSVG_SPREADMETHOD_REPEAT();
    @JsProperty(name = "SVG_SPREADMETHOD_UNKNOWN")
    public native Number getSVG_SPREADMETHOD_UNKNOWN();
    /** 
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
     */
    @JsProperty(name = "SVG_UNIT_TYPE_OBJECTBOUNDINGBOX")
    public native Number getSVG_UNIT_TYPE_OBJECTBOUNDINGBOX();
    /** 
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
     */
    @JsProperty(name = "SVG_UNIT_TYPE_UNKNOWN")
    public native Number getSVG_UNIT_TYPE_UNKNOWN();
    /** 
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
     */
    @JsProperty(name = "SVG_UNIT_TYPE_USERSPACEONUSE")
    public native Number getSVG_UNIT_TYPE_USERSPACEONUSE();
    @JsProperty(name = "spreadMethod")
    public native SVGAnimatedEnumeration getSpreadMethod();
    @JsProperty(name = "gradientTransform")
    public native void setGradientTransform(SVGAnimatedTransformList value);
    @JsProperty(name = "gradientUnits")
    public native void setGradientUnits(SVGAnimatedEnumeration value);
    /** 
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
      * inherited from (js.browser.SVGURIReference)
     */
    @JsProperty(name = "href")
    public native void setHref(SVGAnimatedString value);
    @JsProperty(name = "SVG_SPREADMETHOD_PAD")
    public native void setSVG_SPREADMETHOD_PAD(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_SPREADMETHOD_REFLECT")
    public native void setSVG_SPREADMETHOD_REFLECT(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_SPREADMETHOD_REPEAT")
    public native void setSVG_SPREADMETHOD_REPEAT(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_SPREADMETHOD_UNKNOWN")
    public native void setSVG_SPREADMETHOD_UNKNOWN(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
     */
    @JsProperty(name = "SVG_UNIT_TYPE_OBJECTBOUNDINGBOX")
    public native void setSVG_UNIT_TYPE_OBJECTBOUNDINGBOX(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
     */
    @JsProperty(name = "SVG_UNIT_TYPE_UNKNOWN")
    public native void setSVG_UNIT_TYPE_UNKNOWN(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
      * inherited from (js.browser.SVGUnitTypes)
     */
    @JsProperty(name = "SVG_UNIT_TYPE_USERSPACEONUSE")
    public native void setSVG_UNIT_TYPE_USERSPACEONUSE(@DoNotAutobox Number value);
    @JsProperty(name = "spreadMethod")
    public native void setSpreadMethod(SVGAnimatedEnumeration value);
}
