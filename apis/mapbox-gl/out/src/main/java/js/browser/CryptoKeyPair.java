package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CryptoKeyPair
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 318793
  * declared in: tsd/browser/lib.es6.d.ts at pos 318888
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CryptoKeyPair")
public class CryptoKeyPair
{

    /*
        Constructors
    */
    public CryptoKeyPair () {
    } 

    /*
        Properties
    */

    public CryptoKey privateKey;

    public CryptoKey publicKey;

    /*
        Methods
    */
    @JsProperty(name = "privateKey")
    public native CryptoKey getPrivateKey();
    @JsProperty(name = "publicKey")
    public native CryptoKey getPublicKey();
    @JsProperty(name = "privateKey")
    public native void setPrivateKey(CryptoKey value);
    @JsProperty(name = "publicKey")
    public native void setPublicKey(CryptoKey value);
}
