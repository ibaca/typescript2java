package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ScopedCredentialOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 280299

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ScopedCredentialOptions
{

    /*
        Properties
    */

    public Array<ScopedCredentialDescriptor> excludeList;

    public WebAuthnExtensions extensions;

    public String rpId;

    public Number timeoutSeconds;

    /*
        Methods
    */
    @JsProperty(name = "excludeList")
    public native Array<ScopedCredentialDescriptor> getExcludeList();
    @JsProperty(name = "extensions")
    public native WebAuthnExtensions getExtensions();
    @JsProperty(name = "rpId")
    public native String getRpId();
    @JsProperty(name = "timeoutSeconds")
    public native Number getTimeoutSeconds();
    @JsProperty(name = "excludeList")
    public native void setExcludeList(Array<ScopedCredentialDescriptor> value);
    @JsProperty(name = "extensions")
    public native void setExtensions(WebAuthnExtensions value);
    @JsProperty(name = "rpId")
    public native void setRpId(String value);
    @JsProperty(name = "timeoutSeconds")
    public native void setTimeoutSeconds(@DoNotAutobox Number value);
}
