package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSCredentialFilter
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 262305

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSCredentialFilter
{

    /*
        Properties
    */

    public Array<MSCredentialSpec> accept;

    /*
        Methods
    */
    @JsProperty(name = "accept")
    public native Array<MSCredentialSpec> getAccept();
    @JsProperty(name = "accept")
    public native void setAccept(Array<MSCredentialSpec> value);
}
