package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PositionError
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 551543
  * declared in: tsd/browser/lib.es6.d.ts at pos 551779
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PositionError")
public class PositionError
{

    /*
        Constructors
    */
    public PositionError () {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="PositionError", name="PERMISSION_DENIED")
    public static Number PERMISSION_DENIED;

    @JsProperty(namespace="PositionError", name="POSITION_UNAVAILABLE")
    public static Number POSITION_UNAVAILABLE;

    @JsProperty(namespace="PositionError", name="TIMEOUT")
    public static Number TIMEOUT;

    /*
        Properties
    */

    public Number code;

    public String message;

    /*
        Methods
    */
    @JsProperty(name = "code")
    public native Number getCode();
    @JsProperty(name = "message")
    public native String getMessage();
    @JsProperty(name = "PERMISSION_DENIED")
    public native Number getPERMISSION_DENIED();
    @JsProperty(name = "POSITION_UNAVAILABLE")
    public native Number getPOSITION_UNAVAILABLE();
    @JsProperty(name = "TIMEOUT")
    public native Number getTIMEOUT();
    @JsProperty(name = "code")
    public native void setCode(@DoNotAutobox Number value);
    @JsProperty(name = "message")
    public native void setMessage(String value);
    @JsProperty(name = "PERMISSION_DENIED")
    public native void setPERMISSION_DENIED(@DoNotAutobox Number value);
    @JsProperty(name = "POSITION_UNAVAILABLE")
    public native void setPOSITION_UNAVAILABLE(@DoNotAutobox Number value);
    @JsProperty(name = "TIMEOUT")
    public native void setTIMEOUT(@DoNotAutobox Number value);
}
