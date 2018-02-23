package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CryptoKey
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 318561
  * declared in: tsd/browser/lib.es6.d.ts at pos 318730
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CryptoKey")
public class CryptoKey
{

    /*
        Constructors
    */
    public CryptoKey () {
    } 

    /*
        Properties
    */

    public KeyAlgorithm algorithm;

    public Boolean extractable;

    public String type;

    public Array<String> usages;

    /*
        Methods
    */
    @JsProperty(name = "algorithm")
    public native KeyAlgorithm getAlgorithm();
    @JsProperty(name = "extractable")
    public native Boolean getExtractable();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "usages")
    public native Array<String> getUsages();
    @JsProperty(name = "algorithm")
    public native void setAlgorithm(KeyAlgorithm value);
    @JsProperty(name = "extractable")
    public native void setExtractable(Boolean value);
    @JsProperty(name = "type")
    public native void setType(String value);
    @JsProperty(name = "usages")
    public native void setUsages(Array<String> value);
}
