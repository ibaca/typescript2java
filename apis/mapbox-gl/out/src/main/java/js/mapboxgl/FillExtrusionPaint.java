package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.UnionOfArrayOfObjectAndNumberAndStyleFunction;
import js.UnionOfArrayOfObjectAndStringAndStyleFunction;
import js.browser.Array;
import js.browser.UnionOfArrayOfObjectAndArrayOfNumber;
import js.browser.UnionOfArrayOfObjectAndNumber;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".FillExtrusionPaint
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 26359

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class FillExtrusionPaint
{

    /*
        Properties
    */

    @JsProperty(name="fill-extrusion-base")
    public UnionOfArrayOfObjectAndNumberAndStyleFunction fill_dash_extrusion_dash_base;

    @JsProperty(name="fill-extrusion-color")
    public UnionOfArrayOfObjectAndStringAndStyleFunction fill_dash_extrusion_dash_color;

    @JsProperty(name="fill-extrusion-height")
    public UnionOfArrayOfObjectAndNumberAndStyleFunction fill_dash_extrusion_dash_height;

    @JsProperty(name="fill-extrusion-opacity")
    public UnionOfArrayOfObjectAndNumber fill_dash_extrusion_dash_opacity;

    @JsProperty(name="fill-extrusion-pattern")
    public String fill_dash_extrusion_dash_pattern;

    @JsProperty(name="fill-extrusion-translate")
    public UnionOfArrayOfObjectAndArrayOfNumber fill_dash_extrusion_dash_translate;

    @JsProperty(name="fill-extrusion-translate-anchor")
    public String fill_dash_extrusion_dash_translate_dash_anchor;

    /*
        Methods
    */
    @JsProperty(name = "fill-extrusion-base")
    public native UnionOfArrayOfObjectAndNumberAndStyleFunction getFill_dash_extrusion_dash_base();
    @JsProperty(name = "fill-extrusion-color")
    public native UnionOfArrayOfObjectAndStringAndStyleFunction getFill_dash_extrusion_dash_color();
    @JsProperty(name = "fill-extrusion-height")
    public native UnionOfArrayOfObjectAndNumberAndStyleFunction getFill_dash_extrusion_dash_height();
    @JsProperty(name = "fill-extrusion-opacity")
    public native UnionOfArrayOfObjectAndNumber getFill_dash_extrusion_dash_opacity();
    @JsProperty(name = "fill-extrusion-pattern")
    public native String getFill_dash_extrusion_dash_pattern();
    @JsProperty(name = "fill-extrusion-translate")
    public native UnionOfArrayOfObjectAndArrayOfNumber getFill_dash_extrusion_dash_translate();
    @JsProperty(name = "fill-extrusion-translate-anchor")
    public native String getFill_dash_extrusion_dash_translate_dash_anchor();
    @JsProperty(name = "fill-extrusion-base")
    public native void setFill_dash_extrusion_dash_base(@DoNotAutobox Number value);
    @JsProperty(name = "fill-extrusion-base")
    public native void setFill_dash_extrusion_dash_base(StyleFunction value);
    @JsProperty(name = "fill-extrusion-base")
    public native void setFill_dash_extrusion_dash_base(Array<Object> value);
    @JsProperty(name = "fill-extrusion-base")
    public native void setFill_dash_extrusion_dash_base(UnionOfArrayOfObjectAndNumberAndStyleFunction value);
    @JsProperty(name = "fill-extrusion-color")
    public native void setFill_dash_extrusion_dash_color(String value);
    @JsProperty(name = "fill-extrusion-color")
    public native void setFill_dash_extrusion_dash_color(StyleFunction value);
    @JsProperty(name = "fill-extrusion-color")
    public native void setFill_dash_extrusion_dash_color(Array<Object> value);
    @JsProperty(name = "fill-extrusion-color")
    public native void setFill_dash_extrusion_dash_color(UnionOfArrayOfObjectAndStringAndStyleFunction value);
    @JsProperty(name = "fill-extrusion-height")
    public native void setFill_dash_extrusion_dash_height(@DoNotAutobox Number value);
    @JsProperty(name = "fill-extrusion-height")
    public native void setFill_dash_extrusion_dash_height(StyleFunction value);
    @JsProperty(name = "fill-extrusion-height")
    public native void setFill_dash_extrusion_dash_height(Array<Object> value);
    @JsProperty(name = "fill-extrusion-height")
    public native void setFill_dash_extrusion_dash_height(UnionOfArrayOfObjectAndNumberAndStyleFunction value);
    @JsProperty(name = "fill-extrusion-opacity")
    public native void setFill_dash_extrusion_dash_opacity(@DoNotAutobox Number value);
    @JsProperty(name = "fill-extrusion-opacity")
    public native void setFill_dash_extrusion_dash_opacity(Array<Object> value);
    @JsProperty(name = "fill-extrusion-opacity")
    public native void setFill_dash_extrusion_dash_opacity(UnionOfArrayOfObjectAndNumber value);
    @JsProperty(name = "fill-extrusion-pattern")
    public native void setFill_dash_extrusion_dash_pattern(String value);
    @JsProperty(name = "fill-extrusion-translate")
    public native void setFill_dash_extrusion_dash_translate(Array<Object> value);
    @JsProperty(name = "fill-extrusion-translate")
    public native void setFill_dash_extrusion_dash_translate(UnionOfArrayOfObjectAndArrayOfNumber value);
    @JsProperty(name = "fill-extrusion-translate-anchor")
    public native void setFill_dash_extrusion_dash_translate_dash_anchor(String value);
}
