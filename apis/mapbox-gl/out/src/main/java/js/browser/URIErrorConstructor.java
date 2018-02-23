package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: URIErrorConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 38099

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class URIErrorConstructor
{
    /** SKIPPED CALL SIGNATURE ! */

    /*
        Properties
    */

    public URIError prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native URIError getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(URIError value);
}
