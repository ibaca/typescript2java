package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CompositionEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 316364
  * declared in: tsd/browser/lib.es6.d.ts at pos 316627
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CompositionEvent")
public class CompositionEvent extends UIEvent 
{

    /*
        Constructors
    */
    public CompositionEvent (String typeArg, CompositionEventInit eventInitDict /* optional */) {
        super((String) null, (UIEventInit) null); 
    } 
    public CompositionEvent (String typeArg) {
        super((String) null, (UIEventInit) null); 
    } 

    /*
        Properties
    */

    public String data;

    public String locale;

    /*
        Methods
    */
    @JsProperty(name = "data")
    public native String getData();
    @JsProperty(name = "locale")
    public native String getLocale();
    /** 
      * tsd/browser/lib.es6.d.ts@316471
     */
    public native void initCompositionEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, String dataArg, String locale);
    @JsProperty(name = "data")
    public native void setData(String value);
    @JsProperty(name = "locale")
    public native void setLocale(String value);
}
