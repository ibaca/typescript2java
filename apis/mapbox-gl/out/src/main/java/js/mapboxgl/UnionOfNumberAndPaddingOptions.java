package js.mapboxgl;

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
public interface UnionOfNumberAndPaddingOptions  {
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfNumberAndPaddingOptions ofNumber(@DoNotAutobox Number value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default PaddingOptions asPaddingOptions() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfNumberAndPaddingOptions ofPaddingOptions(PaddingOptions value) {
        return Js.cast( value );
    }
    
}
