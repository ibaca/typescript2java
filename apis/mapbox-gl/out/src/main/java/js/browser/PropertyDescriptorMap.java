package js.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: PropertyDescriptorMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 3131

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PropertyDescriptorMap
{

    @JsOverlay
    public final void setByIndex(String index, PropertyDescriptor value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final PropertyDescriptor getByIndex(String index) {
        return (PropertyDescriptor) Js.asPropertyMap(this).get(index);
    }
}
