package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGMarkerElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 605322
  * declared in: tsd/browser/lib.es6.d.ts at pos 606350
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGMarkerElement")
public class SVGMarkerElement extends SVGElement  implements SVGFitToViewBox 
{

    /*
        Constructors
    */
    public SVGMarkerElement () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="SVGMarkerElement", name="SVG_MARKERUNITS_STROKEWIDTH")
    public static Number SVG_MARKERUNITS_STROKEWIDTH;

    @JsProperty(namespace="SVGMarkerElement", name="SVG_MARKERUNITS_UNKNOWN")
    public static Number SVG_MARKERUNITS_UNKNOWN;

    @JsProperty(namespace="SVGMarkerElement", name="SVG_MARKERUNITS_USERSPACEONUSE")
    public static Number SVG_MARKERUNITS_USERSPACEONUSE;

    @JsProperty(namespace="SVGMarkerElement", name="SVG_MARKER_ORIENT_ANGLE")
    public static Number SVG_MARKER_ORIENT_ANGLE;

    @JsProperty(namespace="SVGMarkerElement", name="SVG_MARKER_ORIENT_AUTO")
    public static Number SVG_MARKER_ORIENT_AUTO;

    @JsProperty(namespace="SVGMarkerElement", name="SVG_MARKER_ORIENT_UNKNOWN")
    public static Number SVG_MARKER_ORIENT_UNKNOWN;

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public Element lastElementChild;

    public SVGAnimatedLength markerHeight;

    public SVGAnimatedEnumeration markerUnits;

    public SVGAnimatedLength markerWidth;

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

    public SVGAnimatedAngle orientAngle;

    public SVGAnimatedEnumeration orientType;

    public SVGAnimatedPreserveAspectRatio preserveAspectRatio;

    public Element previousElementSibling;

    public SVGAnimatedLength refX;

    public SVGAnimatedLength refY;

    public SVGAnimatedRect viewBox;

    /*
        Methods
    */
    @JsProperty(name = "markerHeight")
    public native SVGAnimatedLength getMarkerHeight();
    @JsProperty(name = "markerUnits")
    public native SVGAnimatedEnumeration getMarkerUnits();
    @JsProperty(name = "markerWidth")
    public native SVGAnimatedLength getMarkerWidth();
    @JsProperty(name = "orientAngle")
    public native SVGAnimatedAngle getOrientAngle();
    @JsProperty(name = "orientType")
    public native SVGAnimatedEnumeration getOrientType();
    /** 
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
     */
    @JsProperty(name = "preserveAspectRatio")
    public native SVGAnimatedPreserveAspectRatio getPreserveAspectRatio();
    @JsProperty(name = "refX")
    public native SVGAnimatedLength getRefX();
    @JsProperty(name = "refY")
    public native SVGAnimatedLength getRefY();
    @JsProperty(name = "SVG_MARKERUNITS_STROKEWIDTH")
    public native Number getSVG_MARKERUNITS_STROKEWIDTH();
    @JsProperty(name = "SVG_MARKERUNITS_UNKNOWN")
    public native Number getSVG_MARKERUNITS_UNKNOWN();
    @JsProperty(name = "SVG_MARKERUNITS_USERSPACEONUSE")
    public native Number getSVG_MARKERUNITS_USERSPACEONUSE();
    @JsProperty(name = "SVG_MARKER_ORIENT_ANGLE")
    public native Number getSVG_MARKER_ORIENT_ANGLE();
    @JsProperty(name = "SVG_MARKER_ORIENT_AUTO")
    public native Number getSVG_MARKER_ORIENT_AUTO();
    @JsProperty(name = "SVG_MARKER_ORIENT_UNKNOWN")
    public native Number getSVG_MARKER_ORIENT_UNKNOWN();
    /** 
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
     */
    @JsProperty(name = "viewBox")
    public native SVGAnimatedRect getViewBox();
    @JsProperty(name = "markerHeight")
    public native void setMarkerHeight(SVGAnimatedLength value);
    @JsProperty(name = "markerUnits")
    public native void setMarkerUnits(SVGAnimatedEnumeration value);
    @JsProperty(name = "markerWidth")
    public native void setMarkerWidth(SVGAnimatedLength value);
    @JsProperty(name = "orientAngle")
    public native void setOrientAngle(SVGAnimatedAngle value);
    /** 
      * tsd/browser/lib.es6.d.ts@605703
     */
    public native void setOrientToAngle(SVGAngle angle);
    /** 
      * tsd/browser/lib.es6.d.ts@605748
     */
    public native void setOrientToAuto();
    @JsProperty(name = "orientType")
    public native void setOrientType(SVGAnimatedEnumeration value);
    /** 
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
     */
    @JsProperty(name = "preserveAspectRatio")
    public native void setPreserveAspectRatio(SVGAnimatedPreserveAspectRatio value);
    @JsProperty(name = "refX")
    public native void setRefX(SVGAnimatedLength value);
    @JsProperty(name = "refY")
    public native void setRefY(SVGAnimatedLength value);
    @JsProperty(name = "SVG_MARKERUNITS_STROKEWIDTH")
    public native void setSVG_MARKERUNITS_STROKEWIDTH(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_MARKERUNITS_UNKNOWN")
    public native void setSVG_MARKERUNITS_UNKNOWN(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_MARKERUNITS_USERSPACEONUSE")
    public native void setSVG_MARKERUNITS_USERSPACEONUSE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_MARKER_ORIENT_ANGLE")
    public native void setSVG_MARKER_ORIENT_ANGLE(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_MARKER_ORIENT_AUTO")
    public native void setSVG_MARKER_ORIENT_AUTO(@DoNotAutobox Number value);
    @JsProperty(name = "SVG_MARKER_ORIENT_UNKNOWN")
    public native void setSVG_MARKER_ORIENT_UNKNOWN(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
      * inherited from (js.browser.SVGFitToViewBox)
     */
    @JsProperty(name = "viewBox")
    public native void setViewBox(SVGAnimatedRect value);
}
