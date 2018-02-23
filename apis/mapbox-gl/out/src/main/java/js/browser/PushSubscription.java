package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PushSubscription
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 552919
  * declared in: tsd/browser/lib.es6.d.ts at pos 553147
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PushSubscription")
public class PushSubscription
{

    /*
        Constructors
    */
    public PushSubscription () {
    } 

    /*
        Properties
    */

    public String endpoint;

    public PushSubscriptionOptions options;

    /*
        Methods
    */
    @JsProperty(name = "endpoint")
    public native String getEndpoint();
    /** 
      * tsd/browser/lib.es6.d.ts@553035
     */
    public native ArrayBuffer getKey(String name);
    @JsProperty(name = "options")
    public native PushSubscriptionOptions getOptions();
    @JsProperty(name = "endpoint")
    public native void setEndpoint(String value);
    @JsProperty(name = "options")
    public native void setOptions(PushSubscriptionOptions value);
    /** 
      * tsd/browser/lib.es6.d.ts@553081
     */
    public native Object toJSON();
    /** 
      * tsd/browser/lib.es6.d.ts@553100
     */
    public native Promise<Boolean> unsubscribe();
}
