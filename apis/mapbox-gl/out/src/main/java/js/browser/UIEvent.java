package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: UIEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 660156
  * declared in: tsd/browser/lib.es6.d.ts at pos 660385
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="UIEvent")
public class UIEvent extends Event 
{

    /*
        Constructors
    */
    public UIEvent (String typeArg, UIEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public UIEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Number detail;

    public Window view;

    /*
        Methods
    */
    @JsProperty(name = "detail")
    public native Number getDetail();
    @JsProperty(name = "view")
    public native Window getView();
    /** 
      * tsd/browser/lib.es6.d.ts@660252
     */
    public native void initUIEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Window viewArg, @DoNotAutobox Number detailArg);
    @JsProperty(name = "detail")
    public native void setDetail(@DoNotAutobox Number value);
    @JsProperty(name = "view")
    public native void setView(Window value);
}
