package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: RTCRtcpFeedback
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 276702

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class RTCRtcpFeedback
{

    /*
        Properties
    */

    public String parameter;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "parameter")
    public native String getParameter();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "parameter")
    public native void setParameter(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
