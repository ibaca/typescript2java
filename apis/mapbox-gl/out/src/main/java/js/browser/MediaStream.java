package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaStream
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 521070
  * declared in: tsd/browser/lib.es6.d.ts at pos 522028
  * 4 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStream")
public class MediaStream extends EventTarget 
{

    /*
        Constructors
    */
    public MediaStream (UnionOfArrayOfMediaStreamTrackAndMediaStream streamOrTracks /* optional */) {
    } 
    public MediaStream (Array<MediaStreamTrack> streamOrTracks /* optional */) {
    } 
    public MediaStream (MediaStream streamOrTracks /* optional */) {
    } 
    public MediaStream () {
    } 

    /*
        Properties
    */

    public Boolean active;

    public String id;

    public Function1<Event, Object> onactive;

    public Function1<MediaStreamTrackEvent, Object> onaddtrack;

    public Function1<Event, Object> oninactive;

    public Function1<MediaStreamTrackEvent, Object> onremovetrack;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@521428
     */
    public native void addTrack(MediaStreamTrack track);
    /** 
      * tsd/browser/lib.es6.d.ts@521473
     */
    public native MediaStream clone();
    @JsProperty(name = "active")
    public native Boolean getActive();
    /** 
      * tsd/browser/lib.es6.d.ts@521499
     */
    public native Array<MediaStreamTrack> getAudioTracks();
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "onactive")
    public native Function1<Event, Object> getOnactive();
    @JsProperty(name = "onaddtrack")
    public native Function1<MediaStreamTrackEvent, Object> getOnaddtrack();
    @JsProperty(name = "oninactive")
    public native Function1<Event, Object> getOninactive();
    @JsProperty(name = "onremovetrack")
    public native Function1<MediaStreamTrackEvent, Object> getOnremovetrack();
    /** 
      * tsd/browser/lib.es6.d.ts@521541
     */
    public native MediaStreamTrack getTrackById(String trackId);
    /** 
      * tsd/browser/lib.es6.d.ts@521601
     */
    public native Array<MediaStreamTrack> getTracks();
    /** 
      * tsd/browser/lib.es6.d.ts@521638
     */
    public native Array<MediaStreamTrack> getVideoTracks();
    /** 
      * tsd/browser/lib.es6.d.ts@521680
     */
    public native void removeTrack(MediaStreamTrack track);
    @JsProperty(name = "active")
    public native void setActive(Boolean value);
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "onactive")
    public native void setOnactive(Function1<Event, Object> value);
    @JsProperty(name = "onaddtrack")
    public native void setOnaddtrack(Function1<MediaStreamTrackEvent, Object> value);
    @JsProperty(name = "oninactive")
    public native void setOninactive(Function1<Event, Object> value);
    @JsProperty(name = "onremovetrack")
    public native void setOnremovetrack(Function1<MediaStreamTrackEvent, Object> value);
    /** 
      * tsd/browser/lib.es6.d.ts@521728
     */
    public native void stop();
}
