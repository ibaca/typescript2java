package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PaymentItem
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 272140

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PaymentItem
{

    /*
        Properties
    */

    public PaymentCurrencyAmount amount;

    public String label;

    public Boolean pending;

    /*
        Methods
    */
    @JsProperty(name = "amount")
    public native PaymentCurrencyAmount getAmount();
    @JsProperty(name = "label")
    public native String getLabel();
    @JsProperty(name = "pending")
    public native Boolean getPending();
    @JsProperty(name = "amount")
    public native void setAmount(PaymentCurrencyAmount value);
    @JsProperty(name = "label")
    public native void setLabel(String value);
    @JsProperty(name = "pending")
    public native void setPending(Boolean value);
}
