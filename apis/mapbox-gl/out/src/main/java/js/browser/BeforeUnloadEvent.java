package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: BeforeUnloadEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 292435
  * declared in: tsd/browser/lib.es6.d.ts at pos 292517
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="BeforeUnloadEvent")
public class BeforeUnloadEvent extends Event 
{

    /*
        Constructors
    */
    public BeforeUnloadEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Methods
    */
    @JsProperty(name = "returnValue")
    public native void setReturnValue(Object value);
}
