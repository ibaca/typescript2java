package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PaymentRequest
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 541559
  * declared in: tsd/browser/lib.es6.d.ts at pos 542249
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentRequest")
public class PaymentRequest extends EventTarget 
{

    /*
        Constructors
    */
    public PaymentRequest (Array<PaymentMethodData> methodData, PaymentDetails details, PaymentOptions options /* optional */) {
    } 
    public PaymentRequest (Array<PaymentMethodData> methodData, PaymentDetails details) {
    } 

    /*
        Properties
    */

    public Function1<Event, Object> onshippingaddresschange;

    public Function1<Event, Object> onshippingoptionchange;

    public PaymentAddress shippingAddress;

    public String shippingOption;

    public String shippingType;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@541892
     */
    public native Promise<Void> abort();
    @JsProperty(name = "onshippingaddresschange")
    public native Function1<Event, Object> getOnshippingaddresschange();
    @JsProperty(name = "onshippingoptionchange")
    public native Function1<Event, Object> getOnshippingoptionchange();
    @JsProperty(name = "shippingAddress")
    public native PaymentAddress getShippingAddress();
    @JsProperty(name = "shippingOption")
    public native String getShippingOption();
    @JsProperty(name = "shippingType")
    public native String getShippingType();
    @JsProperty(name = "onshippingaddresschange")
    public native void setOnshippingaddresschange(Function1<Event, Object> value);
    @JsProperty(name = "onshippingoptionchange")
    public native void setOnshippingoptionchange(Function1<Event, Object> value);
    @JsProperty(name = "shippingAddress")
    public native void setShippingAddress(PaymentAddress value);
    @JsProperty(name = "shippingOption")
    public native void setShippingOption(String value);
    @JsProperty(name = "shippingType")
    public native void setShippingType(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@541920
     */
    public native Promise<PaymentResponse> show();
}
