package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBIndexParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 259302

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class IDBIndexParameters
{

    /*
        Properties
    */

    public Boolean multiEntry;

    public Boolean unique;

    /*
        Methods
    */
    @JsProperty(name = "multiEntry")
    public native Boolean getMultiEntry();
    @JsProperty(name = "unique")
    public native Boolean getUnique();
    @JsProperty(name = "multiEntry")
    public native void setMultiEntry(Boolean value);
    @JsProperty(name = "unique")
    public native void setUnique(Boolean value);
}
