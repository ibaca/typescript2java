package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PaymentShippingOption
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 272577

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PaymentShippingOption
{

    /*
        Properties
    */

    public PaymentCurrencyAmount amount;

    public String id;

    public String label;

    public Boolean selected;

    /*
        Methods
    */
    @JsProperty(name = "amount")
    public native PaymentCurrencyAmount getAmount();
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "label")
    public native String getLabel();
    @JsProperty(name = "selected")
    public native Boolean getSelected();
    @JsProperty(name = "amount")
    public native void setAmount(PaymentCurrencyAmount value);
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "label")
    public native void setLabel(String value);
    @JsProperty(name = "selected")
    public native void setSelected(Boolean value);
}
