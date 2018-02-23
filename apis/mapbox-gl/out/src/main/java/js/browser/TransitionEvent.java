package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TransitionEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 659314
  * declared in: tsd/browser/lib.es6.d.ts at pos 659585
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TransitionEvent")
public class TransitionEvent extends Event 
{

    /*
        Constructors
    */
    public TransitionEvent (String typeArg, TransitionEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public TransitionEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Number elapsedTime;

    public String propertyName;

    /*
        Methods
    */
    @JsProperty(name = "elapsedTime")
    public native Number getElapsedTime();
    @JsProperty(name = "propertyName")
    public native String getPropertyName();
    /** 
      * tsd/browser/lib.es6.d.ts@659431
     */
    public native void initTransitionEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, String propertyNameArg, @DoNotAutobox Number elapsedTimeArg);
    @JsProperty(name = "elapsedTime")
    public native void setElapsedTime(@DoNotAutobox Number value);
    @JsProperty(name = "propertyName")
    public native void setPropertyName(String value);
}
