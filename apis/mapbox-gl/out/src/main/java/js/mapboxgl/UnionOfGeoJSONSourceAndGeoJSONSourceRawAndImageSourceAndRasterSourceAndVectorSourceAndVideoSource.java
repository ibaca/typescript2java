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
public interface UnionOfGeoJSONSourceAndGeoJSONSourceRawAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource extends Source  {
    @JsOverlay
    default GeoJSONSource asGeoJSONSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeoJSONSourceAndGeoJSONSourceRawAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource ofGeoJSONSource(GeoJSONSource value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default GeoJSONSourceRaw asGeoJSONSourceRaw() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeoJSONSourceAndGeoJSONSourceRawAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource ofGeoJSONSourceRaw(GeoJSONSourceRaw value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ImageSource asImageSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeoJSONSourceAndGeoJSONSourceRawAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource ofImageSource(ImageSource value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RasterSource asRasterSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeoJSONSourceAndGeoJSONSourceRawAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource ofRasterSource(RasterSource value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default VectorSource asVectorSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeoJSONSourceAndGeoJSONSourceRawAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource ofVectorSource(VectorSource value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default VideoSource asVideoSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeoJSONSourceAndGeoJSONSourceRawAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource ofVideoSource(VideoSource value) {
        return Js.cast( value );
    }
    
}
