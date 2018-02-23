package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.browser.Array;
import js.browser.UnionOfArrayOfObjectAndNumber;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".LineLayout
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 26841

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class LineLayout
{

    /*
        Properties
    */

    @JsProperty(name="line-cap")
    public String line_dash_cap;

    @JsProperty(name="line-join")
    public String line_dash_join;

    @JsProperty(name="line-miter-limit")
    public UnionOfArrayOfObjectAndNumber line_dash_miter_dash_limit;

    @JsProperty(name="line-round-limit")
    public UnionOfArrayOfObjectAndNumber line_dash_round_dash_limit;

    public String visibility;

    /*
        Methods
    */
    @JsProperty(name = "line-cap")
    public native String getLine_dash_cap();
    @JsProperty(name = "line-join")
    public native String getLine_dash_join();
    @JsProperty(name = "line-miter-limit")
    public native UnionOfArrayOfObjectAndNumber getLine_dash_miter_dash_limit();
    @JsProperty(name = "line-round-limit")
    public native UnionOfArrayOfObjectAndNumber getLine_dash_round_dash_limit();
    @JsProperty(name = "visibility")
    public native String getVisibility();
    @JsProperty(name = "line-cap")
    public native void setLine_dash_cap(String value);
    @JsProperty(name = "line-join")
    public native void setLine_dash_join(String value);
    @JsProperty(name = "line-miter-limit")
    public native void setLine_dash_miter_dash_limit(@DoNotAutobox Number value);
    @JsProperty(name = "line-miter-limit")
    public native void setLine_dash_miter_dash_limit(Array<Object> value);
    @JsProperty(name = "line-miter-limit")
    public native void setLine_dash_miter_dash_limit(UnionOfArrayOfObjectAndNumber value);
    @JsProperty(name = "line-round-limit")
    public native void setLine_dash_round_dash_limit(@DoNotAutobox Number value);
    @JsProperty(name = "line-round-limit")
    public native void setLine_dash_round_dash_limit(Array<Object> value);
    @JsProperty(name = "line-round-limit")
    public native void setLine_dash_round_dash_limit(UnionOfArrayOfObjectAndNumber value);
    @JsProperty(name = "visibility")
    public native void setVisibility(String value);
}
