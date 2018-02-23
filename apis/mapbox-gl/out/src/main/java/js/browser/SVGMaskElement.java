package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGMaskElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 606722
  * declared in: tsd/browser/lib.es6.d.ts at pos 607333
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGMaskElement")
public class SVGMaskElement extends SVGElement  implements SVGTests, SVGUnitTypes 
{

    /*
        Constructors
    */
    public SVGMaskElement () {
    } 

    /*
        Properties
    */

    public Number SVG_UNIT_TYPE_OBJECTBOUNDINGBOX;

    public Number SVG_UNIT_TYPE_UNKNOWN;

    public Number SVG_UNIT_TYPE_USERSPACEONUSE;

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public SVGAnimatedLength height;

    public Element lastElementChild;

    public SVGAnimatedEnumeration maskContentUnits;

    public SVGAnimatedEnumeration maskUnits;

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

    public SVGAnimatedLength width;

    public SVGAnimatedLength x;

    public SVGAnimatedLength y;

    /*
        Methods
    */
    @JsProperty(name = "height")
    public native SVGAnimatedLength getHeight();
    @JsProperty(name = "maskContentUnits")
    public native SVGAnimatedEnumeration getMaskContentUnits();
    @JsProperty(name = "maskUnits")
    public native SVGAnimatedEnumeration getMaskUnits();
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "requiredExtensions")
    public native SVGStringList getRequiredExtensions();
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "requiredFeatures")
    public native SVGStringList getRequiredFeatures();
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
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "systemLanguage")
    public native SVGStringList getSystemLanguage();
    @JsProperty(name = "width")
    public native SVGAnimatedLength getWidth();
    @JsProperty(name = "x")
    public native SVGAnimatedLength getX();
    @JsProperty(name = "y")
    public native SVGAnimatedLength getY();
    /** 
      * tsd/browser/lib.es6.d.ts@735294
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    public native Boolean hasExtension(String extension);
    @JsProperty(name = "height")
    public native void setHeight(SVGAnimatedLength value);
    @JsProperty(name = "maskContentUnits")
    public native void setMaskContentUnits(SVGAnimatedEnumeration value);
    @JsProperty(name = "maskUnits")
    public native void setMaskUnits(SVGAnimatedEnumeration value);
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "requiredExtensions")
    public native void setRequiredExtensions(SVGStringList value);
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "requiredFeatures")
    public native void setRequiredFeatures(SVGStringList value);
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
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "systemLanguage")
    public native void setSystemLanguage(SVGStringList value);
    @JsProperty(name = "width")
    public native void setWidth(SVGAnimatedLength value);
    @JsProperty(name = "x")
    public native void setX(SVGAnimatedLength value);
    @JsProperty(name = "y")
    public native void setY(SVGAnimatedLength value);
}
