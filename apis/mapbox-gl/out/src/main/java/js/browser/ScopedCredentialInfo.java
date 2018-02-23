package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ScopedCredentialInfo
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 637983
  * declared in: tsd/browser/lib.es6.d.ts at pos 638110
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ScopedCredentialInfo")
public class ScopedCredentialInfo
{

    /*
        Constructors
    */
    public ScopedCredentialInfo () {
    } 

    /*
        Properties
    */

    public ScopedCredential credential;

    public CryptoKey publicKey;

    /*
        Methods
    */
    @JsProperty(name = "credential")
    public native ScopedCredential getCredential();
    @JsProperty(name = "publicKey")
    public native CryptoKey getPublicKey();
    @JsProperty(name = "credential")
    public native void setCredential(ScopedCredential value);
    @JsProperty(name = "publicKey")
    public native void setPublicKey(CryptoKey value);
}
