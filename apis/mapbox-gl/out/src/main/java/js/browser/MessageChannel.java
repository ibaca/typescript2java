package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MessageChannel
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 524675
  * declared in: tsd/browser/lib.es6.d.ts at pos 524784
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MessageChannel")
public class MessageChannel
{

    /*
        Constructors
    */
    public MessageChannel () {
    } 

    /*
        Properties
    */

    public MessagePort port1;

    public MessagePort port2;

    /*
        Methods
    */
    @JsProperty(name = "port1")
    public native MessagePort getPort1();
    @JsProperty(name = "port2")
    public native MessagePort getPort2();
    @JsProperty(name = "port1")
    public native void setPort1(MessagePort value);
    @JsProperty(name = "port2")
    public native void setPort2(MessagePort value);
}
