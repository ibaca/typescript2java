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
public interface UnionOfBac_112_mbolLayout  {
    @JsOverlay
    default BackgroundLayout asBackgroundLayout() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_112_mbolLayout ofBackgroundLayout(BackgroundLayout value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default CircleLayout asCircleLayout() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_112_mbolLayout ofCircleLayout(CircleLayout value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default FillExtrusionLayout asFillExtrusionLayout() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_112_mbolLayout ofFillExtrusionLayout(FillExtrusionLayout value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default FillLayout asFillLayout() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_112_mbolLayout ofFillLayout(FillLayout value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HeatmapLayout asHeatmapLayout() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_112_mbolLayout ofHeatmapLayout(HeatmapLayout value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default LineLayout asLineLayout() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_112_mbolLayout ofLineLayout(LineLayout value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RasterLayout asRasterLayout() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_112_mbolLayout ofRasterLayout(RasterLayout value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SymbolLayout asSymbolLayout() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_112_mbolLayout ofSymbolLayout(SymbolLayout value) {
        return Js.cast( value );
    }
    
}
