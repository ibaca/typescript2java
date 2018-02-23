package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGPolylineElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 620540
  * declared in: tsd/browser/lib.es6.d.ts at pos 620910
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGPolylineElement")
public class SVGPolylineElement extends SVGGraphicsElement  implements SVGAnimatedPoints 
{

    /*
        Constructors
    */
    public SVGPolylineElement () {
    } 

    /*
        Properties
    */

    public SVGPointList animatedPoints;

    public Number childElementCount;

    public HTMLCollection children;

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

    public SVGPointList points;

    public Element previousElementSibling;

    public SVGStringList requiredExtensions;

    public SVGStringList requiredFeatures;

    public SVGStringList systemLanguage;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.SVGAnimatedPoints)
      * inherited from (js.browser.SVGAnimatedPoints)
     */
    @JsProperty(name = "animatedPoints")
    public native SVGPointList getAnimatedPoints();
    /** 
      * inherited from (js.browser.SVGAnimatedPoints)
      * inherited from (js.browser.SVGAnimatedPoints)
     */
    @JsProperty(name = "points")
    public native SVGPointList getPoints();
    /** 
      * inherited from (js.browser.SVGAnimatedPoints)
      * inherited from (js.browser.SVGAnimatedPoints)
     */
    @JsProperty(name = "animatedPoints")
    public native void setAnimatedPoints(SVGPointList value);
    /** 
      * inherited from (js.browser.SVGAnimatedPoints)
      * inherited from (js.browser.SVGAnimatedPoints)
     */
    @JsProperty(name = "points")
    public native void setPoints(SVGPointList value);
}
