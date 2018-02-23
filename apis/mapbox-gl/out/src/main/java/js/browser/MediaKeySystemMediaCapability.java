package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MediaKeySystemMediaCapability
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 268458

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MediaKeySystemMediaCapability
{

    /*
        Properties
    */

    public String contentType;

    public String robustness;

    /*
        Methods
    */
    @JsProperty(name = "contentType")
    public native String getContentType();
    @JsProperty(name = "robustness")
    public native String getRobustness();
    @JsProperty(name = "contentType")
    public native void setContentType(String value);
    @JsProperty(name = "robustness")
    public native void setRobustness(String value);
}
