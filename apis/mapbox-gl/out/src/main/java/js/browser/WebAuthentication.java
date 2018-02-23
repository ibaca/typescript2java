package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: WebAuthentication
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 664605
  * declared in: tsd/browser/lib.es6.d.ts at pos 664940
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebAuthentication")
public class WebAuthentication
{

    /*
        Constructors
    */
    public WebAuthentication () {
    } 

    /*
        Methods
    */
    public native Promise<WebAuthnAssertion> getAssertion(Object assertionChallenge);
    /** 
      * tsd/browser/lib.es6.d.ts@664641
     */
    public native Promise<WebAuthnAssertion> getAssertion(Object assertionChallenge, AssertionOptions options /* optional */);
    public native Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Object attestationChallenge);
    /** 
      * tsd/browser/lib.es6.d.ts@664740
     */
    public native Promise<ScopedCredentialInfo> makeCredential(Account accountInformation, Array<ScopedCredentialParameters> cryptoParameters, Object attestationChallenge, ScopedCredentialOptions options /* optional */);
}
