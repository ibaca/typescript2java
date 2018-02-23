package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: OfflineAudioContext
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 538195
  * declared in: tsd/browser/lib.es6.d.ts at pos 538771
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="OfflineAudioContext")
public class OfflineAudioContext extends AudioContextBase 
{

    /*
        Constructors
    */
    public OfflineAudioContext (@DoNotAutobox Number numberOfChannels, @DoNotAutobox Number length, @DoNotAutobox Number sampleRate) {
    } 

    /*
        Properties
    */

    public int length;

    public Function1<OfflineAudioCompletionEvent, Object> oncomplete;

    /*
        Methods
    */
    @JsProperty(name = "length")
    public native Number getLength();
    @JsProperty(name = "oncomplete")
    public native Function1<OfflineAudioCompletionEvent, Object> getOncomplete();
    @JsProperty(name = "length")
    public native void setLength(@DoNotAutobox Number value);
    @JsProperty(name = "oncomplete")
    public native void setOncomplete(Function1<OfflineAudioCompletionEvent, Object> value);
    /** 
      * tsd/browser/lib.es6.d.ts@538372
     */
    public native Promise<AudioBuffer> startRendering();
    /** 
      * tsd/browser/lib.es6.d.ts@538416
     */
    public native Promise<Void> suspend(@DoNotAutobox Number suspendTime);
}
