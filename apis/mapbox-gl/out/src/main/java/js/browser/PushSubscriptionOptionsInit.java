package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PushSubscriptionOptionsInit
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 273324

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PushSubscriptionOptionsInit
{

    /*
        Properties
    */

    public Object applicationServerKey;

    public Boolean userVisibleOnly;

    /*
        Methods
    */
    @JsProperty(name = "applicationServerKey")
    public native Object getApplicationServerKey();
    @JsProperty(name = "userVisibleOnly")
    public native Boolean getUserVisibleOnly();
    @JsProperty(name = "applicationServerKey")
    public native void setApplicationServerKey(Object value);
    @JsProperty(name = "userVisibleOnly")
    public native void setUserVisibleOnly(Boolean value);
}
