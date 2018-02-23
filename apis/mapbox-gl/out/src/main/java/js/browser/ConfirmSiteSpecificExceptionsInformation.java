package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ConfirmSiteSpecificExceptionsInformation
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 256430

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ConfirmSiteSpecificExceptionsInformation implements ExceptionInformation 
{

    /*
        Properties
    */

    public Array<String> arrayOfDomainStrings;

    public String domain;

    /*
        Methods
    */
    @JsProperty(name = "arrayOfDomainStrings")
    public native Array<String> getArrayOfDomainStrings();
    /** 
      * inherited from (js.browser.ExceptionInformation)
      * inherited from (js.browser.ExceptionInformation)
     */
    @JsProperty(name = "domain")
    public native String getDomain();
    @JsProperty(name = "arrayOfDomainStrings")
    public native void setArrayOfDomainStrings(Array<String> value);
    /** 
      * inherited from (js.browser.ExceptionInformation)
      * inherited from (js.browser.ExceptionInformation)
     */
    @JsProperty(name = "domain")
    public native void setDomain(String value);
}
