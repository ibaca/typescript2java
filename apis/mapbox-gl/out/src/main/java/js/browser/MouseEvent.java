package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MouseEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 526400
  * declared in: tsd/browser/lib.es6.d.ts at pos 527575
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="MouseEvent")
public class MouseEvent extends UIEvent 
{

    /*
        Constructors
    */
    public MouseEvent (String typeArg, MouseEventInit eventInitDict /* optional */) {
        super((String) null, (UIEventInit) null); 
    } 
    public MouseEvent (String typeArg) {
        super((String) null, (UIEventInit) null); 
    } 

    /*
        Properties
    */

    public Boolean altKey;

    public Number button;

    public Number buttons;

    public Number clientX;

    public Number clientY;

    public Boolean ctrlKey;

    public Element fromElement;

    public Number layerX;

    public Number layerY;

    public Boolean metaKey;

    public Number movementX;

    public Number movementY;

    public Number offsetX;

    public Number offsetY;

    public Number pageX;

    public Number pageY;

    public EventTarget relatedTarget;

    public Number screenX;

    public Number screenY;

    public Boolean shiftKey;

    public Element toElement;

    public Number which;

    public Number x;

    public Number y;

    /*
        Methods
    */
    @JsProperty(name = "altKey")
    public native Boolean getAltKey();
    @JsProperty(name = "button")
    public native Number getButton();
    @JsProperty(name = "buttons")
    public native Number getButtons();
    @JsProperty(name = "clientX")
    public native Number getClientX();
    @JsProperty(name = "clientY")
    public native Number getClientY();
    @JsProperty(name = "ctrlKey")
    public native Boolean getCtrlKey();
    @JsProperty(name = "fromElement")
    public native Element getFromElement();
    @JsProperty(name = "layerX")
    public native Number getLayerX();
    @JsProperty(name = "layerY")
    public native Number getLayerY();
    @JsProperty(name = "metaKey")
    public native Boolean getMetaKey();
    /** 
      * tsd/browser/lib.es6.d.ts@527171
     */
    public native Boolean getModifierState(String keyArg);
    @JsProperty(name = "movementX")
    public native Number getMovementX();
    @JsProperty(name = "movementY")
    public native Number getMovementY();
    @JsProperty(name = "offsetX")
    public native Number getOffsetX();
    @JsProperty(name = "offsetY")
    public native Number getOffsetY();
    @JsProperty(name = "pageX")
    public native Number getPageX();
    @JsProperty(name = "pageY")
    public native Number getPageY();
    @JsProperty(name = "relatedTarget")
    public native EventTarget getRelatedTarget();
    @JsProperty(name = "screenX")
    public native Number getScreenX();
    @JsProperty(name = "screenY")
    public native Number getScreenY();
    @JsProperty(name = "shiftKey")
    public native Boolean getShiftKey();
    @JsProperty(name = "toElement")
    public native Element getToElement();
    @JsProperty(name = "which")
    public native Number getWhich();
    @JsProperty(name = "x")
    public native Number getX();
    @JsProperty(name = "y")
    public native Number getY();
    /** 
      * tsd/browser/lib.es6.d.ts@527218
     */
    public native void initMouseEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, @DoNotAutobox Number detailArg, @DoNotAutobox Number screenXArg, @DoNotAutobox Number screenYArg, @DoNotAutobox Number clientXArg, @DoNotAutobox Number clientYArg, Boolean ctrlKeyArg, Boolean altKeyArg, Boolean shiftKeyArg, Boolean metaKeyArg, @DoNotAutobox Number buttonArg, EventTarget relatedTargetArg);
    @JsProperty(name = "altKey")
    public native void setAltKey(Boolean value);
    @JsProperty(name = "button")
    public native void setButton(@DoNotAutobox Number value);
    @JsProperty(name = "buttons")
    public native void setButtons(@DoNotAutobox Number value);
    @JsProperty(name = "clientX")
    public native void setClientX(@DoNotAutobox Number value);
    @JsProperty(name = "clientY")
    public native void setClientY(@DoNotAutobox Number value);
    @JsProperty(name = "ctrlKey")
    public native void setCtrlKey(Boolean value);
    @JsProperty(name = "fromElement")
    public native void setFromElement(Element value);
    @JsProperty(name = "layerX")
    public native void setLayerX(@DoNotAutobox Number value);
    @JsProperty(name = "layerY")
    public native void setLayerY(@DoNotAutobox Number value);
    @JsProperty(name = "metaKey")
    public native void setMetaKey(Boolean value);
    @JsProperty(name = "movementX")
    public native void setMovementX(@DoNotAutobox Number value);
    @JsProperty(name = "movementY")
    public native void setMovementY(@DoNotAutobox Number value);
    @JsProperty(name = "offsetX")
    public native void setOffsetX(@DoNotAutobox Number value);
    @JsProperty(name = "offsetY")
    public native void setOffsetY(@DoNotAutobox Number value);
    @JsProperty(name = "pageX")
    public native void setPageX(@DoNotAutobox Number value);
    @JsProperty(name = "pageY")
    public native void setPageY(@DoNotAutobox Number value);
    @JsProperty(name = "relatedTarget")
    public native void setRelatedTarget(EventTarget value);
    @JsProperty(name = "screenX")
    public native void setScreenX(@DoNotAutobox Number value);
    @JsProperty(name = "screenY")
    public native void setScreenY(@DoNotAutobox Number value);
    @JsProperty(name = "shiftKey")
    public native void setShiftKey(Boolean value);
    @JsProperty(name = "toElement")
    public native void setToElement(Element value);
    @JsProperty(name = "which")
    public native void setWhich(@DoNotAutobox Number value);
    @JsProperty(name = "x")
    public native void setX(@DoNotAutobox Number value);
    @JsProperty(name = "y")
    public native void setY(@DoNotAutobox Number value);
}
