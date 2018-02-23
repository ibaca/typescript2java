package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PaymentAddress
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 540951
  * declared in: tsd/browser/lib.es6.d.ts at pos 541372
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PaymentAddress")
public class PaymentAddress
{

    /*
        Constructors
    */
    public PaymentAddress () {
    } 

    /*
        Properties
    */

    public Array<String> addressLine;

    public String city;

    public String country;

    public String dependentLocality;

    public String languageCode;

    public String organization;

    public String phone;

    public String postalCode;

    public String recipient;

    public String region;

    public String sortingCode;

    /*
        Methods
    */
    @JsProperty(name = "addressLine")
    public native Array<String> getAddressLine();
    @JsProperty(name = "city")
    public native String getCity();
    @JsProperty(name = "country")
    public native String getCountry();
    @JsProperty(name = "dependentLocality")
    public native String getDependentLocality();
    @JsProperty(name = "languageCode")
    public native String getLanguageCode();
    @JsProperty(name = "organization")
    public native String getOrganization();
    @JsProperty(name = "phone")
    public native String getPhone();
    @JsProperty(name = "postalCode")
    public native String getPostalCode();
    @JsProperty(name = "recipient")
    public native String getRecipient();
    @JsProperty(name = "region")
    public native String getRegion();
    @JsProperty(name = "sortingCode")
    public native String getSortingCode();
    @JsProperty(name = "addressLine")
    public native void setAddressLine(Array<String> value);
    @JsProperty(name = "city")
    public native void setCity(String value);
    @JsProperty(name = "country")
    public native void setCountry(String value);
    @JsProperty(name = "dependentLocality")
    public native void setDependentLocality(String value);
    @JsProperty(name = "languageCode")
    public native void setLanguageCode(String value);
    @JsProperty(name = "organization")
    public native void setOrganization(String value);
    @JsProperty(name = "phone")
    public native void setPhone(String value);
    @JsProperty(name = "postalCode")
    public native void setPostalCode(String value);
    @JsProperty(name = "recipient")
    public native void setRecipient(String value);
    @JsProperty(name = "region")
    public native void setRegion(String value);
    @JsProperty(name = "sortingCode")
    public native void setSortingCode(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@541343
     */
    public native Object toJSON();
}
