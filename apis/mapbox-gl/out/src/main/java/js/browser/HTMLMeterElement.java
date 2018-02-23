package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: HTMLMeterElement
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 446927
  * declared in: tsd/browser/lib.es6.d.ts at pos 447378
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="HTMLMeterElement")
public class HTMLMeterElement extends HTMLElement 
{

    /*
        Constructors
    */
    public HTMLMeterElement () {
    } 

    /*
        Properties
    */

    public Number childElementCount;

    public HTMLCollection children;

    public Element firstElementChild;

    public Number high;

    public Element lastElementChild;

    public Number low;

    public Number max;

    public Number min;

    public Element nextElementSibling;

    public Function1<PointerEvent, Object> onpointercancel;

    public Function1<PointerEvent, Object> onpointerdown;

    public Function1<PointerEvent, Object> onpointerenter;

    public Function1<PointerEvent, Object> onpointerleave;

    public Function1<PointerEvent, Object> onpointermove;

    public Function1<PointerEvent, Object> onpointerout;

    public Function1<PointerEvent, Object> onpointerover;

    public Function1<PointerEvent, Object> onpointerup;

    public Function1<WheelEvent, Object> onwheel;

    public Number optimum;

    public Element previousElementSibling;

    public Number value;

    /*
        Methods
    */
    @JsProperty(name = "high")
    public native Number getHigh();
    @JsProperty(name = "low")
    public native Number getLow();
    @JsProperty(name = "max")
    public native Number getMax();
    @JsProperty(name = "min")
    public native Number getMin();
    @JsProperty(name = "optimum")
    public native Number getOptimum();
    @JsProperty(name = "value")
    public native Number getValue();
    @JsProperty(name = "high")
    public native void setHigh(@DoNotAutobox Number value);
    @JsProperty(name = "low")
    public native void setLow(@DoNotAutobox Number value);
    @JsProperty(name = "max")
    public native void setMax(@DoNotAutobox Number value);
    @JsProperty(name = "min")
    public native void setMin(@DoNotAutobox Number value);
    @JsProperty(name = "optimum")
    public native void setOptimum(@DoNotAutobox Number value);
    @JsProperty(name = "value")
    public native void setValue(@DoNotAutobox Number value);
}
