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
public interface UnionOfGeoJSONSourceAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource extends Source  {
    @JsOverlay
    default GeoJSONSource asGeoJSONSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeoJSONSourceAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource ofGeoJSONSource(GeoJSONSource value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default ImageSource asImageSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeoJSONSourceAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource ofImageSource(ImageSource value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default RasterSource asRasterSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeoJSONSourceAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource ofRasterSource(RasterSource value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default VectorSource asVectorSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeoJSONSourceAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource ofVectorSource(VectorSource value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default VideoSource asVideoSource() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfGeoJSONSourceAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource ofVideoSource(VideoSource value) {
        return Js.cast( value );
    }
    
}
