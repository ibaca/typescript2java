package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ScreenEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 638206

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ScreenEventMap
{

    /*
        Properties
    */

    public Event MSOrientationChange;

    /*
        Methods
    */
    @JsProperty(name = "MSOrientationChange")
    public native Event getMSOrientationChange();
    @JsProperty(name = "MSOrientationChange")
    public native void setMSOrientationChange(Event value);
}
