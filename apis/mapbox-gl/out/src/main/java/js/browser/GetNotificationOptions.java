package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: GetNotificationOptions
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 259151

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class GetNotificationOptions
{

    /*
        Properties
    */

    public String tag;

    /*
        Methods
    */
    @JsProperty(name = "tag")
    public native String getTag();
    @JsProperty(name = "tag")
    public native void setTag(String value);
}
