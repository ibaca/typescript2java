package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DhKeyAlgorithm
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 742037

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class DhKeyAlgorithm implements KeyAlgorithm 
{

    /*
        Properties
    */

    public Uint8Array generator;

    public String name;

    public Uint8Array prime;

    /*
        Methods
    */
    @JsProperty(name = "generator")
    public native Uint8Array getGenerator();
    /** 
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
     */
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "prime")
    public native Uint8Array getPrime();
    @JsProperty(name = "generator")
    public native void setGenerator(Uint8Array value);
    /** 
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
     */
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "prime")
    public native void setPrime(Uint8Array value);
}
