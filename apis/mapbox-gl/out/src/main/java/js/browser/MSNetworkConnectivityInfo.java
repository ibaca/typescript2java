package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSNetworkConnectivityInfo
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 264418

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSNetworkConnectivityInfo
{

    /*
        Properties
    */

    public Number linkspeed;

    public String networkConnectionDetails;

    public Boolean vpn;

    /*
        Methods
    */
    @JsProperty(name = "linkspeed")
    public native Number getLinkspeed();
    @JsProperty(name = "networkConnectionDetails")
    public native String getNetworkConnectionDetails();
    @JsProperty(name = "vpn")
    public native Boolean getVpn();
    @JsProperty(name = "linkspeed")
    public native void setLinkspeed(@DoNotAutobox Number value);
    @JsProperty(name = "networkConnectionDetails")
    public native void setNetworkConnectionDetails(String value);
    @JsProperty(name = "vpn")
    public native void setVpn(Boolean value);
}
