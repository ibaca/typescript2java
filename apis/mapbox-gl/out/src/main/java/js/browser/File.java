package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: File
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 374355
  * declared in: tsd/browser/lib.es6.d.ts at pos 374505
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="File")
public class File extends Blob 
{

    /*
        Constructors
    */
    public File (Array<UnionOfArrayBufferAndArrayBufferViewAndBlobAndString> parts, String filename, FilePropertyBag properties /* optional */) {
        super((Array<Object>) null, (BlobPropertyBag) null); 
    } 
    public File (Array<UnionOfArrayBufferAndArrayBufferViewAndBlobAndString> parts, String filename) {
        super((Array<Object>) null, (BlobPropertyBag) null); 
    } 

    /*
        Properties
    */

    public Object lastModifiedDate;

    public String name;

    public String webkitRelativePath;

    /*
        Methods
    */
    @JsProperty(name = "lastModifiedDate")
    public native Object getLastModifiedDate();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "webkitRelativePath")
    public native String getWebkitRelativePath();
    @JsProperty(name = "lastModifiedDate")
    public native void setLastModifiedDate(Object value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "webkitRelativePath")
    public native void setWebkitRelativePath(String value);
}
