package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TypedPropertyDescriptor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 60599

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class TypedPropertyDescriptor<T>
{

    /*
        Properties
    */

    public Boolean configurable;

    public Boolean enumerable;

    public T value;

    public Boolean writable;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@60743
     */
    public native T get();
    @JsProperty(name = "configurable")
    public native Boolean getConfigurable();
    @JsProperty(name = "enumerable")
    public native Boolean getEnumerable();
    @JsProperty(name = "value")
    public native T getValue();
    @JsProperty(name = "writable")
    public native Boolean getWritable();
    /** 
      * tsd/browser/lib.es6.d.ts@60762
     */
    public native void set(@DoNotAutobox T value);
    @JsProperty(name = "configurable")
    public native void setConfigurable(Boolean value);
    @JsProperty(name = "enumerable")
    public native void setEnumerable(Boolean value);
    @JsProperty(name = "value")
    public native void setValue(@DoNotAutobox T value);
    @JsProperty(name = "writable")
    public native void setWritable(Boolean value);
}
