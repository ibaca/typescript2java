package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: OscillatorNodeEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 538924

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class OscillatorNodeEventMap
{

    /*
        Properties
    */

    public MediaStreamErrorEvent ended;

    /*
        Methods
    */
    @JsProperty(name = "ended")
    public native MediaStreamErrorEvent getEnded();
    @JsProperty(name = "ended")
    public native void setEnded(MediaStreamErrorEvent value);
}
