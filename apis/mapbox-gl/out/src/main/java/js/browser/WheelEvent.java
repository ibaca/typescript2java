package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: WheelEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 703504
  * declared in: tsd/browser/lib.es6.d.ts at pos 704297
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="WheelEvent")
public class WheelEvent extends MouseEvent 
{

    /*
        Constructors
    */
    public WheelEvent (String typeArg, WheelEventInit eventInitDict /* optional */) {
        super((String) null, (MouseEventInit) null); 
    } 
    public WheelEvent (String typeArg) {
        super((String) null, (MouseEventInit) null); 
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="WheelEvent", name="DOM_DELTA_LINE")
    public static Number DOM_DELTA_LINE;

    @JsProperty(namespace="WheelEvent", name="DOM_DELTA_PAGE")
    public static Number DOM_DELTA_PAGE;

    @JsProperty(namespace="WheelEvent", name="DOM_DELTA_PIXEL")
    public static Number DOM_DELTA_PIXEL;

    /*
        Properties
    */

    public Number deltaMode;

    public Number deltaX;

    public Number deltaY;

    public Number deltaZ;

    public Number wheelDelta;

    public Number wheelDeltaX;

    public Number wheelDeltaY;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@703772
     */
    public native void getCurrentPoint(Element element);
    @JsProperty(name = "DOM_DELTA_LINE")
    public native Number getDOM_DELTA_LINE();
    @JsProperty(name = "DOM_DELTA_PAGE")
    public native Number getDOM_DELTA_PAGE();
    @JsProperty(name = "DOM_DELTA_PIXEL")
    public native Number getDOM_DELTA_PIXEL();
    @JsProperty(name = "deltaMode")
    public native Number getDeltaMode();
    @JsProperty(name = "deltaX")
    public native Number getDeltaX();
    @JsProperty(name = "deltaY")
    public native Number getDeltaY();
    @JsProperty(name = "deltaZ")
    public native Number getDeltaZ();
    @JsProperty(name = "wheelDelta")
    public native Number getWheelDelta();
    @JsProperty(name = "wheelDeltaX")
    public native Number getWheelDeltaX();
    @JsProperty(name = "wheelDeltaY")
    public native Number getWheelDeltaY();
    /** 
      * tsd/browser/lib.es6.d.ts@703817
     */
    public native void initWheelEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, @DoNotAutobox Number detailArg, @DoNotAutobox Number screenXArg, @DoNotAutobox Number screenYArg, @DoNotAutobox Number clientXArg, @DoNotAutobox Number clientYArg, @DoNotAutobox Number buttonArg, EventTarget relatedTargetArg, String modifiersListArg, @DoNotAutobox Number deltaXArg, @DoNotAutobox Number deltaYArg, @DoNotAutobox Number deltaZArg, @DoNotAutobox Number deltaMode);
    @JsProperty(name = "DOM_DELTA_LINE")
    public native void setDOM_DELTA_LINE(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_DELTA_PAGE")
    public native void setDOM_DELTA_PAGE(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_DELTA_PIXEL")
    public native void setDOM_DELTA_PIXEL(@DoNotAutobox Number value);
    @JsProperty(name = "deltaMode")
    public native void setDeltaMode(@DoNotAutobox Number value);
    @JsProperty(name = "deltaX")
    public native void setDeltaX(@DoNotAutobox Number value);
    @JsProperty(name = "deltaY")
    public native void setDeltaY(@DoNotAutobox Number value);
    @JsProperty(name = "deltaZ")
    public native void setDeltaZ(@DoNotAutobox Number value);
    @JsProperty(name = "wheelDelta")
    public native void setWheelDelta(@DoNotAutobox Number value);
    @JsProperty(name = "wheelDeltaX")
    public native void setWheelDeltaX(@DoNotAutobox Number value);
    @JsProperty(name = "wheelDeltaY")
    public native void setWheelDeltaY(@DoNotAutobox Number value);
}
