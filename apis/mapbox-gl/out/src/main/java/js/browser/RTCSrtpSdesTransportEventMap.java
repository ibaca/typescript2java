package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCSrtpSdesTransportEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 564861

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCSrtpSdesTransportEventMap
{

    /*
        Properties
    */

    public Event error;

    /*
        Methods
    */
    @JsProperty(name = "error")
    public native Event getError();
    @JsProperty(name = "error")
    public native void setError(Event value);
}
