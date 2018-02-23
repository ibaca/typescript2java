package js.mapboxgl;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".BackgroundLayout
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 25508

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class BackgroundLayout
{

    /*
        Properties
    */

    public String visibility;

    /*
        Methods
    */
    @JsProperty(name = "visibility")
    public native String getVisibility();
    @JsProperty(name = "visibility")
    public native void setVisibility(String value);
}
