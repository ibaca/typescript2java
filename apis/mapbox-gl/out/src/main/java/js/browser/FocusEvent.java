package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: FocusEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 375457
  * declared in: tsd/browser/lib.es6.d.ts at pos 375710
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="FocusEvent")
public class FocusEvent extends UIEvent 
{

    /*
        Constructors
    */
    public FocusEvent (String typeArg, FocusEventInit eventInitDict /* optional */) {
        super((String) null, (UIEventInit) null); 
    } 
    public FocusEvent (String typeArg) {
        super((String) null, (UIEventInit) null); 
    } 

    /*
        Properties
    */

    public EventTarget relatedTarget;

    /*
        Methods
    */
    @JsProperty(name = "relatedTarget")
    public native EventTarget getRelatedTarget();
    /** 
      * tsd/browser/lib.es6.d.ts@375543
     */
    public native void initFocusEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, @DoNotAutobox Number detailArg, EventTarget relatedTargetArg);
    @JsProperty(name = "relatedTarget")
    public native void setRelatedTarget(EventTarget value);
}
