package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ServiceWorkerContainer
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 642074
  * declared in: tsd/browser/lib.es6.d.ts at pos 642902
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ServiceWorkerContainer")
public class ServiceWorkerContainer extends EventTarget 
{

    /*
        Constructors
    */
    public ServiceWorkerContainer () {
    } 

    /*
        Properties
    */

    public ServiceWorker controller;

    public Function1<Event, Object> oncontrollerchange;

    public Function1<ServiceWorkerMessageEvent, Object> onmessage;

    public Promise<ServiceWorkerRegistration> ready;

    /*
        Methods
    */
    @JsProperty(name = "controller")
    public native ServiceWorker getController();
    @JsProperty(name = "oncontrollerchange")
    public native Function1<Event, Object> getOncontrollerchange();
    @JsProperty(name = "onmessage")
    public native Function1<ServiceWorkerMessageEvent, Object> getOnmessage();
    @JsProperty(name = "ready")
    public native Promise<ServiceWorkerRegistration> getReady();
    public native Promise<Object> getRegistration();
    /** 
      * tsd/browser/lib.es6.d.ts@642397
     */
    public native Promise<Object> getRegistration(String clientURL /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@642455
     */
    public native Object getRegistrations();
    public native Promise<ServiceWorkerRegistration> register(String scriptURL);
    /** 
      * tsd/browser/lib.es6.d.ts@642484
     */
    public native Promise<ServiceWorkerRegistration> register(String scriptURL, RegistrationOptions options /* optional */);
    @JsProperty(name = "controller")
    public native void setController(ServiceWorker value);
    @JsProperty(name = "oncontrollerchange")
    public native void setOncontrollerchange(Function1<Event, Object> value);
    @JsProperty(name = "onmessage")
    public native void setOnmessage(Function1<ServiceWorkerMessageEvent, Object> value);
    @JsProperty(name = "ready")
    public native void setReady(Promise<ServiceWorkerRegistration> value);
}
