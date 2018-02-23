package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaStreamError
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 522333
  * declared in: tsd/browser/lib.es6.d.ts at pos 522486
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaStreamError")
public class MediaStreamError
{

    /*
        Constructors
    */
    public MediaStreamError () {
    } 

    /*
        Properties
    */

    public String constraintName;

    public String message;

    public String name;

    /*
        Methods
    */
    @JsProperty(name = "constraintName")
    public native String getConstraintName();
    @JsProperty(name = "message")
    public native String getMessage();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "constraintName")
    public native void setConstraintName(String value);
    @JsProperty(name = "message")
    public native void setMessage(String value);
    @JsProperty(name = "name")
    public native void setName(String value);
}
