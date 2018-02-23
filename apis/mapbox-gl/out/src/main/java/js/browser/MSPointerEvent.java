package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSPointerEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 512044
  * declared in: tsd/browser/lib.es6.d.ts at pos 513146
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSPointerEvent")
public class MSPointerEvent extends MouseEvent 
{

    /*
        Constructors
    */
    public MSPointerEvent (String typeArg, PointerEventInit eventInitDict /* optional */) {
        super((String) null, (MouseEventInit) null); 
    } 
    public MSPointerEvent (String typeArg) {
        super((String) null, (MouseEventInit) null); 
    } 

    /*
        Properties
    */

    public Object currentPoint;

    public Number height;

    public Number hwTimestamp;

    public Object intermediatePoints;

    public Boolean isPrimary;

    public Number pointerId;

    public Object pointerType;

    public Number pressure;

    public Number rotation;

    public Number tiltX;

    public Number tiltY;

    public Number width;

    /*
        Methods
    */
    @JsProperty(name = "currentPoint")
    public native Object getCurrentPoint();
    /** 
      * tsd/browser/lib.es6.d.ts@512471
     */
    public native void getCurrentPoint(Element element);
    @JsProperty(name = "height")
    public native Number getHeight();
    @JsProperty(name = "hwTimestamp")
    public native Number getHwTimestamp();
    @JsProperty(name = "intermediatePoints")
    public native Object getIntermediatePoints();
    /** 
      * tsd/browser/lib.es6.d.ts@512516
     */
    public native void getIntermediatePoints(Element element);
    @JsProperty(name = "isPrimary")
    public native Boolean getIsPrimary();
    @JsProperty(name = "pointerId")
    public native Number getPointerId();
    @JsProperty(name = "pointerType")
    public native Object getPointerType();
    @JsProperty(name = "pressure")
    public native Number getPressure();
    @JsProperty(name = "rotation")
    public native Number getRotation();
    @JsProperty(name = "tiltX")
    public native Number getTiltX();
    @JsProperty(name = "tiltY")
    public native Number getTiltY();
    @JsProperty(name = "width")
    public native Number getWidth();
    /** 
      * tsd/browser/lib.es6.d.ts@512567
     */
    public native void initPointerEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, @DoNotAutobox Number detailArg, @DoNotAutobox Number screenXArg, @DoNotAutobox Number screenYArg, @DoNotAutobox Number clientXArg, @DoNotAutobox Number clientYArg, Boolean ctrlKeyArg, Boolean altKeyArg, Boolean shiftKeyArg, Boolean metaKeyArg, @DoNotAutobox Number buttonArg, EventTarget relatedTargetArg, @DoNotAutobox Number offsetXArg, @DoNotAutobox Number offsetYArg, @DoNotAutobox Number widthArg, @DoNotAutobox Number heightArg, @DoNotAutobox Number pressure, @DoNotAutobox Number rotation, @DoNotAutobox Number tiltX, @DoNotAutobox Number tiltY, @DoNotAutobox Number pointerIdArg, Object pointerType, @DoNotAutobox Number hwTimestampArg, Boolean isPrimary);
    @JsProperty(name = "currentPoint")
    public native void setCurrentPoint(Object value);
    @JsProperty(name = "height")
    public native void setHeight(@DoNotAutobox Number value);
    @JsProperty(name = "hwTimestamp")
    public native void setHwTimestamp(@DoNotAutobox Number value);
    @JsProperty(name = "intermediatePoints")
    public native void setIntermediatePoints(Object value);
    @JsProperty(name = "isPrimary")
    public native void setIsPrimary(Boolean value);
    @JsProperty(name = "pointerId")
    public native void setPointerId(@DoNotAutobox Number value);
    @JsProperty(name = "pointerType")
    public native void setPointerType(Object value);
    @JsProperty(name = "pressure")
    public native void setPressure(@DoNotAutobox Number value);
    @JsProperty(name = "rotation")
    public native void setRotation(@DoNotAutobox Number value);
    @JsProperty(name = "tiltX")
    public native void setTiltX(@DoNotAutobox Number value);
    @JsProperty(name = "tiltY")
    public native void setTiltY(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(@DoNotAutobox Number value);
}
