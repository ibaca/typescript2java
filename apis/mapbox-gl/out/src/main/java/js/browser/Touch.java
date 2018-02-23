package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Touch
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 658113
  * declared in: tsd/browser/lib.es6.d.ts at pos 658390
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Touch")
public class Touch
{

    /*
        Constructors
    */
    public Touch () {
    } 

    /*
        Properties
    */

    public Number clientX;

    public Number clientY;

    public Number identifier;

    public Number pageX;

    public Number pageY;

    public Number screenX;

    public Number screenY;

    public EventTarget target;

    /*
        Methods
    */
    @JsProperty(name = "clientX")
    public native Number getClientX();
    @JsProperty(name = "clientY")
    public native Number getClientY();
    @JsProperty(name = "identifier")
    public native Number getIdentifier();
    @JsProperty(name = "pageX")
    public native Number getPageX();
    @JsProperty(name = "pageY")
    public native Number getPageY();
    @JsProperty(name = "screenX")
    public native Number getScreenX();
    @JsProperty(name = "screenY")
    public native Number getScreenY();
    @JsProperty(name = "target")
    public native EventTarget getTarget();
    @JsProperty(name = "clientX")
    public native void setClientX(@DoNotAutobox Number value);
    @JsProperty(name = "clientY")
    public native void setClientY(@DoNotAutobox Number value);
    @JsProperty(name = "identifier")
    public native void setIdentifier(@DoNotAutobox Number value);
    @JsProperty(name = "pageX")
    public native void setPageX(@DoNotAutobox Number value);
    @JsProperty(name = "pageY")
    public native void setPageY(@DoNotAutobox Number value);
    @JsProperty(name = "screenX")
    public native void setScreenX(@DoNotAutobox Number value);
    @JsProperty(name = "screenY")
    public native void setScreenY(@DoNotAutobox Number value);
    @JsProperty(name = "target")
    public native void setTarget(EventTarget value);
}
