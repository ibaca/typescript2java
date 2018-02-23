package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MessagePort
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 525374
  * declared in: tsd/browser/lib.es6.d.ts at pos 525861
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MessagePort")
public class MessagePort extends EventTarget 
{

    /*
        Constructors
    */
    public MessagePort () {
    } 

    /*
        Properties
    */

    public Function1<MessageEvent, Object> onmessage;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@525485
     */
    public native void close();
    @JsProperty(name = "onmessage")
    public native Function1<MessageEvent, Object> getOnmessage();
    public native void postMessage();
    public native void postMessage(Object message /* optional */);
    /** 
      * tsd/browser/lib.es6.d.ts@525504
     */
    public native void postMessage(Object message /* optional */, Array<Object> transfer /* optional */);
    @JsProperty(name = "onmessage")
    public native void setOnmessage(Function1<MessageEvent, Object> value);
    /** 
      * tsd/browser/lib.es6.d.ts@525560
     */
    public native void start();
}
