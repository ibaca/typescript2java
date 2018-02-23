package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: OfflineAudioCompletionEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 537849
  * declared in: tsd/browser/lib.es6.d.ts at pos 537961
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="OfflineAudioCompletionEvent")
public class OfflineAudioCompletionEvent extends Event 
{

    /*
        Constructors
    */
    public OfflineAudioCompletionEvent () {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public AudioBuffer renderedBuffer;

    /*
        Methods
    */
    @JsProperty(name = "renderedBuffer")
    public native AudioBuffer getRenderedBuffer();
    @JsProperty(name = "renderedBuffer")
    public native void setRenderedBuffer(AudioBuffer value);
}
