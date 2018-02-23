package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RegistrationOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 279759

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RegistrationOptions
{

    /*
        Properties
    */

    public String scope;

    /*
        Methods
    */
    @JsProperty(name = "scope")
    public native String getScope();
    @JsProperty(name = "scope")
    public native void setScope(String value);
}
