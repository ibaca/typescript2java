package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ErrorEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 371792
  * declared in: tsd/browser/lib.es6.d.ts at pos 372138
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="ErrorEvent")
public class ErrorEvent extends Event 
{

    /*
        Constructors
    */
    public ErrorEvent (String type, ErrorEventInit errorEventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public ErrorEvent (String type) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Number colno;

    public Object error;

    public String filename;

    public Number lineno;

    public String message;

    /*
        Methods
    */
    @JsProperty(name = "colno")
    public native Number getColno();
    @JsProperty(name = "error")
    public native Object getError();
    @JsProperty(name = "filename")
    public native String getFilename();
    @JsProperty(name = "lineno")
    public native Number getLineno();
    @JsProperty(name = "message")
    public native String getMessage();
    /** 
      * tsd/browser/lib.es6.d.ts@371978
     */
    public native void initErrorEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, String messageArg, String filenameArg, @DoNotAutobox Number linenoArg);
    @JsProperty(name = "colno")
    public native void setColno(@DoNotAutobox Number value);
    @JsProperty(name = "error")
    public native void setError(Object value);
    @JsProperty(name = "filename")
    public native void setFilename(String value);
    @JsProperty(name = "lineno")
    public native void setLineno(@DoNotAutobox Number value);
    @JsProperty(name = "message")
    public native void setMessage(String value);
}
