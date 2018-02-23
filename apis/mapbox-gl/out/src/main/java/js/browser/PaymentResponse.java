package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PaymentResponse
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 542697
  * declared in: tsd/browser/lib.es6.d.ts at pos 543082
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentResponse")
public class PaymentResponse
{

    /*
        Constructors
    */
    public PaymentResponse () {
    } 

    /*
        Properties
    */

    public Object details;

    public String methodName;

    public String payerEmail;

    public String payerName;

    public String payerPhone;

    public PaymentAddress shippingAddress;

    public String shippingOption;

    /*
        Methods
    */
    public native Promise<Void> complete();
    /** 
      * tsd/browser/lib.es6.d.ts@543007
     */
    public native Promise<Void> complete(String result /* optional */);
    @JsProperty(name = "details")
    public native Object getDetails();
    @JsProperty(name = "methodName")
    public native String getMethodName();
    @JsProperty(name = "payerEmail")
    public native String getPayerEmail();
    @JsProperty(name = "payerName")
    public native String getPayerName();
    @JsProperty(name = "payerPhone")
    public native String getPayerPhone();
    @JsProperty(name = "shippingAddress")
    public native PaymentAddress getShippingAddress();
    @JsProperty(name = "shippingOption")
    public native String getShippingOption();
    @JsProperty(name = "details")
    public native void setDetails(Object value);
    @JsProperty(name = "methodName")
    public native void setMethodName(String value);
    @JsProperty(name = "payerEmail")
    public native void setPayerEmail(String value);
    @JsProperty(name = "payerName")
    public native void setPayerName(String value);
    @JsProperty(name = "payerPhone")
    public native void setPayerPhone(String value);
    @JsProperty(name = "shippingAddress")
    public native void setShippingAddress(PaymentAddress value);
    @JsProperty(name = "shippingOption")
    public native void setShippingOption(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@543053
     */
    public native Object toJSON();
}
