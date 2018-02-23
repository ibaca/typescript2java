package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCIceParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 275125

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCIceParameters
{

    /*
        Properties
    */

    public Boolean iceLite;

    public String password;

    public String usernameFragment;

    /*
        Methods
    */
    @JsProperty(name = "iceLite")
    public native Boolean getIceLite();
    @JsProperty(name = "password")
    public native String getPassword();
    @JsProperty(name = "usernameFragment")
    public native String getUsernameFragment();
    @JsProperty(name = "iceLite")
    public native void setIceLite(Boolean value);
    @JsProperty(name = "password")
    public native void setPassword(String value);
    @JsProperty(name = "usernameFragment")
    public native void setUsernameFragment(String value);
}
