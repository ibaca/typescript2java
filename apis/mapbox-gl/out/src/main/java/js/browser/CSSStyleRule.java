package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CSSStyleRule
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 309067
  * declared in: tsd/browser/lib.es6.d.ts at pos 309223
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSStyleRule")
public class CSSStyleRule extends CSSRule 
{

    /*
        Constructors
    */
    public CSSStyleRule () {
    } 

    /*
        Properties
    */

    public Boolean readOnly;

    public String selectorText;

    public CSSStyleDeclaration style;

    /*
        Methods
    */
    @JsProperty(name = "readOnly")
    public native Boolean getReadOnly();
    @JsProperty(name = "selectorText")
    public native String getSelectorText();
    @JsProperty(name = "style")
    public native CSSStyleDeclaration getStyle();
    @JsProperty(name = "readOnly")
    public native void setReadOnly(Boolean value);
    @JsProperty(name = "selectorText")
    public native void setSelectorText(String value);
    @JsProperty(name = "style")
    public native void setStyle(CSSStyleDeclaration value);
}
