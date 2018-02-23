package js.mapboxgl;

import fr.lteconsulting.prebuilt.Function1;
import js.browser.HTMLElement;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".IControl
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 10761

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class IControl
{

    /*
        Properties
    */

    public Function1<Map, HTMLElement> onAdd;

    public Function1<Map, Object> onRemove;

    /*
        Methods
    */
    /** 
      * tsd/mapbox-gl/index.d.ts@10876
     */
    public native String getDefaultPosition();
    @JsProperty(name = "onAdd")
    public native Function1<Map, HTMLElement> getOnAdd();
    @JsProperty(name = "onRemove")
    public native Function1<Map, Object> getOnRemove();
    @JsProperty(name = "onAdd")
    public native void setOnAdd(Function1<Map, HTMLElement> value);
    @JsProperty(name = "onRemove")
    public native void setOnRemove(Function1<Map, Object> value);
}
