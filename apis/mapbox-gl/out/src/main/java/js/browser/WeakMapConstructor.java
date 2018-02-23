package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WeakMapConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 215912
  * declared in: tsd/browser/lib.es6.d.ts at pos 219917

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class WeakMapConstructor
{

    /*
        Properties
    */

    public WeakMap<Object, Object> prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native WeakMap<Object, Object> getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(WeakMap<Object, Object> value);
}
