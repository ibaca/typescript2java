package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSFIDOCredentialAssertion
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 503337
  * declared in: tsd/browser/lib.es6.d.ts at pos 503557
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSFIDOCredentialAssertion")
public class MSFIDOCredentialAssertion extends MSAssertion 
{

    /*
        Constructors
    */
    public MSFIDOCredentialAssertion () {
    } 

    /*
        Properties
    */

    public UnionOfAlgorithmAndString algorithm;

    public Object attestation;

    public String publicKey;

    public Array<String> transportHints;

    /*
        Methods
    */
    @JsProperty(name = "algorithm")
    public native UnionOfAlgorithmAndString getAlgorithm();
    @JsProperty(name = "attestation")
    public native Object getAttestation();
    @JsProperty(name = "publicKey")
    public native String getPublicKey();
    @JsProperty(name = "transportHints")
    public native Array<String> getTransportHints();
    @JsProperty(name = "algorithm")
    public native void setAlgorithm(String value);
    @JsProperty(name = "algorithm")
    public native void setAlgorithm(Algorithm value);
    @JsProperty(name = "algorithm")
    public native void setAlgorithm(UnionOfAlgorithmAndString value);
    @JsProperty(name = "attestation")
    public native void setAttestation(Object value);
    @JsProperty(name = "publicKey")
    public native void setPublicKey(String value);
    @JsProperty(name = "transportHints")
    public native void setTransportHints(Array<String> value);
}
