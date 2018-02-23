package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSSignatureParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 265135

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSSignatureParameters
{

    /*
        Properties
    */

    public String userPrompt;

    /*
        Methods
    */
    @JsProperty(name = "userPrompt")
    public native String getUserPrompt();
    @JsProperty(name = "userPrompt")
    public native void setUserPrompt(String value);
}
