package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.browser.Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".Layer
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 24487

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class Layer
{

    /*
        Properties
    */

    public Array<Object> filter;

    public String id;

    public Boolean interactive;

    public UnionOfBac_112_mbolLayout layout;

    public Number maxzoom;

    public Object metadata;

    public Number minzoom;

    public UnionOfBac_104_ymbolPaint paint;

    public String ref;

    public UnionOfGeo_86_ideoSource source;

    @JsProperty(name="source-layer")
    public String source_dash_layer;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "filter")
    public native Array<Object> getFilter();
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "interactive")
    public native Boolean getInteractive();
    @JsProperty(name = "layout")
    public native UnionOfBac_112_mbolLayout getLayout();
    @JsProperty(name = "maxzoom")
    public native Number getMaxzoom();
    @JsProperty(name = "metadata")
    public native Object getMetadata();
    @JsProperty(name = "minzoom")
    public native Number getMinzoom();
    @JsProperty(name = "paint")
    public native UnionOfBac_104_ymbolPaint getPaint();
    @JsProperty(name = "ref")
    public native String getRef();
    @JsProperty(name = "source")
    public native UnionOfGeo_86_ideoSource getSource();
    @JsProperty(name = "source-layer")
    public native String getSource_dash_layer();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "filter")
    public native void setFilter(Array<Object> value);
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "interactive")
    public native void setInteractive(Boolean value);
    @JsProperty(name = "layout")
    public native void setLayout(BackgroundLayout value);
    @JsProperty(name = "layout")
    public native void setLayout(CircleLayout value);
    @JsProperty(name = "layout")
    public native void setLayout(FillExtrusionLayout value);
    @JsProperty(name = "layout")
    public native void setLayout(FillLayout value);
    @JsProperty(name = "layout")
    public native void setLayout(HeatmapLayout value);
    @JsProperty(name = "layout")
    public native void setLayout(LineLayout value);
    @JsProperty(name = "layout")
    public native void setLayout(RasterLayout value);
    @JsProperty(name = "layout")
    public native void setLayout(SymbolLayout value);
    @JsProperty(name = "layout")
    public native void setLayout(UnionOfBac_112_mbolLayout value);
    @JsProperty(name = "maxzoom")
    public native void setMaxzoom(@DoNotAutobox Number value);
    @JsProperty(name = "metadata")
    public native void setMetadata(Object value);
    @JsProperty(name = "minzoom")
    public native void setMinzoom(@DoNotAutobox Number value);
    @JsProperty(name = "paint")
    public native void setPaint(BackgroundPaint value);
    @JsProperty(name = "paint")
    public native void setPaint(CirclePaint value);
    @JsProperty(name = "paint")
    public native void setPaint(FillExtrusionPaint value);
    @JsProperty(name = "paint")
    public native void setPaint(FillPaint value);
    @JsProperty(name = "paint")
    public native void setPaint(HeatmapPaint value);
    @JsProperty(name = "paint")
    public native void setPaint(LinePaint value);
    @JsProperty(name = "paint")
    public native void setPaint(RasterPaint value);
    @JsProperty(name = "paint")
    public native void setPaint(SymbolPaint value);
    @JsProperty(name = "paint")
    public native void setPaint(UnionOfBac_104_ymbolPaint value);
    @JsProperty(name = "ref")
    public native void setRef(String value);
    @JsProperty(name = "source")
    public native void setSource(String value);
    @JsProperty(name = "source")
    public native void setSource(GeoJSONSource value);
    @JsProperty(name = "source")
    public native void setSource(GeoJSONSourceRaw value);
    @JsProperty(name = "source")
    public native void setSource(ImageSource value);
    @JsProperty(name = "source")
    public native void setSource(RasterSource value);
    @JsProperty(name = "source")
    public native void setSource(VectorSource value);
    @JsProperty(name = "source")
    public native void setSource(VideoSource value);
    @JsProperty(name = "source")
    public native void setSource(UnionOfGeo_86_ideoSource value);
    @JsProperty(name = "source-layer")
    public native void setSource_dash_layer(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
