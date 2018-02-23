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
public interface UnionOfAnimationOptionsAndCameraOptions  {
    @JsOverlay
    default AnimationOptions asAnimationOptions() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnimationOptionsAndCameraOptions ofAnimationOptions(AnimationOptions value) {
        return Js.cast( value );
    }
    
    @JsOverlay
    default CameraOptions asCameraOptions() {
        return Js.cast( this );
    }
    
    @JsOverlay
    static  UnionOfAnimationOptionsAndCameraOptions ofCameraOptions(CameraOptions value) {
        return Js.cast( value );
    }
    
}
