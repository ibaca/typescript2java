package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGZoomAndPan
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 637255
  * declared in: tsd/browser/lib.es6.d.ts at pos 637330
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface SVGZoomAndPan
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.SVGZoomAndPan)
      * inherited from (js.browser.SVGZoomAndPan)
     */
    @JsProperty(name = "zoomAndPan")
    Number getZoomAndPan();
    /** 
      * inherited from (js.browser.SVGZoomAndPan)
      * inherited from (js.browser.SVGZoomAndPan)
     */
    @JsProperty(name = "zoomAndPan")
    void setZoomAndPan(@DoNotAutobox Number value);
}
