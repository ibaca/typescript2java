package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ElementTraversal
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 729275
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface ElementTraversal
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "childElementCount")
    Number getChildElementCount();
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "firstElementChild")
    Element getFirstElementChild();
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "lastElementChild")
    Element getLastElementChild();
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "nextElementSibling")
    Element getNextElementSibling();
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "previousElementSibling")
    Element getPreviousElementSibling();
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "childElementCount")
    void setChildElementCount(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "firstElementChild")
    void setFirstElementChild(Element value);
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "lastElementChild")
    void setLastElementChild(Element value);
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "nextElementSibling")
    void setNextElementSibling(Element value);
    /** 
      * inherited from (js.browser.ElementTraversal)
     */
    @JsProperty(name = "previousElementSibling")
    void setPreviousElementSibling(Element value);
}
