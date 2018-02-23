package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: NotificationEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 535643

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class NotificationEventMap
{

    /*
        Properties
    */

    public Event click;

    public Event close;

    public Event error;

    public Event show;

    /*
        Methods
    */
    @JsProperty(name = "click")
    public native Event getClick();
    @JsProperty(name = "close")
    public native Event getClose();
    @JsProperty(name = "error")
    public native Event getError();
    @JsProperty(name = "show")
    public native Event getShow();
    @JsProperty(name = "click")
    public native void setClick(Event value);
    @JsProperty(name = "close")
    public native void setClose(Event value);
    @JsProperty(name = "error")
    public native void setError(Event value);
    @JsProperty(name = "show")
    public native void setShow(Event value);
}
