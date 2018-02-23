package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CSSFontFaceRule
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 293713
  * declared in: tsd/browser/lib.es6.d.ts at pos 293814
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSFontFaceRule")
public class CSSFontFaceRule extends CSSRule 
{

    /*
        Constructors
    */
    public CSSFontFaceRule () {
    } 

    /*
        Properties
    */

    public CSSStyleDeclaration style;

    /*
        Methods
    */
    @JsProperty(name = "style")
    public native CSSStyleDeclaration getStyle();
    @JsProperty(name = "style")
    public native void setStyle(CSSStyleDeclaration value);
}
