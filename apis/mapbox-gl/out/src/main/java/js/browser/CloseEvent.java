package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CloseEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 315829
  * declared in: tsd/browser/lib.es6.d.ts at pos 316118
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CloseEvent")
public class CloseEvent extends Event 
{

    /*
        Constructors
    */
    public CloseEvent (String typeArg, CloseEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public CloseEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Number code;

    public String reason;

    public Boolean wasClean;

    /*
        Methods
    */
    @JsProperty(name = "code")
    public native Number getCode();
    @JsProperty(name = "reason")
    public native String getReason();
    @JsProperty(name = "wasClean")
    public native Boolean getWasClean();
    /** 
      * tsd/browser/lib.es6.d.ts@315960
     */
    public native void initCloseEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Boolean wasCleanArg, @DoNotAutobox Number codeArg, String reasonArg);
    @JsProperty(name = "code")
    public native void setCode(@DoNotAutobox Number value);
    @JsProperty(name = "reason")
    public native void setReason(String value);
    @JsProperty(name = "wasClean")
    public native void setWasClean(Boolean value);
}
