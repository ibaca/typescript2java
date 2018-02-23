package js.mapboxgl;

import js.browser.MouseEvent;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".MapMouseEvent
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 20045
  * 
 */
@JsType(isNative=true, namespace="mapboxgl", name="MapMouseEvent")
public class MapMouseEvent
{

    /*
        Properties
    */

    public LngLat lngLat;

    public MouseEvent originalEvent;

    public Point point;

    public Map target;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "lngLat")
    public native LngLat getLngLat();
    @JsProperty(name = "originalEvent")
    public native MouseEvent getOriginalEvent();
    @JsProperty(name = "point")
    public native Point getPoint();
    @JsProperty(name = "target")
    public native Map getTarget();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "lngLat")
    public native void setLngLat(LngLat value);
    @JsProperty(name = "originalEvent")
    public native void setOriginalEvent(MouseEvent value);
    @JsProperty(name = "point")
    public native void setPoint(Point value);
    @JsProperty(name = "target")
    public native void setTarget(Map value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
