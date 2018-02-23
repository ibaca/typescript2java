package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.browser.Array;
import js.browser.UnionOfArrayOfObjectAndNumber;
import js.browser.UnionOfArrayOfObjectAndString;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".BackgroundPaint
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 25596

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class BackgroundPaint
{

    /*
        Properties
    */

    @JsProperty(name="background-color")
    public UnionOfArrayOfObjectAndString background_dash_color;

    @JsProperty(name="background-opacity")
    public UnionOfArrayOfObjectAndNumber background_dash_opacity;

    @JsProperty(name="background-pattern")
    public String background_dash_pattern;

    /*
        Methods
    */
    @JsProperty(name = "background-color")
    public native UnionOfArrayOfObjectAndString getBackground_dash_color();
    @JsProperty(name = "background-opacity")
    public native UnionOfArrayOfObjectAndNumber getBackground_dash_opacity();
    @JsProperty(name = "background-pattern")
    public native String getBackground_dash_pattern();
    @JsProperty(name = "background-color")
    public native void setBackground_dash_color(String value);
    @JsProperty(name = "background-color")
    public native void setBackground_dash_color(Array<Object> value);
    @JsProperty(name = "background-color")
    public native void setBackground_dash_color(UnionOfArrayOfObjectAndString value);
    @JsProperty(name = "background-opacity")
    public native void setBackground_dash_opacity(@DoNotAutobox Number value);
    @JsProperty(name = "background-opacity")
    public native void setBackground_dash_opacity(Array<Object> value);
    @JsProperty(name = "background-opacity")
    public native void setBackground_dash_opacity(UnionOfArrayOfObjectAndNumber value);
    @JsProperty(name = "background-pattern")
    public native void setBackground_dash_pattern(String value);
}
