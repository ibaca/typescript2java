package js.mapboxgl;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".PaddingOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 8953

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PaddingOptions
{

    /*
        Properties
    */

    public Number bottom;

    public Number left;

    public Number right;

    public Number top;

    /*
        Methods
    */
    @JsProperty(name = "bottom")
    public native Number getBottom();
    @JsProperty(name = "left")
    public native Number getLeft();
    @JsProperty(name = "right")
    public native Number getRight();
    @JsProperty(name = "top")
    public native Number getTop();
    @JsProperty(name = "bottom")
    public native void setBottom(@DoNotAutobox Number value);
    @JsProperty(name = "left")
    public native void setLeft(@DoNotAutobox Number value);
    @JsProperty(name = "right")
    public native void setRight(@DoNotAutobox Number value);
    @JsProperty(name = "top")
    public native void setTop(@DoNotAutobox Number value);
}
