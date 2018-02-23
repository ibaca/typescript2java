package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PromiseRejectionEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 744433
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PromiseRejectionEvent")
public class PromiseRejectionEvent extends Event 
{

    /*
        Constructors
    */
    public PromiseRejectionEvent (String typeArg, EventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public PromiseRejectionEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public PromiseLike<Object> promise;

    public Object reason;

    /*
        Methods
    */
    @JsProperty(name = "promise")
    public native PromiseLike<Object> getPromise();
    @JsProperty(name = "reason")
    public native Object getReason();
    @JsProperty(name = "promise")
    public native void setPromise(PromiseLike<Object> value);
    @JsProperty(name = "reason")
    public native void setReason(Object value);
}
