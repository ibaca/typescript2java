package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSAudioRecvSignal
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 261644

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSAudioRecvSignal
{

    /*
        Properties
    */

    public Number initialSignalLevelRMS;

    public Number recvNoiseLevelCh1;

    public Number recvSignalLevelCh1;

    public Number renderLoopbackSignalLevel;

    public Number renderNoiseLevel;

    public Number renderSignalLevel;

    /*
        Methods
    */
    @JsProperty(name = "initialSignalLevelRMS")
    public native Number getInitialSignalLevelRMS();
    @JsProperty(name = "recvNoiseLevelCh1")
    public native Number getRecvNoiseLevelCh1();
    @JsProperty(name = "recvSignalLevelCh1")
    public native Number getRecvSignalLevelCh1();
    @JsProperty(name = "renderLoopbackSignalLevel")
    public native Number getRenderLoopbackSignalLevel();
    @JsProperty(name = "renderNoiseLevel")
    public native Number getRenderNoiseLevel();
    @JsProperty(name = "renderSignalLevel")
    public native Number getRenderSignalLevel();
    @JsProperty(name = "initialSignalLevelRMS")
    public native void setInitialSignalLevelRMS(@DoNotAutobox Number value);
    @JsProperty(name = "recvNoiseLevelCh1")
    public native void setRecvNoiseLevelCh1(@DoNotAutobox Number value);
    @JsProperty(name = "recvSignalLevelCh1")
    public native void setRecvSignalLevelCh1(@DoNotAutobox Number value);
    @JsProperty(name = "renderLoopbackSignalLevel")
    public native void setRenderLoopbackSignalLevel(@DoNotAutobox Number value);
    @JsProperty(name = "renderNoiseLevel")
    public native void setRenderNoiseLevel(@DoNotAutobox Number value);
    @JsProperty(name = "renderSignalLevel")
    public native void setRenderSignalLevel(@DoNotAutobox Number value);
}
