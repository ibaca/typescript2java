package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: IDBObjectStoreParameters
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 259384

  * *** changed to class to reflect the possible DTO use of this type ***
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Object")
public class IDBObjectStoreParameters
{

    /*
        Properties
    */

    public Boolean autoIncrement;

    public String keyPath;

    /*
        Methods
    */
    @JsProperty(name = "autoIncrement")
    public native Boolean getAutoIncrement();
    @JsProperty(name = "keyPath")
    public native String getKeyPath();
    @JsProperty(name = "autoIncrement")
    public native void setAutoIncrement(Boolean value);
    @JsProperty(name = "keyPath")
    public native void setKeyPath(String value);
}
