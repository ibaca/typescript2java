package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: CustomEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 318963
  * declared in: tsd/browser/lib.es6.d.ts at pos 319150
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="CustomEvent")
public class CustomEvent extends Event 
{

    /*
        Constructors
    */
    public CustomEvent (String typeArg, CustomEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public CustomEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Object detail;

    /*
        Methods
    */
    @JsProperty(name = "detail")
    public native Object getDetail();
    /** 
      * tsd/browser/lib.es6.d.ts@319033
     */
    public native void initCustomEvent(String typeArg, Boolean canBubbleArg, Boolean cancelableArg, Object detailArg);
    @JsProperty(name = "detail")
    public native void setDetail(Object value);
}
