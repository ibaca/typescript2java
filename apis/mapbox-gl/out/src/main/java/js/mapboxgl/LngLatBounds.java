package js.mapboxgl;

import js.LngLatBoun_89_gLatBounds;
import js.LngLatLike_UnionOfArrayOfNumberAndLngLat;
import js.browser.Array;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".LngLatBounds
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 16521
  * source type: "tsd/mapbox-gl/index".LngLatBounds
  * flags: TypeParameter (16384)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 16521
  * 9 constructors
  * LngLatBounds
  * LngLatBounds
 */
@JsType(isNative=true, namespace="mapboxgl", name="LngLatBounds")
public class LngLatBounds
{

    /*
        Constructors
    */
    public LngLatBounds (LngLatLike_UnionOfArrayOfNumberAndLngLat sw /* optional */, LngLatLike_UnionOfArrayOfNumberAndLngLat ne /* optional */) {
    } 
    public LngLatBounds (Array<Number> sw /* optional */, Array<Number> ne /* optional */) {
    } 
    public LngLatBounds (LngLat sw /* optional */, Array<Number> ne /* optional */) {
    } 
    public LngLatBounds (Array<Number> sw /* optional */, LngLat ne /* optional */) {
    } 
    public LngLatBounds (LngLat sw /* optional */, LngLat ne /* optional */) {
    } 
    public LngLatBounds (LngLatLike_UnionOfArrayOfNumberAndLngLat sw /* optional */) {
    } 
    public LngLatBounds () {
    } 
    public LngLatBounds (Array<Number> sw /* optional */) {
    } 
    public LngLatBounds (LngLat sw /* optional */) {
    } 

    /*
        Static methods
    */

    /** 
      * Convert an array to a LngLatBounds object, or return an existing LngLatBounds object unchanged. 
      * source : tsd/mapbox-gl/index.d.ts:17896
     */
    @JsMethod(namespace="mapboxgl.LngLatBounds", name = "convert")
    public static native LngLatBounds convert(LngLatBoun_89_gLatBounds input);

    @JsMethod(namespace="mapboxgl.LngLatBounds", name = "convert")
    public static native LngLatBounds convert(Array<Array<Number>> input);

    @JsMethod(namespace="mapboxgl.LngLatBounds", name = "convert")
    public static native LngLatBounds convert(LngLatBounds input);

    /*
        Properties
    */

    public LngLatLike_UnionOfArrayOfNumberAndLngLat ne;

    public LngLatLike_UnionOfArrayOfNumberAndLngLat sw;

    /*
        Methods
    */
    public native LngLatBounds extend(LngLat obj);
    public native LngLatBounds extend(LngLatBounds obj);
    /** 
      * tsd/mapbox-gl/index.d.ts@16870
      * Extend the bounds to include a given LngLat or LngLatBounds. 
     */
    public native LngLatBounds extend(UnionOfLngLatAndLngLatBounds obj);
    /** 
      * tsd/mapbox-gl/index.d.ts@17004
      * Get the point equidistant from this box's corners 
     */
    public native LngLat getCenter();
    /** 
      * tsd/mapbox-gl/index.d.ts@17529
      * Get east edge longitude 
     */
    public native Number getEast();
    @JsProperty(name = "ne")
    public native LngLatLike_UnionOfArrayOfNumberAndLngLat getNe();
    /** 
      * tsd/mapbox-gl/index.d.ts@17596
      * Get north edge latitude 
     */
    public native Number getNorth();
    /** 
      * tsd/mapbox-gl/index.d.ts@17157
      * Get northeast corner 
     */
    public native LngLat getNorthEast();
    /** 
      * tsd/mapbox-gl/index.d.ts@17235
      * Get northwest corner 
     */
    public native LngLat getNorthWest();
    /** 
      * tsd/mapbox-gl/index.d.ts@17461
      * Get south edge latitude 
     */
    public native Number getSouth();
    /** 
      * tsd/mapbox-gl/index.d.ts@17313
      * Get southeast corner 
     */
    public native LngLat getSouthEast();
    /** 
      * tsd/mapbox-gl/index.d.ts@17079
      * Get southwest corner 
     */
    public native LngLat getSouthWest();
    @JsProperty(name = "sw")
    public native LngLatLike_UnionOfArrayOfNumberAndLngLat getSw();
    /** 
      * tsd/mapbox-gl/index.d.ts@17394
      * Get west edge longitude 
     */
    public native Number getWest();
    @JsProperty(name = "ne")
    public native void setNe(LngLat value);
    @JsProperty(name = "ne")
    public native void setNe(Array<Number> value);
    @JsProperty(name = "ne")
    public native void setNe(LngLatLike_UnionOfArrayOfNumberAndLngLat value);
    public native LngLatBounds setNorthEast(LngLat ne);
    public native LngLatBounds setNorthEast(Array<Number> ne);
    /** 
      * tsd/mapbox-gl/index.d.ts@16704
     */
    public native LngLatBounds setNorthEast(LngLatLike_UnionOfArrayOfNumberAndLngLat ne);
    public native LngLatBounds setSouthWest(LngLat sw);
    public native LngLatBounds setSouthWest(Array<Number> sw);
    /** 
      * tsd/mapbox-gl/index.d.ts@16749
     */
    public native LngLatBounds setSouthWest(LngLatLike_UnionOfArrayOfNumberAndLngLat sw);
    @JsProperty(name = "sw")
    public native void setSw(LngLat value);
    @JsProperty(name = "sw")
    public native void setSw(Array<Number> value);
    @JsProperty(name = "sw")
    public native void setSw(LngLatLike_UnionOfArrayOfNumberAndLngLat value);
    /** 
      * tsd/mapbox-gl/index.d.ts@17675
      * Returns a LngLatBounds as an array 
     */
    public native Array<Array<Number>> toArray();
}
