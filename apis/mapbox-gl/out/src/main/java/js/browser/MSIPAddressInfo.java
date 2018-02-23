package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSIPAddressInfo
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 263008

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSIPAddressInfo
{

    /*
        Properties
    */

    public String ipAddr;

    public String manufacturerMacAddrMask;

    public Number port;

    /*
        Methods
    */
    @JsProperty(name = "ipAddr")
    public native String getIpAddr();
    @JsProperty(name = "manufacturerMacAddrMask")
    public native String getManufacturerMacAddrMask();
    @JsProperty(name = "port")
    public native Number getPort();
    @JsProperty(name = "ipAddr")
    public native void setIpAddr(String value);
    @JsProperty(name = "manufacturerMacAddrMask")
    public native void setManufacturerMacAddrMask(String value);
    @JsProperty(name = "port")
    public native void setPort(@DoNotAutobox Number value);
}
