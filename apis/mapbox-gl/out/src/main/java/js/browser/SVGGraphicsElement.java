package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGGraphicsElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 601008
  * declared in: tsd/browser/lib.es6.d.ts at pos 601649
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SVGGraphicsElement")
public class SVGGraphicsElement extends SVGElement  implements SVGTests 
{

    /*
        Constructors
    */
    public SVGGraphicsElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public SVGElement farthestViewportElement;

    public Element firstElementChild;

    public Element lastElementChild;

    public SVGElement nearestViewportElement;

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

    public SVGAnimatedTransformList transform;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@601223
     */
    public native SVGRect getBBox();
    /** 
      * tsd/browser/lib.es6.d.ts@601247
     */
    public native SVGMatrix getCTM();
    @JsProperty(name = "farthestViewportElement")
    public native SVGElement getFarthestViewportElement();
    @JsProperty(name = "nearestViewportElement")
    public native SVGElement getNearestViewportElement();
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
      * tsd/browser/lib.es6.d.ts@601272
     */
    public native SVGMatrix getScreenCTM();
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "systemLanguage")
    public native SVGStringList getSystemLanguage();
    @JsProperty(name = "transform")
    public native SVGAnimatedTransformList getTransform();
    /** 
      * tsd/browser/lib.es6.d.ts@601303
     */
    public native SVGMatrix getTransformToElement(SVGElement element);
    /** 
      * tsd/browser/lib.es6.d.ts@735294
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    public native Boolean hasExtension(String extension);
    @JsProperty(name = "farthestViewportElement")
    public native void setFarthestViewportElement(SVGElement value);
    @JsProperty(name = "nearestViewportElement")
    public native void setNearestViewportElement(SVGElement value);
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
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "systemLanguage")
    public native void setSystemLanguage(SVGStringList value);
    @JsProperty(name = "transform")
    public native void setTransform(SVGAnimatedTransformList value);
}
