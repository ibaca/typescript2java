package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: NotificationOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 271490

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class NotificationOptions
{

    /*
        Properties
    */

    public String body;

    public String dir;

    public String icon;

    public String lang;

    public String tag;

    /*
        Methods
    */
    @JsProperty(name = "body")
    public native String getBody();
    @JsProperty(name = "dir")
    public native String getDir();
    @JsProperty(name = "icon")
    public native String getIcon();
    @JsProperty(name = "lang")
    public native String getLang();
    @JsProperty(name = "tag")
    public native String getTag();
    @JsProperty(name = "body")
    public native void setBody(String value);
    @JsProperty(name = "dir")
    public native void setDir(String value);
    @JsProperty(name = "icon")
    public native void setIcon(String value);
    @JsProperty(name = "lang")
    public native void setLang(String value);
    @JsProperty(name = "tag")
    public native void setTag(String value);
}
