package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Crypto
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 318408
  * declared in: tsd/browser/lib.es6.d.ts at pos 318507
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Crypto")
public class Crypto implements RandomSource 
{

    /*
        Constructors
    */
    public Crypto () {
    } 

    /*
        Properties
    */

    public SubtleCrypto subtle;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@734582
      * inherited from (js.browser.RandomSource)
     */
    public native ArrayBufferView getRandomValues(ArrayBufferView array);
    @JsProperty(name = "subtle")
    public native SubtleCrypto getSubtle();
    @JsProperty(name = "subtle")
    public native void setSubtle(SubtleCrypto value);
}
