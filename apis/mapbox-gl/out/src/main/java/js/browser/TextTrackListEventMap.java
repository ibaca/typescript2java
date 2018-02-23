package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TextTrackListEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 657265

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class TextTrackListEventMap
{

    /*
        Properties
    */

    public TrackEvent addtrack;

    /*
        Methods
    */
    @JsProperty(name = "addtrack")
    public native TrackEvent getAddtrack();
    @JsProperty(name = "addtrack")
    public native void setAddtrack(TrackEvent value);
}
