package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Event
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 372253
  * declared in: tsd/browser/lib.es6.d.ts at pos 373039
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Event")
public class Event
{

    /*
        Constructors
    */
    public Event (String typeArg, EventInit eventInitDict /* optional */) {
    } 
    public Event (String typeArg) {
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="Event", name="AT_TARGET")
    public static Number AT_TARGET;

    @JsProperty(namespace="Event", name="BUBBLING_PHASE")
    public static Number BUBBLING_PHASE;

    @JsProperty(namespace="Event", name="CAPTURING_PHASE")
    public static Number CAPTURING_PHASE;

    /*
        Properties
    */

    public Boolean bubbles;

    public Boolean cancelBubble;

    public Boolean cancelable;

    public EventTarget currentTarget;

    public Boolean defaultPrevented;

    public Number eventPhase;

    public Boolean isTrusted;

    public Boolean returnValue;

    public Boolean scoped;

    public Element srcElement;

    public EventTarget target;

    public Number timeStamp;

    public String type;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@372891
     */
    public native Array<EventTarget> deepPath();
    @JsProperty(name = "AT_TARGET")
    public native Number getAT_TARGET();
    @JsProperty(name = "BUBBLING_PHASE")
    public native Number getBUBBLING_PHASE();
    @JsProperty(name = "bubbles")
    public native Boolean getBubbles();
    @JsProperty(name = "CAPTURING_PHASE")
    public native Number getCAPTURING_PHASE();
    @JsProperty(name = "cancelBubble")
    public native Boolean getCancelBubble();
    @JsProperty(name = "cancelable")
    public native Boolean getCancelable();
    @JsProperty(name = "currentTarget")
    public native EventTarget getCurrentTarget();
    @JsProperty(name = "defaultPrevented")
    public native Boolean getDefaultPrevented();
    @JsProperty(name = "eventPhase")
    public native Number getEventPhase();
    @JsProperty(name = "isTrusted")
    public native Boolean getIsTrusted();
    @JsProperty(name = "returnValue")
    public native Boolean getReturnValue();
    @JsProperty(name = "scoped")
    public native Boolean getScoped();
    @JsProperty(name = "srcElement")
    public native Element getSrcElement();
    @JsProperty(name = "target")
    public native EventTarget getTarget();
    @JsProperty(name = "timeStamp")
    public native Number getTimeStamp();
    @JsProperty(name = "type")
    public native String getType();
    /** 
      * tsd/browser/lib.es6.d.ts@372706
     */
    public native void initEvent(String eventTypeArg, Boolean canBubbleArg, Boolean cancelableArg);
    /** 
      * tsd/browser/lib.es6.d.ts@372796
     */
    public native void preventDefault();
    @JsProperty(name = "AT_TARGET")
    public native void setAT_TARGET(@DoNotAutobox Number value);
    @JsProperty(name = "BUBBLING_PHASE")
    public native void setBUBBLING_PHASE(@DoNotAutobox Number value);
    @JsProperty(name = "bubbles")
    public native void setBubbles(Boolean value);
    @JsProperty(name = "CAPTURING_PHASE")
    public native void setCAPTURING_PHASE(@DoNotAutobox Number value);
    @JsProperty(name = "cancelBubble")
    public native void setCancelBubble(Boolean value);
    @JsProperty(name = "cancelable")
    public native void setCancelable(Boolean value);
    @JsProperty(name = "currentTarget")
    public native void setCurrentTarget(EventTarget value);
    @JsProperty(name = "defaultPrevented")
    public native void setDefaultPrevented(Boolean value);
    @JsProperty(name = "eventPhase")
    public native void setEventPhase(@DoNotAutobox Number value);
    @JsProperty(name = "isTrusted")
    public native void setIsTrusted(Boolean value);
    @JsProperty(name = "returnValue")
    public native void setReturnValue(Boolean value);
    @JsProperty(name = "scoped")
    public native void setScoped(Boolean value);
    @JsProperty(name = "srcElement")
    public native void setSrcElement(Element value);
    @JsProperty(name = "target")
    public native void setTarget(EventTarget value);
    @JsProperty(name = "timeStamp")
    public native void setTimeStamp(@DoNotAutobox Number value);
    @JsProperty(name = "type")
    public native void setType(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@372824
     */
    public native void stopImmediatePropagation();
    /** 
      * tsd/browser/lib.es6.d.ts@372862
     */
    public native void stopPropagation();
}
