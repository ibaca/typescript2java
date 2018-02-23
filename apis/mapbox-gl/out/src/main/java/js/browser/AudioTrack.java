package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AudioTrack
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 291177
  * declared in: tsd/browser/lib.es6.d.ts at pos 291372
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AudioTrack")
public class AudioTrack
{

    /*
        Constructors
    */
    public AudioTrack () {
    } 

    /*
        Properties
    */

    public Boolean enabled;

    public String id;

    public String kind;

    public String label;

    public String language;

    public SourceBuffer sourceBuffer;

    /*
        Methods
    */
    @JsProperty(name = "enabled")
    public native Boolean getEnabled();
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "kind")
    public native String getKind();
    @JsProperty(name = "label")
    public native String getLabel();
    @JsProperty(name = "language")
    public native String getLanguage();
    @JsProperty(name = "sourceBuffer")
    public native SourceBuffer getSourceBuffer();
    @JsProperty(name = "enabled")
    public native void setEnabled(Boolean value);
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "kind")
    public native void setKind(String value);
    @JsProperty(name = "label")
    public native void setLabel(String value);
    @JsProperty(name = "language")
    public native void setLanguage(String value);
    @JsProperty(name = "sourceBuffer")
    public native void setSourceBuffer(SourceBuffer value);
}
