package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGClipPathElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 573215
  * declared in: tsd/browser/lib.es6.d.ts at pos 573632
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGClipPathElement")
public class SVGClipPathElement extends SVGGraphicsElement  implements SVGUnitTypes 
{

    /*
        Constructors
    */
    public SVGClipPathElement () {
    } 

    /*
        Properties
    */

    public Number SVG_UNIT_TYPE_OBJECTBOUNDINGBOX;

    public Number SVG_UNIT_TYPE_UNKNOWN;

    public Number SVG_UNIT_TYPE_USERSPACEONUSE;

    public Number childElementCount;

    public HTMLCollection children;

    public SVGAnimatedEnumeration clipPathUnits;

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

    public Element previousElementSibling;

    public SVGStringList requiredExtensions;

    public SVGStringList requiredFeatures;

    public SVGStringList systemLanguage;

    /*
        Methods
    */
    @JsProperty(name = "clipPathUnits")
    public native SVGAnimatedEnumeration getClipPathUnits();
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
    @JsProperty(name = "clipPathUnits")
    public native void setClipPathUnits(SVGAnimatedEnumeration value);
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
}
