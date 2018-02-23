package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: VideoTrack
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 662066
  * declared in: tsd/browser/lib.es6.d.ts at pos 662262
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="VideoTrack")
public class VideoTrack
{

    /*
        Constructors
    */
    public VideoTrack () {
    } 

    /*
        Properties
    */

    public String id;

    public String kind;

    public String label;

    public String language;

    public Boolean selected;

    public SourceBuffer sourceBuffer;

    /*
        Methods
    */
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "kind")
    public native String getKind();
    @JsProperty(name = "label")
    public native String getLabel();
    @JsProperty(name = "language")
    public native String getLanguage();
    @JsProperty(name = "selected")
    public native Boolean getSelected();
    @JsProperty(name = "sourceBuffer")
    public native SourceBuffer getSourceBuffer();
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "kind")
    public native void setKind(String value);
    @JsProperty(name = "label")
    public native void setLabel(String value);
    @JsProperty(name = "language")
    public native void setLanguage(String value);
    @JsProperty(name = "selected")
    public native void setSelected(Boolean value);
    @JsProperty(name = "sourceBuffer")
    public native void setSourceBuffer(SourceBuffer value);
}
