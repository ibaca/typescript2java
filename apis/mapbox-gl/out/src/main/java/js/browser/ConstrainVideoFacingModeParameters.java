package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ConstrainVideoFacingModeParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 256930

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ConstrainVideoFacingModeParameters
{

    /*
        Properties
    */

    public UnionOfArrayOfStringAndString exact;

    public UnionOfArrayOfStringAndString ideal;

    /*
        Methods
    */
    @JsProperty(name = "exact")
    public native UnionOfArrayOfStringAndString getExact();
    @JsProperty(name = "ideal")
    public native UnionOfArrayOfStringAndString getIdeal();
    @JsProperty(name = "exact")
    public native void setExact(String value);
    @JsProperty(name = "exact")
    public native void setExact(Array<String> value);
    @JsProperty(name = "exact")
    public native void setExact(UnionOfArrayOfStringAndString value);
    @JsProperty(name = "ideal")
    public native void setIdeal(String value);
    @JsProperty(name = "ideal")
    public native void setIdeal(Array<String> value);
    @JsProperty(name = "ideal")
    public native void setIdeal(UnionOfArrayOfStringAndString value);
}
