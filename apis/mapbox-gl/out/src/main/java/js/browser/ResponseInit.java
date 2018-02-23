package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ResponseInit
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 280104

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ResponseInit
{

    /*
        Properties
    */

    public Object headers;

    public Number status;

    public String statusText;

    /*
        Methods
    */
    @JsProperty(name = "headers")
    public native Object getHeaders();
    @JsProperty(name = "status")
    public native Number getStatus();
    @JsProperty(name = "statusText")
    public native String getStatusText();
    @JsProperty(name = "headers")
    public native void setHeaders(Object value);
    @JsProperty(name = "status")
    public native void setStatus(@DoNotAutobox Number value);
    @JsProperty(name = "statusText")
    public native void setStatusText(String value);
}
