package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaTrackSettings
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 270055

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MediaTrackSettings
{

    /*
        Properties
    */

    public Number aspectRatio;

    public String deviceId;

    public Boolean echoCancellation;

    public String facingMode;

    public Number frameRate;

    public String groupId;

    public Number height;

    public Number sampleRate;

    public Number sampleSize;

    public Number volume;

    public Number width;

    /*
        Methods
    */
    @JsProperty(name = "aspectRatio")
    public native Number getAspectRatio();
    @JsProperty(name = "deviceId")
    public native String getDeviceId();
    @JsProperty(name = "echoCancellation")
    public native Boolean getEchoCancellation();
    @JsProperty(name = "facingMode")
    public native String getFacingMode();
    @JsProperty(name = "frameRate")
    public native Number getFrameRate();
    @JsProperty(name = "groupId")
    public native String getGroupId();
    @JsProperty(name = "height")
    public native Number getHeight();
    @JsProperty(name = "sampleRate")
    public native Number getSampleRate();
    @JsProperty(name = "sampleSize")
    public native Number getSampleSize();
    @JsProperty(name = "volume")
    public native Number getVolume();
    @JsProperty(name = "width")
    public native Number getWidth();
    @JsProperty(name = "aspectRatio")
    public native void setAspectRatio(@DoNotAutobox Number value);
    @JsProperty(name = "deviceId")
    public native void setDeviceId(String value);
    @JsProperty(name = "echoCancellation")
    public native void setEchoCancellation(Boolean value);
    @JsProperty(name = "facingMode")
    public native void setFacingMode(String value);
    @JsProperty(name = "frameRate")
    public native void setFrameRate(@DoNotAutobox Number value);
    @JsProperty(name = "groupId")
    public native void setGroupId(String value);
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    @JsProperty(name = "sampleRate")
    public native void setSampleRate(@DoNotAutobox Number value);
    @JsProperty(name = "sampleSize")
    public native void setSampleSize(@DoNotAutobox Number value);
    @JsProperty(name = "volume")
    public native void setVolume(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
}
