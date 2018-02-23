package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TextTrackCue
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 656257
  * declared in: tsd/browser/lib.es6.d.ts at pos 656871
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextTrackCue")
public class TextTrackCue extends EventTarget 
{

    /*
        Constructors
    */
    public TextTrackCue (@DoNotAutobox Number startTime, @DoNotAutobox Number endTime, String text) {
    } 

    /*
        Properties
    */

    public Number endTime;

    public String id;

    public Function1<Event, Object> onenter;

    public Function1<Event, Object> onexit;

    public Boolean pauseOnExit;

    public Number startTime;

    public String text;

    public TextTrack track;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@656548
     */
    public native DocumentFragment getCueAsHTML();
    @JsProperty(name = "endTime")
    public native Number getEndTime();
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "onenter")
    public native Function1<Event, Object> getOnenter();
    @JsProperty(name = "onexit")
    public native Function1<Event, Object> getOnexit();
    @JsProperty(name = "pauseOnExit")
    public native Boolean getPauseOnExit();
    @JsProperty(name = "startTime")
    public native Number getStartTime();
    @JsProperty(name = "text")
    public native String getText();
    @JsProperty(name = "track")
    public native TextTrack getTrack();
    @JsProperty(name = "endTime")
    public native void setEndTime(@DoNotAutobox Number value);
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "onenter")
    public native void setOnenter(Function1<Event, Object> value);
    @JsProperty(name = "onexit")
    public native void setOnexit(Function1<Event, Object> value);
    @JsProperty(name = "pauseOnExit")
    public native void setPauseOnExit(Boolean value);
    @JsProperty(name = "startTime")
    public native void setStartTime(@DoNotAutobox Number value);
    @JsProperty(name = "text")
    public native void setText(String value);
    @JsProperty(name = "track")
    public native void setTrack(TextTrack value);
}
