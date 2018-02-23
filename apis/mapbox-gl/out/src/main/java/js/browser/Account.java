package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Account
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 255386

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class Account
{

    /*
        Properties
    */

    public String displayName;

    public String id;

    public String imageURL;

    public String name;

    public String rpDisplayName;

    /*
        Methods
    */
    @JsProperty(name = "displayName")
    public native String getDisplayName();
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "imageURL")
    public native String getImageURL();
    @JsProperty(name = "name")
    public native String getName();
    @JsProperty(name = "rpDisplayName")
    public native String getRpDisplayName();
    @JsProperty(name = "displayName")
    public native void setDisplayName(String value);
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "imageURL")
    public native void setImageURL(String value);
    @JsProperty(name = "name")
    public native void setName(String value);
    @JsProperty(name = "rpDisplayName")
    public native void setRpDisplayName(String value);
}
