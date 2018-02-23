package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaKeySystemConfiguration
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 268205

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MediaKeySystemConfiguration
{

    /*
        Properties
    */

    public Array<MediaKeySystemMediaCapability> audioCapabilities;

    public String distinctiveIdentifier;

    public Array<String> initDataTypes;

    public String persistentState;

    public Array<MediaKeySystemMediaCapability> videoCapabilities;

    /*
        Methods
    */
    @JsProperty(name = "audioCapabilities")
    public native Array<MediaKeySystemMediaCapability> getAudioCapabilities();
    @JsProperty(name = "distinctiveIdentifier")
    public native String getDistinctiveIdentifier();
    @JsProperty(name = "initDataTypes")
    public native Array<String> getInitDataTypes();
    @JsProperty(name = "persistentState")
    public native String getPersistentState();
    @JsProperty(name = "videoCapabilities")
    public native Array<MediaKeySystemMediaCapability> getVideoCapabilities();
    @JsProperty(name = "audioCapabilities")
    public native void setAudioCapabilities(Array<MediaKeySystemMediaCapability> value);
    @JsProperty(name = "distinctiveIdentifier")
    public native void setDistinctiveIdentifier(String value);
    @JsProperty(name = "initDataTypes")
    public native void setInitDataTypes(Array<String> value);
    @JsProperty(name = "persistentState")
    public native void setPersistentState(String value);
    @JsProperty(name = "videoCapabilities")
    public native void setVideoCapabilities(Array<MediaKeySystemMediaCapability> value);
}
