package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ArrayBufferConstructor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 63573

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ArrayBufferConstructor
{

    /*
        Properties
    */

    public ArrayBuffer prototype;

    /*
        Methods
    */
    @JsProperty(name = "prototype")
    public native ArrayBuffer getPrototype();
    /** 
      * tsd/browser/lib.es6.d.ts@63694
     */
    public native Boolean isView(Object arg);
    @JsProperty(name = "prototype")
    public native void setPrototype(ArrayBuffer value);
}
