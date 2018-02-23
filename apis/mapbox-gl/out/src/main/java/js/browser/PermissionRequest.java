package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PermissionRequest
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 548786
  * declared in: tsd/browser/lib.es6.d.ts at pos 548913
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PermissionRequest")
public class PermissionRequest extends DeferredPermissionRequest 
{

    /*
        Constructors
    */
    public PermissionRequest () {
    } 

    /*
        Properties
    */

    public String state;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@548884
     */
    public native void defer();
    @JsProperty(name = "state")
    public native String getState();
    @JsProperty(name = "state")
    public native void setState(String value);
}
