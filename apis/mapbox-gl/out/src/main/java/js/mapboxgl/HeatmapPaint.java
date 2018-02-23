package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.UnionOfArrayOfObjectAndNumberAndStyleFunction;
import js.browser.Array;
import js.browser.UnionOfArrayOfObjectAndNumber;
import js.browser.UnionOfArrayOfObjectAndString;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".HeatmapPaint
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 32036

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class HeatmapPaint
{

    /*
        Properties
    */

    @JsProperty(name="heatmap-color")
    public UnionOfArrayOfObjectAndString heatmap_dash_color;

    @JsProperty(name="heatmap-color-transition")
    public Transition heatmap_dash_color_dash_transition;

    @JsProperty(name="heatmap-intensity")
    public UnionOfArrayOfObjectAndNumber heatmap_dash_intensity;

    @JsProperty(name="heatmap-opacity")
    public UnionOfArrayOfObjectAndNumber heatmap_dash_opacity;

    @JsProperty(name="heatmap-opacity-transition")
    public Transition heatmap_dash_opacity_dash_transition;

    @JsProperty(name="heatmap-radius")
    public UnionOfArrayOfObjectAndNumber heatmap_dash_radius;

    @JsProperty(name="heatmap-transition")
    public Transition heatmap_dash_transition;

    @JsProperty(name="heatmap-weight")
    public UnionOfArrayOfObjectAndNumberAndStyleFunction heatmap_dash_weight;

    /*
        Methods
    */
    @JsProperty(name = "heatmap-color")
    public native UnionOfArrayOfObjectAndString getHeatmap_dash_color();
    @JsProperty(name = "heatmap-color-transition")
    public native Transition getHeatmap_dash_color_dash_transition();
    @JsProperty(name = "heatmap-intensity")
    public native UnionOfArrayOfObjectAndNumber getHeatmap_dash_intensity();
    @JsProperty(name = "heatmap-opacity")
    public native UnionOfArrayOfObjectAndNumber getHeatmap_dash_opacity();
    @JsProperty(name = "heatmap-opacity-transition")
    public native Transition getHeatmap_dash_opacity_dash_transition();
    @JsProperty(name = "heatmap-radius")
    public native UnionOfArrayOfObjectAndNumber getHeatmap_dash_radius();
    @JsProperty(name = "heatmap-transition")
    public native Transition getHeatmap_dash_transition();
    @JsProperty(name = "heatmap-weight")
    public native UnionOfArrayOfObjectAndNumberAndStyleFunction getHeatmap_dash_weight();
    @JsProperty(name = "heatmap-color")
    public native void setHeatmap_dash_color(String value);
    @JsProperty(name = "heatmap-color")
    public native void setHeatmap_dash_color(Array<Object> value);
    @JsProperty(name = "heatmap-color")
    public native void setHeatmap_dash_color(UnionOfArrayOfObjectAndString value);
    @JsProperty(name = "heatmap-color-transition")
    public native void setHeatmap_dash_color_dash_transition(Transition value);
    @JsProperty(name = "heatmap-intensity")
    public native void setHeatmap_dash_intensity(@DoNotAutobox Number value);
    @JsProperty(name = "heatmap-intensity")
    public native void setHeatmap_dash_intensity(Array<Object> value);
    @JsProperty(name = "heatmap-intensity")
    public native void setHeatmap_dash_intensity(UnionOfArrayOfObjectAndNumber value);
    @JsProperty(name = "heatmap-opacity")
    public native void setHeatmap_dash_opacity(@DoNotAutobox Number value);
    @JsProperty(name = "heatmap-opacity")
    public native void setHeatmap_dash_opacity(Array<Object> value);
    @JsProperty(name = "heatmap-opacity")
    public native void setHeatmap_dash_opacity(UnionOfArrayOfObjectAndNumber value);
    @JsProperty(name = "heatmap-opacity-transition")
    public native void setHeatmap_dash_opacity_dash_transition(Transition value);
    @JsProperty(name = "heatmap-radius")
    public native void setHeatmap_dash_radius(@DoNotAutobox Number value);
    @JsProperty(name = "heatmap-radius")
    public native void setHeatmap_dash_radius(Array<Object> value);
    @JsProperty(name = "heatmap-radius")
    public native void setHeatmap_dash_radius(UnionOfArrayOfObjectAndNumber value);
    @JsProperty(name = "heatmap-transition")
    public native void setHeatmap_dash_transition(Transition value);
    @JsProperty(name = "heatmap-weight")
    public native void setHeatmap_dash_weight(@DoNotAutobox Number value);
    @JsProperty(name = "heatmap-weight")
    public native void setHeatmap_dash_weight(StyleFunction value);
    @JsProperty(name = "heatmap-weight")
    public native void setHeatmap_dash_weight(Array<Object> value);
    @JsProperty(name = "heatmap-weight")
    public native void setHeatmap_dash_weight(UnionOfArrayOfObjectAndNumberAndStyleFunction value);
}
