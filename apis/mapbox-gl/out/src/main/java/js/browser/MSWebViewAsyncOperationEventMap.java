package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSWebViewAsyncOperationEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 514643

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSWebViewAsyncOperationEventMap
{

    /*
        Properties
    */

    public Event complete;

    public Event error;

    /*
        Methods
    */
    @JsProperty(name = "complete")
    public native Event getComplete();
    @JsProperty(name = "error")
    public native Event getError();
    @JsProperty(name = "complete")
    public native void setComplete(Event value);
    @JsProperty(name = "error")
    public native void setError(Event value);
}
