package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: AudioContextEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 286920
  * 
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public interface AudioContextEventMap
{

    /*
        Methods
    */
    /** 
      * inherited from (js.browser.AudioContextEventMap)
     */
    @JsProperty(name = "statechange")
    Event getStatechange();
    /** 
      * inherited from (js.browser.AudioContextEventMap)
     */
    @JsProperty(name = "statechange")
    void setStatechange(Event value);
}
