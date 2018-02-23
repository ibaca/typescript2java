package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WeakSetConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 216816
  * declared in: tsd/browser/lib.es6.d.ts at pos 220302

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class WeakSetConstructor
{

    /*
        Properties
    */

    public WeakSet<Object> prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native WeakSet<Object> getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(WeakSet<Object> value);
}
