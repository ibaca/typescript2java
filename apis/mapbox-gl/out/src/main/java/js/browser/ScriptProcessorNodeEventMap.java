package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ScriptProcessorNodeEventMap
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 639498

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ScriptProcessorNodeEventMap
{

    /*
        Properties
    */

    public AudioProcessingEvent audioprocess;

    /*
        Methods
    */
    @JsProperty(name = "audioprocess")
    public native AudioProcessingEvent getAudioprocess();
    @JsProperty(name = "audioprocess")
    public native void setAudioprocess(AudioProcessingEvent value);
}
