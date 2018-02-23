package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLTrackElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 484939
  * declared in: tsd/browser/lib.es6.d.ts at pos 485556
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLTrackElement")
public class HTMLTrackElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLTrackElement () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="HTMLTrackElement", name="ERROR")
    public static Number ERROR;

    @JsProperty(namespace="HTMLTrackElement", name="LOADED")
    public static Number LOADED;

    @JsProperty(namespace="HTMLTrackElement", name="LOADING")
    public static Number LOADING;

    @JsProperty(namespace="HTMLTrackElement", name="NONE")
    public static Number NONE;

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    @JsProperty(name="default")
    public Boolean default_;

    public Element firstElementChild;

    public String kind;

    public String label;

    public Element lastElementChild;

    public Element nextElementSibling;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<WheelEvent, Object> onwheel;

    public Element previousElementSibling;

    public Number readyState;

    public String src;

    public String srclang;

    public TextTrack track;

    /*
        Methods
    */
    @JsProperty(name = "default")
    public native Boolean getDefault_();
    @JsProperty(name = "ERROR")
    public native Number getERROR();
    @JsProperty(name = "kind")
    public native String getKind();
    @JsProperty(name = "LOADED")
    public native Number getLOADED();
    @JsProperty(name = "LOADING")
    public native Number getLOADING();
    @JsProperty(name = "label")
    public native String getLabel();
    @JsProperty(name = "NONE")
    public native Number getNONE();
    @JsProperty(name = "readyState")
    public native Number getReadyState();
    @JsProperty(name = "src")
    public native String getSrc();
    @JsProperty(name = "srclang")
    public native String getSrclang();
    @JsProperty(name = "track")
    public native TextTrack getTrack();
    @JsProperty(name = "default")
    public native void setDefault_(Boolean value);
    @JsProperty(name = "ERROR")
    public native void setERROR(@DoNotAutobox Number value);
    @JsProperty(name = "kind")
    public native void setKind(String value);
    @JsProperty(name = "LOADED")
    public native void setLOADED(@DoNotAutobox Number value);
    @JsProperty(name = "LOADING")
    public native void setLOADING(@DoNotAutobox Number value);
    @JsProperty(name = "label")
    public native void setLabel(String value);
    @JsProperty(name = "NONE")
    public native void setNONE(@DoNotAutobox Number value);
    @JsProperty(name = "readyState")
    public native void setReadyState(@DoNotAutobox Number value);
    @JsProperty(name = "src")
    public native void setSrc(String value);
    @JsProperty(name = "srclang")
    public native void setSrclang(String value);
    @JsProperty(name = "track")
    public native void setTrack(TextTrack value);
}
