package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AesGcmParams
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 741435

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AesGcmParams implements Algorithm 
{

    /*
        Properties
    */

    public UnionOfArrayBufferAndArrayBufferView additionalData;

    public UnionOfArrayBufferAndArrayBufferView iv;

    public String name;

    public Number tagLength;

    /*
        Methods
    */
    @JsProperty(name = "additionalData")
    public native UnionOfArrayBufferAndArrayBufferView getAdditionalData();
    @JsProperty(name = "iv")
    public native UnionOfArrayBufferAndArrayBufferView getIv();
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
    @JsProperty(name = "tagLength")
    public native Number getTagLength();
    @JsProperty(name = "additionalData")
    public native void setAdditionalData(ArrayBufferView value);
    @JsProperty(name = "additionalData")
    public native void setAdditionalData(ArrayBuffer value);
    @JsProperty(name = "additionalData")
    public native void setAdditionalData(UnionOfArrayBufferAndArrayBufferView value);
    @JsProperty(name = "iv")
    public native void setIv(ArrayBufferView value);
    @JsProperty(name = "iv")
    public native void setIv(ArrayBuffer value);
    @JsProperty(name = "iv")
    public native void setIv(UnionOfArrayBufferAndArrayBufferView value);
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
    @JsProperty(name = "tagLength")
    public native void setTagLength(@DoNotAutobox Number value);
}
