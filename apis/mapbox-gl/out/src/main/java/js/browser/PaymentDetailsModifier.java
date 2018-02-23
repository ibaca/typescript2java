package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PaymentDetailsModifier
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 271984

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PaymentDetailsModifier
{

    /*
        Properties
    */

    public Array<PaymentItem> additionalDisplayItems;

    public Object data;

    public Array<String> supportedMethods;

    public PaymentItem total;

    /*
        Methods
    */
    @JsProperty(name = "additionalDisplayItems")
    public native Array<PaymentItem> getAdditionalDisplayItems();
    @JsProperty(name = "data")
    public native Object getData();
    @JsProperty(name = "supportedMethods")
    public native Array<String> getSupportedMethods();
    @JsProperty(name = "total")
    public native PaymentItem getTotal();
    @JsProperty(name = "additionalDisplayItems")
    public native void setAdditionalDisplayItems(Array<PaymentItem> value);
    @JsProperty(name = "data")
    public native void setData(Object value);
    @JsProperty(name = "supportedMethods")
    public native void setSupportedMethods(Array<String> value);
    @JsProperty(name = "total")
    public native void setTotal(PaymentItem value);
}
