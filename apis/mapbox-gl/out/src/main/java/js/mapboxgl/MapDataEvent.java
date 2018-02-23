package js.mapboxgl;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".MapDataEvent
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 20575
  * 
 */
@JsType(isNative=true, namespace="mapboxgl", name="MapDataEvent")
public class MapDataEvent
{

    /*
        Properties
    */

    public Object coord;

    public String dataType;

    public Boolean isSourceLoaded;

    public Source source;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "coord")
    public native Object getCoord();
    @JsProperty(name = "dataType")
    public native String getDataType();
    @JsProperty(name = "isSourceLoaded")
    public native Boolean getIsSourceLoaded();
    @JsProperty(name = "source")
    public native Source getSource();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "coord")
    public native void setCoord(Object value);
    @JsProperty(name = "dataType")
    public native void setDataType(String value);
    @JsProperty(name = "isSourceLoaded")
    public native void setIsSourceLoaded(Boolean value);
    @JsProperty(name = "source")
    public native void setSource(Source value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
