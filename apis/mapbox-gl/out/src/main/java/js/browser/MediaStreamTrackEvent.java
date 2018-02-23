package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaStreamTrackEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 524416
  * declared in: tsd/browser/lib.es6.d.ts at pos 524518
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamTrackEvent")
public class MediaStreamTrackEvent extends Event 
{

    /*
        Constructors
    */
    public MediaStreamTrackEvent (String typeArg, MediaStreamTrackEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public MediaStreamTrackEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public MediaStreamTrack track;

    /*
        Methods
    */
    @JsProperty(name = "track")
    public native MediaStreamTrack getTrack();
    @JsProperty(name = "track")
    public native void setTrack(MediaStreamTrack value);
}
