package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RsaKeyAlgorithm
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 740241
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface RsaKeyAlgorithm extends KeyAlgorithm 
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.RsaKeyAlgorithm)
     */
    @JsProperty(name = "modulusLength")
    Number getModulusLength();
    /** 
      * inherited from (js.browser.RsaKeyAlgorithm)
     */
    @JsProperty(name = "publicExponent")
    Uint8Array getPublicExponent();
    /** 
      * inherited from (js.browser.RsaKeyAlgorithm)
     */
    @JsProperty(name = "modulusLength")
    void setModulusLength(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RsaKeyAlgorithm)
     */
    @JsProperty(name = "publicExponent")
    void setPublicExponent(Uint8Array value);
}
