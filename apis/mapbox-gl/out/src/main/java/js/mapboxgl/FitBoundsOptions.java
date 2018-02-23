package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.LngLatLike_UnionOfArrayOfNumberAndLngLat;
import js.PointLike_UnionOfArrayOfNumberAndPoint;
import js.browser.Array;
import js.browser.Function;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".FitBoundsOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 21868

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class FitBoundsOptions implements FlyToOptions 
{

    /*
        Properties
    */

    /** 
      * When set to false, no animation happens 
     */
    public Boolean animate;

    /** 
      * If zooming, the zoom center (defaults to map center) 
     */
    public LngLatLike_UnionOfArrayOfNumberAndLngLat around;

    /** 
      * Map rotation bearing in degrees counter-clockwise from north 
     */
    public Number bearing;

    /** 
      * Map center 
     */
    public LngLatLike_UnionOfArrayOfNumberAndLngLat center;

    public Number curve;

    /** 
      * Number in milliseconds 
     */
    public Number duration;

    public Function easing;

    public Boolean linear;

    public Number maxDuration;

    public Number maxZoom;

    public Number minZoom;

    /** 
      * point, origin of movement relative to map center 
     */
    public PointLike_UnionOfArrayOfNumberAndPoint offset;

    public UnionOfNumberAndPaddingOptions padding;

    /** 
      * Map angle in degrees at which the camera is looking at the ground 
     */
    public Number pitch;

    public Number screenSpeed;

    public Number speed;

    /** 
      * Map zoom level 
     */
    public Number zoom;

    /*
        Methods
    */
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "animate")
    public native Boolean getAnimate();
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "around")
    public native LngLatLike_UnionOfArrayOfNumberAndLngLat getAround();
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "bearing")
    public native Number getBearing();
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "center")
    public native LngLatLike_UnionOfArrayOfNumberAndLngLat getCenter();
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "curve")
    public native Number getCurve();
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "duration")
    public native Number getDuration();
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "easing")
    public native Function getEasing();
    @JsProperty(name = "linear")
    public native Boolean getLinear();
    @JsProperty(name = "maxDuration")
    public native Number getMaxDuration();
    @JsProperty(name = "maxZoom")
    public native Number getMaxZoom();
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "minZoom")
    public native Number getMinZoom();
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "offset")
    public native PointLike_UnionOfArrayOfNumberAndPoint getOffset();
    @JsProperty(name = "padding")
    public native UnionOfNumberAndPaddingOptions getPadding();
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "pitch")
    public native Number getPitch();
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "screenSpeed")
    public native Number getScreenSpeed();
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "speed")
    public native Number getSpeed();
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "zoom")
    public native Number getZoom();
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "animate")
    public native void setAnimate(Boolean value);
    @JsProperty(name = "around")
    public native void setAround(LngLat value);
    @JsProperty(name = "around")
    public native void setAround(Array<Number> value);
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "around")
    public native void setAround(LngLatLike_UnionOfArrayOfNumberAndLngLat value);
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "bearing")
    public native void setBearing(@DoNotAutobox Number value);
    @JsProperty(name = "center")
    public native void setCenter(LngLat value);
    @JsProperty(name = "center")
    public native void setCenter(Array<Number> value);
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "center")
    public native void setCenter(LngLatLike_UnionOfArrayOfNumberAndLngLat value);
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "curve")
    public native void setCurve(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "duration")
    public native void setDuration(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "easing")
    public native void setEasing(Function value);
    @JsProperty(name = "linear")
    public native void setLinear(Boolean value);
    @JsProperty(name = "maxDuration")
    public native void setMaxDuration(@DoNotAutobox Number value);
    @JsProperty(name = "maxZoom")
    public native void setMaxZoom(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "minZoom")
    public native void setMinZoom(@DoNotAutobox Number value);
    @JsProperty(name = "offset")
    public native void setOffset(Point value);
    @JsProperty(name = "offset")
    public native void setOffset(Array<Number> value);
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "offset")
    public native void setOffset(PointLike_UnionOfArrayOfNumberAndPoint value);
    @JsProperty(name = "padding")
    public native void setPadding(@DoNotAutobox Number value);
    @JsProperty(name = "padding")
    public native void setPadding(PaddingOptions value);
    @JsProperty(name = "padding")
    public native void setPadding(UnionOfNumberAndPaddingOptions value);
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "pitch")
    public native void setPitch(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "screenSpeed")
    public native void setScreenSpeed(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.FlyToOptions)
     */
    @JsProperty(name = "speed")
    public native void setSpeed(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "zoom")
    public native void setZoom(@DoNotAutobox Number value);
}
