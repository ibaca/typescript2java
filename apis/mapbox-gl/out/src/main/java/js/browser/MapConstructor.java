package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MapConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 215358
  * declared in: tsd/browser/lib.es6.d.ts at pos 219788

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MapConstructor
{

    /*
        Properties
    */

    public Map<Object, Object> prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native Map<Object, Object> getPrototype();
    @JsProperty(name = "prototype")
    public native void setPrototype(Map<Object, Object> value);
}
