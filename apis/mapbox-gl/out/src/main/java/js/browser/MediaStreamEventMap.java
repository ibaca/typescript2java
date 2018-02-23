package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaStreamEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 520910

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MediaStreamEventMap
{

    /*
        Properties
    */

    public Event active;

    public MediaStreamTrackEvent addtrack;

    public Event inactive;

    public MediaStreamTrackEvent removetrack;

    /*
        Methods
    */
    @JsProperty(name = "active")
    public native Event getActive();
    @JsProperty(name = "addtrack")
    public native MediaStreamTrackEvent getAddtrack();
    @JsProperty(name = "inactive")
    public native Event getInactive();
    @JsProperty(name = "removetrack")
    public native MediaStreamTrackEvent getRemovetrack();
    @JsProperty(name = "active")
    public native void setActive(Event value);
    @JsProperty(name = "addtrack")
    public native void setAddtrack(MediaStreamTrackEvent value);
    @JsProperty(name = "inactive")
    public native void setInactive(Event value);
    @JsProperty(name = "removetrack")
    public native void setRemovetrack(MediaStreamTrackEvent value);
}
