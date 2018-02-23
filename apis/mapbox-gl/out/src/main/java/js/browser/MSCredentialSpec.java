package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: MSCredentialSpec
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 262429

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class MSCredentialSpec
{

    /*
        Properties
    */

    public String id;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "id")
    public native String getId();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "id")
    public native void setId(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
