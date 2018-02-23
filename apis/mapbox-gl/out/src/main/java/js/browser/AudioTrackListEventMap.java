package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AudioTrackListEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 291438

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class AudioTrackListEventMap
{

    /*
        Properties
    */

    public TrackEvent addtrack;

    public Event change;

    public TrackEvent removetrack;

    /*
        Methods
    */
    @JsProperty(name = "addtrack")
    public native TrackEvent getAddtrack();
    @JsProperty(name = "change")
    public native Event getChange();
    @JsProperty(name = "removetrack")
    public native TrackEvent getRemovetrack();
    @JsProperty(name = "addtrack")
    public native void setAddtrack(TrackEvent value);
    @JsProperty(name = "change")
    public native void setChange(Event value);
    @JsProperty(name = "removetrack")
    public native void setRemovetrack(TrackEvent value);
}
