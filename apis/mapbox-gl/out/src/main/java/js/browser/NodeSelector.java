package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: NodeSelector
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 734209
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface NodeSelector
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@734337
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
     */
    Element querySelector(String selectors);
    /** 
      * tsd/browser/lib.es6.d.ts@734492
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
     */
    NodeListOf<Element> querySelectorAll(String selectors);
}
