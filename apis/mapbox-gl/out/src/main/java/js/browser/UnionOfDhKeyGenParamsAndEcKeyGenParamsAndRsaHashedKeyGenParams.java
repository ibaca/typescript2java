package js.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfDhKeyGenParamsAndEcKeyGenParamsAndRsaHashedKeyGenParams extends Algorithm  {
    @JsOverlay
    default DhKeyGenParams asDhKeyGenParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDhKeyGenParamsAndEcKeyGenParamsAndRsaHashedKeyGenParams ofDhKeyGenParams(DhKeyGenParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default EcKeyGenParams asEcKeyGenParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDhKeyGenParamsAndEcKeyGenParamsAndRsaHashedKeyGenParams ofEcKeyGenParams(EcKeyGenParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RsaHashedKeyGenParams asRsaHashedKeyGenParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfDhKeyGenParamsAndEcKeyGenParamsAndRsaHashedKeyGenParams ofRsaHashedKeyGenParams(RsaHashedKeyGenParams value) {
        return Js.cast( value );
    }
    
}
