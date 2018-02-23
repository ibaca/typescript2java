package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: TextTrackList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 657330
  * declared in: tsd/browser/lib.es6.d.ts at pos 657838
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextTrackList")
public class TextTrackList extends EventTarget 
{

    /*
        Constructors
    */
    public TextTrackList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, TextTrack value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final TextTrack getByIndex(int index) {
        return (TextTrack) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public int length;

    public Function1<TrackEvent, Object> onaddtrack;

    /*
        Methods
    */
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "onaddtrack")
    public native Function1<TrackEvent, Object> getOnaddtrack();
    /** 
      * tsd/browser/lib.es6.d.ts@657482
     */
    public native TextTrack item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    @JsProperty(name = "onaddtrack")
    public native void setOnaddtrack(Function1<TrackEvent, Object> value);
}
