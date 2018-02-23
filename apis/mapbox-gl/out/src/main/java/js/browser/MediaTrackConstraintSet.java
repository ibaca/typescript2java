package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaTrackConstraintSet
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 269334
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface MediaTrackConstraintSet
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "aspectRatio")
    UnionOfConstrainDoubleRangeAndNumber getAspectRatio();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "deviceId")
    UnionOfArrayOfStringAndConstrainDOMStringParametersAndString getDeviceId();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "echoCancelation")
    UnionOfBooleanAndConstrainBooleanParameters getEchoCancelation();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "facingMode")
    UnionOfArrayOfStringAndConstrainDOMStringParametersAndString getFacingMode();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "frameRate")
    UnionOfConstrainDoubleRangeAndNumber getFrameRate();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "groupId")
    UnionOfArrayOfStringAndConstrainDOMStringParametersAndString getGroupId();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "height")
    UnionOfConstrainLongRangeAndNumber getHeight();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "sampleRate")
    UnionOfConstrainLongRangeAndNumber getSampleRate();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "sampleSize")
    UnionOfConstrainLongRangeAndNumber getSampleSize();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "volume")
    UnionOfConstrainDoubleRangeAndNumber getVolume();
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "width")
    UnionOfConstrainLongRangeAndNumber getWidth();
    @JsProperty(name = "aspectRatio")
    void setAspectRatio(ConstrainDoubleRange value);
    @JsProperty(name = "aspectRatio")
    void setAspectRatio(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "aspectRatio")
    void setAspectRatio(UnionOfConstrainDoubleRangeAndNumber value);
    @JsProperty(name = "deviceId")
    void setDeviceId(String value);
    @JsProperty(name = "deviceId")
    void setDeviceId(ConstrainDOMStringParameters value);
    @JsProperty(name = "deviceId")
    void setDeviceId(Array<String> value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "deviceId")
    void setDeviceId(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString value);
    @JsProperty(name = "echoCancelation")
    void setEchoCancelation(ConstrainBooleanParameters value);
    @JsProperty(name = "echoCancelation")
    void setEchoCancelation(Boolean value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "echoCancelation")
    void setEchoCancelation(UnionOfBooleanAndConstrainBooleanParameters value);
    @JsProperty(name = "facingMode")
    void setFacingMode(String value);
    @JsProperty(name = "facingMode")
    void setFacingMode(ConstrainDOMStringParameters value);
    @JsProperty(name = "facingMode")
    void setFacingMode(Array<String> value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "facingMode")
    void setFacingMode(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString value);
    @JsProperty(name = "frameRate")
    void setFrameRate(ConstrainDoubleRange value);
    @JsProperty(name = "frameRate")
    void setFrameRate(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "frameRate")
    void setFrameRate(UnionOfConstrainDoubleRangeAndNumber value);
    @JsProperty(name = "groupId")
    void setGroupId(String value);
    @JsProperty(name = "groupId")
    void setGroupId(ConstrainDOMStringParameters value);
    @JsProperty(name = "groupId")
    void setGroupId(Array<String> value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "groupId")
    void setGroupId(UnionOfArrayOfStringAndConstrainDOMStringParametersAndString value);
    @JsProperty(name = "height")
    void setHeight(ConstrainLongRange value);
    @JsProperty(name = "height")
    void setHeight(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "height")
    void setHeight(UnionOfConstrainLongRangeAndNumber value);
    @JsProperty(name = "sampleRate")
    void setSampleRate(ConstrainLongRange value);
    @JsProperty(name = "sampleRate")
    void setSampleRate(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "sampleRate")
    void setSampleRate(UnionOfConstrainLongRangeAndNumber value);
    @JsProperty(name = "sampleSize")
    void setSampleSize(ConstrainLongRange value);
    @JsProperty(name = "sampleSize")
    void setSampleSize(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "sampleSize")
    void setSampleSize(UnionOfConstrainLongRangeAndNumber value);
    @JsProperty(name = "volume")
    void setVolume(ConstrainDoubleRange value);
    @JsProperty(name = "volume")
    void setVolume(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "volume")
    void setVolume(UnionOfConstrainDoubleRangeAndNumber value);
    @JsProperty(name = "width")
    void setWidth(ConstrainLongRange value);
    @JsProperty(name = "width")
    void setWidth(@DoNotAutobox Number value);
    /** 
      * inherited from (js.browser.MediaTrackConstraintSet)
     */
    @JsProperty(name = "width")
    void setWidth(UnionOfConstrainLongRangeAndNumber value);
}
