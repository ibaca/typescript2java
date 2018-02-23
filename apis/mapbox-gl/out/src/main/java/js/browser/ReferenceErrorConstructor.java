package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ReferenceErrorConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 37360

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ReferenceErrorConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public ReferenceError prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native ReferenceError getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(ReferenceError value);
}
