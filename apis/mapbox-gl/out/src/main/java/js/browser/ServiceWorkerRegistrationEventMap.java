package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ServiceWorkerRegistrationEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 643428

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ServiceWorkerRegistrationEventMap
{

    /*
        Properties
    */

    public Event updatefound;

    /*
        Methods
    */
    @JsProperty(name = "updatefound")
    public native Event getUpdatefound();
    @JsProperty(name = "updatefound")
    public native void setUpdatefound(Event value);
}
