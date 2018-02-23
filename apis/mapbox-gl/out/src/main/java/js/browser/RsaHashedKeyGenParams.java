package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RsaHashedKeyGenParams
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 740149

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RsaHashedKeyGenParams implements RsaKeyGenParams 
{

    /*
        Properties
    */

    public UnionOfAlgorithmAndString hash;

    public Number modulusLength;

    public String name;

    public Uint8Array publicExponent;

    /*
        Methods
    */
    @JsProperty(name = "hash")
    public native UnionOfAlgorithmAndString getHash();
    /** 
      * inherited from (js.browser.RsaKeyGenParams)
     */
    @JsProperty(name = "modulusLength")
    public native Number getModulusLength();
    /** 
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
     */
    @JsProperty(name = "name")
    public native String getName();
    /** 
      * inherited from (js.browser.RsaKeyGenParams)
     */
    @JsProperty(name = "publicExponent")
    public native Uint8Array getPublicExponent();
    @JsProperty(name = "hash")
    public native void setHash(String value);
    @JsProperty(name = "hash")
    public native void setHash(Algorithm value);
    @JsProperty(name = "hash")
    public native void setHash(UnionOfAlgorithmAndString value);
    /** 
      * inherited from (js.browser.RsaKeyGenParams)
     */
    @JsProperty(name = "modulusLength")
    public native void setModulusLength(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
      * inherited from (js.browser.Algorithm)
     */
    @JsProperty(name = "name")
    public native void setName(String value);
    /** 
      * inherited from (js.browser.RsaKeyGenParams)
     */
    @JsProperty(name = "publicExponent")
    public native void setPublicExponent(Uint8Array value);
}
