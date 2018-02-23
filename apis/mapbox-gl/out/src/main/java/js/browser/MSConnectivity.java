package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSConnectivity
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 262177

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSConnectivity
{

    /*
        Properties
    */

    public String iceType;

    public MSIceWarningFlags iceWarningFlags;

    public MSRelayAddress relayAddress;

    /*
        Methods
    */
    @JsProperty(name = "iceType")
    public native String getIceType();
    @JsProperty(name = "iceWarningFlags")
    public native MSIceWarningFlags getIceWarningFlags();
    @JsProperty(name = "relayAddress")
    public native MSRelayAddress getRelayAddress();
    @JsProperty(name = "iceType")
    public native void setIceType(String value);
    @JsProperty(name = "iceWarningFlags")
    public native void setIceWarningFlags(MSIceWarningFlags value);
    @JsProperty(name = "relayAddress")
    public native void setRelayAddress(MSRelayAddress value);
}
