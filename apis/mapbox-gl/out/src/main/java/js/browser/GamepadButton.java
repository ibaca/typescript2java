package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: GamepadButton
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 376870
  * declared in: tsd/browser/lib.es6.d.ts at pos 376971
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="GamepadButton")
public class GamepadButton
{

    /*
        Constructors
    */
    public GamepadButton () {
    } 

    /*
        Properties
    */

    public Boolean pressed;

    public Number value;

    /*
        Methods
    */
    @JsProperty(name = "pressed")
    public native Boolean getPressed();
    @JsProperty(name = "value")
    public native Number getValue();
    @JsProperty(name = "pressed")
    public native void setPressed(Boolean value);
    @JsProperty(name = "value")
    public native void setValue(@DoNotAutobox Number value);
}
