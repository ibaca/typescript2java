package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RangeErrorConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 37117

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RangeErrorConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public RangeError prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native RangeError getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(RangeError value);
}
