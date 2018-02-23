package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SpeechSynthesisEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 645347

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class SpeechSynthesisEventMap
{

    /*
        Properties
    */

    public Event voiceschanged;

    /*
        Methods
    */
    @JsProperty(name = "voiceschanged")
    public native Event getVoiceschanged();
    @JsProperty(name = "voiceschanged")
    public native void setVoiceschanged(Event value);
}
