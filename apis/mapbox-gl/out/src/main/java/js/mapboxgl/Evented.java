package js.mapboxgl;

import fr.lteconsulting.prebuilt.Function2;
import js.browser.AnonymousType703;
import js.browser.Function;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".Evented
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 19238
  * source type: "tsd/mapbox-gl/index".Evented
  * flags: TypeParameter (16384)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 19238

  * Evented
  * Evented
 */
@JsType(isNative=true, namespace="mapboxgl", name="Evented")
public class Evented
{

    /*
        Properties
    */

    public AnonymousType703<Evented> on;

    public Function2<String, Function, Evented> once;

    /*
        Methods
    */
    public native Evented fire(String type);
    public native Evented fire(String type, Object data /* optional */);
    public native Evented fire(String type, EventData data /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@19622
     */
    public native Evented fire(String type, UnionOfEventDataAndObject data /* optional */);
    @JsProperty(name = "on")
    public native AnonymousType703<Evented> getOn();
    @JsProperty(name = "once")
    public native Function2<String, Function, Evented> getOnce();
    /** 
      * tsd/mapbox-gl/index.d.ts@19693
     */
    public native Boolean listens(String type);
    public native Evented off();
    public native Evented off(Object type /* optional */);
    public native Evented off(Object type /* optional */, String layer /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@19489
      * VERSION 1
     */
    public native Evented off(Object type /* optional */, String layer /* optional */, Function listener /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@19427
     */
    public native Evented off(Object type /* optional */, Function listener /* optional */);
    @JsProperty(name = "on")
    public native void setOn(AnonymousType703<Evented> value);
    @JsProperty(name = "once")
    public native void setOnce(Function2<String, Function, Evented> value);
}
