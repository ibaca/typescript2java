package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CSSGroupingRule
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 293895
  * declared in: tsd/browser/lib.es6.d.ts at pos 294081
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSGroupingRule")
public class CSSGroupingRule extends CSSRule 
{

    /*
        Constructors
    */
    public CSSGroupingRule () {
    } 

    /*
        Properties
    */

    public CSSRuleList cssRules;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@293981
     */
    public native void deleteRule(@DoNotAutobox Number index);
    @JsProperty(name = "cssRules")
    public native CSSRuleList getCssRules();
    /** 
      * tsd/browser/lib.es6.d.ts@294018
     */
    public native Number insertRule(String rule, @DoNotAutobox Number index);
    @JsProperty(name = "cssRules")
    public native void setCssRules(CSSRuleList value);
}
