package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ServiceWorkerRegistration
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 643503
  * declared in: tsd/browser/lib.es6.d.ts at pos 644407
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ServiceWorkerRegistration")
public class ServiceWorkerRegistration extends EventTarget 
{

    /*
        Constructors
    */
    public ServiceWorkerRegistration () {
    } 

    /*
        Properties
    */

    public ServiceWorker active;

    public ServiceWorker installing;

    public Function1<Event, Object> onupdatefound;

    public PushManager pushManager;

    public String scope;

    public SyncManager sync;

    public ServiceWorker waiting;

    /*
        Methods
    */
    @JsProperty(name = "active")
    public native ServiceWorker getActive();
    @JsProperty(name = "installing")
    public native ServiceWorker getInstalling();
    public native Object getNotifications();
    /** 
      * tsd/browser/lib.es6.d.ts@643875
     */
    public native Object getNotifications(GetNotificationOptions filter /* optional */);
    @JsProperty(name = "onupdatefound")
    public native Function1<Event, Object> getOnupdatefound();
    @JsProperty(name = "pushManager")
    public native PushManager getPushManager();
    @JsProperty(name = "scope")
    public native String getScope();
    @JsProperty(name = "sync")
    public native SyncManager getSync();
    @JsProperty(name = "waiting")
    public native ServiceWorker getWaiting();
    @JsProperty(name = "active")
    public native void setActive(ServiceWorker value);
    @JsProperty(name = "installing")
    public native void setInstalling(ServiceWorker value);
    @JsProperty(name = "onupdatefound")
    public native void setOnupdatefound(Function1<Event, Object> value);
    @JsProperty(name = "pushManager")
    public native void setPushManager(PushManager value);
    @JsProperty(name = "scope")
    public native void setScope(String value);
    @JsProperty(name = "sync")
    public native void setSync(SyncManager value);
    @JsProperty(name = "waiting")
    public native void setWaiting(ServiceWorker value);
    public native Promise<Void> showNotification(String title);
    /** 
      * tsd/browser/lib.es6.d.ts@643935
     */
    public native Promise<Void> showNotification(String title, NotificationOptions options /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@644018
     */
    public native Promise<Boolean> unregister();
    /** 
      * tsd/browser/lib.es6.d.ts@644054
     */
    public native Promise<Void> update();
}
