package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PropertyDescriptor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 2959

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PropertyDescriptor
{

    /*
        Properties
    */

    public Boolean configurable;

    public Boolean enumerable;

    public Object value;

    public Boolean writable;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@3091
     */
    public native Object get();
    @JsProperty(name = "configurable")
    public native Boolean getConfigurable();
    @JsProperty(name = "enumerable")
    public native Boolean getEnumerable();
    @JsProperty(name = "value")
    public native Object getValue();
    @JsProperty(name = "writable")
    public native Boolean getWritable();
    /** 
      * tsd/browser/lib.es6.d.ts@3109
     */
    public native void set(Object v);
    @JsProperty(name = "configurable")
    public native void setConfigurable(Boolean value);
    @JsProperty(name = "enumerable")
    public native void setEnumerable(Boolean value);
    @JsProperty(name = "value")
    public native void setValue(Object value);
    @JsProperty(name = "writable")
    public native void setWritable(Boolean value);
}
