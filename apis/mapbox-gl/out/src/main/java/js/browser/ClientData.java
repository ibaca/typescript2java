package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ClientData
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 256055

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ClientData
{

    /*
        Properties
    */

    public String challenge;

    public WebAuthnExtensions extensions;

    public UnionOfAlgorithmAndString hashAlg;

    public String origin;

    public String rpId;

    public String tokenBinding;

    /*
        Methods
    */
    @JsProperty(name = "challenge")
    public native String getChallenge();
    @JsProperty(name = "extensions")
    public native WebAuthnExtensions getExtensions();
    @JsProperty(name = "hashAlg")
    public native UnionOfAlgorithmAndString getHashAlg();
    @JsProperty(name = "origin")
    public native String getOrigin();
    @JsProperty(name = "rpId")
    public native String getRpId();
    @JsProperty(name = "tokenBinding")
    public native String getTokenBinding();
    @JsProperty(name = "challenge")
    public native void setChallenge(String value);
    @JsProperty(name = "extensions")
    public native void setExtensions(WebAuthnExtensions value);
    @JsProperty(name = "hashAlg")
    public native void setHashAlg(String value);
    @JsProperty(name = "hashAlg")
    public native void setHashAlg(Algorithm value);
    @JsProperty(name = "hashAlg")
    public native void setHashAlg(UnionOfAlgorithmAndString value);
    @JsProperty(name = "origin")
    public native void setOrigin(String value);
    @JsProperty(name = "rpId")
    public native void setRpId(String value);
    @JsProperty(name = "tokenBinding")
    public native void setTokenBinding(String value);
}
