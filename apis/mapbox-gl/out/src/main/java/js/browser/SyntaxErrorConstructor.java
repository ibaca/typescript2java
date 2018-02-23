package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SyntaxErrorConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 37624

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class SyntaxErrorConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public SyntaxError prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native SyntaxError getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(SyntaxError value);
}
