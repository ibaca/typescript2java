package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Gamepad
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 376561
  * declared in: tsd/browser/lib.es6.d.ts at pos 376813
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Gamepad")
public class Gamepad
{

    /*
        Constructors
    */
    public Gamepad () {
    } 

    /*
        Properties
    */

    public Array<Number> axes;

    public Array<GamepadButton> buttons;

    public Boolean connected;

    public String id;

    public Number index;

    public String mapping;

    public Number timestamp;

    /*
        Methods
    */
    @JsProperty(name = "axes")
    public native Array<Number> getAxes();
    @JsProperty(name = "buttons")
    public native Array<GamepadButton> getButtons();
    @JsProperty(name = "connected")
    public native Boolean getConnected();
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "index")
    public native Number getIndex();
    @JsProperty(name = "mapping")
    public native String getMapping();
    @JsProperty(name = "timestamp")
    public native Number getTimestamp();
    @JsProperty(name = "axes")
    public native void setAxes(Array<Number> value);
    @JsProperty(name = "buttons")
    public native void setButtons(Array<GamepadButton> value);
    @JsProperty(name = "connected")
    public native void setConnected(Boolean value);
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "index")
    public native void setIndex(@DoNotAutobox Number value);
    @JsProperty(name = "mapping")
    public native void setMapping(String value);
    @JsProperty(name = "timestamp")
    public native void setTimestamp(@DoNotAutobox Number value);
}
