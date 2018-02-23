package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AssignedNodesOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 744107

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AssignedNodesOptions
{

    /*
        Properties
    */

    public Boolean flatten;

    /*
        Methods
    */
    @JsProperty(name = "flatten")
    public native Boolean getFlatten();
    @JsProperty(name = "flatten")
    public native void setFlatten(Boolean value);
}
