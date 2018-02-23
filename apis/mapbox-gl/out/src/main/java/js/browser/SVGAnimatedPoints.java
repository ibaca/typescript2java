package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGAnimatedPoints
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 734641
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface SVGAnimatedPoints
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.SVGAnimatedPoints)
      * inherited from (js.browser.SVGAnimatedPoints)
     */
    @JsProperty(name = "animatedPoints")
    SVGPointList getAnimatedPoints();
    /** 
      * inherited from (js.browser.SVGAnimatedPoints)
      * inherited from (js.browser.SVGAnimatedPoints)
     */
    @JsProperty(name = "points")
    SVGPointList getPoints();
    /** 
      * inherited from (js.browser.SVGAnimatedPoints)
      * inherited from (js.browser.SVGAnimatedPoints)
     */
    @JsProperty(name = "animatedPoints")
    void setAnimatedPoints(SVGPointList value);
    /** 
      * inherited from (js.browser.SVGAnimatedPoints)
      * inherited from (js.browser.SVGAnimatedPoints)
     */
    @JsProperty(name = "points")
    void setPoints(SVGPointList value);
}
