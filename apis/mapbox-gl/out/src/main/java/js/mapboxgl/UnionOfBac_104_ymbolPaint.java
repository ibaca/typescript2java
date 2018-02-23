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
public interface UnionOfBac_104_ymbolPaint  {
    @JsOverlay
    default BackgroundPaint asBackgroundPaint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_104_ymbolPaint ofBackgroundPaint(BackgroundPaint value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default CirclePaint asCirclePaint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_104_ymbolPaint ofCirclePaint(CirclePaint value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default FillExtrusionPaint asFillExtrusionPaint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_104_ymbolPaint ofFillExtrusionPaint(FillExtrusionPaint value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default FillPaint asFillPaint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_104_ymbolPaint ofFillPaint(FillPaint value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default HeatmapPaint asHeatmapPaint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_104_ymbolPaint ofHeatmapPaint(HeatmapPaint value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default LinePaint asLinePaint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_104_ymbolPaint ofLinePaint(LinePaint value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RasterPaint asRasterPaint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_104_ymbolPaint ofRasterPaint(RasterPaint value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default SymbolPaint asSymbolPaint() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfBac_104_ymbolPaint ofSymbolPaint(SymbolPaint value) {
        return Js.cast( value );
    }
    
}
