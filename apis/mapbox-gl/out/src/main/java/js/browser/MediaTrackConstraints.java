package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaTrackConstraints
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 269944

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MediaTrackConstraints implements MediaTrackConstraintSet 
{

    /*
        Properties
    */

    public Array<MediaTrackConstraintSet> advanced;

    public UnionOfConstrainDoubleRangeAndNumber aspectRatio;

    public UnionOfArrayOfStringAndConstrainDOMStringParametersAndString deviceId;

    public UnionOfBooleanAndConstrainBooleanParameters echoCancelation;

    public UnionOfArrayOfStringAndConstrainDOMStringParametersAndString facingMode;

    public UnionOfConstrainDoubleRangeAndNumber frameRate;

    public UnionOfArrayOfStringAndConstrainDOMStringParametersAndString groupId;

    public UnionOfConstrainLongRangeAndNumber height;

    public UnionOfConstrainLongRangeAndNumber sampleRate;

    public UnionOfConstrainLongRangeAndNumber sampleSize;

    public UnionOfConstrainDoubleRangeAndNumber volume;

    public UnionOfConstrainLongRangeAndNumber width;

    /*
        Methods
    */
    @JsProperty(name = "advanced")
    public native Array<MediaTrackConstraintSet> getAdvanced();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "aspectRatio")
    public native UnionOfConstrainDoubleRangeAndNumber getAspectRatio();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "deviceId")
    public native UnionOfArrayOfStringAndConstrainDOMStringParametersAndString getDeviceId();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "echoCancelation")
    public native UnionOfBooleanAndConstrainBooleanParameters getEchoCancelation();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "facingMode")
    public native UnionOfArrayOfStringAndConstrainDOMStringParametersAndString getFacingMode();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "frameRate")
    public native UnionOfConstrainDoubleRangeAndNumber getFrameRate();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "groupId")
    public native UnionOfArrayOfStringAndConstrainDOMStringParametersAndString getGroupId();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "height")
    public native UnionOfConstrainLongRangeAndNumber getHeight();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "sampleRate")
    public native UnionOfConstrainLongRangeAndNumber getSampleRate();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "sampleSize")
    public native UnionOfConstrainLongRangeAndNumber getSampleSize();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "volume")
    public native UnionOfConstrainDoubleRangeAndNumber getVolume();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "width")
    public native UnionOfConstrainLongRangeAndNumber getWidth();
    @JsProperty(name = "advanced")
    public native void setAdvanced(Array<MediaTrackConstraintSet> value);
    @JsProperty(name = "aspectRatio")
    public native void setAspectRatio(ConstrainDoubleRange value);
    @JsProperty(name = "aspectRatio")
    public native void setAspectRatio(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "aspectRatio")
    public native void setAspectRatio(UnionOfConstrainDoubleRangeAndNumber value);
    @JsProperty(name = "deviceId")
    public native void setDeviceId(String value);
    @JsProperty(name = "deviceId")
    public native void setDeviceId(ConstrainDOMStringParameters value);
    @JsProperty(name = "deviceId")
    public native void setDeviceId(Array<String> value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "deviceId")
    public native void setDeviceId(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString value);
    @JsProperty(name = "echoCancelation")
    public native void setEchoCancelation(ConstrainBooleanParameters value);
    @JsProperty(name = "echoCancelation")
    public native void setEchoCancelation(Boolean value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "echoCancelation")
    public native void setEchoCancelation(UnionOfBooleanAndConstrainBooleanParameters value);
    @JsProperty(name = "facingMode")
    public native void setFacingMode(String value);
    @JsProperty(name = "facingMode")
    public native void setFacingMode(ConstrainDOMStringParameters value);
    @JsProperty(name = "facingMode")
    public native void setFacingMode(Array<String> value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "facingMode")
    public native void setFacingMode(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString value);
    @JsProperty(name = "frameRate")
    public native void setFrameRate(ConstrainDoubleRange value);
    @JsProperty(name = "frameRate")
    public native void setFrameRate(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "frameRate")
    public native void setFrameRate(UnionOfConstrainDoubleRangeAndNumber value);
    @JsProperty(name = "groupId")
    public native void setGroupId(String value);
    @JsProperty(name = "groupId")
    public native void setGroupId(ConstrainDOMStringParameters value);
    @JsProperty(name = "groupId")
    public native void setGroupId(Array<String> value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "groupId")
    public native void setGroupId(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString value);
    @JsProperty(name = "height")
    public native void setHeight(ConstrainLongRange value);
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "height")
    public native void setHeight(UnionOfConstrainLongRangeAndNumber value);
    @JsProperty(name = "sampleRate")
    public native void setSampleRate(ConstrainLongRange value);
    @JsProperty(name = "sampleRate")
    public native void setSampleRate(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "sampleRate")
    public native void setSampleRate(UnionOfConstrainLongRangeAndNumber value);
    @JsProperty(name = "sampleSize")
    public native void setSampleSize(ConstrainLongRange value);
    @JsProperty(name = "sampleSize")
    public native void setSampleSize(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "sampleSize")
    public native void setSampleSize(UnionOfConstrainLongRangeAndNumber value);
    @JsProperty(name = "volume")
    public native void setVolume(ConstrainDoubleRange value);
    @JsProperty(name = "volume")
    public native void setVolume(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "volume")
    public native void setVolume(UnionOfConstrainDoubleRangeAndNumber value);
    @JsProperty(name = "width")
    public native void setWidth(ConstrainLongRange value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "width")
    public native void setWidth(UnionOfConstrainLongRangeAndNumber value);
}
