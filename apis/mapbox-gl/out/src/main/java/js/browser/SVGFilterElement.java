package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGFilterElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 598136
  * declared in: tsd/browser/lib.es6.d.ts at pos 598912
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGFilterElement")
public class SVGFilterElement extends SVGElement  implements SVGUnitTypes, SVGURIReference 
{

    /*
        Constructors
    */
    public SVGFilterElement () {
    } 

    /*
        Properties
    */

    public Number SVG_UNIT_TYPE_OBJECTBOUNDINGBOX;

    public Number SVG_UNIT_TYPE_UNKNOWN;

    public Number SVG_UNIT_TYPE_USERSPACEONUSE;

    public Number childElementCount;

    public HTMLCollection children;

    public SVGAnimatedInteger filterResX;

    public SVGAnimatedInteger filterResY;

    public SVGAnimatedEnumeration filterUnits;

    public Element firstElementChild;

    public SVGAnimatedLength height;

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

    public SVGAnimatedEnumeration primitiveUnits;

    public SVGAnimatedLength width;

    public SVGAnimatedLength x;

    public SVGAnimatedLength y;

    /*
        Methods
    */
    @JsProperty(name = "filterResX")
    public native SVGAnimatedInteger getFilterResX();
    @JsProperty(name = "filterResY")
    public native SVGAnimatedInteger getFilterResY();
    @JsProperty(name = "filterUnits")
    public native SVGAnimatedEnumeration getFilterUnits();
    @JsProperty(name = "height")
    public native SVGAnimatedLength getHeight();
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
    @JsProperty(name = "primitiveUnits")
    public native SVGAnimatedEnumeration getPrimitiveUnits();
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
    @JsProperty(name = "width")
    public native SVGAnimatedLength getWidth();
    @JsProperty(name = "x")
    public native SVGAnimatedLength getX();
    @JsProperty(name = "y")
    public native SVGAnimatedLength getY();
    /** 
      * tsd/browser/lib.es6.d.ts@598563
     */
    public native void setFilterRes(@DoNotAutobox Number filterResX, @DoNotAutobox Number filterResY);
    @JsProperty(name = "filterResX")
    public native void setFilterResX(SVGAnimatedInteger value);
    @JsProperty(name = "filterResY")
    public native void setFilterResY(SVGAnimatedInteger value);
    @JsProperty(name = "filterUnits")
    public native void setFilterUnits(SVGAnimatedEnumeration value);
    @JsProperty(name = "height")
    public native void setHeight(SVGAnimatedLength value);
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
    @JsProperty(name = "primitiveUnits")
    public native void setPrimitiveUnits(SVGAnimatedEnumeration value);
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
    @JsProperty(name = "width")
    public native void setWidth(SVGAnimatedLength value);
    @JsProperty(name = "x")
    public native void setX(SVGAnimatedLength value);
    @JsProperty(name = "y")
    public native void setY(SVGAnimatedLength value);
}
