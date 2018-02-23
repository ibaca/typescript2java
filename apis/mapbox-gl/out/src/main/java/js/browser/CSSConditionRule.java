package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CSSConditionRule
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 293533
  * declared in: tsd/browser/lib.es6.d.ts at pos 293629
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CSSConditionRule")
public class CSSConditionRule extends CSSGroupingRule 
{

    /*
        Constructors
    */
    public CSSConditionRule () {
    } 

    /*
        Properties
    */

    public String conditionText;

    /*
        Methods
    */
    @JsProperty(name = "conditionText")
    public native String getConditionText();
    @JsProperty(name = "conditionText")
    public native void setConditionText(String value);
}
