package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WebAuthnAssertion
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 665027
  * declared in: tsd/browser/lib.es6.d.ts at pos 665236
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebAuthnAssertion")
public class WebAuthnAssertion
{

    /*
        Constructors
    */
    public WebAuthnAssertion () {
    } 

    /*
        Properties
    */

    public ArrayBuffer authenticatorData;

    public ArrayBuffer clientData;

    public ScopedCredential credential;

    public ArrayBuffer signature;

    /*
        Methods
    */
    @JsProperty(name = "authenticatorData")
    public native ArrayBuffer getAuthenticatorData();
    @JsProperty(name = "clientData")
    public native ArrayBuffer getClientData();
    @JsProperty(name = "credential")
    public native ScopedCredential getCredential();
    @JsProperty(name = "signature")
    public native ArrayBuffer getSignature();
    @JsProperty(name = "authenticatorData")
    public native void setAuthenticatorData(ArrayBuffer value);
    @JsProperty(name = "clientData")
    public native void setClientData(ArrayBuffer value);
    @JsProperty(name = "credential")
    public native void setCredential(ScopedCredential value);
    @JsProperty(name = "signature")
    public native void setSignature(ArrayBuffer value);
}
