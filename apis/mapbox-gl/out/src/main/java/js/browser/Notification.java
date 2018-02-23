package js.browser;

import fr.lteconsulting.prebuilt.Function1;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Notification
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 535758
  * declared in: tsd/browser/lib.es6.d.ts at pos 536518
  * 2 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Notification")
public class Notification extends EventTarget 
{

    /*
        Constructors
    */
    public Notification (String title, NotificationOptions options /* optional */) {
    } 
    public Notification (String title) {
    } 

    /*
        Static methods
    */

    /** 
      * source : tsd/browser/lib.es6.d.ts:536637
     */
    @JsMethod(namespace="Notification", name = "requestPermission")
    public static native Promise<String> requestPermission(NotificationPermissionCallback callback /* optional */);

    @JsMethod(namespace="Notification", name = "requestPermission")
    public static native Promise<String> requestPermission();

    /*
        Properties
    */

    public String body;

    public String dir;

    public String icon;

    public String lang;

    public Function1<Event, Object> onclick;

    public Function1<Event, Object> onclose;

    public Function1<Event, Object> onerror;

    public Function1<Event, Object> onshow;

    public String permission;

    public String tag;

    public String title;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@536214
     */
    public native void close();
    @JsProperty(name = "body")
    public native String getBody();
    @JsProperty(name = "dir")
    public native String getDir();
    @JsProperty(name = "icon")
    public native String getIcon();
    @JsProperty(name = "lang")
    public native String getLang();
    @JsProperty(name = "onclick")
    public native Function1<Event, Object> getOnclick();
    @JsProperty(name = "onclose")
    public native Function1<Event, Object> getOnclose();
    @JsProperty(name = "onerror")
    public native Function1<Event, Object> getOnerror();
    @JsProperty(name = "onshow")
    public native Function1<Event, Object> getOnshow();
    @JsProperty(name = "permission")
    public native String getPermission();
    @JsProperty(name = "tag")
    public native String getTag();
    @JsProperty(name = "title")
    public native String getTitle();
    @JsProperty(name = "body")
    public native void setBody(String value);
    @JsProperty(name = "dir")
    public native void setDir(String value);
    @JsProperty(name = "icon")
    public native void setIcon(String value);
    @JsProperty(name = "lang")
    public native void setLang(String value);
    @JsProperty(name = "onclick")
    public native void setOnclick(Function1<Event, Object> value);
    @JsProperty(name = "onclose")
    public native void setOnclose(Function1<Event, Object> value);
    @JsProperty(name = "onerror")
    public native void setOnerror(Function1<Event, Object> value);
    @JsProperty(name = "onshow")
    public native void setOnshow(Function1<Event, Object> value);
    @JsProperty(name = "permission")
    public native void setPermission(String value);
    @JsProperty(name = "tag")
    public native void setTag(String value);
    @JsProperty(name = "title")
    public native void setTitle(String value);
}
