package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PaymentDetails
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 271786

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PaymentDetails
{

    /*
        Properties
    */

    public Array<PaymentItem> displayItems;

    public String error;

    public Array<PaymentDetailsModifier> modifiers;

    public Array<PaymentShippingOption> shippingOptions;

    public PaymentItem total;

    /*
        Methods
    */
    @JsProperty(name = "displayItems")
    public native Array<PaymentItem> getDisplayItems();
    @JsProperty(name = "error")
    public native String getError();
    @JsProperty(name = "modifiers")
    public native Array<PaymentDetailsModifier> getModifiers();
    @JsProperty(name = "shippingOptions")
    public native Array<PaymentShippingOption> getShippingOptions();
    @JsProperty(name = "total")
    public native PaymentItem getTotal();
    @JsProperty(name = "displayItems")
    public native void setDisplayItems(Array<PaymentItem> value);
    @JsProperty(name = "error")
    public native void setError(String value);
    @JsProperty(name = "modifiers")
    public native void setModifiers(Array<PaymentDetailsModifier> value);
    @JsProperty(name = "shippingOptions")
    public native void setShippingOptions(Array<PaymentShippingOption> value);
    @JsProperty(name = "total")
    public native void setTotal(PaymentItem value);
}
