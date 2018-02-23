package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CSSKeyframeRule
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 294393
  * declared in: tsd/browser/lib.es6.d.ts at pos 294515
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSKeyframeRule")
public class CSSKeyframeRule extends CSSRule 
{

    /*
        Constructors
    */
    public CSSKeyframeRule () {
    } 

    /*
        Properties
    */

    public String keyText;

    public CSSStyleDeclaration style;

    /*
        Methods
    */
    @JsProperty(name = "keyText")
    public native String getKeyText();
    @JsProperty(name = "style")
    public native CSSStyleDeclaration getStyle();
    @JsProperty(name = "keyText")
    public native void setKeyText(String value);
    @JsProperty(name = "style")
    public native void setStyle(CSSStyleDeclaration value);
}
