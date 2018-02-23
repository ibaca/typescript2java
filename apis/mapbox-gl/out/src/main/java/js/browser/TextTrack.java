package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TextTrack
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 654889
  * declared in: tsd/browser/lib.es6.d.ts at pos 655915
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextTrack")
public class TextTrack extends EventTarget 
{

    /*
        Constructors
    */
    public TextTrack () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="TextTrack", name="DISABLED")
    public static Number DISABLED;

    @JsProperty(namespace="TextTrack", name="ERROR")
    public static Number ERROR;

    @JsProperty(namespace="TextTrack", name="HIDDEN")
    public static Number HIDDEN;

    @JsProperty(namespace="TextTrack", name="LOADED")
    public static Number LOADED;

    @JsProperty(namespace="TextTrack", name="LOADING")
    public static Number LOADING;

    @JsProperty(namespace="TextTrack", name="NONE")
    public static Number NONE;

    @JsProperty(namespace="TextTrack", name="SHOWING")
    public static Number SHOWING;

    /*
        Properties
    */

    public TextTrackCueList activeCues;

    public TextTrackCueList cues;

    public String inBandMetadataTrackDispatchType;

    public String kind;

    public String label;

    public String language;

    public Object mode;

    public Function1<Event, Object> oncuechange;

    public Function1<Event, Object> onerror;

    public Function1<Event, Object> onload;

    public Number readyState;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@655358
     */
    public native void addCue(TextTrackCue cue);
    @JsProperty(name = "activeCues")
    public native TextTrackCueList getActiveCues();
    @JsProperty(name = "cues")
    public native TextTrackCueList getCues();
    @JsProperty(name = "DISABLED")
    public native Number getDISABLED();
    @JsProperty(name = "ERROR")
    public native Number getERROR();
    @JsProperty(name = "HIDDEN")
    public native Number getHIDDEN();
    @JsProperty(name = "inBandMetadataTrackDispatchType")
    public native String getInBandMetadataTrackDispatchType();
    @JsProperty(name = "kind")
    public native String getKind();
    @JsProperty(name = "LOADED")
    public native Number getLOADED();
    @JsProperty(name = "LOADING")
    public native Number getLOADING();
    @JsProperty(name = "label")
    public native String getLabel();
    @JsProperty(name = "language")
    public native String getLanguage();
    @JsProperty(name = "mode")
    public native Object getMode();
    @JsProperty(name = "NONE")
    public native Number getNONE();
    @JsProperty(name = "oncuechange")
    public native Function1<Event, Object> getOncuechange();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "onload")
    public native Function1<Event, Object> getOnload();
    @JsProperty(name = "readyState")
    public native Number getReadyState();
    @JsProperty(name = "SHOWING")
    public native Number getSHOWING();
    /** 
      * tsd/browser/lib.es6.d.ts@655395
     */
    public native void removeCue(TextTrackCue cue);
    @JsProperty(name = "activeCues")
    public native void setActiveCues(TextTrackCueList value);
    @JsProperty(name = "cues")
    public native void setCues(TextTrackCueList value);
    @JsProperty(name = "DISABLED")
    public native void setDISABLED(@DoNotAutobox Number value);
    @JsProperty(name = "ERROR")
    public native void setERROR(@DoNotAutobox Number value);
    @JsProperty(name = "HIDDEN")
    public native void setHIDDEN(@DoNotAutobox Number value);
    @JsProperty(name = "inBandMetadataTrackDispatchType")
    public native void setInBandMetadataTrackDispatchType(String value);
    @JsProperty(name = "kind")
    public native void setKind(String value);
    @JsProperty(name = "LOADED")
    public native void setLOADED(@DoNotAutobox Number value);
    @JsProperty(name = "LOADING")
    public native void setLOADING(@DoNotAutobox Number value);
    @JsProperty(name = "label")
    public native void setLabel(String value);
    @JsProperty(name = "language")
    public native void setLanguage(String value);
    @JsProperty(name = "mode")
    public native void setMode(Object value);
    @JsProperty(name = "NONE")
    public native void setNONE(@DoNotAutobox Number value);
    @JsProperty(name = "oncuechange")
    public native void setOncuechange(Function1<Event, Object> value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "onload")
    public native void setOnload(Function1<Event, Object> value);
    @JsProperty(name = "readyState")
    public native void setReadyState(@DoNotAutobox Number value);
    @JsProperty(name = "SHOWING")
    public native void setSHOWING(@DoNotAutobox Number value);
}
