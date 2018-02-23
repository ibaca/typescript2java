package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SpeechSynthesisUtterance
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 646706
  * declared in: tsd/browser/lib.es6.d.ts at pos 647672
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SpeechSynthesisUtterance")
public class SpeechSynthesisUtterance extends EventTarget 
{

    /*
        Constructors
    */
    public SpeechSynthesisUtterance (String text /* optional */) {
    } 
    public SpeechSynthesisUtterance () {
    } 

    /*
        Properties
    */

    public String lang;

    public Function1<Event, Object> onboundary;

    public Function1<Event, Object> onend;

    public Function1<Event, Object> onerror;

    public Function1<Event, Object> onmark;

    public Function1<Event, Object> onpause;

    public Function1<Event, Object> onresume;

    public Function1<Event, Object> onstart;

    public Number pitch;

    public Number rate;

    public String text;

    public SpeechSynthesisVoice voice;

    public Number volume;

    /*
        Methods
    */
    @JsProperty(name = "lang")
    public native String getLang();
    @JsProperty(name = "onboundary")
    public native Function1<Event, Object> getOnboundary();
    @JsProperty(name = "onend")
    public native Function1<Event, Object> getOnend();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "onmark")
    public native Function1<Event, Object> getOnmark();
    @JsProperty(name = "onpause")
    public native Function1<Event, Object> getOnpause();
    @JsProperty(name = "onresume")
    public native Function1<Event, Object> getOnresume();
    @JsProperty(name = "onstart")
    public native Function1<Event, Object> getOnstart();
    @JsProperty(name = "pitch")
    public native Number getPitch();
    @JsProperty(name = "rate")
    public native Number getRate();
    @JsProperty(name = "text")
    public native String getText();
    @JsProperty(name = "voice")
    public native SpeechSynthesisVoice getVoice();
    @JsProperty(name = "volume")
    public native Number getVolume();
    @JsProperty(name = "lang")
    public native void setLang(String value);
    @JsProperty(name = "onboundary")
    public native void setOnboundary(Function1<Event, Object> value);
    @JsProperty(name = "onend")
    public native void setOnend(Function1<Event, Object> value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "onmark")
    public native void setOnmark(Function1<Event, Object> value);
    @JsProperty(name = "onpause")
    public native void setOnpause(Function1<Event, Object> value);
    @JsProperty(name = "onresume")
    public native void setOnresume(Function1<Event, Object> value);
    @JsProperty(name = "onstart")
    public native void setOnstart(Function1<Event, Object> value);
    @JsProperty(name = "pitch")
    public native void setPitch(@DoNotAutobox Number value);
    @JsProperty(name = "rate")
    public native void setRate(@DoNotAutobox Number value);
    @JsProperty(name = "text")
    public native void setText(String value);
    @JsProperty(name = "voice")
    public native void setVoice(SpeechSynthesisVoice value);
    @JsProperty(name = "volume")
    public native void setVolume(@DoNotAutobox Number value);
}
