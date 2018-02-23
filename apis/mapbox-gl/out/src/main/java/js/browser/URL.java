package js.browser;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: URL
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 660486
  * declared in: tsd/browser/lib.es6.d.ts at pos 660817
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="URL")
public class URL
{

    /*
        Constructors
    */
    public URL (String url, String base /* optional */) {
    } 
    public URL (String url) {
    } 

    /*
        Static methods
    */

    /** 
      * source : tsd/browser/lib.es6.d.ts:660891
     */
    @JsMethod(namespace="URL", name = "createObjectURL")
    public static native String createObjectURL(Object object, ObjectURLOptions options /* optional */);

    /** 
      * source : tsd/browser/lib.es6.d.ts:660961
     */
    @JsMethod(namespace="URL", name = "revokeObjectURL")
    public static native void revokeObjectURL(String url);

    @JsMethod(namespace="URL", name = "createObjectURL")
    public static native String createObjectURL(Object object);

    /*
        Properties
    */

    public String hash;

    public String host;

    public String hostname;

    public String href;

    public String origin;

    public String password;

    public String pathname;

    public String port;

    public String protocol;

    public String search;

    public URLSearchParams searchparams;

    public String username;

    /*
        Methods
    */
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
    @JsProperty(name = "password")
    public native String getPassword();
    @JsProperty(name = "pathname")
    public native String getPathname();
    @JsProperty(name = "port")
    public native String getPort();
    @JsProperty(name = "protocol")
    public native String getProtocol();
    @JsProperty(name = "search")
    public native String getSearch();
    @JsProperty(name = "searchparams")
    public native URLSearchParams getSearchparams();
    @JsProperty(name = "username")
    public native String getUsername();
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
    @JsProperty(name = "password")
    public native void setPassword(String value);
    @JsProperty(name = "pathname")
    public native void setPathname(String value);
    @JsProperty(name = "port")
    public native void setPort(String value);
    @JsProperty(name = "protocol")
    public native void setProtocol(String value);
    @JsProperty(name = "search")
    public native void setSearch(String value);
    @JsProperty(name = "searchparams")
    public native void setSearchparams(URLSearchParams value);
    @JsProperty(name = "username")
    public native void setUsername(String value);
}
