package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TextEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 653359
  * declared in: tsd/browser/lib.es6.d.ts at pos 654128
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TextEvent")
public class TextEvent extends UIEvent 
{

    /*
        Constructors
    */
    public TextEvent () {
        super((String) null, (UIEventInit) null); 
    } 

    /*
        Static properties
    */

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_DROP")
    public static Number DOM_INPUT_METHOD_DROP;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_HANDWRITING")
    public static Number DOM_INPUT_METHOD_HANDWRITING;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_IME")
    public static Number DOM_INPUT_METHOD_IME;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_KEYBOARD")
    public static Number DOM_INPUT_METHOD_KEYBOARD;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_MULTIMODAL")
    public static Number DOM_INPUT_METHOD_MULTIMODAL;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_OPTION")
    public static Number DOM_INPUT_METHOD_OPTION;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_PASTE")
    public static Number DOM_INPUT_METHOD_PASTE;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_SCRIPT")
    public static Number DOM_INPUT_METHOD_SCRIPT;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_UNKNOWN")
    public static Number DOM_INPUT_METHOD_UNKNOWN;

    @JsProperty(namespace="TextEvent", name="DOM_INPUT_METHOD_VOICE")
    public static Number DOM_INPUT_METHOD_VOICE;

    /*
        Properties
    */

    public String data;

    public Number inputMethod;

    public String locale;

    /*
        Methods
    */
    @JsProperty(name = "DOM_INPUT_METHOD_DROP")
    public native Number getDOM_INPUT_METHOD_DROP();
    @JsProperty(name = "DOM_INPUT_METHOD_HANDWRITING")
    public native Number getDOM_INPUT_METHOD_HANDWRITING();
    @JsProperty(name = "DOM_INPUT_METHOD_IME")
    public native Number getDOM_INPUT_METHOD_IME();
    @JsProperty(name = "DOM_INPUT_METHOD_KEYBOARD")
    public native Number getDOM_INPUT_METHOD_KEYBOARD();
    @JsProperty(name = "DOM_INPUT_METHOD_MULTIMODAL")
    public native Number getDOM_INPUT_METHOD_MULTIMODAL();
    @JsProperty(name = "DOM_INPUT_METHOD_OPTION")
    public native Number getDOM_INPUT_METHOD_OPTION();
    @JsProperty(name = "DOM_INPUT_METHOD_PASTE")
    public native Number getDOM_INPUT_METHOD_PASTE();
    @JsProperty(name = "DOM_INPUT_METHOD_SCRIPT")
    public native Number getDOM_INPUT_METHOD_SCRIPT();
    @JsProperty(name = "DOM_INPUT_METHOD_UNKNOWN")
    public native Number getDOM_INPUT_METHOD_UNKNOWN();
    @JsProperty(name = "DOM_INPUT_METHOD_VOICE")
    public native Number getDOM_INPUT_METHOD_VOICE();
    @JsProperty(name = "data")
    public native String getData();
    @JsProperty(name = "inputMethod")
    public native Number getInputMethod();
    @JsProperty(name = "locale")
    public native String getLocale();
    /** 
      * tsd/browser/lib.es6.d.ts@653493
     */
    public native void initTextEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, String dataArg, @DoNotAutobox Number inputMethod, String locale);
    @JsProperty(name = "DOM_INPUT_METHOD_DROP")
    public native void setDOM_INPUT_METHOD_DROP(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_INPUT_METHOD_HANDWRITING")
    public native void setDOM_INPUT_METHOD_HANDWRITING(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_INPUT_METHOD_IME")
    public native void setDOM_INPUT_METHOD_IME(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_INPUT_METHOD_KEYBOARD")
    public native void setDOM_INPUT_METHOD_KEYBOARD(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_INPUT_METHOD_MULTIMODAL")
    public native void setDOM_INPUT_METHOD_MULTIMODAL(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_INPUT_METHOD_OPTION")
    public native void setDOM_INPUT_METHOD_OPTION(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_INPUT_METHOD_PASTE")
    public native void setDOM_INPUT_METHOD_PASTE(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_INPUT_METHOD_SCRIPT")
    public native void setDOM_INPUT_METHOD_SCRIPT(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_INPUT_METHOD_UNKNOWN")
    public native void setDOM_INPUT_METHOD_UNKNOWN(@DoNotAutobox Number value);
    @JsProperty(name = "DOM_INPUT_METHOD_VOICE")
    public native void setDOM_INPUT_METHOD_VOICE(@DoNotAutobox Number value);
    @JsProperty(name = "data")
    public native void setData(String value);
    @JsProperty(name = "inputMethod")
    public native void setInputMethod(@DoNotAutobox Number value);
    @JsProperty(name = "locale")
    public native void setLocale(String value);
}
