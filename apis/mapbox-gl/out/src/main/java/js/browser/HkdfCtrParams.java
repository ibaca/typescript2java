package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HkdfCtrParams
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 742535

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class HkdfCtrParams implements Algorithm 
{

    /*
        Properties
    */

    public UnionOfArrayBufferAndArrayBufferView context;

    public UnionOfAlgorithmAndString hash;

    public UnionOfArrayBufferAndArrayBufferView label;

    public String name;

    /*
        Methods
    */
    @JsProperty(name = "context")
    public native UnionOfArrayBufferAndArrayBufferView getContext();
    @JsProperty(name = "hash")
    public native UnionOfAlgorithmAndString getHash();
    @JsProperty(name = "label")
    public native UnionOfArrayBufferAndArrayBufferView getLabel();
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
    @JsProperty(name = "context")
    public native void setContext(ArrayBufferView value);
    @JsProperty(name = "context")
    public native void setContext(ArrayBuffer value);
    @JsProperty(name = "context")
    public native void setContext(UnionOfArrayBufferAndArrayBufferView value);
    @JsProperty(name = "hash")
    public native void setHash(String value);
    @JsProperty(name = "hash")
    public native void setHash(Algorithm value);
    @JsProperty(name = "hash")
    public native void setHash(UnionOfAlgorithmAndString value);
    @JsProperty(name = "label")
    public native void setLabel(ArrayBufferView value);
    @JsProperty(name = "label")
    public native void setLabel(ArrayBuffer value);
    @JsProperty(name = "label")
    public native void setLabel(UnionOfArrayBufferAndArrayBufferView value);
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
