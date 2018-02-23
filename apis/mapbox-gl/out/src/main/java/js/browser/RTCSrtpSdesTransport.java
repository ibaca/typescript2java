package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCSrtpSdesTransport
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 564925
  * declared in: tsd/browser/lib.es6.d.ts at pos 565404
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="RTCSrtpSdesTransport")
public class RTCSrtpSdesTransport extends EventTarget 
{

    /*
        Constructors
    */
    public RTCSrtpSdesTransport (RTCIceTransport transport, RTCSrtpSdesParameters encryptParameters, RTCSrtpSdesParameters decryptParameters) {
    } 

    /*
        Static methods
    */

    /** 
      * source : tsd/browser/lib.es6.d.ts:565613
     */
    @JsMethod(namespace="RTCSrtpSdesTransport", name = "getLocalParameters")
    public static native Array<RTCSrtpSdesParameters> getLocalParameters();

    /*
        Properties
    */

    public Function1<Event, Object> onerror;

    public RTCIceTransport transport;

    /*
        Methods
    */
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "transport")
    public native RTCIceTransport getTransport();
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "transport")
    public native void setTransport(RTCIceTransport value);
}
