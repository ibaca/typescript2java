package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: GeneratorFunctionConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 217045

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class GeneratorFunctionConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public GeneratorFunction prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native GeneratorFunction getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(GeneratorFunction value);
}
