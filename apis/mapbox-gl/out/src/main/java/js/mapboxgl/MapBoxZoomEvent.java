package js.mapboxgl;

import js.browser.MouseEvent;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".MapBoxZoomEvent
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 20461
  * 
 */
@JsType(isNative=true, namespace="mapboxgl", name="MapBoxZoomEvent")
public class MapBoxZoomEvent
{

    /*
        Properties
    */

    public LngLatBounds boxZoomBounds;

    public MouseEvent originalEvent;

    /*
        Methods
    */
    @JsProperty(name = "boxZoomBounds")
    public native LngLatBounds getBoxZoomBounds();
    @JsProperty(name = "originalEvent")
    public native MouseEvent getOriginalEvent();
    @JsProperty(name = "boxZoomBounds")
    public native void setBoxZoomBounds(LngLatBounds value);
    @JsProperty(name = "originalEvent")
    public native void setOriginalEvent(MouseEvent value);
}
