package js.mapboxgl;

import js.browser.Array;
import js.browser.HTMLVideoElement;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".VideoSource
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 14324
  * declared in: tsd/mapbox-gl/index.d.ts at pos 14428
  * source type: "tsd/mapbox-gl/index".VideoSource
  * flags: TypeParameter (16384)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 14324
  * declared in: tsd/mapbox-gl/index.d.ts at pos 14428
  * 2 constructors
  * VideoSource
  * VideoSource
 */
@JsType(isNative=true, namespace="mapboxgl", name="VideoSource")
public class VideoSource implements VideoSourceOptions, Source 
{

    /*
        Constructors
    */
    public VideoSource (VideoSourceOptions options /* optional */) {
    } 
    public VideoSource () {
    } 

    /*
        Properties
    */

    public Array<Array<Number>> coordinates;

    public String type;

    public Array<String> urls;

    /*
        Methods
    */
    /** 
      * inherited from (js.mapboxgl.VideoSourceOptions)
     */
    @JsProperty(name = "coordinates")
    public native Array<Array<Number>> getCoordinates();
    /** 
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
     */
    @JsProperty(name = "type")
    public native String getType();
    /** 
      * inherited from (js.mapboxgl.VideoSourceOptions)
     */
    @JsProperty(name = "urls")
    public native Array<String> getUrls();
    /** 
      * tsd/mapbox-gl/index.d.ts@14572
     */
    public native HTMLVideoElement getVideo();
    /** 
      * inherited from (js.mapboxgl.VideoSourceOptions)
     */
    @JsProperty(name = "coordinates")
    public native void setCoordinates(Array<Array<Number>> value);
    /** 
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
      * inherited from (js.mapboxgl.Source)
     */
    @JsProperty(name = "type")
    public native void setType(String value);
    /** 
      * inherited from (js.mapboxgl.VideoSourceOptions)
     */
    @JsProperty(name = "urls")
    public native void setUrls(Array<String> value);
}
