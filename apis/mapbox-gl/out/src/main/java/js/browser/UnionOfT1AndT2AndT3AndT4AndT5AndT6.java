package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfT1AndT2AndT3AndT4AndT5AndT6<T1, T2, T3, T4, T5, T6>  {
    @JsOverlay
    default T1 asT1() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T1, T2, T3, T4, T5, T6> UnionOfT1AndT2AndT3AndT4AndT5AndT6<T1, T2, T3, T4, T5, T6> ofT1(@DoNotAutobox T1 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T2 asT2() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T1, T2, T3, T4, T5, T6> UnionOfT1AndT2AndT3AndT4AndT5AndT6<T1, T2, T3, T4, T5, T6> ofT2(@DoNotAutobox T2 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T3 asT3() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T1, T2, T3, T4, T5, T6> UnionOfT1AndT2AndT3AndT4AndT5AndT6<T1, T2, T3, T4, T5, T6> ofT3(@DoNotAutobox T3 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T4 asT4() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T1, T2, T3, T4, T5, T6> UnionOfT1AndT2AndT3AndT4AndT5AndT6<T1, T2, T3, T4, T5, T6> ofT4(@DoNotAutobox T4 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T5 asT5() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T1, T2, T3, T4, T5, T6> UnionOfT1AndT2AndT3AndT4AndT5AndT6<T1, T2, T3, T4, T5, T6> ofT5(@DoNotAutobox T5 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default T6 asT6() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static <T1, T2, T3, T4, T5, T6> UnionOfT1AndT2AndT3AndT4AndT5AndT6<T1, T2, T3, T4, T5, T6> ofT6(@DoNotAutobox T6 value) {
        return Js.cast( value );
    }
    
}
