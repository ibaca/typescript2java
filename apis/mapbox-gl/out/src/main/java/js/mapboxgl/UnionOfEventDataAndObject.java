package js.mapboxgl;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface UnionOfEventDataAndObject  {
    @JsOverlay
    default EventData asEventData() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfEventDataAndObject ofEventData(EventData value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default Object asObject() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfEventDataAndObject ofObject(Object value) {
        return Js.cast( value );
    }
    
}
