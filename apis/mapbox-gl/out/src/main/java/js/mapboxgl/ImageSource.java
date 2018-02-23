package js.mapboxgl;

import js.browser.Array;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".ImageSource
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 14772
  * declared in: tsd/mapbox-gl/index.d.ts at pos 14876
  * source type: "tsd/mapbox-gl/index".ImageSource
  * flags: TypeParameter (16384)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 14772
  * declared in: tsd/mapbox-gl/index.d.ts at pos 14876
  * 2 constructors
  * ImageSource
  * ImageSource
 */
@JsType(isNative=true, namespace="mapboxgl", name="ImageSource")
public class ImageSource implements ImageSourceOptions, Source 
{

    /*
        Constructors
    */
    public ImageSource (ImageSourceOptions options /* optional */) {
    } 
    public ImageSource () {
    } 

    /*
        Properties
    */

    public Array<Array<Number>> coordinates;

    public String type;

    public String url;

    /*
        Methods
    */
    /** 
      * inherited from (js.mapboxgl.ImageSourceOptions)
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
      * inherited from (js.mapboxgl.ImageSourceOptions)
     */
    @JsProperty(name = "url")
    public native String getUrl();
    /** 
      * inherited from (js.mapboxgl.ImageSourceOptions)
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
      * inherited from (js.mapboxgl.ImageSourceOptions)
     */
    @JsProperty(name = "url")
    public native void setUrl(String value);
}
