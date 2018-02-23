package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: ScopedCredentialDescriptor
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 280197

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class ScopedCredentialDescriptor
{

    /*
        Properties
    */

    public Object id;

    public Array<String> transports;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "id")
    public native Object getId();
    @JsProperty(name = "transports")
    public native Array<String> getTransports();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "id")
    public native void setId(Object value);
    @JsProperty(name = "transports")
    public native void setTransports(Array<String> value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
