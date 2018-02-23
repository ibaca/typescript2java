package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CSSKeyframesRule
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 294596
  * declared in: tsd/browser/lib.es6.d.ts at pos 294828
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSKeyframesRule")
public class CSSKeyframesRule extends CSSRule 
{

    /*
        Constructors
    */
    public CSSKeyframesRule () {
    } 

    /*
        Properties
    */

    public CSSRuleList cssRules;

    public String name;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@294701
     */
    public native void appendRule(String rule);
    /** 
      * tsd/browser/lib.es6.d.ts@294737
     */
    public native void deleteRule(String rule);
    /** 
      * tsd/browser/lib.es6.d.ts@294773
     */
    public native CSSKeyframeRule findRule(String rule);
    @JsProperty(name = "cssRules")
    public native CSSRuleList getCssRules();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "cssRules")
    public native void setCssRules(CSSRuleList value);
    @JsProperty(name = "name")
    public native void setName(String value);
}
