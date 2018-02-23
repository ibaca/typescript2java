package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MessageEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 524862
  * declared in: tsd/browser/lib.es6.d.ts at pos 525192
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MessageEvent")
public class MessageEvent extends Event 
{

    /*
        Constructors
    */
    public MessageEvent (String type, MessageEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public MessageEvent (String type) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Object data;

    public String origin;

    public Object ports;

    public Window source;

    /*
        Methods
    */
    @JsProperty(name = "data")
    public native Object getData();
    @JsProperty(name = "origin")
    public native String getOrigin();
    @JsProperty(name = "ports")
    public native Object getPorts();
    @JsProperty(name = "source")
    public native Window getSource();
    /** 
      * tsd/browser/lib.es6.d.ts@525014
     */
    public native void initMessageEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Object dataArg, String originArg, String lastEventIdArg, Window sourceArg);
    @JsProperty(name = "data")
    public native void setData(Object value);
    @JsProperty(name = "origin")
    public native void setOrigin(String value);
    @JsProperty(name = "ports")
    public native void setPorts(Object value);
    @JsProperty(name = "source")
    public native void setSource(Window value);
}
