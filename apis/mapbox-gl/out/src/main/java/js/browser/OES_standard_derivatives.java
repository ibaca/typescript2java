package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: OES_standard_derivatives
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 536870
  * declared in: tsd/browser/lib.es6.d.ts at pos 536981
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="OES_standard_derivatives")
public class OES_standard_derivatives
{

    /*
        Constructors
    */
    public OES_standard_derivatives () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="OES_standard_derivatives", name="FRAGMENT_SHADER_DERIVATIVE_HINT_OES")
    public static Number FRAGMENT_SHADER_DERIVATIVE_HINT_OES;

    /*
        Properties
    */

    /*
        Methods
    */
    @JsProperty(name = "FRAGMENT_SHADER_DERIVATIVE_HINT_OES")
    public native Number getFRAGMENT_SHADER_DERIVATIVE_HINT_OES();
    @JsProperty(name = "FRAGMENT_SHADER_DERIVATIVE_HINT_OES")
    public native void setFRAGMENT_SHADER_DERIVATIVE_HINT_OES(@DoNotAutobox Number value);
}
