package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Error
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 36596
  * declared in: tsd/browser/lib.es6.d.ts at pos 36820
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Error")
public class Error
{

    /*
        Constructors
    */
    public Error (String message /* optional */) {
    } 
    public Error () {
    } 

    /*
        Properties
    */

    public String message;

    public String name;

    public String stack;

    /*
        Methods
    */
    @JsProperty(name = "message")
    public native String getMessage();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "stack")
    public native String getStack();
    @JsProperty(name = "message")
    public native void setMessage(String value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "stack")
    public native void setStack(String value);
}
