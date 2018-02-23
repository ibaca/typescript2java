package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SpeechSynthesis
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 645414
  * declared in: tsd/browser/lib.es6.d.ts at pos 646073
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SpeechSynthesis")
public class SpeechSynthesis extends EventTarget 
{

    /*
        Constructors
    */
    public SpeechSynthesis () {
    } 

    /*
        Properties
    */

    public Function1<Event, Object> onvoiceschanged;

    public Boolean paused;

    public Boolean pending;

    public Boolean speaking;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@645625
     */
    public native void cancel();
    @JsProperty(name = "onvoiceschanged")
    public native Function1<Event, Object> getOnvoiceschanged();
    @JsProperty(name = "paused")
    public native Boolean getPaused();
    @JsProperty(name = "pending")
    public native Boolean getPending();
    @JsProperty(name = "speaking")
    public native Boolean getSpeaking();
    /** 
      * tsd/browser/lib.es6.d.ts@645645
     */
    public native Array<SpeechSynthesisVoice> getVoices();
    /** 
      * tsd/browser/lib.es6.d.ts@645686
     */
    public native void pause();
    /** 
      * tsd/browser/lib.es6.d.ts@645705
     */
    public native void resume();
    @JsProperty(name = "onvoiceschanged")
    public native void setOnvoiceschanged(Function1<Event, Object> value);
    @JsProperty(name = "paused")
    public native void setPaused(Boolean value);
    @JsProperty(name = "pending")
    public native void setPending(Boolean value);
    @JsProperty(name = "speaking")
    public native void setSpeaking(Boolean value);
    /** 
      * tsd/browser/lib.es6.d.ts@645725
     */
    public native void speak(SpeechSynthesisUtterance utterance);
}
