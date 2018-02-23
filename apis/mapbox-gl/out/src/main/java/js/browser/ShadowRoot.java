package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ShadowRoot
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 743768
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ShadowRoot")
public class ShadowRoot extends DocumentFragment  implements DocumentOrShadowRoot 
{

    /*
        Constructors
    */
    public ShadowRoot () {
    } 

    /*
        Properties
    */

    public Element activeElement;

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public Element host;

    public String innerHTML;

    public Element lastElementChild;

    public StyleSheetList stylesheets;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@743655
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    public native Element elementFromPoint(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/browser/lib.es6.d.ts@743715
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    public native Array<Element> elementsFromPoint(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    @JsProperty(name = "activeElement")
    public native Element getActiveElement();
    @JsProperty(name = "host")
    public native Element getHost();
    @JsProperty(name = "innerHTML")
    public native String getInnerHTML();
    /** 
      * tsd/browser/lib.es6.d.ts@743617
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    public native Selection getSelection();
    /** 
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    @JsProperty(name = "stylesheets")
    public native StyleSheetList getStylesheets();
    /** 
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    @JsProperty(name = "activeElement")
    public native void setActiveElement(Element value);
    @JsProperty(name = "host")
    public native void setHost(Element value);
    @JsProperty(name = "innerHTML")
    public native void setInnerHTML(String value);
    /** 
      * inherited from (js.browser.DocumentOrShadowRoot)
      * inherited from (js.browser.DocumentOrShadowRoot)
     */
    @JsProperty(name = "stylesheets")
    public native void setStylesheets(StyleSheetList value);
}
