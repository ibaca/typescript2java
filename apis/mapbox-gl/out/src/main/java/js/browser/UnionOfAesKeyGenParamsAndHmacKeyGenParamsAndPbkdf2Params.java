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
public interface UnionOfAesKeyGenParamsAndHmacKeyGenParamsAndPbkdf2Params extends Algorithm  {
    @JsOverlay
    default AesKeyGenParams asAesKeyGenParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesKeyGenParamsAndHmacKeyGenParamsAndPbkdf2Params ofAesKeyGenParams(AesKeyGenParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HmacKeyGenParams asHmacKeyGenParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesKeyGenParamsAndHmacKeyGenParamsAndPbkdf2Params ofHmacKeyGenParams(HmacKeyGenParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Pbkdf2Params asPbkdf2Params() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAesKeyGenParamsAndHmacKeyGenParamsAndPbkdf2Params ofPbkdf2Params(Pbkdf2Params value) {
        return Js.cast( value );
    }
    
}
