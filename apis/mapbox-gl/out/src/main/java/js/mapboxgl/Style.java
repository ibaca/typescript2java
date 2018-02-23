package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.browser.Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".Style
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 12643

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class Style
{

    /*
        Properties
    */

    public Number bearing;

    public Array<Number> center;

    public String glyphs;

    public Array<Layer> layers;

    public Light light;

    public Object metadata;

    public String name;

    public Number pitch;

    public Object sources;

    public String sprite;

    public Transition transition;

    public Number version;

    public Number zoom;

    /*
        Methods
    */
    @JsProperty(name = "bearing")
    public native Number getBearing();
    @JsProperty(name = "center")
    public native Array<Number> getCenter();
    @JsProperty(name = "glyphs")
    public native String getGlyphs();
    @JsProperty(name = "layers")
    public native Array<Layer> getLayers();
    @JsProperty(name = "light")
    public native Light getLight();
    @JsProperty(name = "metadata")
    public native Object getMetadata();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "pitch")
    public native Number getPitch();
    @JsProperty(name = "sources")
    public native Object getSources();
    @JsProperty(name = "sprite")
    public native String getSprite();
    @JsProperty(name = "transition")
    public native Transition getTransition();
    @JsProperty(name = "version")
    public native Number getVersion();
    @JsProperty(name = "zoom")
    public native Number getZoom();
    @JsProperty(name = "bearing")
    public native void setBearing(@DoNotAutobox Number value);
    @JsProperty(name = "center")
    public native void setCenter(Array<Number> value);
    @JsProperty(name = "glyphs")
    public native void setGlyphs(String value);
    @JsProperty(name = "layers")
    public native void setLayers(Array<Layer> value);
    @JsProperty(name = "light")
    public native void setLight(Light value);
    @JsProperty(name = "metadata")
    public native void setMetadata(Object value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "pitch")
    public native void setPitch(@DoNotAutobox Number value);
    @JsProperty(name = "sources")
    public native void setSources(Object value);
    @JsProperty(name = "sprite")
    public native void setSprite(String value);
    @JsProperty(name = "transition")
    public native void setTransition(Transition value);
    @JsProperty(name = "version")
    public native void setVersion(@DoNotAutobox Number value);
    @JsProperty(name = "zoom")
    public native void setZoom(@DoNotAutobox Number value);
}
