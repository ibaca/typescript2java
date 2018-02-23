package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: CanvasPathMethods
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 723194
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface CanvasPathMethods
{

    /*
        Methods
    */
    void arc(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number radius, @DoNotAutobox Number startAngle, @DoNotAutobox Number endAngle);
    /** 
      * tsd/browser/lib.es6.d.ts@723230
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    void arc(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number radius, @DoNotAutobox Number startAngle, @DoNotAutobox Number endAngle, Boolean anticlockwise /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@723346
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    void arcTo(@DoNotAutobox Number x1, @DoNotAutobox Number y1, @DoNotAutobox Number x2, @DoNotAutobox Number y2, @DoNotAutobox Number radius);
    /** 
      * tsd/browser/lib.es6.d.ts@723427
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    void bezierCurveTo(@DoNotAutobox Number cp1x, @DoNotAutobox Number cp1y, @DoNotAutobox Number cp2x, @DoNotAutobox Number cp2y, @DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@723530
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    void closePath();
    void ellipse(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number radiusX, @DoNotAutobox Number radiusY, @DoNotAutobox Number rotation, @DoNotAutobox Number startAngle, @DoNotAutobox Number endAngle);
    /** 
      * tsd/browser/lib.es6.d.ts@723553
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    void ellipse(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number radiusX, @DoNotAutobox Number radiusY, @DoNotAutobox Number rotation, @DoNotAutobox Number startAngle, @DoNotAutobox Number endAngle, Boolean anticlockwise /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@723709
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    void lineTo(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@723749
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    void moveTo(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@723789
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    void quadraticCurveTo(@DoNotAutobox Number cpx, @DoNotAutobox Number cpy, @DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@723865
      * inherited from (js.browser.CanvasPathMethods)
      * inherited from (js.browser.CanvasPathMethods)
     */
    void rect(@DoNotAutobox Number x, @DoNotAutobox Number y, @DoNotAutobox Number w, @DoNotAutobox Number h);
}
