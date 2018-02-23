package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.PointLike_UnionOfArrayOfNumberAndPoint;
import js.browser.Array;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".Point
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 17965
  * 1 constructors
  * Point
 */
@JsType(isNative=true, namespace="mapboxgl", name="Point")
public class Point
{

    /*
        Constructors
    */
    public Point (@DoNotAutobox Number x, @DoNotAutobox Number y) {
    } 

    /*
        Static methods
    */

    /** 
      * source : tsd/mapbox-gl/index.d.ts:18776
     */
    @JsMethod(namespace="mapboxgl.Point", name = "convert")
    public static native Point convert(PointLike_UnionOfArrayOfNumberAndPoint a);

    @JsMethod(namespace="mapboxgl.Point", name = "convert")
    public static native Point convert(Array<Number> a);

    @JsMethod(namespace="mapboxgl.Point", name = "convert")
    public static native Point convert(Point a);

    /*
        Properties
    */

    public Number x;

    public Number y;

    /*
        Methods
    */
    /** 
      * tsd/mapbox-gl/index.d.ts@18220
     */
    public native Point add(@DoNotAutobox Number p);
    /** 
      * tsd/mapbox-gl/index.d.ts@18622
     */
    public native Number angle();
    /** 
      * tsd/mapbox-gl/index.d.ts@18648
     */
    public native Number angleTo(Point p);
    /** 
      * tsd/mapbox-gl/index.d.ts@18684
     */
    public native Number angleWidth(Point p);
    /** 
      * tsd/mapbox-gl/index.d.ts@18723
     */
    public native Number angleWithSep(@DoNotAutobox Number x, @DoNotAutobox Number y);
    /** 
      * tsd/mapbox-gl/index.d.ts@18195
     */
    public native Point clone();
    /** 
      * tsd/mapbox-gl/index.d.ts@18553
     */
    public native Number dist(Point p);
    /** 
      * tsd/mapbox-gl/index.d.ts@18586
     */
    public native Number distSqr(Point p);
    /** 
      * tsd/mapbox-gl/index.d.ts@18317
     */
    public native Point div(@DoNotAutobox Number k);
    /** 
      * tsd/mapbox-gl/index.d.ts@18517
     */
    public native Boolean equals(Point p);
    @JsProperty(name = "x")
    public native Number getX();
    @JsProperty(name = "y")
    public native Number getY();
    /** 
      * tsd/mapbox-gl/index.d.ts@18493
     */
    public native Number mag();
    /** 
      * tsd/mapbox-gl/index.d.ts@18384
     */
    public native Point matMult(@DoNotAutobox Number m);
    /** 
      * tsd/mapbox-gl/index.d.ts@18284
     */
    public native Point mult(@DoNotAutobox Number k);
    /** 
      * tsd/mapbox-gl/index.d.ts@18444
     */
    public native Point perp();
    /** 
      * tsd/mapbox-gl/index.d.ts@18349
     */
    public native Point rotate(@DoNotAutobox Number a);
    /** 
      * tsd/mapbox-gl/index.d.ts@18468
     */
    public native Point round();
    @JsProperty(name = "x")
    public native void setX(@DoNotAutobox Number value);
    @JsProperty(name = "y")
    public native void setY(@DoNotAutobox Number value);
    /** 
      * tsd/mapbox-gl/index.d.ts@18252
     */
    public native Point sub(@DoNotAutobox Number p);
    /** 
      * tsd/mapbox-gl/index.d.ts@18420
     */
    public native Point unit();
}
