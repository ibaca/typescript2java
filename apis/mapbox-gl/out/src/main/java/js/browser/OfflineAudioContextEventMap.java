package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: OfflineAudioContextEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 538078

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class OfflineAudioContextEventMap implements AudioContextEventMap 
{

    /*
        Properties
    */

    public OfflineAudioCompletionEvent complete;

    public Event statechange;

    /*
        Methods
    */
    @JsProperty(name = "complete")
    public native OfflineAudioCompletionEvent getComplete();
    /** 
      * inherited from (js.browser.AudioContextEventMap)
     */
    @JsProperty(name = "statechange")
    public native Event getStatechange();
    @JsProperty(name = "complete")
    public native void setComplete(OfflineAudioCompletionEvent value);
    /** 
      * inherited from (js.browser.AudioContextEventMap)
     */
    @JsProperty(name = "statechange")
    public native void setStatechange(Event value);
}
