package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: DeviceLightEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 325440
  * declared in: tsd/browser/lib.es6.d.ts at pos 325527
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="DeviceLightEvent")
public class DeviceLightEvent extends Event 
{

    /*
        Constructors
    */
    public DeviceLightEvent (String typeArg, DeviceLightEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public DeviceLightEvent (String typeArg) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Number value;

    /*
        Methods
    */
    @JsProperty(name = "value")
    public native Number getValue();
    @JsProperty(name = "value")
    public native void setValue(@DoNotAutobox Number value);
}
