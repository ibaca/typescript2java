package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PaymentCurrencyAmount
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 271677

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PaymentCurrencyAmount
{

    /*
        Properties
    */

    public String currency;

    public String currencySystem;

    public String value;

    /*
        Methods
    */
    @JsProperty(name = "currency")
    public native String getCurrency();
    @JsProperty(name = "currencySystem")
    public native String getCurrencySystem();
    @JsProperty(name = "value")
    public native String getValue();
    @JsProperty(name = "currency")
    public native void setCurrency(String value);
    @JsProperty(name = "currencySystem")
    public native void setCurrencySystem(String value);
    @JsProperty(name = "value")
    public native void setValue(String value);
}
