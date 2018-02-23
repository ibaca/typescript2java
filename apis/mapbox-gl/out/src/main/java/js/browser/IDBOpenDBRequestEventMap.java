package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBOpenDBRequestEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 494035

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class IDBOpenDBRequestEventMap implements IDBRequestEventMap 
{

    /*
        Properties
    */

    public Event blocked;

    public Event error;

    public Event success;

    public IDBVersionChangeEvent upgradeneeded;

    /*
        Methods
    */
    @JsProperty(name = "blocked")
    public native Event getBlocked();
    /** 
      * inherited from (js.browser.IDBRequestEventMap)
     */
    @JsProperty(name = "error")
    public native Event getError();
    /** 
      * inherited from (js.browser.IDBRequestEventMap)
     */
    @JsProperty(name = "success")
    public native Event getSuccess();
    @JsProperty(name = "upgradeneeded")
    public native IDBVersionChangeEvent getUpgradeneeded();
    @JsProperty(name = "blocked")
    public native void setBlocked(Event value);
    /** 
      * inherited from (js.browser.IDBRequestEventMap)
     */
    @JsProperty(name = "error")
    public native void setError(Event value);
    /** 
      * inherited from (js.browser.IDBRequestEventMap)
     */
    @JsProperty(name = "success")
    public native void setSuccess(Event value);
    @JsProperty(name = "upgradeneeded")
    public native void setUpgradeneeded(IDBVersionChangeEvent value);
}
