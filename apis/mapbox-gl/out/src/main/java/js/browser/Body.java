package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Body
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 723019
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface Body
{

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@723074
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    Promise<ArrayBuffer> arrayBuffer();
    /** 
      * tsd/browser/lib.es6.d.ts@723115
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    Promise<Blob> blob();
    /** 
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    @JsProperty(name = "bodyUsed")
    Boolean getBodyUsed();
    /** 
      * tsd/browser/lib.es6.d.ts@723142
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    Promise<Object> json();
    /** 
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    @JsProperty(name = "bodyUsed")
    void setBodyUsed(Boolean value);
    /** 
      * tsd/browser/lib.es6.d.ts@723168
      * inherited from (js.browser.Body)
      * inherited from (js.browser.Body)
     */
    Promise<String> text();
}
