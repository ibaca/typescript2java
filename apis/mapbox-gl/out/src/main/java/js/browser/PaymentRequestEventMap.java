package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PaymentRequestEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 541450

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PaymentRequestEventMap
{

    /*
        Properties
    */

    public Event shippingaddresschange;

    public Event shippingoptionchange;

    /*
        Methods
    */
    @JsProperty(name = "shippingaddresschange")
    public native Event getShippingaddresschange();
    @JsProperty(name = "shippingoptionchange")
    public native Event getShippingoptionchange();
    @JsProperty(name = "shippingaddresschange")
    public native void setShippingaddresschange(Event value);
    @JsProperty(name = "shippingoptionchange")
    public native void setShippingoptionchange(Event value);
}
