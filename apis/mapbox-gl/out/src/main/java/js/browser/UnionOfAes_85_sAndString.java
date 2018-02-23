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
public interface UnionOfAes_85_sAndString  {
    @JsOverlay
    default AesCbcParams asAesCbcParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAes_85_sAndString ofAesCbcParams(AesCbcParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default AesCfbParams asAesCfbParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAes_85_sAndString ofAesCfbParams(AesCfbParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default AesCmacParams asAesCmacParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAes_85_sAndString ofAesCmacParams(AesCmacParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default AesCtrParams asAesCtrParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAes_85_sAndString ofAesCtrParams(AesCtrParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default AesGcmParams asAesGcmParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAes_85_sAndString ofAesGcmParams(AesGcmParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RsaOaepParams asRsaOaepParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAes_85_sAndString ofRsaOaepParams(RsaOaepParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAes_85_sAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
