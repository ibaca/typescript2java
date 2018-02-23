package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSAudioSendSignal
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 262054

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSAudioSendSignal
{

    /*
        Properties
    */

    public Number noiseLevel;

    public Number sendNoiseLevelCh1;

    public Number sendSignalLevelCh1;

    /*
        Methods
    */
    @JsProperty(name = "noiseLevel")
    public native Number getNoiseLevel();
    @JsProperty(name = "sendNoiseLevelCh1")
    public native Number getSendNoiseLevelCh1();
    @JsProperty(name = "sendSignalLevelCh1")
    public native Number getSendSignalLevelCh1();
    @JsProperty(name = "noiseLevel")
    public native void setNoiseLevel(@DoNotAutobox Number value);
    @JsProperty(name = "sendNoiseLevelCh1")
    public native void setSendNoiseLevelCh1(@DoNotAutobox Number value);
    @JsProperty(name = "sendSignalLevelCh1")
    public native void setSendSignalLevelCh1(@DoNotAutobox Number value);
}
