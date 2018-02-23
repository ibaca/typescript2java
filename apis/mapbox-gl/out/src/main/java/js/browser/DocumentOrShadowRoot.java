package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DocumentOrShadowRoot
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 743492
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface DocumentOrShadowRoot
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@743655
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    Element elementFromPoint(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@743715
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    Array<Element> elementsFromPoint(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    @JsProperty(name = "activeElement")
    Element getActiveElement();
    /** 
      * tsd/browser/lib.es6.d.ts@743617
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    Selection getSelection();
    /** 
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    @JsProperty(name = "stylesheets")
    StyleSheetList getStylesheets();
    /** 
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    @JsProperty(name = "activeElement")
    void setActiveElement(Element value);
    /** 
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    @JsProperty(name = "stylesheets")
    void setStylesheets(StyleSheetList value);
}
