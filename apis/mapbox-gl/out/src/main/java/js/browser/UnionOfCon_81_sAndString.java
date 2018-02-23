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
public interface UnionOfCon_81_sAndString  {
    @JsOverlay
    default ConcatParams asConcatParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCon_81_sAndString ofConcatParams(ConcatParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default DhKeyDeriveParams asDhKeyDeriveParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCon_81_sAndString ofDhKeyDeriveParams(DhKeyDeriveParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default EcdhKeyDeriveParams asEcdhKeyDeriveParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCon_81_sAndString ofEcdhKeyDeriveParams(EcdhKeyDeriveParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HkdfCtrParams asHkdfCtrParams() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCon_81_sAndString ofHkdfCtrParams(HkdfCtrParams value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Pbkdf2Params asPbkdf2Params() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCon_81_sAndString ofPbkdf2Params(Pbkdf2Params value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfCon_81_sAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
