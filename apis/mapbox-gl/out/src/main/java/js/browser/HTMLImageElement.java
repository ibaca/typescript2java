package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLImageElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 422518
  * declared in: tsd/browser/lib.es6.d.ts at pos 425084
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLImageElement")
public class HTMLImageElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLImageElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves how the object is aligned with adjacent text.
     */
    public String align;

    /** 
      * Sets or retrieves a text alternative to the graphic.
     */
    public String alt;

    /** 
      * Specifies the properties of a border drawn around an object.
     */
    public String border;

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Retrieves whether the object is fully loaded.
     */
    public Boolean complete;

    public String crossOrigin;

    public String currentSrc;

    public Element firstElementChild;

    /** 
      * Sets or retrieves the height of the object.
     */
    public Number height;

    /** 
      * Sets or retrieves the width of the border to draw around the object.
     */
    public Number hspace;

    /** 
      * Sets or retrieves whether the image is a server-side image map.
     */
    public Boolean isMap;

    public Element lastElementChild;

    /** 
      * Sets or retrieves a Uniform Resource Identifier (URI) to a long description of the object.
     */
    public String longDesc;

    public String lowsrc;

    /** 
      * Gets or sets whether the DLNA PlayTo device is available.
     */
    public Boolean msPlayToDisabled;

    public String msPlayToPreferredSourceUri;

    /** 
      * Gets or sets the primary DLNA PlayTo device.
     */
    public Boolean msPlayToPrimary;

    /** 
      * Gets the source associated with the media element for use by the PlayToManager.
     */
    public Object msPlayToSource;

    /** 
      * Sets or retrieves the name of the object.
     */
    public String name;

    /** 
      * The original height of the image resource before sizing.
     */
    public Number naturalHeight;

    /** 
      * The original width of the image resource before sizing.
     */
    public Number naturalWidth;

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

    public String sizes;

    /** 
      * The address or URL of the a media resource that is to be considered.
     */
    public String src;

    public String srcset;

    /** 
      * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
     */
    public String useMap;

    /** 
      * Sets or retrieves the vertical margin for the object.
     */
    public Number vspace;

    /** 
      * Sets or retrieves the width of the object.
     */
    public Number width;

    public Number x;

    public Number y;

    /*
        Methods
    */
    @JsProperty(name = "align")
    public native String getAlign();
    @JsProperty(name = "alt")
    public native String getAlt();
    @JsProperty(name = "border")
    public native String getBorder();
    @JsProperty(name = "complete")
    public native Boolean getComplete();
    @JsProperty(name = "crossOrigin")
    public native String getCrossOrigin();
    @JsProperty(name = "currentSrc")
    public native String getCurrentSrc();
    @JsProperty(name = "height")
    public native Number getHeight();
    @JsProperty(name = "hspace")
    public native Number getHspace();
    @JsProperty(name = "isMap")
    public native Boolean getIsMap();
    @JsProperty(name = "longDesc")
    public native String getLongDesc();
    @JsProperty(name = "lowsrc")
    public native String getLowsrc();
    @JsProperty(name = "msPlayToDisabled")
    public native Boolean getMsPlayToDisabled();
    @JsProperty(name = "msPlayToPreferredSourceUri")
    public native String getMsPlayToPreferredSourceUri();
    @JsProperty(name = "msPlayToPrimary")
    public native Boolean getMsPlayToPrimary();
    @JsProperty(name = "msPlayToSource")
    public native Object getMsPlayToSource();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "naturalHeight")
    public native Number getNaturalHeight();
    @JsProperty(name = "naturalWidth")
    public native Number getNaturalWidth();
    @JsProperty(name = "sizes")
    public native String getSizes();
    @JsProperty(name = "src")
    public native String getSrc();
    @JsProperty(name = "srcset")
    public native String getSrcset();
    @JsProperty(name = "useMap")
    public native String getUseMap();
    @JsProperty(name = "vspace")
    public native Number getVspace();
    @JsProperty(name = "width")
    public native Number getWidth();
    @JsProperty(name = "x")
    public native Number getX();
    @JsProperty(name = "y")
    public native Number getY();
    /** 
      * tsd/browser/lib.es6.d.ts@424764
     */
    public native Object msGetAsCastingSource();
    @JsProperty(name = "align")
    public native void setAlign(String value);
    @JsProperty(name = "alt")
    public native void setAlt(String value);
    @JsProperty(name = "border")
    public native void setBorder(String value);
    @JsProperty(name = "complete")
    public native void setComplete(Boolean value);
    @JsProperty(name = "crossOrigin")
    public native void setCrossOrigin(String value);
    @JsProperty(name = "currentSrc")
    public native void setCurrentSrc(String value);
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    @JsProperty(name = "hspace")
    public native void setHspace(@DoNotAutobox Number value);
    @JsProperty(name = "isMap")
    public native void setIsMap(Boolean value);
    @JsProperty(name = "longDesc")
    public native void setLongDesc(String value);
    @JsProperty(name = "lowsrc")
    public native void setLowsrc(String value);
    @JsProperty(name = "msPlayToDisabled")
    public native void setMsPlayToDisabled(Boolean value);
    @JsProperty(name = "msPlayToPreferredSourceUri")
    public native void setMsPlayToPreferredSourceUri(String value);
    @JsProperty(name = "msPlayToPrimary")
    public native void setMsPlayToPrimary(Boolean value);
    @JsProperty(name = "msPlayToSource")
    public native void setMsPlayToSource(Object value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "naturalHeight")
    public native void setNaturalHeight(@DoNotAutobox Number value);
    @JsProperty(name = "naturalWidth")
    public native void setNaturalWidth(@DoNotAutobox Number value);
    @JsProperty(name = "sizes")
    public native void setSizes(String value);
    @JsProperty(name = "src")
    public native void setSrc(String value);
    @JsProperty(name = "srcset")
    public native void setSrcset(String value);
    @JsProperty(name = "useMap")
    public native void setUseMap(String value);
    @JsProperty(name = "vspace")
    public native void setVspace(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
    @JsProperty(name = "x")
    public native void setX(@DoNotAutobox Number value);
    @JsProperty(name = "y")
    public native void setY(@DoNotAutobox Number value);
}
