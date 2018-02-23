package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.UnionOfArrayOfObjectAndNumberAndStyleFunction;
import js.UnionOfArrayOfObjectAndStringAndStyleFunction;
import js.browser.Array;
import js.browser.UnionOfArrayOfObjectAndArrayOfNumber;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".LinePaint
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 27125

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class LinePaint
{

    /*
        Properties
    */

    @JsProperty(name="line-blur")
    public UnionOfArrayOfObjectAndNumberAndStyleFunction line_dash_blur;

    @JsProperty(name="line-color")
    public UnionOfArrayOfObjectAndStringAndStyleFunction line_dash_color;

    @JsProperty(name="line-dasharray")
    public Array<Number> line_dash_dasharray;

    @JsProperty(name="line-dasharray-transition")
    public Transition line_dash_dasharray_dash_transition;

    @JsProperty(name="line-gap-width")
    public UnionOfArrayOfObjectAndNumberAndStyleFunction line_dash_gap_dash_width;

    @JsProperty(name="line-offset")
    public UnionOfArrayOfObjectAndNumberAndStyleFunction line_dash_offset;

    @JsProperty(name="line-opacity")
    public UnionOfArrayOfObjectAndNumberAndStyleFunction line_dash_opacity;

    @JsProperty(name="line-pattern")
    public String line_dash_pattern;

    @JsProperty(name="line-translate")
    public UnionOfArrayOfObjectAndArrayOfNumber line_dash_translate;

    @JsProperty(name="line-translate-anchor")
    public String line_dash_translate_dash_anchor;

    @JsProperty(name="line-width")
    public UnionOfArrayOfObjectAndNumberAndStyleFunction line_dash_width;

    /*
        Methods
    */
    @JsProperty(name = "line-blur")
    public native UnionOfArrayOfObjectAndNumberAndStyleFunction getLine_dash_blur();
    @JsProperty(name = "line-color")
    public native UnionOfArrayOfObjectAndStringAndStyleFunction getLine_dash_color();
    @JsProperty(name = "line-dasharray")
    public native Array<Number> getLine_dash_dasharray();
    @JsProperty(name = "line-dasharray-transition")
    public native Transition getLine_dash_dasharray_dash_transition();
    @JsProperty(name = "line-gap-width")
    public native UnionOfArrayOfObjectAndNumberAndStyleFunction getLine_dash_gap_dash_width();
    @JsProperty(name = "line-offset")
    public native UnionOfArrayOfObjectAndNumberAndStyleFunction getLine_dash_offset();
    @JsProperty(name = "line-opacity")
    public native UnionOfArrayOfObjectAndNumberAndStyleFunction getLine_dash_opacity();
    @JsProperty(name = "line-pattern")
    public native String getLine_dash_pattern();
    @JsProperty(name = "line-translate")
    public native UnionOfArrayOfObjectAndArrayOfNumber getLine_dash_translate();
    @JsProperty(name = "line-translate-anchor")
    public native String getLine_dash_translate_dash_anchor();
    @JsProperty(name = "line-width")
    public native UnionOfArrayOfObjectAndNumberAndStyleFunction getLine_dash_width();
    @JsProperty(name = "line-blur")
    public native void setLine_dash_blur(@DoNotAutobox Number value);
    @JsProperty(name = "line-blur")
    public native void setLine_dash_blur(StyleFunction value);
    @JsProperty(name = "line-blur")
    public native void setLine_dash_blur(Array<Object> value);
    @JsProperty(name = "line-blur")
    public native void setLine_dash_blur(UnionOfArrayOfObjectAndNumberAndStyleFunction value);
    @JsProperty(name = "line-color")
    public native void setLine_dash_color(String value);
    @JsProperty(name = "line-color")
    public native void setLine_dash_color(StyleFunction value);
    @JsProperty(name = "line-color")
    public native void setLine_dash_color(Array<Object> value);
    @JsProperty(name = "line-color")
    public native void setLine_dash_color(UnionOfArrayOfObjectAndStringAndStyleFunction value);
    @JsProperty(name = "line-dasharray")
    public native void setLine_dash_dasharray(Array<Number> value);
    @JsProperty(name = "line-dasharray-transition")
    public native void setLine_dash_dasharray_dash_transition(Transition value);
    @JsProperty(name = "line-gap-width")
    public native void setLine_dash_gap_dash_width(@DoNotAutobox Number value);
    @JsProperty(name = "line-gap-width")
    public native void setLine_dash_gap_dash_width(StyleFunction value);
    @JsProperty(name = "line-gap-width")
    public native void setLine_dash_gap_dash_width(Array<Object> value);
    @JsProperty(name = "line-gap-width")
    public native void setLine_dash_gap_dash_width(UnionOfArrayOfObjectAndNumberAndStyleFunction value);
    @JsProperty(name = "line-offset")
    public native void setLine_dash_offset(@DoNotAutobox Number value);
    @JsProperty(name = "line-offset")
    public native void setLine_dash_offset(StyleFunction value);
    @JsProperty(name = "line-offset")
    public native void setLine_dash_offset(Array<Object> value);
    @JsProperty(name = "line-offset")
    public native void setLine_dash_offset(UnionOfArrayOfObjectAndNumberAndStyleFunction value);
    @JsProperty(name = "line-opacity")
    public native void setLine_dash_opacity(@DoNotAutobox Number value);
    @JsProperty(name = "line-opacity")
    public native void setLine_dash_opacity(StyleFunction value);
    @JsProperty(name = "line-opacity")
    public native void setLine_dash_opacity(Array<Object> value);
    @JsProperty(name = "line-opacity")
    public native void setLine_dash_opacity(UnionOfArrayOfObjectAndNumberAndStyleFunction value);
    @JsProperty(name = "line-pattern")
    public native void setLine_dash_pattern(String value);
    @JsProperty(name = "line-translate")
    public native void setLine_dash_translate(Array<Object> value);
    @JsProperty(name = "line-translate")
    public native void setLine_dash_translate(UnionOfArrayOfObjectAndArrayOfNumber value);
    @JsProperty(name = "line-translate-anchor")
    public native void setLine_dash_translate_dash_anchor(String value);
    @JsProperty(name = "line-width")
    public native void setLine_dash_width(@DoNotAutobox Number value);
    @JsProperty(name = "line-width")
    public native void setLine_dash_width(StyleFunction value);
    @JsProperty(name = "line-width")
    public native void setLine_dash_width(Array<Object> value);
    @JsProperty(name = "line-width")
    public native void setLine_dash_width(UnionOfArrayOfObjectAndNumberAndStyleFunction value);
}
