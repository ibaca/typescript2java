package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AnimationEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 283267
  * declared in: tsd/browser/lib.es6.d.ts at pos 283538
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="AnimationEvent")
public class AnimationEvent extends Event 
{

    /*
        Constructors
    */
    public AnimationEvent (String typeArg, AnimationEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public AnimationEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public String animationName;

    public Number elapsedTime;

    /*
        Methods
    */
    @JsProperty(name = "animationName")
    public native String getAnimationName();
    @JsProperty(name = "elapsedTime")
    public native Number getElapsedTime();
    /** 
      * tsd/browser/lib.es6.d.ts@283384
     */
    public native void initAnimationEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, String animationNameArg, @DoNotAutobox Number elapsedTimeArg);
    @JsProperty(name = "animationName")
    public native void setAnimationName(String value);
    @JsProperty(name = "elapsedTime")
    public native void setElapsedTime(@DoNotAutobox Number value);
}
