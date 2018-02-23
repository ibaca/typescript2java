package js.mapboxgl;

import js.LngLatLike_UnionOfArrayOfNumberAndLngLat;
import js.PointLike_UnionOfArrayOfNumberAndPoint;
import js.browser.Array;
import js.browser.HTMLElement;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".Marker
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 18818
  * source type: "tsd/mapbox-gl/index".Marker
  * flags: TypeParameter (16384)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 18818
  * 3 constructors
 */
@JsType(isNative=true, namespace="mapboxgl", name="Marker")
public class Marker
{

    /*
        Constructors
    */
    public Marker (HTMLElement element /* optional */, Object options /* optional */) {
    } 
    public Marker (HTMLElement element /* optional */) {
    } 
    public Marker () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/mapbox-gl/index.d.ts@18933
     */
    public native Marker addTo(Map map);
    /** 
      * tsd/mapbox-gl/index.d.ts@18990
     */
    public native LngLat getLngLat();
    /** 
      * tsd/mapbox-gl/index.d.ts@19134
     */
    public native PointLike_UnionOfArrayOfNumberAndPoint getOffset();
    /** 
      * tsd/mapbox-gl/index.d.ts@19106
     */
    public native Popup getPopup();
    /** 
      * tsd/mapbox-gl/index.d.ts@18965
     */
    public native Marker remove();
    public native Marker setLngLat(LngLat lngLat);
    public native Marker setLngLat(Array<Number> lngLat);
    /** 
      * tsd/mapbox-gl/index.d.ts@19020
     */
    public native Marker setLngLat(LngLatLike_UnionOfArrayOfNumberAndLngLat lngLat);
    public native Marker setOffset(Point offset);
    public native Marker setOffset(Array<Number> offset);
    /** 
      * tsd/mapbox-gl/index.d.ts@19167
     */
    public native Marker setOffset(PointLike_UnionOfArrayOfNumberAndPoint offset);
    public native Marker setPopup();
    /** 
      * tsd/mapbox-gl/index.d.ts@19066
     */
    public native Marker setPopup(Popup popup /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@19212
     */
    public native Marker togglePopup();
}
