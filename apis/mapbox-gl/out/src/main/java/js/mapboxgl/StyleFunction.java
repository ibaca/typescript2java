package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.browser.Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".StyleFunction
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 25243

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class StyleFunction
{

    /*
        Properties
    */

    public Number base;

    public String colorSpace;

    @JsProperty(name="default")
    public Object default_;

    public String property;

    public Array<Array<Object>> stops;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "base")
    public native Number getBase();
    @JsProperty(name = "colorSpace")
    public native String getColorSpace();
    @JsProperty(name = "default")
    public native Object getDefault_();
    @JsProperty(name = "property")
    public native String getProperty();
    @JsProperty(name = "stops")
    public native Array<Array<Object>> getStops();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "base")
    public native void setBase(@DoNotAutobox Number value);
    @JsProperty(name = "colorSpace")
    public native void setColorSpace(String value);
    @JsProperty(name = "default")
    public native void setDefault_(Object value);
    @JsProperty(name = "property")
    public native void setProperty(String value);
    @JsProperty(name = "stops")
    public native void setStops(Array<Array<Object>> value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
