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
public interface UnionOfGeo_86_ideoSource  {
    @JsOverlay
    default GeoJSONSource asGeoJSONSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeo_86_ideoSource ofGeoJSONSource(GeoJSONSource value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default GeoJSONSourceRaw asGeoJSONSourceRaw() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeo_86_ideoSource ofGeoJSONSourceRaw(GeoJSONSourceRaw value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ImageSource asImageSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeo_86_ideoSource ofImageSource(ImageSource value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RasterSource asRasterSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeo_86_ideoSource ofRasterSource(RasterSource value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default String asString() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeo_86_ideoSource ofString(String value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default VectorSource asVectorSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeo_86_ideoSource ofVectorSource(VectorSource value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default VideoSource asVideoSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeo_86_ideoSource ofVideoSource(VideoSource value) {
        return Js.cast( value );
    }
    
}
