package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TextTrackCueEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 656182

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class TextTrackCueEventMap
{

    /*
        Properties
    */

    public Event enter;

    public Event exit;

    /*
        Methods
    */
    @JsProperty(name = "enter")
    public native Event getEnter();
    @JsProperty(name = "exit")
    public native Event getExit();
    @JsProperty(name = "enter")
    public native void setEnter(Event value);
    @JsProperty(name = "exit")
    public native void setExit(Event value);
}
