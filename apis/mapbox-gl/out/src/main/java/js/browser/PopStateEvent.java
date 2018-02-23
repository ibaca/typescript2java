package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PopStateEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 551066
  * declared in: tsd/browser/lib.es6.d.ts at pos 551255
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="PopStateEvent")
public class PopStateEvent extends Event 
{

    /*
        Constructors
    */
    public PopStateEvent (String typeArg, PopStateEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public PopStateEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Object state;

    /*
        Methods
    */
    @JsProperty(name = "state")
    public native Object getState();
    /** 
      * tsd/browser/lib.es6.d.ts@551137
     */
    public native void initPopStateEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Object stateArg);
    @JsProperty(name = "state")
    public native void setState(Object value);
}
