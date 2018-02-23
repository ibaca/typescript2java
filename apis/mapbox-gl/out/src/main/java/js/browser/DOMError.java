package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DOMError
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 319267
  * declared in: tsd/browser/lib.es6.d.ts at pos 319355
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DOMError")
public class DOMError
{

    /*
        Constructors
    */
    public DOMError () {
    } 

    /*
        Properties
    */

    public String name;

    /*
        Methods
    */
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "name")
    public native void setName(String value);
}
