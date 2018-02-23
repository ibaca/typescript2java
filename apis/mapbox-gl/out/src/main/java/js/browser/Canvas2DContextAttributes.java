package js.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: Canvas2DContextAttributes
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 737727

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class Canvas2DContextAttributes
{

    @JsOverlay
    public final void setByIndex(String index, UnionOfBooleanAndString value) {
        Js.asPropertyMap(this).set(index, value);
    }

    @JsOverlay
    public final UnionOfBooleanAndString getByIndex(String index) {
        return (UnionOfBooleanAndString) Js.asPropertyMap(this).get(index);
    }

    /*
        Properties
    */

    public Boolean alpha;

    public Boolean storage;

    public Boolean willReadFrequently;

    /*
        Methods
    */
    @JsProperty(name = "alpha")
    public native Boolean getAlpha();
    @JsProperty(name = "storage")
    public native Boolean getStorage();
    @JsProperty(name = "willReadFrequently")
    public native Boolean getWillReadFrequently();
    @JsProperty(name = "alpha")
    public native void setAlpha(Boolean value);
    @JsProperty(name = "storage")
    public native void setStorage(Boolean value);
    @JsProperty(name = "willReadFrequently")
    public native void setWillReadFrequently(Boolean value);
}
