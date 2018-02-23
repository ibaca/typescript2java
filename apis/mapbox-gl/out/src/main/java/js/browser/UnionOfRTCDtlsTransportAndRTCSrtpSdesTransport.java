package js.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public abstract class UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport extends EventTarget  {
    @JsOverlay
    public final RTCDtlsTransport asRTCDtlsTransport() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport ofRTCDtlsTransport(RTCDtlsTransport value) {
        return Js.uncheckedCast( value );
    }
    
    @JsOverlay
    public final RTCSrtpSdesTransport asRTCSrtpSdesTransport() {
        return Js.uncheckedCast( this );
    }
    
    @JsOverlay
    public static  UnionOfRTCDtlsTransportAndRTCSrtpSdesTransport ofRTCSrtpSdesTransport(RTCSrtpSdesTransport value) {
        return Js.uncheckedCast( value );
    }
    
}
