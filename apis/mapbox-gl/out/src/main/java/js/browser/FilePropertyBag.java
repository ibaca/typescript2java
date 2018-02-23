package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: FilePropertyBag
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 739342

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class FilePropertyBag
{

    /*
        Properties
    */

    public Number lastModified;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "lastModified")
    public native Number getLastModified();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "lastModified")
    public native void setLastModified(@DoNotAutobox Number value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
