package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.LngLatLike_UnionOfArrayOfNumberAndLngLat;
import js.browser.Array;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".LngLat
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 15984
  * 1 constructors
  * LngLat
 */
@JsType(isNative=true, namespace="mapboxgl", name="LngLat")
public class LngLat
{

    /*
        Constructors
    */
    public LngLat (@DoNotAutobox Number lng, @DoNotAutobox Number lat) {
    } 

    /*
        Static methods
    */

    /** 
      * source : tsd/mapbox-gl/index.d.ts:16464
     */
    @JsMethod(namespace="mapboxgl.LngLat", name = "convert")
    public static native LngLat convert(LngLatLike_UnionOfArrayOfNumberAndLngLat input);

    @JsMethod(namespace="mapboxgl.LngLat", name = "convert")
    public static native LngLat convert(Array<Number> input);

    @JsMethod(namespace="mapboxgl.LngLat", name = "convert")
    public static native LngLat convert(LngLat input);

    /*
        Properties
    */

    public Number lat;

    public Number lng;

    /*
        Methods
    */
    @JsProperty(name = "lat")
    public native Number getLat();
    @JsProperty(name = "lng")
    public native Number getLng();
    @JsProperty(name = "lat")
    public native void setLat(@DoNotAutobox Number value);
    @JsProperty(name = "lng")
    public native void setLng(@DoNotAutobox Number value);
    /** 
      * tsd/mapbox-gl/index.d.ts@16313
      * Return a LngLat as an array 
     */
    public native Array<Number> toArray();
    /** 
      * tsd/mapbox-gl/index.d.ts@16415
     */
    public native LngLatBounds toBounds(@DoNotAutobox Number radius);
    /** 
      * tsd/mapbox-gl/index.d.ts@16236
      * Return a new LngLat object whose longitude is wrapped to the range (-180, 180). 
     */
    public native LngLat wrap();
}
