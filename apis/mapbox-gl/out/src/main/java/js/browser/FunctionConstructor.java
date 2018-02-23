package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: FunctionConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 10366

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class FunctionConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public Function prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native Function getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(Function value);
}
