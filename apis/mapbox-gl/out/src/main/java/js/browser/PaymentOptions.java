package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PaymentOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 272328

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PaymentOptions
{

    /*
        Properties
    */

    public Boolean requestPayerEmail;

    public Boolean requestPayerName;

    public Boolean requestPayerPhone;

    public Boolean requestShipping;

    public String shippingType;

    /*
        Methods
    */
    @JsProperty(name = "requestPayerEmail")
    public native Boolean getRequestPayerEmail();
    @JsProperty(name = "requestPayerName")
    public native Boolean getRequestPayerName();
    @JsProperty(name = "requestPayerPhone")
    public native Boolean getRequestPayerPhone();
    @JsProperty(name = "requestShipping")
    public native Boolean getRequestShipping();
    @JsProperty(name = "shippingType")
    public native String getShippingType();
    @JsProperty(name = "requestPayerEmail")
    public native void setRequestPayerEmail(Boolean value);
    @JsProperty(name = "requestPayerName")
    public native void setRequestPayerName(Boolean value);
    @JsProperty(name = "requestPayerPhone")
    public native void setRequestPayerPhone(Boolean value);
    @JsProperty(name = "requestShipping")
    public native void setRequestShipping(Boolean value);
    @JsProperty(name = "shippingType")
    public native void setShippingType(String value);
}
