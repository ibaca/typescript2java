package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SymbolConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 217406
  * declared in: tsd/browser/lib.es6.d.ts at pos 243491
  * declared in: tsd/browser/lib.es6.d.ts at pos 244303

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class SymbolConstructor
{

    /*
        Properties
    */

    /** 
      * A reference to the prototype. 
     */
    public Symbol prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native Symbol getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(Symbol value);
}
