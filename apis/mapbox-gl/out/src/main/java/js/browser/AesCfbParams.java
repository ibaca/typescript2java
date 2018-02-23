package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AesCfbParams
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 741562

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AesCfbParams implements Algorithm 
{

    /*
        Properties
    */

    public UnionOfArrayBufferAndArrayBufferView iv;

    public String name;

    /*
        Methods
    */
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
}
