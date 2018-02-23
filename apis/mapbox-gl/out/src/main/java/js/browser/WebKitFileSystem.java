package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WebKitFileSystem
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 701880
  * declared in: tsd/browser/lib.es6.d.ts at pos 701993
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitFileSystem")
public class WebKitFileSystem
{

    /*
        Constructors
    */
    public WebKitFileSystem () {
    } 

    /*
        Properties
    */

    public String name;

    public WebKitDirectoryEntry root;

    /*
        Methods
    */
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "root")
    public native WebKitDirectoryEntry getRoot();
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "root")
    public native void setRoot(WebKitDirectoryEntry value);
}
