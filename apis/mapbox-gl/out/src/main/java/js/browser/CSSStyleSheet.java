package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CSSStyleSheet
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 309295
  * declared in: tsd/browser/lib.es6.d.ts at pos 310115
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSStyleSheet")
public class CSSStyleSheet extends StyleSheet 
{

    /*
        Constructors
    */
    public CSSStyleSheet () {
    } 

    /*
        Properties
    */

    public CSSRuleList cssRules;

    public String cssText;

    public String id;

    public StyleSheetList imports;

    public Boolean isAlternate;

    public Boolean isPrefAlternate;

    public CSSRule ownerRule;

    public Element owningElement;

    public StyleSheetPageList pages;

    public Boolean readOnly;

    public CSSRuleList rules;

    /*
        Methods
    */
    public native Number addImport(String bstrURL);
    /** 
      * tsd/browser/lib.es6.d.ts@309715
     */
    public native Number addImport(String bstrURL, @DoNotAutobox Number lIndex /* optional */);
    public native Number addPageRule(String bstrSelector, String bstrStyle);
    /** 
      * tsd/browser/lib.es6.d.ts@309772
     */
    public native Number addPageRule(String bstrSelector, String bstrStyle, @DoNotAutobox Number lIndex /* optional */);
    public native Number addRule(String bstrSelector);
    public native Number addRule(String bstrSelector, String bstrStyle /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@309855
     */
    public native Number addRule(String bstrSelector, String bstrStyle /* optional */, @DoNotAutobox Number lIndex /* optional */);
    public native void deleteRule();
    /** 
      * tsd/browser/lib.es6.d.ts@309935
     */
    public native void deleteRule(@DoNotAutobox Number index /* optional */);
    @JsProperty(name = "cssRules")
    public native CSSRuleList getCssRules();
    @JsProperty(name = "cssText")
    public native String getCssText();
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "imports")
    public native StyleSheetList getImports();
    @JsProperty(name = "isAlternate")
    public native Boolean getIsAlternate();
    @JsProperty(name = "isPrefAlternate")
    public native Boolean getIsPrefAlternate();
    @JsProperty(name = "ownerRule")
    public native CSSRule getOwnerRule();
    @JsProperty(name = "owningElement")
    public native Element getOwningElement();
    @JsProperty(name = "pages")
    public native StyleSheetPageList getPages();
    @JsProperty(name = "readOnly")
    public native Boolean getReadOnly();
    @JsProperty(name = "rules")
    public native CSSRuleList getRules();
    public native Number insertRule(String rule);
    /** 
      * tsd/browser/lib.es6.d.ts@309973
     */
    public native Number insertRule(String rule, @DoNotAutobox Number index /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@310027
     */
    public native void removeImport(@DoNotAutobox Number lIndex);
    /** 
      * tsd/browser/lib.es6.d.ts@310067
     */
    public native void removeRule(@DoNotAutobox Number lIndex);
    @JsProperty(name = "cssRules")
    public native void setCssRules(CSSRuleList value);
    @JsProperty(name = "cssText")
    public native void setCssText(String value);
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "imports")
    public native void setImports(StyleSheetList value);
    @JsProperty(name = "isAlternate")
    public native void setIsAlternate(Boolean value);
    @JsProperty(name = "isPrefAlternate")
    public native void setIsPrefAlternate(Boolean value);
    @JsProperty(name = "ownerRule")
    public native void setOwnerRule(CSSRule value);
    @JsProperty(name = "owningElement")
    public native void setOwningElement(Element value);
    @JsProperty(name = "pages")
    public native void setPages(StyleSheetPageList value);
    @JsProperty(name = "readOnly")
    public native void setReadOnly(Boolean value);
    @JsProperty(name = "rules")
    public native void setRules(CSSRuleList value);
}
