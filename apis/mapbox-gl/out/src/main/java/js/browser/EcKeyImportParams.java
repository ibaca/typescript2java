package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: EcKeyImportParams
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 740860

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class EcKeyImportParams
{

    /*
        Properties
    */

    public String namedCurve;

    /*
        Methods
    */
    @JsProperty(name = "namedCurve")
    public native String getNamedCurve();
    @JsProperty(name = "namedCurve")
    public native void setNamedCurve(String value);
}
