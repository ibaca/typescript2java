package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaKeyMessageEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 518262
  * declared in: tsd/browser/lib.es6.d.ts at pos 518394
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MediaKeyMessageEvent")
public class MediaKeyMessageEvent extends Event 
{

    /*
        Constructors
    */
    public MediaKeyMessageEvent (String type, MediaKeyMessageEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public MediaKeyMessageEvent (String type) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public ArrayBuffer message;

    public String messageType;

    /*
        Methods
    */
    @JsProperty(name = "message")
    public native ArrayBuffer getMessage();
    @JsProperty(name = "messageType")
    public native String getMessageType();
    @JsProperty(name = "message")
    public native void setMessage(ArrayBuffer value);
    @JsProperty(name = "messageType")
    public native void setMessageType(String value);
}
