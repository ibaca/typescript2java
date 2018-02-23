package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ServiceWorkerContainerEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 641955

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ServiceWorkerContainerEventMap
{

    /*
        Properties
    */

    public Event controllerchange;

    public ServiceWorkerMessageEvent message;

    /*
        Methods
    */
    @JsProperty(name = "controllerchange")
    public native Event getControllerchange();
    @JsProperty(name = "message")
    public native ServiceWorkerMessageEvent getMessage();
    @JsProperty(name = "controllerchange")
    public native void setControllerchange(Event value);
    @JsProperty(name = "message")
    public native void setMessage(ServiceWorkerMessageEvent value);
}
