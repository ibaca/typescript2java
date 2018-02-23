package js;

import javaemul.internal.annotations.DoNotAutobox;
import js.browser.AnonymousType716;
import js.browser.Array;
import js.mapboxgl.Point;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfAnonymousType716AndArrayOfNumberAndNumberAndPoint  {
    @JsOverlay
    default AnonymousType716 asAnonymousType716() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType716AndArrayOfNumberAndNumberAndPoint ofAnonymousType716(AnonymousType716 value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Array<Number> asArrayOfNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType716AndArrayOfNumberAndNumberAndPoint ofArrayOfNumber(Array<Number> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Number asNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType716AndArrayOfNumberAndNumberAndPoint ofNumber(@DoNotAutobox Number value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Point asPoint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnonymousType716AndArrayOfNumberAndNumberAndPoint ofPoint(Point value) {
        return Js.cast( value );
    }
    
}
