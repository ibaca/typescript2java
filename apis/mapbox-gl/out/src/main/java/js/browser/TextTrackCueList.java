package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

/** 
  * source type: TextTrackCueList
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 656991
  * declared in: tsd/browser/lib.es6.d.ts at pos 657181
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextTrackCueList")
public class TextTrackCueList
{

    /*
        Constructors
    */
    public TextTrackCueList () {
    } 

    @JsOverlay
    public final void setByIndex(int index, TextTrackCue value) {
        Js.asArrayLike(this).setAt(index, value);
    }

    @JsOverlay
    public final TextTrackCue getByIndex(int index) {
        return (TextTrackCue) Js.asArrayLike(this).getAt(index);
    }

    /*
        Properties
    */

    public int length;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@657055
     */
    public native TextTrackCue getCueById(String id);
    @JsProperty(name = "length")
    public native Number getLength();
    /** 
      * tsd/browser/lib.es6.d.ts@657097
     */
    public native TextTrackCue item(@DoNotAutobox Number index);
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
}
