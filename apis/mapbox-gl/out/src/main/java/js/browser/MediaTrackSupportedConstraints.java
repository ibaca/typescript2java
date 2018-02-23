package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaTrackSupportedConstraints
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 270353

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MediaTrackSupportedConstraints
{

    /*
        Properties
    */

    public Boolean aspectRatio;

    public Boolean deviceId;

    public Boolean echoCancellation;

    public Boolean facingMode;

    public Boolean frameRate;

    public Boolean groupId;

    public Boolean height;

    public Boolean sampleRate;

    public Boolean sampleSize;

    public Boolean volume;

    public Boolean width;

    /*
        Methods
    */
    @JsProperty(name = "aspectRatio")
    public native Boolean getAspectRatio();
    @JsProperty(name = "deviceId")
    public native Boolean getDeviceId();
    @JsProperty(name = "echoCancellation")
    public native Boolean getEchoCancellation();
    @JsProperty(name = "facingMode")
    public native Boolean getFacingMode();
    @JsProperty(name = "frameRate")
    public native Boolean getFrameRate();
    @JsProperty(name = "groupId")
    public native Boolean getGroupId();
    @JsProperty(name = "height")
    public native Boolean getHeight();
    @JsProperty(name = "sampleRate")
    public native Boolean getSampleRate();
    @JsProperty(name = "sampleSize")
    public native Boolean getSampleSize();
    @JsProperty(name = "volume")
    public native Boolean getVolume();
    @JsProperty(name = "width")
    public native Boolean getWidth();
    @JsProperty(name = "aspectRatio")
    public native void setAspectRatio(Boolean value);
    @JsProperty(name = "deviceId")
    public native void setDeviceId(Boolean value);
    @JsProperty(name = "echoCancellation")
    public native void setEchoCancellation(Boolean value);
    @JsProperty(name = "facingMode")
    public native void setFacingMode(Boolean value);
    @JsProperty(name = "frameRate")
    public native void setFrameRate(Boolean value);
    @JsProperty(name = "groupId")
    public native void setGroupId(Boolean value);
    @JsProperty(name = "height")
    public native void setHeight(Boolean value);
    @JsProperty(name = "sampleRate")
    public native void setSampleRate(Boolean value);
    @JsProperty(name = "sampleSize")
    public native void setSampleSize(Boolean value);
    @JsProperty(name = "volume")
    public native void setVolume(Boolean value);
    @JsProperty(name = "width")
    public native void setWidth(Boolean value);
}
