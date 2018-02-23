package js.browser;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * Union adapter
  * aliased in: tsd/geojson/index.d.ts:1039
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="?")
public interface BBox_Union_99_rAndNumber  {
    @JsOverlay
    default TupleOf4<Number, Number, Number, Number> asTupleOf4OfNumberAndNumberAndNumberAndNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  BBox_Union_99_rAndNumber ofTupleOf4OfNumberAndNumberAndNumberAndNumber(TupleOf4<Number, Number, Number, Number> value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default TupleOf6<Number, Number, Number, Number, Number, Number> asTupleOf6OfNumberAndNumberAndNumberAndNumberAndNumberAndNumber() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  BBox_Union_99_rAndNumber ofTupleOf6OfNumberAndNumberAndNumberAndNumberAndNumberAndNumber(TupleOf6<Number, Number, Number, Number, Number, Number> value) {
        return Js.cast( value );
    }
    
}
