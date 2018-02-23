package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: CustomElementRegistry
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 744227

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class CustomElementRegistry
{

    /*
        Methods
    */
    public native void define(String name, Function constructor);
    /** 
      * tsd/browser/lib.es6.d.ts@744267
     */
    public native void define(String name, Function constructor, ElementDefinitionOptions options /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@744358
     */
    public native Object get(String name);
    /** 
      * tsd/browser/lib.es6.d.ts@744386
     */
    public native PromiseLike<Void> whenDefined(String name);
}
