package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSAccountInfo
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 260038

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSAccountInfo
{

    /*
        Properties
    */

    public String accountImageUri;

    public String accountName;

    public String rpDisplayName;

    public String userDisplayName;

    public String userId;

    /*
        Methods
    */
    @JsProperty(name = "accountImageUri")
    public native String getAccountImageUri();
    @JsProperty(name = "accountName")
    public native String getAccountName();
    @JsProperty(name = "rpDisplayName")
    public native String getRpDisplayName();
    @JsProperty(name = "userDisplayName")
    public native String getUserDisplayName();
    @JsProperty(name = "userId")
    public native String getUserId();
    @JsProperty(name = "accountImageUri")
    public native void setAccountImageUri(String value);
    @JsProperty(name = "accountName")
    public native void setAccountName(String value);
    @JsProperty(name = "rpDisplayName")
    public native void setRpDisplayName(String value);
    @JsProperty(name = "userDisplayName")
    public native void setUserDisplayName(String value);
    @JsProperty(name = "userId")
    public native void setUserId(String value);
}
