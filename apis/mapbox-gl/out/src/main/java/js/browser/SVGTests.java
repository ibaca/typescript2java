package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SVGTests
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 735129
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface SVGTests
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "requiredExtensions")
    SVGStringList getRequiredExtensions();
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "requiredFeatures")
    SVGStringList getRequiredFeatures();
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "systemLanguage")
    SVGStringList getSystemLanguage();
    /** 
      * tsd/browser/lib.es6.d.ts@735294
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    Boolean hasExtension(String extension);
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "requiredExtensions")
    void setRequiredExtensions(SVGStringList value);
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "requiredFeatures")
    void setRequiredFeatures(SVGStringList value);
    /** 
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
      * inherited from (js.browser.SVGTests)
     */
    @JsProperty(name = "systemLanguage")
    void setSystemLanguage(SVGStringList value);
}
