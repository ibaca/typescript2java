package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ConstrainBooleanParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 256552

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ConstrainBooleanParameters
{

    /*
        Properties
    */

    public Boolean exact;

    public Boolean ideal;

    /*
        Methods
    */
    @JsProperty(name = "exact")
    public native Boolean getExact();
    @JsProperty(name = "ideal")
    public native Boolean getIdeal();
    @JsProperty(name = "exact")
    public native void setExact(Boolean value);
    @JsProperty(name = "ideal")
    public native void setIdeal(Boolean value);
}
