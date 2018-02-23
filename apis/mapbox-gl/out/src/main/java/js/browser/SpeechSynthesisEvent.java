package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SpeechSynthesisEvent
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 646154
  * declared in: tsd/browser/lib.es6.d.ts at pos 646367
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SpeechSynthesisEvent")
public class SpeechSynthesisEvent extends Event 
{

    /*
        Constructors
    */
    public SpeechSynthesisEvent (String type, SpeechSynthesisEventInit eventInitDict /* optional */) {
        super((String) null, (EventInit) null); 
    } 
    public SpeechSynthesisEvent (String type) {
        super((String) null, (EventInit) null); 
    } 

    /*
        Properties
    */

    public Number charIndex;

    public Number elapsedTime;

    public String name;

    public SpeechSynthesisUtterance utterance;

    /*
        Methods
    */
    @JsProperty(name = "charIndex")
    public native Number getCharIndex();
    @JsProperty(name = "elapsedTime")
    public native Number getElapsedTime();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "utterance")
    public native SpeechSynthesisUtterance getUtterance();
    @JsProperty(name = "charIndex")
    public native void setCharIndex(@DoNotAutobox Number value);
    @JsProperty(name = "elapsedTime")
    public native void setElapsedTime(@DoNotAutobox Number value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "utterance")
    public native void setUtterance(SpeechSynthesisUtterance value);
}
