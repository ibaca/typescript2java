package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: tsd/browser/lib.es6.d.ts:195163
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface PropertyKey_UnionOfFakeEsSymbolAndNumberAndString  {
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  PropertyKey_UnionOfFakeEsSymbolAndNumberAndString ofNumber(@DoNotAutobox Number value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  PropertyKey_UnionOfFakeEsSymbolAndNumberAndString ofString(String value) {
        return Js.cast( value );
    }
    
}
