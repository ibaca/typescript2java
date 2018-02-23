package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSNetworkInterfaceType
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 264541

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSNetworkInterfaceType
{

    /*
        Properties
    */

    public Boolean interfaceTypeEthernet;

    public Boolean interfaceTypePPP;

    public Boolean interfaceTypeTunnel;

    public Boolean interfaceTypeWWAN;

    public Boolean interfaceTypeWireless;

    /*
        Methods
    */
    @JsProperty(name = "interfaceTypeEthernet")
    public native Boolean getInterfaceTypeEthernet();
    @JsProperty(name = "interfaceTypePPP")
    public native Boolean getInterfaceTypePPP();
    @JsProperty(name = "interfaceTypeTunnel")
    public native Boolean getInterfaceTypeTunnel();
    @JsProperty(name = "interfaceTypeWWAN")
    public native Boolean getInterfaceTypeWWAN();
    @JsProperty(name = "interfaceTypeWireless")
    public native Boolean getInterfaceTypeWireless();
    @JsProperty(name = "interfaceTypeEthernet")
    public native void setInterfaceTypeEthernet(Boolean value);
    @JsProperty(name = "interfaceTypePPP")
    public native void setInterfaceTypePPP(Boolean value);
    @JsProperty(name = "interfaceTypeTunnel")
    public native void setInterfaceTypeTunnel(Boolean value);
    @JsProperty(name = "interfaceTypeWWAN")
    public native void setInterfaceTypeWWAN(Boolean value);
    @JsProperty(name = "interfaceTypeWireless")
    public native void setInterfaceTypeWireless(Boolean value);
}
