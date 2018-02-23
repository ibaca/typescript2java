package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CSSPageRule
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 295290
  * declared in: tsd/browser/lib.es6.d.ts at pos 295478
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSPageRule")
public class CSSPageRule extends CSSRule 
{

    /*
        Constructors
    */
    public CSSPageRule () {
    } 

    /*
        Properties
    */

    public String pseudoClass;

    public String selector;

    public String selectorText;

    public CSSStyleDeclaration style;

    /*
        Methods
    */
    @JsProperty(name = "pseudoClass")
    public native String getPseudoClass();
    @JsProperty(name = "selector")
    public native String getSelector();
    @JsProperty(name = "selectorText")
    public native String getSelectorText();
    @JsProperty(name = "style")
    public native CSSStyleDeclaration getStyle();
    @JsProperty(name = "pseudoClass")
    public native void setPseudoClass(String value);
    @JsProperty(name = "selector")
    public native void setSelector(String value);
    @JsProperty(name = "selectorText")
    public native void setSelectorText(String value);
    @JsProperty(name = "style")
    public native void setStyle(CSSStyleDeclaration value);
}
