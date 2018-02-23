package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: StoreSiteSpecificExceptionsInformation
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 281085

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class StoreSiteSpecificExceptionsInformation implements StoreExceptionsInformation 
{

    /*
        Properties
    */

    public Array<String> arrayOfDomainStrings;

    public String detailURI;

    public String domain;

    public String explanationString;

    public String siteName;

    /*
        Methods
    */
    @JsProperty(name = "arrayOfDomainStrings")
    public native Array<String> getArrayOfDomainStrings();
    /** 
      * inherited from (js.browser.StoreExceptionsInformation)
     */
    @JsProperty(name = "detailURI")
    public native String getDetailURI();
    /** 
      * inherited from (js.browser.ExceptionInformation)
      * inherited from (js.browser.ExceptionInformation)
     */
    @JsProperty(name = "domain")
    public native String getDomain();
    /** 
      * inherited from (js.browser.StoreExceptionsInformation)
     */
    @JsProperty(name = "explanationString")
    public native String getExplanationString();
    /** 
      * inherited from (js.browser.StoreExceptionsInformation)
     */
    @JsProperty(name = "siteName")
    public native String getSiteName();
    @JsProperty(name = "arrayOfDomainStrings")
    public native void setArrayOfDomainStrings(Array<String> value);
    /** 
      * inherited from (js.browser.StoreExceptionsInformation)
     */
    @JsProperty(name = "detailURI")
    public native void setDetailURI(String value);
    /** 
      * inherited from (js.browser.ExceptionInformation)
      * inherited from (js.browser.ExceptionInformation)
     */
    @JsProperty(name = "domain")
    public native void setDomain(String value);
    /** 
      * inherited from (js.browser.StoreExceptionsInformation)
     */
    @JsProperty(name = "explanationString")
    public native void setExplanationString(String value);
    /** 
      * inherited from (js.browser.StoreExceptionsInformation)
     */
    @JsProperty(name = "siteName")
    public native void setSiteName(String value);
}
