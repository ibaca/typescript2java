package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.PointLike_UnionOfArrayOfNumberAndPoint;
import js.browser.Array;
import js.browser.Function;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".AnimationOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 20772

  * AnimationOptions
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface AnimationOptions
{

    /*
        Methods
    */
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "animate")
    Boolean getAnimate();
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "duration")
    Number getDuration();
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "easing")
    Function getEasing();
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "offset")
    PointLike_UnionOfArrayOfNumberAndPoint getOffset();
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "animate")
    void setAnimate(Boolean value);
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "duration")
    void setDuration(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "easing")
    void setEasing(Function value);
    @JsProperty(name = "offset")
    void setOffset(Point value);
    @JsProperty(name = "offset")
    void setOffset(Array<Number> value);
    /** 
      * inherited from (js.mapboxgl.AnimationOptions)
     */
    @JsProperty(name = "offset")
    void setOffset(PointLike_UnionOfArrayOfNumberAndPoint value);
}
