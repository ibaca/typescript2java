package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaStreamTrack
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 523231
  * declared in: tsd/browser/lib.es6.d.ts at pos 524332
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamTrack")
public class MediaStreamTrack extends EventTarget 
{

    /*
        Constructors
    */
    public MediaStreamTrack () {
    } 

    /*
        Properties
    */

    public Boolean enabled;

    public String id;

    public String kind;

    public String label;

    public Boolean muted;

    public Function1<MediaStreamErrorEvent, Object> onended;

    public Function1<Event, Object> onmute;

    public Function1<MediaStreamErrorEvent, Object> onoverconstrained;

    public Function1<Event, Object> onunmute;

    public Boolean readonly;

    public String readyState;

    public Boolean remote;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@523782
     */
    public native Promise<Void> applyConstraints(MediaTrackConstraints constraints);
    /** 
      * tsd/browser/lib.es6.d.ts@523855
     */
    public native MediaStreamTrack clone();
    /** 
      * tsd/browser/lib.es6.d.ts@523886
     */
    public native MediaTrackCapabilities getCapabilities();
    /** 
      * tsd/browser/lib.es6.d.ts@523933
     */
    public native MediaTrackConstraints getConstraints();
    @JsProperty(name = "enabled")
    public native Boolean getEnabled();
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "kind")
    public native String getKind();
    @JsProperty(name = "label")
    public native String getLabel();
    @JsProperty(name = "muted")
    public native Boolean getMuted();
    @JsProperty(name = "onended")
    public native Function1<MediaStreamErrorEvent, Object> getOnended();
    @JsProperty(name = "onmute")
    public native Function1<Event, Object> getOnmute();
    @JsProperty(name = "onoverconstrained")
    public native Function1<MediaStreamErrorEvent, Object> getOnoverconstrained();
    @JsProperty(name = "onunmute")
    public native Function1<Event, Object> getOnunmute();
    @JsProperty(name = "readonly")
    public native Boolean getReadonly();
    @JsProperty(name = "readyState")
    public native String getReadyState();
    @JsProperty(name = "remote")
    public native Boolean getRemote();
    /** 
      * tsd/browser/lib.es6.d.ts@523978
     */
    public native MediaTrackSettings getSettings();
    @JsProperty(name = "enabled")
    public native void setEnabled(Boolean value);
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "kind")
    public native void setKind(String value);
    @JsProperty(name = "label")
    public native void setLabel(String value);
    @JsProperty(name = "muted")
    public native void setMuted(Boolean value);
    @JsProperty(name = "onended")
    public native void setOnended(Function1<MediaStreamErrorEvent, Object> value);
    @JsProperty(name = "onmute")
    public native void setOnmute(Function1<Event, Object> value);
    @JsProperty(name = "onoverconstrained")
    public native void setOnoverconstrained(Function1<MediaStreamErrorEvent, Object> value);
    @JsProperty(name = "onunmute")
    public native void setOnunmute(Function1<Event, Object> value);
    @JsProperty(name = "readonly")
    public native void setReadonly(Boolean value);
    @JsProperty(name = "readyState")
    public native void setReadyState(String value);
    @JsProperty(name = "remote")
    public native void setRemote(Boolean value);
    /** 
      * tsd/browser/lib.es6.d.ts@524017
     */
    public native void stop();
}
