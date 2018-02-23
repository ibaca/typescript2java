package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaStreamTrackEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 523069

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MediaStreamTrackEventMap
{

    /*
        Properties
    */

    public MediaStreamErrorEvent ended;

    public Event mute;

    public MediaStreamErrorEvent overconstrained;

    public Event unmute;

    /*
        Methods
    */
    @JsProperty(name = "ended")
    public native MediaStreamErrorEvent getEnded();
    @JsProperty(name = "mute")
    public native Event getMute();
    @JsProperty(name = "overconstrained")
    public native MediaStreamErrorEvent getOverconstrained();
    @JsProperty(name = "unmute")
    public native Event getUnmute();
    @JsProperty(name = "ended")
    public native void setEnded(MediaStreamErrorEvent value);
    @JsProperty(name = "mute")
    public native void setMute(Event value);
    @JsProperty(name = "overconstrained")
    public native void setOverconstrained(MediaStreamErrorEvent value);
    @JsProperty(name = "unmute")
    public native void setUnmute(Event value);
}
