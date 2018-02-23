package js;

import js.browser.Array;
import js.mapboxgl.StyleFunction;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfArrayOfObjectAndStringAndStyleFunction  {
    @JsOverlay
    default Array<Object> asArrayOfObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndStringAndStyleFunction ofArrayOfObject(Array<Object> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndStringAndStyleFunction ofString(String value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default StyleFunction asStyleFunction() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfArrayOfObjectAndStringAndStyleFunction ofStyleFunction(StyleFunction value) {
        return Js.cast( value );
    }
    
}
