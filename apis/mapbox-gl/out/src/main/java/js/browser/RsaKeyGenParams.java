package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RsaKeyGenParams
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 740041
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface RsaKeyGenParams extends Algorithm 
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.RsaKeyGenParams)
     */
    @JsProperty(name = "modulusLength")
    Number getModulusLength();
    /** 
      * inherited from (js.browser.RsaKeyGenParams)
     */
    @JsProperty(name = "publicExponent")
    Uint8Array getPublicExponent();
    /** 
      * inherited from (js.browser.RsaKeyGenParams)
     */
    @JsProperty(name = "modulusLength")
    void setModulusLength(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.RsaKeyGenParams)
     */
    @JsProperty(name = "publicExponent")
    void setPublicExponent(Uint8Array value);
}
