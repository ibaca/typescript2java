package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WebSocketEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 702238

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class WebSocketEventMap
{

    /*
        Properties
    */

    public CloseEvent close;

    public Event error;

    public MessageEvent message;

    public Event open;

    /*
        Methods
    */
    @JsProperty(name = "close")
    public native CloseEvent getClose();
    @JsProperty(name = "error")
    public native Event getError();
    @JsProperty(name = "message")
    public native MessageEvent getMessage();
    @JsProperty(name = "open")
    public native Event getOpen();
    @JsProperty(name = "close")
    public native void setClose(CloseEvent value);
    @JsProperty(name = "error")
    public native void setError(Event value);
    @JsProperty(name = "message")
    public native void setMessage(MessageEvent value);
    @JsProperty(name = "open")
    public native void setOpen(Event value);
}
