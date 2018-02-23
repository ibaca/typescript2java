package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: AudioTrackList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 291556
  * declared in: tsd/browser/lib.es6.d.ts at pos 292233
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioTrackList")
public class AudioTrackList extends EventTarget 
{

    /*
        Constructors
    */
    public AudioTrackList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, AudioTrack value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final AudioTrack getByIndex(int index) {
        return (AudioTrack) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public int length;

    public Function1<TrackEvent, Object> onaddtrack;

    public Function1<Event, Object> onchange;

    public Function1<TrackEvent, Object> onremovetrack;

    /*
        Methods
    */
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "onaddtrack")
    public native Function1<TrackEvent, Object> getOnaddtrack();
    @JsProperty(name = "onchange")
    public native Function1<Event, Object> getOnchange();
    @JsProperty(name = "onremovetrack")
    public native Function1<TrackEvent, Object> getOnremovetrack();
    /** 
      * tsd/browser/lib.es6.d.ts@291823
     */
    public native AudioTrack getTrackById(String id);
    /** 
      * tsd/browser/lib.es6.d.ts@291872
     */
    public native AudioTrack item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    @JsProperty(name = "onaddtrack")
    public native void setOnaddtrack(Function1<TrackEvent, Object> value);
    @JsProperty(name = "onchange")
    public native void setOnchange(Function1<Event, Object> value);
    @JsProperty(name = "onremovetrack")
    public native void setOnremovetrack(Function1<TrackEvent, Object> value);
}
