package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSFIDOSignature
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 503668
  * declared in: tsd/browser/lib.es6.d.ts at pos 503810
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSFIDOSignature")
public class MSFIDOSignature
{

    /*
        Constructors
    */
    public MSFIDOSignature () {
    } 

    /*
        Properties
    */

    public String authnrData;

    public String clientData;

    public String signature;

    /*
        Methods
    */
    @JsProperty(name = "authnrData")
    public native String getAuthnrData();
    @JsProperty(name = "clientData")
    public native String getClientData();
    @JsProperty(name = "signature")
    public native String getSignature();
    @JsProperty(name = "authnrData")
    public native void setAuthnrData(String value);
    @JsProperty(name = "clientData")
    public native void setClientData(String value);
    @JsProperty(name = "signature")
    public native void setSignature(String value);
}
