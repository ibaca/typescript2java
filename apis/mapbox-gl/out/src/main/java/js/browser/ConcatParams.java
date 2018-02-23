package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ConcatParams
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 742313

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ConcatParams implements Algorithm 
{

    /*
        Properties
    */

    public Uint8Array algorithmId;

    public UnionOfAlgorithmAndString hash;

    public String name;

    public Uint8Array partyUInfo;

    public Uint8Array partyVInfo;

    public Uint8Array privateInfo;

    public Uint8Array publicInfo;

    /*
        Methods
    */
    @JsProperty(name = "algorithmId")
    public native Uint8Array getAlgorithmId();
    @JsProperty(name = "hash")
    public native UnionOfAlgorithmAndString getHash();
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
    @JsProperty(name = "partyUInfo")
    public native Uint8Array getPartyUInfo();
    @JsProperty(name = "partyVInfo")
    public native Uint8Array getPartyVInfo();
    @JsProperty(name = "privateInfo")
    public native Uint8Array getPrivateInfo();
    @JsProperty(name = "publicInfo")
    public native Uint8Array getPublicInfo();
    @JsProperty(name = "algorithmId")
    public native void setAlgorithmId(Uint8Array value);
    @JsProperty(name = "hash")
    public native void setHash(String value);
    @JsProperty(name = "hash")
    public native void setHash(Algorithm value);
    @JsProperty(name = "hash")
    public native void setHash(UnionOfAlgorithmAndString value);
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
    @JsProperty(name = "partyUInfo")
    public native void setPartyUInfo(Uint8Array value);
    @JsProperty(name = "partyVInfo")
    public native void setPartyVInfo(Uint8Array value);
    @JsProperty(name = "privateInfo")
    public native void setPrivateInfo(Uint8Array value);
    @JsProperty(name = "publicInfo")
    public native void setPublicInfo(Uint8Array value);
}
