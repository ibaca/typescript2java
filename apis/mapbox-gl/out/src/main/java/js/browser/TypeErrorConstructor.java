package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TypeErrorConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 37868

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class TypeErrorConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public TypeError prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native TypeError getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(TypeError value);
}
