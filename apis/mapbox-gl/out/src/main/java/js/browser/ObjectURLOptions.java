package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ObjectURLOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 271618

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ObjectURLOptions
{

    /*
        Properties
    */

    public Boolean oneTimeOnly;

    /*
        Methods
    */
    @JsProperty(name = "oneTimeOnly")
    public native Boolean getOneTimeOnly();
    @JsProperty(name = "oneTimeOnly")
    public native void setOneTimeOnly(Boolean value);
}
