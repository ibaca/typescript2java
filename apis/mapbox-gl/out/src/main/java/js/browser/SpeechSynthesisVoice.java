package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: SpeechSynthesisVoice
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 647793
  * declared in: tsd/browser/lib.es6.d.ts at pos 647994
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="SpeechSynthesisVoice")
public class SpeechSynthesisVoice
{

    /*
        Constructors
    */
    public SpeechSynthesisVoice () {
    } 

    /*
        Properties
    */

    @JsProperty(name="default")
    public Boolean default_;

    public String lang;

    public Boolean localService;

    public String name;

    public String voiceURI;

    /*
        Methods
    */
    @JsProperty(name = "default")
    public native Boolean getDefault_();
    @JsProperty(name = "lang")
    public native String getLang();
    @JsProperty(name = "localService")
    public native Boolean getLocalService();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "voiceURI")
    public native String getVoiceURI();
    @JsProperty(name = "default")
    public native void setDefault_(Boolean value);
    @JsProperty(name = "lang")
    public native void setLang(String value);
    @JsProperty(name = "localService")
    public native void setLocalService(Boolean value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "voiceURI")
    public native void setVoiceURI(String value);
}
