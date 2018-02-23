package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSRelayAddress
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 265059

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSRelayAddress
{

    /*
        Properties
    */

    public Number port;

    public String relayAddress;

    /*
        Methods
    */
    @JsProperty(name = "port")
    public native Number getPort();
    @JsProperty(name = "relayAddress")
    public native String getRelayAddress();
    @JsProperty(name = "port")
    public native void setPort(@DoNotAutobox Number value);
    @JsProperty(name = "relayAddress")
    public native void setRelayAddress(String value);
}
