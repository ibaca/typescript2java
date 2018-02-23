package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: KeyboardEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 498241
  * declared in: tsd/browser/lib.es6.d.ts at pos 499219
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="KeyboardEvent")
public class KeyboardEvent extends UIEvent 
{

    /*
        Constructors
    */
    public KeyboardEvent (String typeArg, KeyboardEventInit eventInitDict /* optional */) {
        super((String) null, (UIEventInit) null); 
    } 
    public KeyboardEvent (String typeArg) {
        super((String) null, (UIEventInit) null); 
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="KeyboardEvent", name="DOM_KEY_LOCATION_JOYSTICK")
    public static Number DOM_KEY_LOCATION_JOYSTICK;

    @JsProperty(namespace="KeyboardEvent", name="DOM_KEY_LOCATION_LEFT")
    public static Number DOM_KEY_LOCATION_LEFT;

    @JsProperty(namespace="KeyboardEvent", name="DOM_KEY_LOCATION_MOBILE")
    public static Number DOM_KEY_LOCATION_MOBILE;

    @JsProperty(namespace="KeyboardEvent", name="DOM_KEY_LOCATION_NUMPAD")
    public static Number DOM_KEY_LOCATION_NUMPAD;

    @JsProperty(namespace="KeyboardEvent", name="DOM_KEY_LOCATION_RIGHT")
    public static Number DOM_KEY_LOCATION_RIGHT;

    @JsProperty(namespace="KeyboardEvent", name="DOM_KEY_LOCATION_STANDARD")
    public static Number DOM_KEY_LOCATION_STANDARD;

    /*
        Properties
    */

    public Boolean altKey;

    @JsProperty(name="char")
    public String char_;

    public Number charCode;

    public String code;

    public Boolean ctrlKey;

    public String key;

    public Number keyCode;

    public String locale;

    public Number location;

    public Boolean metaKey;

    public Boolean repeat;

    public Boolean shiftKey;

    public Number which;

    /*
        Methods
    */
    @JsProperty(name = "altKey")
    public native Boolean getAltKey();
    @JsProperty(name = "charCode")
    public native Number getCharCode();
    @JsProperty(name = "char")
    public native String getChar_();
    @JsProperty(name = "code")
    public native String getCode();
    @JsProperty(name = "ctrlKey")
    public native Boolean getCtrlKey();
    @JsProperty(name = "DOM_KEY_LOCATION_JOYSTICK")
    public native Number getDOM_KEY_LOCATION_JOYSTICK();
    @JsProperty(name = "DOM_KEY_LOCATION_LEFT")
    public native Number getDOM_KEY_LOCATION_LEFT();
    @JsProperty(name = "DOM_KEY_LOCATION_MOBILE")
    public native Number getDOM_KEY_LOCATION_MOBILE();
    @JsProperty(name = "DOM_KEY_LOCATION_NUMPAD")
    public native Number getDOM_KEY_LOCATION_NUMPAD();
    @JsProperty(name = "DOM_KEY_LOCATION_RIGHT")
    public native Number getDOM_KEY_LOCATION_RIGHT();
    @JsProperty(name = "DOM_KEY_LOCATION_STANDARD")
    public native Number getDOM_KEY_LOCATION_STANDARD();
    @JsProperty(name = "key")
    public native String getKey();
    @JsProperty(name = "keyCode")
    public native Number getKeyCode();
    @JsProperty(name = "locale")
    public native String getLocale();
    @JsProperty(name = "location")
    public native Number getLocation();
    @JsProperty(name = "metaKey")
    public native Boolean getMetaKey();
    /** 
      * tsd/browser/lib.es6.d.ts@498679
     */
    public native Boolean getModifierState(String keyArg);
    @JsProperty(name = "repeat")
    public native Boolean getRepeat();
    @JsProperty(name = "shiftKey")
    public native Boolean getShiftKey();
    @JsProperty(name = "which")
    public native Number getWhich();
    /** 
      * tsd/browser/lib.es6.d.ts@498726
     */
    public native void initKeyboardEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, String keyArg, @DoNotAutobox Number locationArg, String modifiersListArg, Boolean repeat, String locale);
    @JsProperty(name = "altKey")
    public native void setAltKey(Boolean value);
    @JsProperty(name = "charCode")
    public native void setCharCode(@DoNotAutobox Number value);
    @JsProperty(name = "char")
    public native void setChar_(String value);
    @JsProperty(name = "code")
    public native void setCode(String value);
    @JsProperty(name = "ctrlKey")
    public native void setCtrlKey(Boolean value);
    @JsProperty(name = "DOM_KEY_LOCATION_JOYSTICK")
    public native void setDOM_KEY_LOCATION_JOYSTICK(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_KEY_LOCATION_LEFT")
    public native void setDOM_KEY_LOCATION_LEFT(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_KEY_LOCATION_MOBILE")
    public native void setDOM_KEY_LOCATION_MOBILE(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_KEY_LOCATION_NUMPAD")
    public native void setDOM_KEY_LOCATION_NUMPAD(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_KEY_LOCATION_RIGHT")
    public native void setDOM_KEY_LOCATION_RIGHT(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_KEY_LOCATION_STANDARD")
    public native void setDOM_KEY_LOCATION_STANDARD(@DoNotAutobox Number value);
    @JsProperty(name = "key")
    public native void setKey(String value);
    @JsProperty(name = "keyCode")
    public native void setKeyCode(@DoNotAutobox Number value);
    @JsProperty(name = "locale")
    public native void setLocale(String value);
    @JsProperty(name = "location")
    public native void setLocation(@DoNotAutobox Number value);
    @JsProperty(name = "metaKey")
    public native void setMetaKey(Boolean value);
    @JsProperty(name = "repeat")
    public native void setRepeat(Boolean value);
    @JsProperty(name = "shiftKey")
    public native void setShiftKey(Boolean value);
    @JsProperty(name = "which")
    public native void setWhich(@DoNotAutobox Number value);
}
