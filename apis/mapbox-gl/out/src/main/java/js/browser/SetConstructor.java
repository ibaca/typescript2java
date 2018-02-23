package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SetConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 216369
  * declared in: tsd/browser/lib.es6.d.ts at pos 220202

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class SetConstructor
{

    /*
        Properties
    */

    public Set<Object> prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native Set<Object> getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(Set<Object> value);
}
