package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSFIDOSignatureAssertion
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 503891
  * declared in: tsd/browser/lib.es6.d.ts at pos 504005
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSFIDOSignatureAssertion")
public class MSFIDOSignatureAssertion extends MSAssertion 
{

    /*
        Constructors
    */
    public MSFIDOSignatureAssertion () {
    } 

    /*
        Properties
    */

    public MSFIDOSignature signature;

    /*
        Methods
    */
    @JsProperty(name = "signature")
    public native MSFIDOSignature getSignature();
    @JsProperty(name = "signature")
    public native void setSignature(MSFIDOSignature value);
}
