package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: GamepadEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 377046
  * declared in: tsd/browser/lib.es6.d.ts at pos 377132
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="GamepadEvent")
public class GamepadEvent extends Event 
{

    /*
        Constructors
    */
    public GamepadEvent (String typeArg, GamepadEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public GamepadEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Gamepad gamepad;

    /*
        Methods
    */
    @JsProperty(name = "gamepad")
    public native Gamepad getGamepad();
    @JsProperty(name = "gamepad")
    public native void setGamepad(Gamepad value);
}
