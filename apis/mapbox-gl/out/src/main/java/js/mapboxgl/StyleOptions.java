package js.mapboxgl;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".StyleOptions
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 19730

  * StyleOptions
  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class StyleOptions
{

    /*
        Properties
    */

    public Boolean transition;

    /*
        Methods
    */
    @JsProperty(name = "transition")
    public native Boolean getTransition();
    @JsProperty(name = "transition")
    public native void setTransition(Boolean value);
}
