package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: EcKeyAlgorithm
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 740785

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class EcKeyAlgorithm implements KeyAlgorithm 
{

    /*
        Properties
    */

    public String name;

    public String typedCurve;

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
     */
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "typedCurve")
    public native String getTypedCurve();
    /** 
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
      * inherited from (js.browser.KeyAlgorithm)
     */
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "typedCurve")
    public native void setTypedCurve(String value);
}
