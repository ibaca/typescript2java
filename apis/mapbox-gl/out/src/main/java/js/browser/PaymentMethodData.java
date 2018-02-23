package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: PaymentMethodData
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 272246

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class PaymentMethodData
{

    /*
        Properties
    */

    public Object data;

    public Array<String> supportedMethods;

    /*
        Methods
    */
    @JsProperty(name = "data")
    public native Object getData();
    @JsProperty(name = "supportedMethods")
    public native Array<String> getSupportedMethods();
    @JsProperty(name = "data")
    public native void setData(Object value);
    @JsProperty(name = "supportedMethods")
    public native void setSupportedMethods(Array<String> value);
}
