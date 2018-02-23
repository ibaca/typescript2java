package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AesKeyAlgorithm
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 741086

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AesKeyAlgorithm implements KeyAlgorithm 
{

    /*
        Properties
    */

    public int length;

    public String name;

    /*
        Methods
    */
    @JsProperty(name = "length")
    public native Number getLength();
    /** 
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
     */
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
     */
    @JsProperty(name = "name")
    public native void setName(String value);
}
