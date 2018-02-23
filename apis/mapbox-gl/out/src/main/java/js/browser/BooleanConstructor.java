package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: BooleanConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 18428

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class BooleanConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public Boolean prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native Boolean getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(Boolean value);
}
