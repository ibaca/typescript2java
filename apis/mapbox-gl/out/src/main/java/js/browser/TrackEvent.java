package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TrackEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 659084
  * declared in: tsd/browser/lib.es6.d.ts at pos 659201
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TrackEvent")
public class TrackEvent extends Event 
{

    /*
        Constructors
    */
    public TrackEvent (String typeArg, TrackEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public TrackEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public UnionOfAudioTrackAndTextTrackAndVideoTrack track;

    /*
        Methods
    */
    @JsProperty(name = "track")
    public native UnionOfAudioTrackAndTextTrackAndVideoTrack getTrack();
    @JsProperty(name = "track")
    public native void setTrack(TextTrack value);
    @JsProperty(name = "track")
    public native void setTrack(AudioTrack value);
    @JsProperty(name = "track")
    public native void setTrack(VideoTrack value);
    @JsProperty(name = "track")
    public native void setTrack(UnionOfAudioTrackAndTextTrackAndVideoTrack value);
}
