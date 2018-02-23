package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: BlobPropertyBag
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 739270

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class BlobPropertyBag
{

    /*
        Properties
    */

    public String endings;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "endings")
    public native String getEndings();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "endings")
    public native void setEndings(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
