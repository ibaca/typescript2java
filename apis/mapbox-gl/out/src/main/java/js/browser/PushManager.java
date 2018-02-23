package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/** 
  * source type: PushManager
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 552602
  * declared in: tsd/browser/lib.es6.d.ts at pos 552850
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PushManager")
public class PushManager
{

    /*
        Constructors
    */
    public PushManager () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@552632
     */
    public native Promise<PushSubscription> getSubscription();
    public native Promise<String> permissionState();
    /** 
      * tsd/browser/lib.es6.d.ts@552682
     */
    public native Promise<String> permissionState(PushSubscriptionOptionsInit options /* optional */);
    public native Promise<PushSubscription> subscribe();
    /** 
      * tsd/browser/lib.es6.d.ts@552759
     */
    public native Promise<PushSubscription> subscribe(PushSubscriptionOptionsInit options /* optional */);
}
