package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PushSubscriptionOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 553231
  * declared in: tsd/browser/lib.es6.d.ts at pos 553377
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PushSubscriptionOptions")
public class PushSubscriptionOptions
{

    /*
        Constructors
    */
    public PushSubscriptionOptions () {
    } 

    /*
        Properties
    */

    public ArrayBuffer applicationServerKey;

    public Boolean userVisibleOnly;

    /*
        Methods
    */
    @JsProperty(name = "applicationServerKey")
    public native ArrayBuffer getApplicationServerKey();
    @JsProperty(name = "userVisibleOnly")
    public native Boolean getUserVisibleOnly();
    @JsProperty(name = "applicationServerKey")
    public native void setApplicationServerKey(ArrayBuffer value);
    @JsProperty(name = "userVisibleOnly")
    public native void setUserVisibleOnly(Boolean value);
}
