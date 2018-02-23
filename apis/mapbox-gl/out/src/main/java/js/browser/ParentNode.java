package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ParentNode
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 743292
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface ParentNode
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "childElementCount")
    Number getChildElementCount();
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "children")
    HTMLCollection getChildren();
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "firstElementChild")
    Element getFirstElementChild();
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "lastElementChild")
    Element getLastElementChild();
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "childElementCount")
    void setChildElementCount(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "children")
    void setChildren(HTMLCollection value);
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "firstElementChild")
    void setFirstElementChild(Element value);
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "lastElementChild")
    void setLastElementChild(Element value);
}
