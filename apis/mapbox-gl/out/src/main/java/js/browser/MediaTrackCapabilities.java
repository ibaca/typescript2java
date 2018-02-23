package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaTrackCapabilities
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 268940

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MediaTrackCapabilities
{

    /*
        Properties
    */

    public UnionOfDoubleRangeAndNumber aspectRatio;

    public String deviceId;

    public Array<Boolean> echoCancellation;

    public String facingMode;

    public UnionOfDoubleRangeAndNumber frameRate;

    public String groupId;

    public UnionOfLongRangeAndNumber height;

    public UnionOfLongRangeAndNumber sampleRate;

    public UnionOfLongRangeAndNumber sampleSize;

    public UnionOfDoubleRangeAndNumber volume;

    public UnionOfLongRangeAndNumber width;

    /*
        Methods
    */
    @JsProperty(name = "aspectRatio")
    public native UnionOfDoubleRangeAndNumber getAspectRatio();
    @JsProperty(name = "deviceId")
    public native String getDeviceId();
    @JsProperty(name = "echoCancellation")
    public native Array<Boolean> getEchoCancellation();
    @JsProperty(name = "facingMode")
    public native String getFacingMode();
    @JsProperty(name = "frameRate")
    public native UnionOfDoubleRangeAndNumber getFrameRate();
    @JsProperty(name = "groupId")
    public native String getGroupId();
    @JsProperty(name = "height")
    public native UnionOfLongRangeAndNumber getHeight();
    @JsProperty(name = "sampleRate")
    public native UnionOfLongRangeAndNumber getSampleRate();
    @JsProperty(name = "sampleSize")
    public native UnionOfLongRangeAndNumber getSampleSize();
    @JsProperty(name = "volume")
    public native UnionOfDoubleRangeAndNumber getVolume();
    @JsProperty(name = "width")
    public native UnionOfLongRangeAndNumber getWidth();
    @JsProperty(name = "aspectRatio")
    public native void setAspectRatio(DoubleRange value);
    @JsProperty(name = "aspectRatio")
    public native void setAspectRatio(@DoNotAutobox Number value);
    @JsProperty(name = "aspectRatio")
    public native void setAspectRatio(UnionOfDoubleRangeAndNumber value);
    @JsProperty(name = "deviceId")
    public native void setDeviceId(String value);
    @JsProperty(name = "echoCancellation")
    public native void setEchoCancellation(Array<Boolean> value);
    @JsProperty(name = "facingMode")
    public native void setFacingMode(String value);
    @JsProperty(name = "frameRate")
    public native void setFrameRate(DoubleRange value);
    @JsProperty(name = "frameRate")
    public native void setFrameRate(@DoNotAutobox Number value);
    @JsProperty(name = "frameRate")
    public native void setFrameRate(UnionOfDoubleRangeAndNumber value);
    @JsProperty(name = "groupId")
    public native void setGroupId(String value);
    @JsProperty(name = "height")
    public native void setHeight(LongRange value);
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    @JsProperty(name = "height")
    public native void setHeight(UnionOfLongRangeAndNumber value);
    @JsProperty(name = "sampleRate")
    public native void setSampleRate(LongRange value);
    @JsProperty(name = "sampleRate")
    public native void setSampleRate(@DoNotAutobox Number value);
    @JsProperty(name = "sampleRate")
    public native void setSampleRate(UnionOfLongRangeAndNumber value);
    @JsProperty(name = "sampleSize")
    public native void setSampleSize(LongRange value);
    @JsProperty(name = "sampleSize")
    public native void setSampleSize(@DoNotAutobox Number value);
    @JsProperty(name = "sampleSize")
    public native void setSampleSize(UnionOfLongRangeAndNumber value);
    @JsProperty(name = "volume")
    public native void setVolume(DoubleRange value);
    @JsProperty(name = "volume")
    public native void setVolume(@DoNotAutobox Number value);
    @JsProperty(name = "volume")
    public native void setVolume(UnionOfDoubleRangeAndNumber value);
    @JsProperty(name = "width")
    public native void setWidth(LongRange value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(UnionOfLongRangeAndNumber value);
}
