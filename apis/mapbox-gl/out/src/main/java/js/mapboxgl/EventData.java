package js.mapboxgl;

import js.browser.Event;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".EventData
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 19839

  * EventData
 */
@JsType(isNative=true, namespace="mapboxgl", name="EventData")
public class EventData
{

    /*
        Properties
    */

    public LngLat lngLat;

    public Event originalEvent;

    public Point point;

    public Map target;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "lngLat")
    public native LngLat getLngLat();
    @JsProperty(name = "originalEvent")
    public native Event getOriginalEvent();
    @JsProperty(name = "point")
    public native Point getPoint();
    @JsProperty(name = "target")
    public native Map getTarget();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "lngLat")
    public native void setLngLat(LngLat value);
    @JsProperty(name = "originalEvent")
    public native void setOriginalEvent(Event value);
    @JsProperty(name = "point")
    public native void setPoint(Point value);
    @JsProperty(name = "target")
    public native void setTarget(Map value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
