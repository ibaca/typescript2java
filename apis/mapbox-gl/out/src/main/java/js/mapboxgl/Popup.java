package js.mapboxgl;

import js.LngLatLike_UnionOfArrayOfNumberAndLngLat;
import js.browser.Array;
import js.browser.Node;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".Popup
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 11919
  * source type: "tsd/mapbox-gl/index".Popup
  * flags: TypeParameter (16384)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 11919
  * 2 constructors
  * Popup
  * Popup
 */
@JsType(isNative=true, namespace="mapboxgl", name="Popup")
public class Popup extends Evented 
{

    /*
        Constructors
    */
    public Popup (PopupOptions options /* optional */) {
    } 
    public Popup () {
    } 

    /*
        Methods
    */
    /** 
      * tsd/mapbox-gl/index.d.ts@12054
     */
    public native Popup addTo(Map map);
    /** 
      * tsd/mapbox-gl/index.d.ts@12148
     */
    public native LngLat getLngLat();
    /** 
      * tsd/mapbox-gl/index.d.ts@12095
     */
    public native Boolean isOpen();
    /** 
      * tsd/mapbox-gl/index.d.ts@12123
     */
    public native Popup remove();
    /** 
      * tsd/mapbox-gl/index.d.ts@12309
     */
    public native Popup setDOMContent(Node htmlNode);
    /** 
      * tsd/mapbox-gl/index.d.ts@12271
     */
    public native Popup setHTML(String html);
    public native Popup setLngLat(LngLat lnglat);
    public native Popup setLngLat(Array<Number> lnglat);
    /** 
      * tsd/mapbox-gl/index.d.ts@12187
     */
    public native Popup setLngLat(LngLatLike_UnionOfArrayOfNumberAndLngLat lnglat);
    /** 
      * tsd/mapbox-gl/index.d.ts@12233
     */
    public native Popup setText(String text);
}
