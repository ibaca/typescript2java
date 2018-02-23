package js.mapboxgl;

import js.browser.Array;
import js.browser.TouchEvent;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".MapTouchEvent
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 20227
  * 
 */
@JsType(isNative=true, namespace="mapboxgl", name="MapTouchEvent")
public class MapTouchEvent
{

    /*
        Properties
    */

    public LngLat lngLat;

    public Array<LngLat> lngLats;

    public TouchEvent originalEvent;

    public Point point;

    public Array<Point> points;

    public Map target;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "lngLat")
    public native LngLat getLngLat();
    @JsProperty(name = "lngLats")
    public native Array<LngLat> getLngLats();
    @JsProperty(name = "originalEvent")
    public native TouchEvent getOriginalEvent();
    @JsProperty(name = "point")
    public native Point getPoint();
    @JsProperty(name = "points")
    public native Array<Point> getPoints();
    @JsProperty(name = "target")
    public native Map getTarget();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "lngLat")
    public native void setLngLat(LngLat value);
    @JsProperty(name = "lngLats")
    public native void setLngLats(Array<LngLat> value);
    @JsProperty(name = "originalEvent")
    public native void setOriginalEvent(TouchEvent value);
    @JsProperty(name = "point")
    public native void setPoint(Point value);
    @JsProperty(name = "points")
    public native void setPoints(Array<Point> value);
    @JsProperty(name = "target")
    public native void setTarget(Map value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
