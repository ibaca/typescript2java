package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.LngLatLike_UnionOfArrayOfNumberAndLngLat;
import js.browser.Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".CameraOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 21125

  * CameraOptions
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface CameraOptions
{

    /*
        Methods
    */
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "around")
    LngLatLike_UnionOfArrayOfNumberAndLngLat getAround();
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "bearing")
    Number getBearing();
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "center")
    LngLatLike_UnionOfArrayOfNumberAndLngLat getCenter();
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "pitch")
    Number getPitch();
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "zoom")
    Number getZoom();
    @JsProperty(name = "around")
    void setAround(LngLat value);
    @JsProperty(name = "around")
    void setAround(Array<Number> value);
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "around")
    void setAround(LngLatLike_UnionOfArrayOfNumberAndLngLat value);
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "bearing")
    void setBearing(@DoNotAutobox Number value);
    @JsProperty(name = "center")
    void setCenter(LngLat value);
    @JsProperty(name = "center")
    void setCenter(Array<Number> value);
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "center")
    void setCenter(LngLatLike_UnionOfArrayOfNumberAndLngLat value);
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "pitch")
    void setPitch(@DoNotAutobox Number value);
    /** 
      * inherited from (js.mapboxgl.CameraOptions)
     */
    @JsProperty(name = "zoom")
    void setZoom(@DoNotAutobox Number value);
}
