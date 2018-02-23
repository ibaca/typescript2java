package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DocumentFragment
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 363380
  * declared in: tsd/browser/lib.es6.d.ts at pos 363464
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DocumentFragment")
public class DocumentFragment extends Node  implements NodeSelector, ParentNode 
{

    /*
        Constructors
    */
    public DocumentFragment () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public Element lastElementChild;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "childElementCount")
    public native Number getChildElementCount();
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "children")
    public native HTMLCollection getChildren();
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "firstElementChild")
    public native Element getFirstElementChild();
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "lastElementChild")
    public native Element getLastElementChild();
    /** 
      * tsd/browser/lib.es6.d.ts@734337
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
     */
    public native Element querySelector(String selectors);
    /** 
      * tsd/browser/lib.es6.d.ts@734492
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
      * inherited from (js.browser.NodeSelector)
     */
    public native NodeListOf<Element> querySelectorAll(String selectors);
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "childElementCount")
    public native void setChildElementCount(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "children")
    public native void setChildren(HTMLCollection value);
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "firstElementChild")
    public native void setFirstElementChild(Element value);
    /** 
      * inherited from (js.browser.ParentNode)
      * inherited from (js.browser.ParentNode)
     */
    @JsProperty(name = "lastElementChild")
    public native void setLastElementChild(Element value);
}
