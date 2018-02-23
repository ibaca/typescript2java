package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSGestureEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 504294
  * declared in: tsd/browser/lib.es6.d.ts at pos 505603
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MSGestureEvent")
public class MSGestureEvent extends UIEvent 
{

    /*
        Constructors
    */
    public MSGestureEvent () {
        super((String) null, (UIEventInit) null); 
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="MSGestureEvent", name="MSGESTURE_FLAG_BEGIN")
    public static Number MSGESTURE_FLAG_BEGIN;

    @JsProperty(namespace="MSGestureEvent", name="MSGESTURE_FLAG_CANCEL")
    public static Number MSGESTURE_FLAG_CANCEL;

    @JsProperty(namespace="MSGestureEvent", name="MSGESTURE_FLAG_END")
    public static Number MSGESTURE_FLAG_END;

    @JsProperty(namespace="MSGestureEvent", name="MSGESTURE_FLAG_INERTIA")
    public static Number MSGESTURE_FLAG_INERTIA;

    @JsProperty(namespace="MSGestureEvent", name="MSGESTURE_FLAG_NONE")
    public static Number MSGESTURE_FLAG_NONE;

    /*
        Properties
    */

    public Number clientX;

    public Number clientY;

    public Number expansion;

    public Object gestureObject;

    public Number hwTimestamp;

    public Number offsetX;

    public Number offsetY;

    public Number rotation;

    public Number scale;

    public Number screenX;

    public Number screenY;

    public Number translationX;

    public Number translationY;

    public Number velocityAngular;

    public Number velocityExpansion;

    public Number velocityX;

    public Number velocityY;

    /*
        Methods
    */
    @JsProperty(name = "clientX")
    public native Number getClientX();
    @JsProperty(name = "clientY")
    public native Number getClientY();
    @JsProperty(name = "expansion")
    public native Number getExpansion();
    @JsProperty(name = "gestureObject")
    public native Object getGestureObject();
    @JsProperty(name = "hwTimestamp")
    public native Number getHwTimestamp();
    @JsProperty(name = "MSGESTURE_FLAG_BEGIN")
    public native Number getMSGESTURE_FLAG_BEGIN();
    @JsProperty(name = "MSGESTURE_FLAG_CANCEL")
    public native Number getMSGESTURE_FLAG_CANCEL();
    @JsProperty(name = "MSGESTURE_FLAG_END")
    public native Number getMSGESTURE_FLAG_END();
    @JsProperty(name = "MSGESTURE_FLAG_INERTIA")
    public native Number getMSGESTURE_FLAG_INERTIA();
    @JsProperty(name = "MSGESTURE_FLAG_NONE")
    public native Number getMSGESTURE_FLAG_NONE();
    @JsProperty(name = "offsetX")
    public native Number getOffsetX();
    @JsProperty(name = "offsetY")
    public native Number getOffsetY();
    @JsProperty(name = "rotation")
    public native Number getRotation();
    @JsProperty(name = "scale")
    public native Number getScale();
    @JsProperty(name = "screenX")
    public native Number getScreenX();
    @JsProperty(name = "screenY")
    public native Number getScreenY();
    @JsProperty(name = "translationX")
    public native Number getTranslationX();
    @JsProperty(name = "translationY")
    public native Number getTranslationY();
    @JsProperty(name = "velocityAngular")
    public native Number getVelocityAngular();
    @JsProperty(name = "velocityExpansion")
    public native Number getVelocityExpansion();
    @JsProperty(name = "velocityX")
    public native Number getVelocityX();
    @JsProperty(name = "velocityY")
    public native Number getVelocityY();
    /** 
      * tsd/browser/lib.es6.d.ts@504893
     */
    public native void initGestureEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, @DoNotAutobox Number detailArg, @DoNotAutobox Number screenXArg, @DoNotAutobox Number screenYArg, @DoNotAutobox Number clientXArg, @DoNotAutobox Number clientYArg, @DoNotAutobox Number offsetXArg, @DoNotAutobox Number offsetYArg, @DoNotAutobox Number translationXArg, @DoNotAutobox Number translationYArg, @DoNotAutobox Number scaleArg, @DoNotAutobox Number expansionArg, @DoNotAutobox Number rotationArg, @DoNotAutobox Number velocityXArg, @DoNotAutobox Number velocityYArg, @DoNotAutobox Number velocityExpansionArg, @DoNotAutobox Number velocityAngularArg, @DoNotAutobox Number hwTimestampArg);
    @JsProperty(name = "clientX")
    public native void setClientX(@DoNotAutobox Number value);
    @JsProperty(name = "clientY")
    public native void setClientY(@DoNotAutobox Number value);
    @JsProperty(name = "expansion")
    public native void setExpansion(@DoNotAutobox Number value);
    @JsProperty(name = "gestureObject")
    public native void setGestureObject(Object value);
    @JsProperty(name = "hwTimestamp")
    public native void setHwTimestamp(@DoNotAutobox Number value);
    @JsProperty(name = "MSGESTURE_FLAG_BEGIN")
    public native void setMSGESTURE_FLAG_BEGIN(@DoNotAutobox Number value);
    @JsProperty(name = "MSGESTURE_FLAG_CANCEL")
    public native void setMSGESTURE_FLAG_CANCEL(@DoNotAutobox Number value);
    @JsProperty(name = "MSGESTURE_FLAG_END")
    public native void setMSGESTURE_FLAG_END(@DoNotAutobox Number value);
    @JsProperty(name = "MSGESTURE_FLAG_INERTIA")
    public native void setMSGESTURE_FLAG_INERTIA(@DoNotAutobox Number value);
    @JsProperty(name = "MSGESTURE_FLAG_NONE")
    public native void setMSGESTURE_FLAG_NONE(@DoNotAutobox Number value);
    @JsProperty(name = "offsetX")
    public native void setOffsetX(@DoNotAutobox Number value);
    @JsProperty(name = "offsetY")
    public native void setOffsetY(@DoNotAutobox Number value);
    @JsProperty(name = "rotation")
    public native void setRotation(@DoNotAutobox Number value);
    @JsProperty(name = "scale")
    public native void setScale(@DoNotAutobox Number value);
    @JsProperty(name = "screenX")
    public native void setScreenX(@DoNotAutobox Number value);
    @JsProperty(name = "screenY")
    public native void setScreenY(@DoNotAutobox Number value);
    @JsProperty(name = "translationX")
    public native void setTranslationX(@DoNotAutobox Number value);
    @JsProperty(name = "translationY")
    public native void setTranslationY(@DoNotAutobox Number value);
    @JsProperty(name = "velocityAngular")
    public native void setVelocityAngular(@DoNotAutobox Number value);
    @JsProperty(name = "velocityExpansion")
    public native void setVelocityExpansion(@DoNotAutobox Number value);
    @JsProperty(name = "velocityX")
    public native void setVelocityX(@DoNotAutobox Number value);
    @JsProperty(name = "velocityY")
    public native void setVelocityY(@DoNotAutobox Number value);
}
