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
  * source type: "tsd/mapbox-gl/index".FillPaint
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 25865

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class FillPaint
{

    /*
        Properties
    */

    @JsProperty(name="fill-antialias")
    public Boolean fill_dash_antialias;

    @JsProperty(name="fill-color")
    public UnionOfArrayOfObjectAndStringAndStyleFunction fill_dash_color;

    @JsProperty(name="fill-opacity")
    public UnionOfArrayOfObjectAndNumberAndStyleFunction fill_dash_opacity;

    @JsProperty(name="fill-outline-color")
    public UnionOfArrayOfObjectAndStringAndStyleFunction fill_dash_outline_dash_color;

    @JsProperty(name="fill-pattern")
    public String fill_dash_pattern;

    @JsProperty(name="fill-translate")
    public UnionOfArrayOfObjectAndArrayOfNumber fill_dash_translate;

    @JsProperty(name="fill-translate-anchor")
    public String fill_dash_translate_dash_anchor;

    /*
        Methods
    */
    @JsProperty(name = "fill-antialias")
    public native Boolean getFill_dash_antialias();
    @JsProperty(name = "fill-color")
    public native UnionOfArrayOfObjectAndStringAndStyleFunction getFill_dash_color();
    @JsProperty(name = "fill-opacity")
    public native UnionOfArrayOfObjectAndNumberAndStyleFunction getFill_dash_opacity();
    @JsProperty(name = "fill-outline-color")
    public native UnionOfArrayOfObjectAndStringAndStyleFunction getFill_dash_outline_dash_color();
    @JsProperty(name = "fill-pattern")
    public native String getFill_dash_pattern();
    @JsProperty(name = "fill-translate")
    public native UnionOfArrayOfObjectAndArrayOfNumber getFill_dash_translate();
    @JsProperty(name = "fill-translate-anchor")
    public native String getFill_dash_translate_dash_anchor();
    @JsProperty(name = "fill-antialias")
    public native void setFill_dash_antialias(Boolean value);
    @JsProperty(name = "fill-color")
    public native void setFill_dash_color(String value);
    @JsProperty(name = "fill-color")
    public native void setFill_dash_color(StyleFunction value);
    @JsProperty(name = "fill-color")
    public native void setFill_dash_color(Array<Object> value);
    @JsProperty(name = "fill-color")
    public native void setFill_dash_color(UnionOfArrayOfObjectAndStringAndStyleFunction value);
    @JsProperty(name = "fill-opacity")
    public native void setFill_dash_opacity(@DoNotAutobox Number value);
    @JsProperty(name = "fill-opacity")
    public native void setFill_dash_opacity(StyleFunction value);
    @JsProperty(name = "fill-opacity")
    public native void setFill_dash_opacity(Array<Object> value);
    @JsProperty(name = "fill-opacity")
    public native void setFill_dash_opacity(UnionOfArrayOfObjectAndNumberAndStyleFunction value);
    @JsProperty(name = "fill-outline-color")
    public native void setFill_dash_outline_dash_color(String value);
    @JsProperty(name = "fill-outline-color")
    public native void setFill_dash_outline_dash_color(StyleFunction value);
    @JsProperty(name = "fill-outline-color")
    public native void setFill_dash_outline_dash_color(Array<Object> value);
    @JsProperty(name = "fill-outline-color")
    public native void setFill_dash_outline_dash_color(UnionOfArrayOfObjectAndStringAndStyleFunction value);
    @JsProperty(name = "fill-pattern")
    public native void setFill_dash_pattern(String value);
    @JsProperty(name = "fill-translate")
    public native void setFill_dash_translate(Array<Object> value);
    @JsProperty(name = "fill-translate")
    public native void setFill_dash_translate(UnionOfArrayOfObjectAndArrayOfNumber value);
    @JsProperty(name = "fill-translate-anchor")
    public native void setFill_dash_translate_dash_anchor(String value);
}
