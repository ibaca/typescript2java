package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TextTrackEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 654793

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class TextTrackEventMap
{

    /*
        Properties
    */

    public Event cuechange;

    public Event error;

    public Event load;

    /*
        Methods
    */
    @JsProperty(name = "cuechange")
    public native Event getCuechange();
    @JsProperty(name = "error")
    public native Event getError();
    @JsProperty(name = "load")
    public native Event getLoad();
    @JsProperty(name = "cuechange")
    public native void setCuechange(Event value);
    @JsProperty(name = "error")
    public native void setError(Event value);
    @JsProperty(name = "load")
    public native void setLoad(Event value);
}
