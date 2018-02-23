package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLMarqueeElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 437180
  * declared in: tsd/browser/lib.es6.d.ts at pos 437991
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLMarqueeElement")
public class HTMLMarqueeElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLMarqueeElement () {
    } 

    /*
        Properties
    */

    public String behavior;

    public Object bgColor;

    public Number childElementCount;

    public HTMLCollection children;

    public String direction;

    public Element firstElementChild;

    public String height;

    public Number hspace;

    public Element lastElementChild;

    public Number loop;

    public Element nextElementSibling;

    public Function1<Event, Object> onbounce;

    public Function1<Event, Object> onfinish;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<Event, Object> onstart;

    public Function1<WheelEvent, Object> onwheel;

    public Element previousElementSibling;

    public Number scrollAmount;

    public Number scrollDelay;

    public Boolean trueSpeed;

    public Number vspace;

    public String width;

    /*
        Methods
    */
    @JsProperty(name = "behavior")
    public native String getBehavior();
    @JsProperty(name = "bgColor")
    public native Object getBgColor();
    @JsProperty(name = "direction")
    public native String getDirection();
    @JsProperty(name = "height")
    public native String getHeight();
    @JsProperty(name = "hspace")
    public native Number getHspace();
    @JsProperty(name = "loop")
    public native Number getLoop();
    @JsProperty(name = "onbounce")
    public native Function1<Event, Object> getOnbounce();
    @JsProperty(name = "onfinish")
    public native Function1<Event, Object> getOnfinish();
    @JsProperty(name = "onstart")
    public native Function1<Event, Object> getOnstart();
    @JsProperty(name = "scrollAmount")
    public native Number getScrollAmount();
    @JsProperty(name = "scrollDelay")
    public native Number getScrollDelay();
    @JsProperty(name = "trueSpeed")
    public native Boolean getTrueSpeed();
    @JsProperty(name = "vspace")
    public native Number getVspace();
    @JsProperty(name = "width")
    public native String getWidth();
    @JsProperty(name = "behavior")
    public native void setBehavior(String value);
    @JsProperty(name = "bgColor")
    public native void setBgColor(Object value);
    @JsProperty(name = "direction")
    public native void setDirection(String value);
    @JsProperty(name = "height")
    public native void setHeight(String value);
    @JsProperty(name = "hspace")
    public native void setHspace(@DoNotAutobox Number value);
    @JsProperty(name = "loop")
    public native void setLoop(@DoNotAutobox Number value);
    @JsProperty(name = "onbounce")
    public native void setOnbounce(Function1<Event, Object> value);
    @JsProperty(name = "onfinish")
    public native void setOnfinish(Function1<Event, Object> value);
    @JsProperty(name = "onstart")
    public native void setOnstart(Function1<Event, Object> value);
    @JsProperty(name = "scrollAmount")
    public native void setScrollAmount(@DoNotAutobox Number value);
    @JsProperty(name = "scrollDelay")
    public native void setScrollDelay(@DoNotAutobox Number value);
    @JsProperty(name = "trueSpeed")
    public native void setTrueSpeed(Boolean value);
    @JsProperty(name = "vspace")
    public native void setVspace(@DoNotAutobox Number value);
    @JsProperty(name = "width")
    public native void setWidth(String value);
    /** 
      * tsd/browser/lib.es6.d.ts@437651
     */
    public native void start();
    /** 
      * tsd/browser/lib.es6.d.ts@437670
     */
    public native void stop();
}
