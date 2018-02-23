package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaStreamConstraints
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 268554

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MediaStreamConstraints
{

    /*
        Properties
    */

    public UnionOfBooleanAndMediaTrackConstraints audio;

    public UnionOfBooleanAndMediaTrackConstraints video;

    /*
        Methods
    */
    @JsProperty(name = "audio")
    public native UnionOfBooleanAndMediaTrackConstraints getAudio();
    @JsProperty(name = "video")
    public native UnionOfBooleanAndMediaTrackConstraints getVideo();
    @JsProperty(name = "audio")
    public native void setAudio(MediaTrackConstraints value);
    @JsProperty(name = "audio")
    public native void setAudio(Boolean value);
    @JsProperty(name = "audio")
    public native void setAudio(UnionOfBooleanAndMediaTrackConstraints value);
    @JsProperty(name = "video")
    public native void setVideo(MediaTrackConstraints value);
    @JsProperty(name = "video")
    public native void setVideo(Boolean value);
    @JsProperty(name = "video")
    public native void setVideo(UnionOfBooleanAndMediaTrackConstraints value);
}
