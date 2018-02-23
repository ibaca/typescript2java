package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLAnchorElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 377979
  * declared in: tsd/browser/lib.es6.d.ts at pos 380309
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLAnchorElement")
public class HTMLAnchorElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLAnchorElement () {
    } 

    /*
        Properties
    */

    public String Methods;

    /** 
      * Sets or retrieves the character set used to encode the object.
     */
    public String charset;

    public Number childElementCount;

    public HTMLCollection children;

    /** 
      * Sets or retrieves the coordinates of the object.
     */
    public String coords;

    public String download;

    public Element firstElementChild;

    /** 
      * Contains the anchor portion of the URL including the hash sign (#).
     */
    public String hash;

    /** 
      * Contains the hostname and port values of the URL.
     */
    public String host;

    /** 
      * Contains the hostname of a URL.
     */
    public String hostname;

    /** 
      * Sets or retrieves a destination URL or an anchor point.
     */
    public String href;

    /** 
      * Sets or retrieves the language code of the object.
     */
    public String hreflang;

    public Element lastElementChild;

    public String mimeType;

    /** 
      * Sets or retrieves the shape of the object.
     */
    public String name;

    public String nameProp;

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

    /** 
      * Contains the pathname of the URL.
     */
    public String pathname;

    /** 
      * Sets or retrieves the port number associated with a URL.
     */
    public String port;

    public Element previousElementSibling;

    /** 
      * Contains the protocol of the URL.
     */
    public String protocol;

    public String protocolLong;

    /** 
      * Sets or retrieves the relationship between the object and the destination of the link.
     */
    public String rel;

    /** 
      * Sets or retrieves the relationship between the object and the destination of the link.
     */
    public String rev;

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

    /** 
      * Retrieves or sets the text of the object as a string. 
     */
    public String text;

    public String type;

    public String urn;

    /*
        Methods
    */
    @JsProperty(name = "charset")
    public native String getCharset();
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
    @JsProperty(name = "hreflang")
    public native String getHreflang();
    @JsProperty(name = "Methods")
    public native String getMethods();
    @JsProperty(name = "mimeType")
    public native String getMimeType();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "nameProp")
    public native String getNameProp();
    @JsProperty(name = "pathname")
    public native String getPathname();
    @JsProperty(name = "port")
    public native String getPort();
    @JsProperty(name = "protocol")
    public native String getProtocol();
    @JsProperty(name = "protocolLong")
    public native String getProtocolLong();
    @JsProperty(name = "rel")
    public native String getRel();
    @JsProperty(name = "rev")
    public native String getRev();
    @JsProperty(name = "search")
    public native String getSearch();
    @JsProperty(name = "shape")
    public native String getShape();
    @JsProperty(name = "target")
    public native String getTarget();
    @JsProperty(name = "text")
    public native String getText();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "urn")
    public native String getUrn();
    @JsProperty(name = "charset")
    public native void setCharset(String value);
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
    @JsProperty(name = "hreflang")
    public native void setHreflang(String value);
    @JsProperty(name = "Methods")
    public native void setMethods(String value);
    @JsProperty(name = "mimeType")
    public native void setMimeType(String value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "nameProp")
    public native void setNameProp(String value);
    @JsProperty(name = "pathname")
    public native void setPathname(String value);
    @JsProperty(name = "port")
    public native void setPort(String value);
    @JsProperty(name = "protocol")
    public native void setProtocol(String value);
    @JsProperty(name = "protocolLong")
    public native void setProtocolLong(String value);
    @JsProperty(name = "rel")
    public native void setRel(String value);
    @JsProperty(name = "rev")
    public native void setRev(String value);
    @JsProperty(name = "search")
    public native void setSearch(String value);
    @JsProperty(name = "shape")
    public native void setShape(String value);
    @JsProperty(name = "target")
    public native void setTarget(String value);
    @JsProperty(name = "text")
    public native void setText(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
    @JsProperty(name = "urn")
    public native void setUrn(String value);
}
