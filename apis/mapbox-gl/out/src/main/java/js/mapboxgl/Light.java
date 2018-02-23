package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import js.browser.Array;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".Light
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 13098

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class Light
{

    /*
        Properties
    */

    public String anchor;

    public String color;

    public Number intensity;

    public Array<Number> position;

    /*
        Methods
    */
    @JsProperty(name = "anchor")
    public native String getAnchor();
    @JsProperty(name = "color")
    public native String getColor();
    @JsProperty(name = "intensity")
    public native Number getIntensity();
    @JsProperty(name = "position")
    public native Array<Number> getPosition();
    @JsProperty(name = "anchor")
    public native void setAnchor(String value);
    @JsProperty(name = "color")
    public native void setColor(String value);
    @JsProperty(name = "intensity")
    public native void setIntensity(@DoNotAutobox Number value);
    @JsProperty(name = "position")
    public native void setPosition(Array<Number> value);
}
