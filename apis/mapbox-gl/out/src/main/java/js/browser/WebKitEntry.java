package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WebKitEntry
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 701370
  * declared in: tsd/browser/lib.es6.d.ts at pos 701576
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WebKitEntry")
public class WebKitEntry
{

    /*
        Constructors
    */
    public WebKitEntry () {
    } 

    /*
        Properties
    */

    public WebKitFileSystem filesystem;

    public String fullPath;

    public Boolean isDirectory;

    public Boolean isFile;

    public String name;

    /*
        Methods
    */
    @JsProperty(name = "filesystem")
    public native WebKitFileSystem getFilesystem();
    @JsProperty(name = "fullPath")
    public native String getFullPath();
    @JsProperty(name = "isDirectory")
    public native Boolean getIsDirectory();
    @JsProperty(name = "isFile")
    public native Boolean getIsFile();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "filesystem")
    public native void setFilesystem(WebKitFileSystem value);
    @JsProperty(name = "fullPath")
    public native void setFullPath(String value);
    @JsProperty(name = "isDirectory")
    public native void setIsDirectory(Boolean value);
    @JsProperty(name = "isFile")
    public native void setIsFile(Boolean value);
    @JsProperty(name = "name")
    public native void setName(String value);
}
