package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaDevicesEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 516488

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MediaDevicesEventMap
{

    /*
        Properties
    */

    public Event devicechange;

    /*
        Methods
    */
    @JsProperty(name = "devicechange")
    public native Event getDevicechange();
    @JsProperty(name = "devicechange")
    public native void setDevicechange(Event value);
}
