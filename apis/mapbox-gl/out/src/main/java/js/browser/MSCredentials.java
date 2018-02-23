package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: MSCredentials
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 502976
  * declared in: tsd/browser/lib.es6.d.ts at pos 503262
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSCredentials")
public class MSCredentials
{

    /*
        Constructors
    */
    public MSCredentials () {
    } 

    /*
        Methods
    */
    public native Promise<MSAssertion> getAssertion(String challenge);
    public native Promise<MSAssertion> getAssertion(String challenge, MSCredentialFilter filter /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@503008
     */
    public native Promise<MSAssertion> getAssertion(String challenge, MSCredentialFilter filter /* optional */, MSSignatureParameters params /* optional */);
    public native Promise<MSAssertion> makeCredential(MSAccountInfo accountInfo, Array<MSCredentialParameters> params);
    /** 
      * tsd/browser/lib.es6.d.ts@503128
     */
    public native Promise<MSAssertion> makeCredential(MSAccountInfo accountInfo, Array<MSCredentialParameters> params, String challenge /* optional */);
}
