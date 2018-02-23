package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLAreaElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 382815
  * declared in: tsd/browser/lib.es6.d.ts at pos 384671
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLAreaElement")
public class HTMLAreaElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLAreaElement () {
    } 

    /*
        Properties
    */

    /** 
      * Sets or retrieves a text alternative to the graphic.
     */
    public String alt;

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Sets or retrieves the coordinates of the object.
     */
    public String coords;

    public String download;

    public Element firstElementChild;

    /** 
      * Sets or retrieves the subsection of the href property that follows the number sign (#).
     */
    public String hash;

    /** 
      * Sets or retrieves the hostname and port number of the location or URL.
     */
    public String host;

    /** 
      * Sets or retrieves the host name part of the location or URL. 
     */
    public String hostname;

    /** 
      * Sets or retrieves a destination URL or an anchor point.
     */
    public String href;

    public Element lastElementChild;

    public Element nextElementSibling;

    /** 
      * Sets or gets whether clicks in this region cause action.
     */
    public Boolean noHref;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<WheelEvent, Object> onwheel;

    /** 
      * Sets or retrieves the file name or path specified by the object.
     */
    public String pathname;

    /** 
      * Sets or retrieves the port number associated with a URL.
     */
    public String port;

    public Element previousElementSibling;

    /** 
      * Sets or retrieves the protocol portion of a URL.
     */
    public String protocol;

    public String rel;

    /** 
      * Sets or retrieves the substring of the href property that follows the question mark.
     */
    public String search;

    /** 
      * Sets or retrieves the shape of the object.
     */
    public String shape;

    /** 
      * Sets or retrieves the window or frame at which to target content.
     */
    public String target;

    /*
        Methods
    */
    @JsProperty(name = "alt")
    public native String getAlt();
    @JsProperty(name = "coords")
    public native String getCoords();
    @JsProperty(name = "download")
    public native String getDownload();
    @JsProperty(name = "hash")
    public native String getHash();
    @JsProperty(name = "host")
    public native String getHost();
    @JsProperty(name = "hostname")
    public native String getHostname();
    @JsProperty(name = "href")
    public native String getHref();
    @JsProperty(name = "noHref")
    public native Boolean getNoHref();
    @JsProperty(name = "pathname")
    public native String getPathname();
    @JsProperty(name = "port")
    public native String getPort();
    @JsProperty(name = "protocol")
    public native String getProtocol();
    @JsProperty(name = "rel")
    public native String getRel();
    @JsProperty(name = "search")
    public native String getSearch();
    @JsProperty(name = "shape")
    public native String getShape();
    @JsProperty(name = "target")
    public native String getTarget();
    @JsProperty(name = "alt")
    public native void setAlt(String value);
    @JsProperty(name = "coords")
    public native void setCoords(String value);
    @JsProperty(name = "download")
    public native void setDownload(String value);
    @JsProperty(name = "hash")
    public native void setHash(String value);
    @JsProperty(name = "host")
    public native void setHost(String value);
    @JsProperty(name = "hostname")
    public native void setHostname(String value);
    @JsProperty(name = "href")
    public native void setHref(String value);
    @JsProperty(name = "noHref")
    public native void setNoHref(Boolean value);
    @JsProperty(name = "pathname")
    public native void setPathname(String value);
    @JsProperty(name = "port")
    public native void setPort(String value);
    @JsProperty(name = "protocol")
    public native void setProtocol(String value);
    @JsProperty(name = "rel")
    public native void setRel(String value);
    @JsProperty(name = "search")
    public native void setSearch(String value);
    @JsProperty(name = "shape")
    public native void setShape(String value);
    @JsProperty(name = "target")
    public native void setTarget(String value);
}
