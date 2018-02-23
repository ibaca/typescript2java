package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Location
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 499860
  * declared in: tsd/browser/lib.es6.d.ts at pos 500213
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Location")
public class Location
{

    /*
        Constructors
    */
    public Location () {
    } 

    /*
        Properties
    */

    public String hash;

    public String host;

    public String hostname;

    public String href;

    public String origin;

    public String pathname;

    public String port;

    public String protocol;

    public String search;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@500074
     */
    public native void assign(String url);
    @JsProperty(name = "hash")
    public native String getHash();
    @JsProperty(name = "host")
    public native String getHost();
    @JsProperty(name = "hostname")
    public native String getHostname();
    @JsProperty(name = "href")
    public native String getHref();
    @JsProperty(name = "origin")
    public native String getOrigin();
    @JsProperty(name = "pathname")
    public native String getPathname();
    @JsProperty(name = "port")
    public native String getPort();
    @JsProperty(name = "protocol")
    public native String getProtocol();
    @JsProperty(name = "search")
    public native String getSearch();
    public native void reload();
    /** 
      * tsd/browser/lib.es6.d.ts@500105
     */
    public native void reload(Boolean forcedReload /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@500147
     */
    public native void replace(String url);
    @JsProperty(name = "hash")
    public native void setHash(String value);
    @JsProperty(name = "host")
    public native void setHost(String value);
    @JsProperty(name = "hostname")
    public native void setHostname(String value);
    @JsProperty(name = "href")
    public native void setHref(String value);
    @JsProperty(name = "origin")
    public native void setOrigin(String value);
    @JsProperty(name = "pathname")
    public native void setPathname(String value);
    @JsProperty(name = "port")
    public native void setPort(String value);
    @JsProperty(name = "protocol")
    public native void setProtocol(String value);
    @JsProperty(name = "search")
    public native void setSearch(String value);
}
