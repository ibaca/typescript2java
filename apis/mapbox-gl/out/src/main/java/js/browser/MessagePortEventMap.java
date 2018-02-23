package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MessagePortEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 525310

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MessagePortEventMap
{

    /*
        Properties
    */

    public MessageEvent message;

    /*
        Methods
    */
    @JsProperty(name = "message")
    public native MessageEvent getMessage();
    @JsProperty(name = "message")
    public native void setMessage(MessageEvent value);
}
