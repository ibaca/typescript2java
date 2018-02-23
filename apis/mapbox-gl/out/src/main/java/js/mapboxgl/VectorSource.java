package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.browser.Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".VectorSource
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 15608

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class VectorSource implements Source 
{

    /*
        Properties
    */

    public Number maxzoom;

    public Number minzoom;

    public Array<String> tiles;

    public String type;

    public String url;

    /*
        Methods
    */
    @JsProperty(name = "maxzoom")
    public native Number getMaxzoom();
    @JsProperty(name = "minzoom")
    public native Number getMinzoom();
    @JsProperty(name = "tiles")
    public native Array<String> getTiles();
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
    @JsProperty(name = "url")
    public native String getUrl();
    @JsProperty(name = "maxzoom")
    public native void setMaxzoom(@DoNotAutobox Number value);
    @JsProperty(name = "minzoom")
    public native void setMinzoom(@DoNotAutobox Number value);
    @JsProperty(name = "tiles")
    public native void setTiles(Array<String> value);
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
    @JsProperty(name = "url")
    public native void setUrl(String value);
}
