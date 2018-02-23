package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ScopedCredentialParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 280474

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ScopedCredentialParameters
{

    /*
        Properties
    */

    public UnionOfAlgorithmAndString algorithm;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "algorithm")
    public native UnionOfAlgorithmAndString getAlgorithm();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "algorithm")
    public native void setAlgorithm(String value);
    @JsProperty(name = "algorithm")
    public native void setAlgorithm(Algorithm value);
    @JsProperty(name = "algorithm")
    public native void setAlgorithm(UnionOfAlgorithmAndString value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
