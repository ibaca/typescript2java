package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PermissionRequestedEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 549000
  * declared in: tsd/browser/lib.es6.d.ts at pos 549118
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PermissionRequestedEvent")
public class PermissionRequestedEvent extends Event 
{

    /*
        Constructors
    */
    public PermissionRequestedEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public PermissionRequest permissionRequest;

    /*
        Methods
    */
    @JsProperty(name = "permissionRequest")
    public native PermissionRequest getPermissionRequest();
    @JsProperty(name = "permissionRequest")
    public native void setPermissionRequest(PermissionRequest value);
}
